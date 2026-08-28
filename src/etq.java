import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class etq {
   private final Set<etp<?>> a;
   private final Set<etp<?>> b;

   etq(Set<etp<?>> $$0, Set<etp<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(etp<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<etp<?>> a() {
      return this.a;
   }

   public Set<etp<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(erc $$0, eqx $$1) {
      this.a($$0.b(), $$1);
   }

   public void a(aym $$0, eqx $$1) {
      Set<etp<?>> $$2 = $$1.a();
      Set<etp<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static etq.a c() {
      return new etq.a();
   }

   public static class a {
      private final Set<etp<?>> a = Sets.newIdentityHashSet();
      private final Set<etp<?>> b = Sets.newIdentityHashSet();

      public etq.a a(etp<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public etq.a b(etp<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public etq a() {
         return new etq(this.a, this.b);
      }
   }
}
