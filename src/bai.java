import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bai {
   private final Set<bah<?>> a;
   private final Set<bah<?>> b;

   bai(Set<bah<?>> $$0, Set<bah<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bah<?>> a() {
      return this.a;
   }

   public Set<bah<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bah<?>> a = Sets.newIdentityHashSet();
      private final Set<bah<?>> b = Sets.newIdentityHashSet();

      public bai.a a(bah<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bai.a b(bah<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bai a() {
         return new bai(this.a, this.b);
      }
   }
}
