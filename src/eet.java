import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eet {
   private final Set<ees<?>> a;
   private final Set<ees<?>> b;

   eet(Set<ees<?>> $$0, Set<ees<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ees<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ees<?>> a() {
      return this.a;
   }

   public Set<ees<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ect $$0, ecl $$1) {
      Set<ees<?>> $$2 = $$1.a();
      Set<ees<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eet.a c() {
      return new eet.a();
   }

   public static class a {
      private final Set<ees<?>> a = Sets.newIdentityHashSet();
      private final Set<ees<?>> b = Sets.newIdentityHashSet();

      public eet.a a(ees<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eet.a b(ees<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eet a() {
         return new eet(this.a, this.b);
      }
   }
}
