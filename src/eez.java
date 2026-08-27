import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eez {
   private final Set<eey<?>> a;
   private final Set<eey<?>> b;

   eez(Set<eey<?>> $$0, Set<eey<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eey<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eey<?>> a() {
      return this.a;
   }

   public Set<eey<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ecz $$0, ecr $$1) {
      Set<eey<?>> $$2 = $$1.a();
      Set<eey<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eez.a c() {
      return new eez.a();
   }

   public static class a {
      private final Set<eey<?>> a = Sets.newIdentityHashSet();
      private final Set<eey<?>> b = Sets.newIdentityHashSet();

      public eez.a a(eey<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eez.a b(eey<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eez a() {
         return new eez(this.a, this.b);
      }
   }
}
