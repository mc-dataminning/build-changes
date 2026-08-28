import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bbc {
   private final Set<bbb<?>> a;
   private final Set<bbb<?>> b;

   bbc(Set<bbb<?>> $$0, Set<bbb<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bbb<?>> a() {
      return this.a;
   }

   public Set<bbb<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bbb<?>> a = Sets.newIdentityHashSet();
      private final Set<bbb<?>> b = Sets.newIdentityHashSet();

      public bbc.a a(bbb<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bbc.a b(bbb<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bbc a() {
         return new bbc(this.a, this.b);
      }
   }
}
