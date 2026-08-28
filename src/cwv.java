import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cwv {
   private final List<cwv.b> a;
   private final cwv.b b;

   cwv(List<cwv.b> $$0, cwv.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cwv.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cwv.a a() {
      return new cwv.a();
   }

   public cwv.b a(int $$0) {
      return this.a.get($$0);
   }

   public cwv.b b() {
      return this.b;
   }

   public List<cwv.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cwv.b> a = new ArrayList<>();
      private cwv.b b = cwv.b.e;

      public cwv.a a(int $$0, int $$1, int $$2, Predicate<czy> $$3) {
         this.a.add(new cwv.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cwv.a a(int $$0, int $$1, int $$2) {
         this.b = new cwv.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cwv a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cwv.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cwv(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<czy> d) {
      static final cwv.b e = new cwv.b(0, 0, 0, $$0 -> true);
   }
}
