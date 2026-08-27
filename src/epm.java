import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class epm {
   private final Set<epl<?>> a;
   private final Set<epl<?>> b;

   epm(Set<epl<?>> $$0, Set<epl<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(epl<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<epl<?>> a() {
      return this.a;
   }

   public Set<epl<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(enk $$0, enc $$1) {
      Set<epl<?>> $$2 = $$1.a();
      Set<epl<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static epm.a c() {
      return new epm.a();
   }

   public static class a {
      private final Set<epl<?>> a = Sets.newIdentityHashSet();
      private final Set<epl<?>> b = Sets.newIdentityHashSet();

      public epm.a a(epl<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public epm.a b(epl<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public epm a() {
         return new epm(this.a, this.b);
      }
   }
}
