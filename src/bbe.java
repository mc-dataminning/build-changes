import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bbe {
   private final Set<bbd<?>> a;
   private final Set<bbd<?>> b;

   bbe(Set<bbd<?>> $$0, Set<bbd<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bbd<?>> a() {
      return this.a;
   }

   public Set<bbd<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bbd<?>> a = Sets.newIdentityHashSet();
      private final Set<bbd<?>> b = Sets.newIdentityHashSet();

      public bbe.a a(bbd<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bbe.a b(bbd<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bbe a() {
         return new bbe(this.a, this.b);
      }
   }
}
