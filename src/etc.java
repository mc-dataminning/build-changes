import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class etc {
   private final Set<etb<?>> a;
   private final Set<etb<?>> b;

   etc(Set<etb<?>> $$0, Set<etb<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(etb<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<etb<?>> a() {
      return this.a;
   }

   public Set<etb<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eqo $$0, eqj $$1) {
      Set<etb<?>> $$2 = $$1.a();
      Set<etb<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static etc.a c() {
      return new etc.a();
   }

   public static class a {
      private final Set<etb<?>> a = Sets.newIdentityHashSet();
      private final Set<etb<?>> b = Sets.newIdentityHashSet();

      public etc.a a(etb<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public etc.a b(etb<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public etc a() {
         return new etc(this.a, this.b);
      }
   }
}
