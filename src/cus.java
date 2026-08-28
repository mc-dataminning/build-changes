import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cus {
   private final List<cus.b> a;
   private final cus.b b;

   cus(List<cus.b> $$0, cus.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cus.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cus.a a() {
      return new cus.a();
   }

   public cus.b a(int $$0) {
      return this.a.get($$0);
   }

   public cus.b b() {
      return this.b;
   }

   public List<cus.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cus.b> a = new ArrayList<>();
      private cus.b b = cus.b.e;

      public cus.a a(int $$0, int $$1, int $$2, Predicate<cxy> $$3) {
         this.a.add(new cus.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cus.a a(int $$0, int $$1, int $$2) {
         this.b = new cus.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cus a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cus.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cus(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cxy> d) {
      static final cus.b e = new cus.b(0, 0, 0, $$0 -> true);
   }
}
