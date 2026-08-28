import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ewq {
   private final Set<ewp<?>> a;
   private final Set<ewp<?>> b;

   ewq(Set<ewp<?>> $$0, Set<ewp<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ewp<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ewp<?>> a() {
      return this.a;
   }

   public Set<ewp<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(euc $$0, etx $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(azp $$0, etx $$1) {
      Set<ewp<?>> $$2 = $$1.a();
      Set<ewp<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ewq.a c() {
      return new ewq.a();
   }

   public static class a {
      private final Set<ewp<?>> a = Sets.newIdentityHashSet();
      private final Set<ewp<?>> b = Sets.newIdentityHashSet();

      public ewq.a a(ewp<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ewq.a b(ewp<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ewq a() {
         return new ewq(this.a, this.b);
      }
   }
}
