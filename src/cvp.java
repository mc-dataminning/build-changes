import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cvp {
   private final List<cvp.b> a;
   private final cvp.b b;

   cvp(List<cvp.b> $$0, cvp.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cvp.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cvp.a a() {
      return new cvp.a();
   }

   public cvp.b a(int $$0) {
      return this.a.get($$0);
   }

   public cvp.b b() {
      return this.b;
   }

   public List<cvp.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cvp.b> a = new ArrayList<>();
      private cvp.b b = cvp.b.e;

      public cvp.a a(int $$0, int $$1, int $$2, Predicate<cys> $$3) {
         this.a.add(new cvp.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cvp.a a(int $$0, int $$1, int $$2) {
         this.b = new cvp.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cvp a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cvp.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cvp(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cys> d) {
      static final cvp.b e = new cvp.b(0, 0, 0, $$0 -> true);
   }
}
