import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ctg {
   private final List<ctg.b> a;
   private final ctg.b b;

   ctg(List<ctg.b> $$0, ctg.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(ctg.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static ctg.a a() {
      return new ctg.a();
   }

   public ctg.b a(int $$0) {
      return this.a.get($$0);
   }

   public ctg.b b() {
      return this.b;
   }

   public List<ctg.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<ctg.b> a = new ArrayList<>();
      private ctg.b b = ctg.b.e;

      public ctg.a a(int $$0, int $$1, int $$2, Predicate<cwo> $$3) {
         this.a.add(new ctg.b($$0, $$1, $$2, $$3));
         return this;
      }

      public ctg.a a(int $$0, int $$1, int $$2) {
         this.b = new ctg.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public ctg a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            ctg.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new ctg(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cwo> d) {
      static final ctg.b e = new ctg.b(0, 0, 0, $$0 -> true);
   }
}
