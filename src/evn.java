import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class evn {
   private final Set<evm<?>> a;
   private final Set<evm<?>> b;

   evn(Set<evm<?>> $$0, Set<evm<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(evm<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<evm<?>> a() {
      return this.a;
   }

   public Set<evm<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(esz $$0, esu $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(azi $$0, esu $$1) {
      Set<evm<?>> $$2 = $$1.a();
      Set<evm<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static evn.a c() {
      return new evn.a();
   }

   public static class a {
      private final Set<evm<?>> a = Sets.newIdentityHashSet();
      private final Set<evm<?>> b = Sets.newIdentityHashSet();

      public evn.a a(evm<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public evn.a b(evm<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public evn a() {
         return new evn(this.a, this.b);
      }
   }
}
