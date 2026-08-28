import com.mojang.serialization.MapCodec;

public class dlw extends dhp implements dlv {
   public static final MapCodec<dlw> b = b(dlw::new);

   @Override
   public MapCodec<dlw> a() {
      return b;
   }

   public dlw(dsg.d $$0) {
      super(bpf.a(1), $$0);
   }

   @Override
   public int a(dma.a $$0, dce $$1, ja $$2, aym $$3, dma $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ja $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ja $$10 = $$7.c();
               dsh $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), avg.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dma $$0, ja $$1, ja $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aye.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aye.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dsh a(dce $$0, ja $$1, aym $$2, boolean $$3) {
      dsh $$4;
      if ($$2.a(11) == 0) {
         $$4 = dfh.qV.o().a(dlz.d, Boolean.valueOf($$3));
      } else {
         $$4 = dfh.qQ.o();
      }

      return $$4.b(dsx.C) && !$$0.b_($$1).c() ? $$4.a(dsx.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dce $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dfh.G) && $$2.u().b(eoc.c)) {
         int $$3 = 0;

         for (ja $$4 : ja.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dsh $$5 = $$0.a_($$4);
            if ($$5.a(dfh.qQ) || $$5.a(dfh.qV)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean d() {
      return false;
   }
}
