import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cti {
   private final List<cti.b> a;
   private final cti.b b;

   cti(List<cti.b> $$0, cti.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cti.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cti.a a() {
      return new cti.a();
   }

   public cti.b a(int $$0) {
      return this.a.get($$0);
   }

   public cti.b b() {
      return this.b;
   }

   public List<cti.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cti.b> a = new ArrayList<>();
      private cti.b b = cti.b.e;

      public cti.a a(int $$0, int $$1, int $$2, Predicate<cwq> $$3) {
         this.a.add(new cti.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cti.a a(int $$0, int $$1, int $$2) {
         this.b = new cti.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cti a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cti.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cti(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cwq> d) {
      static final cti.b e = new cti.b(0, 0, 0, $$0 -> true);
   }
}
