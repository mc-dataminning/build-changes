import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class efb {
   private final Set<efa<?>> a;
   private final Set<efa<?>> b;

   efb(Set<efa<?>> $$0, Set<efa<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(efa<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<efa<?>> a() {
      return this.a;
   }

   public Set<efa<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(edb $$0, ect $$1) {
      Set<efa<?>> $$2 = $$1.a();
      Set<efa<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static efb.a c() {
      return new efb.a();
   }

   public static class a {
      private final Set<efa<?>> a = Sets.newIdentityHashSet();
      private final Set<efa<?>> b = Sets.newIdentityHashSet();

      public efb.a a(efa<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public efb.a b(efa<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public efb a() {
         return new efb(this.a, this.b);
      }
   }
}
