import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class eul {
   private final Set<euk<?>> a;
   private final Set<euk<?>> b;

   eul(Set<euk<?>> $$0, Set<euk<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(euk<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<euk<?>> a() {
      return this.a;
   }

   public Set<euk<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(erx $$0, ers $$1) {
      this.a($$0.c(), $$1);
   }

   public void a(ayu $$0, ers $$1) {
      Set<euk<?>> $$2 = $$1.a();
      Set<euk<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.b("Parameters " + $$3 + " are not provided in this context");
      }
   }

   public static eul.a c() {
      return new eul.a();
   }

   public static class a {
      private final Set<euk<?>> a = Sets.newIdentityHashSet();
      private final Set<euk<?>> b = Sets.newIdentityHashSet();

      public eul.a a(euk<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public eul.a b(euk<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public eul a() {
         return new eul(this.a, this.b);
      }
   }
}
