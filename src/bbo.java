import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bbo {
   private final Set<bbn<?>> a;
   private final Set<bbn<?>> b;

   bbo(Set<bbn<?>> $$0, Set<bbn<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bbn<?>> a() {
      return this.a;
   }

   public Set<bbn<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bbn<?>> a = Sets.newIdentityHashSet();
      private final Set<bbn<?>> b = Sets.newIdentityHashSet();

      public bbo.a a(bbn<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bbo.a b(bbn<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bbo a() {
         return new bbo(this.a, this.b);
      }
   }
}
