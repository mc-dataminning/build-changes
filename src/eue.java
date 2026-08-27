import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eue {
   private final Set<eud<?>> a;
   private final Set<eud<?>> b;

   eue(Set<eud<?>> $$0, Set<eud<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eud<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eud<?>> a() {
      return this.a;
   }

   public Set<eud<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(erv $$0, erq $$1) {
      Set<eud<?>> $$2 = $$1.a();
      Set<eud<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eue.a c() {
      return new eue.a();
   }

   public static class a {
      private final Set<eud<?>> a = Sets.newIdentityHashSet();
      private final Set<eud<?>> b = Sets.newIdentityHashSet();

      public eue.a a(eud<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eue.a b(eud<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eue a() {
         return new eue(this.a, this.b);
      }
   }
}
