import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cwx {
   private final List<cwx.b> a;
   private final cwx.b b;

   cwx(List<cwx.b> $$0, cwx.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cwx.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cwx.a a() {
      return new cwx.a();
   }

   public cwx.b a(int $$0) {
      return this.a.get($$0);
   }

   public cwx.b b() {
      return this.b;
   }

   public List<cwx.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cwx.b> a = new ArrayList<>();
      private cwx.b b = cwx.b.e;

      public cwx.a a(int $$0, int $$1, int $$2, Predicate<daa> $$3) {
         this.a.add(new cwx.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cwx.a a(int $$0, int $$1, int $$2) {
         this.b = new cwx.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cwx a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cwx.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cwx(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<daa> d) {
      static final cwx.b e = new cwx.b(0, 0, 0, $$0 -> true);
   }
}
