import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ejo {
   private final Set<ejn<?>> a;
   private final Set<ejn<?>> b;

   ejo(Set<ejn<?>> $$0, Set<ejn<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ejn<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ejn<?>> a() {
      return this.a;
   }

   public Set<ejn<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eho $$0, ehg $$1) {
      Set<ejn<?>> $$2 = $$1.a();
      Set<ejn<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ejo.a c() {
      return new ejo.a();
   }

   public static class a {
      private final Set<ejn<?>> a = Sets.newIdentityHashSet();
      private final Set<ejn<?>> b = Sets.newIdentityHashSet();

      public ejo.a a(ejn<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ejo.a b(ejn<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ejo a() {
         return new ejo(this.a, this.b);
      }
   }
}
