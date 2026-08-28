import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cwk {
   private final List<cwk.b> a;
   private final cwk.b b;

   cwk(List<cwk.b> $$0, cwk.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cwk.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cwk.a a() {
      return new cwk.a();
   }

   public cwk.b a(int $$0) {
      return this.a.get($$0);
   }

   public cwk.b b() {
      return this.b;
   }

   public List<cwk.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cwk.b> a = new ArrayList<>();
      private cwk.b b = cwk.b.e;

      public cwk.a a(int $$0, int $$1, int $$2, Predicate<czn> $$3) {
         this.a.add(new cwk.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cwk.a a(int $$0, int $$1, int $$2) {
         this.b = new cwk.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cwk a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cwk.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cwk(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<czn> d) {
      static final cwk.b e = new cwk.b(0, 0, 0, $$0 -> true);
   }
}
