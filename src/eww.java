import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eww {
   private final Set<ewv<?>> a;
   private final Set<ewv<?>> b;

   eww(Set<ewv<?>> $$0, Set<ewv<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ewv<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ewv<?>> a() {
      return this.a;
   }

   public Set<ewv<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(eui $$0, eud $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(azq $$0, eud $$1) {
      Set<ewv<?>> $$2 = $$1.a();
      Set<ewv<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eww.a c() {
      return new eww.a();
   }

   public static class a {
      private final Set<ewv<?>> a = Sets.newIdentityHashSet();
      private final Set<ewv<?>> b = Sets.newIdentityHashSet();

      public eww.a a(ewv<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eww.a b(ewv<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eww a() {
         return new eww(this.a, this.b);
      }
   }
}
