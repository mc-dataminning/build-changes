import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class eiv extends eje<ele> {
   private static final ImmutableList<dma> a = ImmutableList.of(dmc.I, dmc.fJ, dmc.fK, dmc.fL, dmc.fM, dmc.cE, dmc.cB);
   private static final ja[] b = ja.values();
   private static final double c = 0.9;

   public eiv(Codec<ele> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<ele> $$0) {
      boolean $$1 = false;
      azv $$2 = $$0.d();
      dju $$3 = $$0.b();
      ele $$4 = $$0.f();
      iu $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (iu $$13 : iu.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            iu $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(diw $$0, iu $$1, ele $$2) {
      dzz $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ja $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != ja.b || !$$5 && $$4 == ja.b) {
               return false;
            }
         }

         return true;
      }
   }
}
