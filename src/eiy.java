import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eiy {
   private final Set<eix<?>> a;
   private final Set<eix<?>> b;

   eiy(Set<eix<?>> $$0, Set<eix<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eix<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eix<?>> a() {
      return this.a;
   }

   public Set<eix<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(egy $$0, egq $$1) {
      Set<eix<?>> $$2 = $$1.a();
      Set<eix<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eiy.a c() {
      return new eiy.a();
   }

   public static class a {
      private final Set<eix<?>> a = Sets.newIdentityHashSet();
      private final Set<eix<?>> b = Sets.newIdentityHashSet();

      public eiy.a a(eix<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eiy.a b(eix<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eiy a() {
         return new eiy(this.a, this.b);
      }
   }
}
