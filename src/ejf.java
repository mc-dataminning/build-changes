import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ejf {
   private final Set<eje<?>> a;
   private final Set<eje<?>> b;

   ejf(Set<eje<?>> $$0, Set<eje<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eje<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eje<?>> a() {
      return this.a;
   }

   public Set<eje<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ehf $$0, egx $$1) {
      Set<eje<?>> $$2 = $$1.a();
      Set<eje<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ejf.a c() {
      return new ejf.a();
   }

   public static class a {
      private final Set<eje<?>> a = Sets.newIdentityHashSet();
      private final Set<eje<?>> b = Sets.newIdentityHashSet();

      public ejf.a a(eje<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ejf.a b(eje<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ejf a() {
         return new ejf(this.a, this.b);
      }
   }
}
