import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eeu {
   private final Set<eet<?>> a;
   private final Set<eet<?>> b;

   eeu(Set<eet<?>> $$0, Set<eet<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eet<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eet<?>> a() {
      return this.a;
   }

   public Set<eet<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ecu $$0, ecm $$1) {
      Set<eet<?>> $$2 = $$1.a();
      Set<eet<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eeu.a c() {
      return new eeu.a();
   }

   public static class a {
      private final Set<eet<?>> a = Sets.newIdentityHashSet();
      private final Set<eet<?>> b = Sets.newIdentityHashSet();

      public eeu.a a(eet<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eeu.a b(eet<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eeu a() {
         return new eeu(this.a, this.b);
      }
   }
}
