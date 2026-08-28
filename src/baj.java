import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class baj {
   private final Set<bai<?>> a;
   private final Set<bai<?>> b;

   baj(Set<bai<?>> $$0, Set<bai<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bai<?>> a() {
      return this.a;
   }

   public Set<bai<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bai<?>> a = Sets.newIdentityHashSet();
      private final Set<bai<?>> b = Sets.newIdentityHashSet();

      public baj.a a(bai<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public baj.a b(bai<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public baj a() {
         return new baj(this.a, this.b);
      }
   }
}
