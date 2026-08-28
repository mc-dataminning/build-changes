import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ewb {
   private final Set<ewa<?>> a;
   private final Set<ewa<?>> b;

   ewb(Set<ewa<?>> $$0, Set<ewa<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ewa<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ewa<?>> a() {
      return this.a;
   }

   public Set<ewa<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(etn $$0, eti $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(azj $$0, eti $$1) {
      Set<ewa<?>> $$2 = $$1.a();
      Set<ewa<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ewb.a c() {
      return new ewb.a();
   }

   public static class a {
      private final Set<ewa<?>> a = Sets.newIdentityHashSet();
      private final Set<ewa<?>> b = Sets.newIdentityHashSet();

      public ewb.a a(ewa<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ewb.a b(ewa<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ewb a() {
         return new ewb(this.a, this.b);
      }
   }
}
