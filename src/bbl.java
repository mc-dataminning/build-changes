import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bbl {
   private final Set<bbk<?>> a;
   private final Set<bbk<?>> b;

   bbl(Set<bbk<?>> $$0, Set<bbk<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bbk<?>> a() {
      return this.a;
   }

   public Set<bbk<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bbk<?>> a = Sets.newIdentityHashSet();
      private final Set<bbk<?>> b = Sets.newIdentityHashSet();

      public bbl.a a(bbk<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bbl.a b(bbk<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bbl a() {
         return new bbl(this.a, this.b);
      }
   }
}
