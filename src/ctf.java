import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ctf {
   private final List<ctf.b> a;
   private final ctf.b b;

   ctf(List<ctf.b> $$0, ctf.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(ctf.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static ctf.a a() {
      return new ctf.a();
   }

   public ctf.b a(int $$0) {
      return this.a.get($$0);
   }

   public ctf.b b() {
      return this.b;
   }

   public List<ctf.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<ctf.b> a = new ArrayList<>();
      private ctf.b b = ctf.b.e;

      public ctf.a a(int $$0, int $$1, int $$2, Predicate<cwn> $$3) {
         this.a.add(new ctf.b($$0, $$1, $$2, $$3));
         return this;
      }

      public ctf.a a(int $$0, int $$1, int $$2) {
         this.b = new ctf.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public ctf a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            ctf.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new ctf(this.a, this.b);
         }
      }
   }

   public static record b(int a, int b, int c, Predicate<cwn> d) {
      static final ctf.b e = new ctf.b(0, 0, 0, $$0 -> true);
   }
}
