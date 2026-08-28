import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class exa {
   private final Set<ewz<?>> a;
   private final Set<ewz<?>> b;

   exa(Set<ewz<?>> $$0, Set<ewz<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ewz<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ewz<?>> a() {
      return this.a;
   }

   public Set<ewz<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eum $$0, euh $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(azt $$0, euh $$1) {
      Set<ewz<?>> $$2 = $$1.a();
      Set<ewz<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static exa.a c() {
      return new exa.a();
   }

   public static class a {
      private final Set<ewz<?>> a = Sets.newIdentityHashSet();
      private final Set<ewz<?>> b = Sets.newIdentityHashSet();

      public exa.a a(ewz<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public exa.a b(ewz<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public exa a() {
         return new exa(this.a, this.b);
      }
   }
}
