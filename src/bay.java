import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bay {
   private final Set<bax<?>> a;
   private final Set<bax<?>> b;

   bay(Set<bax<?>> $$0, Set<bax<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bax<?>> a() {
      return this.a;
   }

   public Set<bax<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bax<?>> a = Sets.newIdentityHashSet();
      private final Set<bax<?>> b = Sets.newIdentityHashSet();

      public bay.a a(bax<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bay.a b(bax<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bay a() {
         return new bay(this.a, this.b);
      }
   }
}
