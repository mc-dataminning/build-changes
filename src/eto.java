import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eto {
   private final Set<etn<?>> a;
   private final Set<etn<?>> b;

   eto(Set<etn<?>> $$0, Set<etn<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(etn<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<etn<?>> a() {
      return this.a;
   }

   public Set<etn<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(era $$0, eqv $$1) {
      this.a($$0.b(), $$1);
   }

   public void a(aym $$0, eqv $$1) {
      Set<etn<?>> $$2 = $$1.a();
      Set<etn<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eto.a c() {
      return new eto.a();
   }

   public static class a {
      private final Set<etn<?>> a = Sets.newIdentityHashSet();
      private final Set<etn<?>> b = Sets.newIdentityHashSet();

      public eto.a a(etn<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eto.a b(etn<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eto a() {
         return new eto(this.a, this.b);
      }
   }
}
