import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class enf {
   private final Set<ene<?>> a;
   private final Set<ene<?>> b;

   enf(Set<ene<?>> $$0, Set<ene<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ene<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ene<?>> a() {
      return this.a;
   }

   public Set<ene<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(elf $$0, ekx $$1) {
      Set<ene<?>> $$2 = $$1.a();
      Set<ene<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static enf.a c() {
      return new enf.a();
   }

   public static class a {
      private final Set<ene<?>> a = Sets.newIdentityHashSet();
      private final Set<ene<?>> b = Sets.newIdentityHashSet();

      public enf.a a(ene<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public enf.a b(ene<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public enf a() {
         return new enf(this.a, this.b);
      }
   }
}
