import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class ewf {
   private final Set<ewe<?>> a;
   private final Set<ewe<?>> b;

   ewf(Set<ewe<?>> $$0, Set<ewe<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(ewe<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<ewe<?>> a() {
      return this.a;
   }

   public Set<ewe<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(etr $$0, etm $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(azl $$0, etm $$1) {
      Set<ewe<?>> $$2 = $$1.a();
      Set<ewe<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static ewf.a c() {
      return new ewf.a();
   }

   public static class a {
      private final Set<ewe<?>> a = Sets.newIdentityHashSet();
      private final Set<ewe<?>> b = Sets.newIdentityHashSet();

      public ewf.a a(ewe<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public ewf.a b(ewe<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public ewf a() {
         return new ewf(this.a, this.b);
      }
   }
}
