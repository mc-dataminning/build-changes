import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class erx {
   private final Set<erw<?>> a;
   private final Set<erw<?>> b;

   erx(Set<erw<?>> $$0, Set<erw<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(erw<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<erw<?>> a() {
      return this.a;
   }

   public Set<erw<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(epn $$0, epi $$1) {
      Set<erw<?>> $$2 = $$1.a();
      Set<erw<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static erx.a c() {
      return new erx.a();
   }

   public static class a {
      private final Set<erw<?>> a = Sets.newIdentityHashSet();
      private final Set<erw<?>> b = Sets.newIdentityHashSet();

      public erx.a a(erw<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public erx.a b(erw<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public erx a() {
         return new erx(this.a, this.b);
      }
   }
}
