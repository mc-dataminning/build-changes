import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class esx {
   private final Set<esw<?>> a;
   private final Set<esw<?>> b;

   esx(Set<esw<?>> $$0, Set<esw<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(esw<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<esw<?>> a() {
      return this.a;
   }

   public Set<esw<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eqj $$0, eqe $$1) {
      Set<esw<?>> $$2 = $$1.a();
      Set<esw<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static esx.a c() {
      return new esx.a();
   }

   public static class a {
      private final Set<esw<?>> a = Sets.newIdentityHashSet();
      private final Set<esw<?>> b = Sets.newIdentityHashSet();

      public esx.a a(esw<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public esx.a b(esw<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public esx a() {
         return new esx(this.a, this.b);
      }
   }
}
