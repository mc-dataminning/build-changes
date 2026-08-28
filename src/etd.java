import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class etd {
   private final Set<etc<?>> a;
   private final Set<etc<?>> b;

   etd(Set<etc<?>> $$0, Set<etc<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(etc<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<etc<?>> a() {
      return this.a;
   }

   public Set<etc<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eqp $$0, eqk $$1) {
      Set<etc<?>> $$2 = $$1.a();
      Set<etc<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static etd.a c() {
      return new etd.a();
   }

   public static class a {
      private final Set<etc<?>> a = Sets.newIdentityHashSet();
      private final Set<etc<?>> b = Sets.newIdentityHashSet();

      public etd.a a(etc<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public etd.a b(etc<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public etd a() {
         return new etd(this.a, this.b);
      }
   }
}
