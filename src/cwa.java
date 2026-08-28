import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cwa {
   private final List<cwa.b> a;
   private final cwa.b b;

   cwa(List<cwa.b> $$0, cwa.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cwa.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cwa.a a() {
      return new cwa.a();
   }

   public cwa.b a(int $$0) {
      return this.a.get($$0);
   }

   public cwa.b b() {
      return this.b;
   }

   public List<cwa.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cwa.b> a = new ArrayList<>();
      private cwa.b b = cwa.b.e;

      public cwa.a a(int $$0, int $$1, int $$2, Predicate<czd> $$3) {
         this.a.add(new cwa.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cwa.a a(int $$0, int $$1, int $$2) {
         this.b = new cwa.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cwa a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cwa.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cwa(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<czd> d) {
      static final cwa.b e = new cwa.b(0, 0, 0, $$0 -> true);
   }
}
