import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bau {
   private final Set<bat<?>> a;
   private final Set<bat<?>> b;

   bau(Set<bat<?>> $$0, Set<bat<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bat<?>> a() {
      return this.a;
   }

   public Set<bat<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bat<?>> a = Sets.newIdentityHashSet();
      private final Set<bat<?>> b = Sets.newIdentityHashSet();

      public bau.a a(bat<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bau.a b(bat<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bau a() {
         return new bau(this.a, this.b);
      }
   }
}
