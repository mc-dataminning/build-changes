import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cty {
   private final List<cty.b> a;
   private final cty.b b;

   cty(List<cty.b> $$0, cty.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cty.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cty.a a() {
      return new cty.a();
   }

   public cty.b a(int $$0) {
      return this.a.get($$0);
   }

   public cty.b b() {
      return this.b;
   }

   public List<cty.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cty.b> a = new ArrayList<>();
      private cty.b b = cty.b.e;

      public cty.a a(int $$0, int $$1, int $$2, Predicate<cxg> $$3) {
         this.a.add(new cty.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cty.a a(int $$0, int $$1, int $$2) {
         this.b = new cty.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cty a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cty.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cty(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cxg> d) {
      static final cty.b e = new cty.b(0, 0, 0, $$0 -> true);
   }
}
