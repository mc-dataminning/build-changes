import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class erv {
   private final Set<eru<?>> a;
   private final Set<eru<?>> b;

   erv(Set<eru<?>> $$0, Set<eru<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eru<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eru<?>> a() {
      return this.a;
   }

   public Set<eru<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(epl $$0, epg $$1) {
      Set<eru<?>> $$2 = $$1.a();
      Set<eru<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static erv.a c() {
      return new erv.a();
   }

   public static class a {
      private final Set<eru<?>> a = Sets.newIdentityHashSet();
      private final Set<eru<?>> b = Sets.newIdentityHashSet();

      public erv.a a(eru<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public erv.a b(eru<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public erv a() {
         return new erv(this.a, this.b);
      }
   }
}
