import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class etb {
   private final Set<eta<?>> a;
   private final Set<eta<?>> b;

   etb(Set<eta<?>> $$0, Set<eta<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eta<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eta<?>> a() {
      return this.a;
   }

   public Set<eta<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eqn $$0, eqi $$1) {
      Set<eta<?>> $$2 = $$1.a();
      Set<eta<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static etb.a c() {
      return new etb.a();
   }

   public static class a {
      private final Set<eta<?>> a = Sets.newIdentityHashSet();
      private final Set<eta<?>> b = Sets.newIdentityHashSet();

      public etb.a a(eta<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public etb.a b(eta<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public etb a() {
         return new etb(this.a, this.b);
      }
   }
}
