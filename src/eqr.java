import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eqr {
   private final Set<eqq<?>> a;
   private final Set<eqq<?>> b;

   eqr(Set<eqq<?>> $$0, Set<eqq<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eqq<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eqq<?>> a() {
      return this.a;
   }

   public Set<eqq<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eoj $$0, eob $$1) {
      Set<eqq<?>> $$2 = $$1.a();
      Set<eqq<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eqr.a c() {
      return new eqr.a();
   }

   public static class a {
      private final Set<eqq<?>> a = Sets.newIdentityHashSet();
      private final Set<eqq<?>> b = Sets.newIdentityHashSet();

      public eqr.a a(eqq<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eqr.a b(eqq<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eqr a() {
         return new eqr(this.a, this.b);
      }
   }
}
