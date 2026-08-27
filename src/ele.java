import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ele {
   private final Set<eld<?>> a;
   private final Set<eld<?>> b;

   ele(Set<eld<?>> $$0, Set<eld<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eld<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eld<?>> a() {
      return this.a;
   }

   public Set<eld<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eje $$0, eiw $$1) {
      Set<eld<?>> $$2 = $$1.a();
      Set<eld<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ele.a c() {
      return new ele.a();
   }

   public static class a {
      private final Set<eld<?>> a = Sets.newIdentityHashSet();
      private final Set<eld<?>> b = Sets.newIdentityHashSet();

      public ele.a a(eld<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ele.a b(eld<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ele a() {
         return new ele(this.a, this.b);
      }
   }
}
