import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eer {
   private final Set<eeq<?>> a;
   private final Set<eeq<?>> b;

   eer(Set<eeq<?>> $$0, Set<eeq<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eeq<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eeq<?>> a() {
      return this.a;
   }

   public Set<eeq<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ecs $$0, eci $$1) {
      Set<eeq<?>> $$2 = $$1.a();
      Set<eeq<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eer.a c() {
      return new eer.a();
   }

   public static class a {
      private final Set<eeq<?>> a = Sets.newIdentityHashSet();
      private final Set<eeq<?>> b = Sets.newIdentityHashSet();

      public eer.a a(eeq<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eer.a b(eeq<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eer a() {
         return new eer(this.a, this.b);
      }
   }
}
