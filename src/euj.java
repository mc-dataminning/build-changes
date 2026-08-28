import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class euj {
   private final Set<eui<?>> a;
   private final Set<eui<?>> b;

   euj(Set<eui<?>> $$0, Set<eui<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eui<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eui<?>> a() {
      return this.a;
   }

   public Set<eui<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(erv $$0, erq $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(ayu $$0, erq $$1) {
      Set<eui<?>> $$2 = $$1.a();
      Set<eui<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static euj.a c() {
      return new euj.a();
   }

   public static class a {
      private final Set<eui<?>> a = Sets.newIdentityHashSet();
      private final Set<eui<?>> b = Sets.newIdentityHashSet();

      public euj.a a(eui<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public euj.a b(eui<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public euj a() {
         return new euj(this.a, this.b);
      }
   }
}
