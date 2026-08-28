import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cuh {
   private final List<cuh.b> a;
   private final cuh.b b;

   cuh(List<cuh.b> $$0, cuh.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cuh.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cuh.a a() {
      return new cuh.a();
   }

   public cuh.b a(int $$0) {
      return this.a.get($$0);
   }

   public cuh.b b() {
      return this.b;
   }

   public List<cuh.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cuh.b> a = new ArrayList<>();
      private cuh.b b = cuh.b.e;

      public cuh.a a(int $$0, int $$1, int $$2, Predicate<cxp> $$3) {
         this.a.add(new cuh.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cuh.a a(int $$0, int $$1, int $$2) {
         this.b = new cuh.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cuh a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cuh.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cuh(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cxp> d) {
      static final cuh.b e = new cuh.b(0, 0, 0, $$0 -> true);
   }
}
