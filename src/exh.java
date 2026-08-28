import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class exh {
   private final Set<exg<?>> a;
   private final Set<exg<?>> b;

   exh(Set<exg<?>> $$0, Set<exg<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(exg<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<exg<?>> a() {
      return this.a;
   }

   public Set<exg<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eut $$0, euo $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(azs $$0, euo $$1) {
      Set<exg<?>> $$2 = $$1.a();
      Set<exg<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static exh.a c() {
      return new exh.a();
   }

   public static class a {
      private final Set<exg<?>> a = Sets.newIdentityHashSet();
      private final Set<exg<?>> b = Sets.newIdentityHashSet();

      public exh.a a(exg<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public exh.a b(exg<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public exh a() {
         return new exh(this.a, this.b);
      }
   }
}
