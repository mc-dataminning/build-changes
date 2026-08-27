import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class emh {
   private final Set<emg<?>> a;
   private final Set<emg<?>> b;

   emh(Set<emg<?>> $$0, Set<emg<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(emg<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<emg<?>> a() {
      return this.a;
   }

   public Set<emg<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ekh $$0, ejz $$1) {
      Set<emg<?>> $$2 = $$1.a();
      Set<emg<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static emh.a c() {
      return new emh.a();
   }

   public static class a {
      private final Set<emg<?>> a = Sets.newIdentityHashSet();
      private final Set<emg<?>> b = Sets.newIdentityHashSet();

      public emh.a a(emg<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public emh.a b(emg<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public emh a() {
         return new emh(this.a, this.b);
      }
   }
}
