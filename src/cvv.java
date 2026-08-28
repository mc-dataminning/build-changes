import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cvv {
   private final List<cvv.b> a;
   private final cvv.b b;

   cvv(List<cvv.b> $$0, cvv.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cvv.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cvv.a a() {
      return new cvv.a();
   }

   public cvv.b a(int $$0) {
      return this.a.get($$0);
   }

   public cvv.b b() {
      return this.b;
   }

   public List<cvv.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cvv.b> a = new ArrayList<>();
      private cvv.b b = cvv.b.e;

      public cvv.a a(int $$0, int $$1, int $$2, Predicate<cyy> $$3) {
         this.a.add(new cvv.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cvv.a a(int $$0, int $$1, int $$2) {
         this.b = new cvv.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cvv a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cvv.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cvv(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cyy> d) {
      static final cvv.b e = new cvv.b(0, 0, 0, $$0 -> true);
   }
}
