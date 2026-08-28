import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eta {
   private final Set<esz<?>> a;
   private final Set<esz<?>> b;

   eta(Set<esz<?>> $$0, Set<esz<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(esz<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<esz<?>> a() {
      return this.a;
   }

   public Set<esz<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eqm $$0, eqh $$1) {
      Set<esz<?>> $$2 = $$1.a();
      Set<esz<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eta.a c() {
      return new eta.a();
   }

   public static class a {
      private final Set<esz<?>> a = Sets.newIdentityHashSet();
      private final Set<esz<?>> b = Sets.newIdentityHashSet();

      public eta.a a(esz<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eta.a b(esz<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eta a() {
         return new eta(this.a, this.b);
      }
   }
}
