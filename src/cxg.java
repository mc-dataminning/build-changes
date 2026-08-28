import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cxg {
   private final List<cxg.b> a;
   private final cxg.b b;

   cxg(List<cxg.b> $$0, cxg.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cxg.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cxg.a a() {
      return new cxg.a();
   }

   public cxg.b a(int $$0) {
      return this.a.get($$0);
   }

   public cxg.b b() {
      return this.b;
   }

   public List<cxg.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cxg.b> a = new ArrayList<>();
      private cxg.b b = cxg.b.e;

      public cxg.a a(int $$0, int $$1, int $$2, Predicate<dak> $$3) {
         this.a.add(new cxg.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cxg.a a(int $$0, int $$1, int $$2) {
         this.b = new cxg.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cxg a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cxg.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cxg(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<dak> d) {
      static final cxg.b e = new cxg.b(0, 0, 0, $$0 -> true);
   }
}
