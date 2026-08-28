import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ete {
   private final Set<etd<?>> a;
   private final Set<etd<?>> b;

   ete(Set<etd<?>> $$0, Set<etd<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(etd<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<etd<?>> a() {
      return this.a;
   }

   public Set<etd<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eqq $$0, eql $$1) {
      Set<etd<?>> $$2 = $$1.a();
      Set<etd<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ete.a c() {
      return new ete.a();
   }

   public static class a {
      private final Set<etd<?>> a = Sets.newIdentityHashSet();
      private final Set<etd<?>> b = Sets.newIdentityHashSet();

      public ete.a a(etd<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ete.a b(etd<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ete a() {
         return new ete(this.a, this.b);
      }
   }
}
