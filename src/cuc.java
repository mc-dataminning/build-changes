import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cuc {
   private final List<cuc.b> a;
   private final cuc.b b;

   cuc(List<cuc.b> $$0, cuc.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cuc.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cuc.a a() {
      return new cuc.a();
   }

   public cuc.b a(int $$0) {
      return this.a.get($$0);
   }

   public cuc.b b() {
      return this.b;
   }

   public List<cuc.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cuc.b> a = new ArrayList<>();
      private cuc.b b = cuc.b.e;

      public cuc.a a(int $$0, int $$1, int $$2, Predicate<cxk> $$3) {
         this.a.add(new cuc.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cuc.a a(int $$0, int $$1, int $$2) {
         this.b = new cuc.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cuc a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cuc.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cuc(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cxk> d) {
      static final cuc.b e = new cuc.b(0, 0, 0, $$0 -> true);
   }
}
