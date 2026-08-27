import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class end {
   private final Set<enc<?>> a;
   private final Set<enc<?>> b;

   end(Set<enc<?>> $$0, Set<enc<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(enc<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<enc<?>> a() {
      return this.a;
   }

   public Set<enc<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eld $$0, ekv $$1) {
      Set<enc<?>> $$2 = $$1.a();
      Set<enc<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static end.a c() {
      return new end.a();
   }

   public static class a {
      private final Set<enc<?>> a = Sets.newIdentityHashSet();
      private final Set<enc<?>> b = Sets.newIdentityHashSet();

      public end.a a(enc<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public end.a b(enc<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public end a() {
         return new end(this.a, this.b);
      }
   }
}
