import com.mojang.serialization.MapCodec;

public class dsb extends dmm implements dmp {
   public static final MapCodec<dsb> a = b(dsb::new);

   @Override
   public MapCodec<dsb> a() {
      return a;
   }

   public dsb(ean.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (iv $$3 : iv.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axc.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iv $$6 : iv.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         eao $$7 = $$0.a_($$6);
         if ($$7.a(dmo.oT)) {
            $$5 = true;
         }

         if ($$7.a(dmo.pc)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dmo.oT.m() : dmo.pc.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dmo.oT.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dmo.pc.m(), 3);
      }
   }

   @Override
   public dmp.a an_() {
      return dmp.a.a;
   }
}
