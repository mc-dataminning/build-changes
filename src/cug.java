import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cug {
   private final List<cug.b> a;
   private final cug.b b;

   cug(List<cug.b> $$0, cug.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cug.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cug.a a() {
      return new cug.a();
   }

   public cug.b a(int $$0) {
      return this.a.get($$0);
   }

   public cug.b b() {
      return this.b;
   }

   public List<cug.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<cug.b> a = new ArrayList<>();
      private cug.b b = cug.b.e;

      public cug.a a(int $$0, int $$1, int $$2, Predicate<cxo> $$3) {
         this.a.add(new cug.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cug.a a(int $$0, int $$1, int $$2) {
         this.b = new cug.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cug a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            cug.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new cug(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cxo> d) {
      static final cug.b e = new cug.b(0, 0, 0, $$0 -> true);
   }
}
