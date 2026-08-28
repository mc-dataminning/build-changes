import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ezb {
   private final Set<eza<?>> a;
   private final Set<eza<?>> b;

   ezb(Set<eza<?>> $$0, Set<eza<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eza<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eza<?>> a() {
      return this.a;
   }

   public Set<eza<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ewn $$0, ewi $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(bak $$0, ewi $$1) {
      Set<eza<?>> $$2 = $$1.a();
      Set<eza<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ezb.a c() {
      return new ezb.a();
   }

   public static class a {
      private final Set<eza<?>> a = Sets.newIdentityHashSet();
      private final Set<eza<?>> b = Sets.newIdentityHashSet();

      public ezb.a a(eza<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ezb.a b(eza<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ezb a() {
         return new ezb(this.a, this.b);
      }
   }
}
