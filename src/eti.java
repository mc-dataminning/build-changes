import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eti {
   private final Set<eth<?>> a;
   private final Set<eth<?>> b;

   eti(Set<eth<?>> $$0, Set<eth<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eth<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eth<?>> a() {
      return this.a;
   }

   public Set<eth<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(equ $$0, eqp $$1) {
      this.a($$0.b(), $$1);
   }

   public void a(ayk $$0, eqp $$1) {
      Set<eth<?>> $$2 = $$1.a();
      Set<eth<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eti.a c() {
      return new eti.a();
   }

   public static class a {
      private final Set<eth<?>> a = Sets.newIdentityHashSet();
      private final Set<eth<?>> b = Sets.newIdentityHashSet();

      public eti.a a(eth<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eti.a b(eth<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eti a() {
         return new eti(this.a, this.b);
      }
   }
}
