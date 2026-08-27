import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class egu {
   private final Set<egt<?>> a;
   private final Set<egt<?>> b;

   egu(Set<egt<?>> $$0, Set<egt<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(egt<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<egt<?>> a() {
      return this.a;
   }

   public Set<egt<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eeu $$0, eem $$1) {
      Set<egt<?>> $$2 = $$1.a();
      Set<egt<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static egu.a c() {
      return new egu.a();
   }

   public static class a {
      private final Set<egt<?>> a = Sets.newIdentityHashSet();
      private final Set<egt<?>> b = Sets.newIdentityHashSet();

      public egu.a a(egt<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public egu.a b(egt<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public egu a() {
         return new egu(this.a, this.b);
      }
   }
}
