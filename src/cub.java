import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cub {
   private final List<cub.b> a;
   private final cub.b b;

   cub(List<cub.b> $$0, cub.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cub.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cub.a a() {
      return new cub.a();
   }

   public cub.b a(int $$0) {
      return this.a.get($$0);
   }

   public cub.b b() {
      return this.b;
   }

   public List<cub.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cub.b> a = new ArrayList<>();
      private cub.b b = cub.b.e;

      public cub.a a(int $$0, int $$1, int $$2, Predicate<cxh> $$3) {
         this.a.add(new cub.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cub.a a(int $$0, int $$1, int $$2) {
         this.b = new cub.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cub a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cub.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cub(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cxh> d) {
      static final cub.b e = new cub.b(0, 0, 0, $$0 -> true);
   }
}
