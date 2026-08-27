import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class epv {
   private final Set<epu<?>> a;
   private final Set<epu<?>> b;

   epv(Set<epu<?>> $$0, Set<epu<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(epu<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<epu<?>> a() {
      return this.a;
   }

   public Set<epu<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(ent $$0, enl $$1) {
      Set<epu<?>> $$2 = $$1.a();
      Set<epu<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static epv.a c() {
      return new epv.a();
   }

   public static class a {
      private final Set<epu<?>> a = Sets.newIdentityHashSet();
      private final Set<epu<?>> b = Sets.newIdentityHashSet();

      public epv.a a(epu<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public epv.a b(epu<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public epv a() {
         return new epv(this.a, this.b);
      }
   }
}
