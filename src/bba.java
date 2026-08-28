import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bba {
   private final Set<baz<?>> a;
   private final Set<baz<?>> b;

   bba(Set<baz<?>> $$0, Set<baz<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<baz<?>> a() {
      return this.a;
   }

   public Set<baz<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<baz<?>> a = Sets.newIdentityHashSet();
      private final Set<baz<?>> b = Sets.newIdentityHashSet();

      public bba.a a(baz<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bba.a b(baz<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bba a() {
         return new bba(this.a, this.b);
      }
   }
}
