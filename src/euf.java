import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class euf {
   private final Set<eue<?>> a;
   private final Set<eue<?>> b;

   euf(Set<eue<?>> $$0, Set<eue<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(eue<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<eue<?>> a() {
      return this.a;
   }

   public Set<eue<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(err $$0, erm $$1) {
      this.a($$0.b(), $$1);
   }

   public void a(ayt $$0, erm $$1) {
      Set<eue<?>> $$2 = $$1.a();
      Set<eue<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static euf.a c() {
      return new euf.a();
   }

   public static class a {
      private final Set<eue<?>> a = Sets.newIdentityHashSet();
      private final Set<eue<?>> b = Sets.newIdentityHashSet();

      public euf.a a(eue<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public euf.a b(eue<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public euf a() {
         return new euf(this.a, this.b);
      }
   }
}
