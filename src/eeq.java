import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eeq {
   private final Set<eep<?>> a;
   private final Set<eep<?>> b;

   eeq(Set<eep<?>> $$0, Set<eep<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eep<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eep<?>> a() {
      return this.a;
   }

   public Set<eep<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ecq $$0, eci $$1) {
      Set<eep<?>> $$2 = $$1.a();
      Set<eep<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eeq.a c() {
      return new eeq.a();
   }

   public static class a {
      private final Set<eep<?>> a = Sets.newIdentityHashSet();
      private final Set<eep<?>> b = Sets.newIdentityHashSet();

      public eeq.a a(eep<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eeq.a b(eep<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eeq a() {
         return new eeq(this.a, this.b);
      }
   }
}
