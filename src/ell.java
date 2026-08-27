import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ell {
   private final Set<elk<?>> a;
   private final Set<elk<?>> b;

   ell(Set<elk<?>> $$0, Set<elk<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(elk<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<elk<?>> a() {
      return this.a;
   }

   public Set<elk<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ejl $$0, ejd $$1) {
      Set<elk<?>> $$2 = $$1.a();
      Set<elk<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ell.a c() {
      return new ell.a();
   }

   public static class a {
      private final Set<elk<?>> a = Sets.newIdentityHashSet();
      private final Set<elk<?>> b = Sets.newIdentityHashSet();

      public ell.a a(elk<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ell.a b(elk<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ell a() {
         return new ell(this.a, this.b);
      }
   }
}
