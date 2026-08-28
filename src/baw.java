import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class baw {
   private final Set<bav<?>> a;
   private final Set<bav<?>> b;

   baw(Set<bav<?>> $$0, Set<bav<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bav<?>> a() {
      return this.a;
   }

   public Set<bav<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bav<?>> a = Sets.newIdentityHashSet();
      private final Set<bav<?>> b = Sets.newIdentityHashSet();

      public baw.a a(bav<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public baw.a b(bav<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public baw a() {
         return new baw(this.a, this.b);
      }
   }
}
