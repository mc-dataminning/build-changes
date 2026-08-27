import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ein {
   private final Set<eim<?>> a;
   private final Set<eim<?>> b;

   ein(Set<eim<?>> $$0, Set<eim<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eim<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eim<?>> a() {
      return this.a;
   }

   public Set<eim<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(egn $$0, egf $$1) {
      Set<eim<?>> $$2 = $$1.a();
      Set<eim<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ein.a c() {
      return new ein.a();
   }

   public static class a {
      private final Set<eim<?>> a = Sets.newIdentityHashSet();
      private final Set<eim<?>> b = Sets.newIdentityHashSet();

      public ein.a a(eim<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ein.a b(eim<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ein a() {
         return new ein(this.a, this.b);
      }
   }
}
