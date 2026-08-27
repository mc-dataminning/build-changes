import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ehl {
   private final Set<ehk<?>> a;
   private final Set<ehk<?>> b;

   ehl(Set<ehk<?>> $$0, Set<ehk<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ehk<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ehk<?>> a() {
      return this.a;
   }

   public Set<ehk<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(efl $$0, efd $$1) {
      Set<ehk<?>> $$2 = $$1.a();
      Set<ehk<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ehl.a c() {
      return new ehl.a();
   }

   public static class a {
      private final Set<ehk<?>> a = Sets.newIdentityHashSet();
      private final Set<ehk<?>> b = Sets.newIdentityHashSet();

      public ehl.a a(ehk<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ehl.a b(ehk<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ehl a() {
         return new ehl(this.a, this.b);
      }
   }
}
