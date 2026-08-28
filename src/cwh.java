import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cwh {
   private final List<cwh.b> a;
   private final cwh.b b;

   cwh(List<cwh.b> $$0, cwh.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cwh.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cwh.a a() {
      return new cwh.a();
   }

   public cwh.b a(int $$0) {
      return this.a.get($$0);
   }

   public cwh.b b() {
      return this.b;
   }

   public List<cwh.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cwh.b> a = new ArrayList<>();
      private cwh.b b = cwh.b.e;

      public cwh.a a(int $$0, int $$1, int $$2, Predicate<czk> $$3) {
         this.a.add(new cwh.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cwh.a a(int $$0, int $$1, int $$2) {
         this.b = new cwh.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cwh a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cwh.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cwh(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<czk> d) {
      static final cwh.b e = new cwh.b(0, 0, 0, $$0 -> true);
   }
}
