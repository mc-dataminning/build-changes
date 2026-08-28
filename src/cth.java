import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cth {
   private final List<cth.b> a;
   private final cth.b b;

   cth(List<cth.b> $$0, cth.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cth.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cth.a a() {
      return new cth.a();
   }

   public cth.b a(int $$0) {
      return this.a.get($$0);
   }

   public cth.b b() {
      return this.b;
   }

   public List<cth.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cth.b> a = new ArrayList<>();
      private cth.b b = cth.b.e;

      public cth.a a(int $$0, int $$1, int $$2, Predicate<cwp> $$3) {
         this.a.add(new cth.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cth.a a(int $$0, int $$1, int $$2) {
         this.b = new cth.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cth a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cth.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cth(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cwp> d) {
      static final cth.b e = new cth.b(0, 0, 0, $$0 -> true);
   }
}
