import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class era {
   private final Set<eqz<?>> a;
   private final Set<eqz<?>> b;

   era(Set<eqz<?>> $$0, Set<eqz<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eqz<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eqz<?>> a() {
      return this.a;
   }

   public Set<eqz<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eor $$0, eom $$1) {
      Set<eqz<?>> $$2 = $$1.a();
      Set<eqz<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static era.a c() {
      return new era.a();
   }

   public static class a {
      private final Set<eqz<?>> a = Sets.newIdentityHashSet();
      private final Set<eqz<?>> b = Sets.newIdentityHashSet();

      public era.a a(eqz<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public era.a b(eqz<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public era a() {
         return new era(this.a, this.b);
      }
   }
}
