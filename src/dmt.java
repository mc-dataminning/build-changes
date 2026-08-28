import com.mojang.serialization.MapCodec;

public class dmt extends dmf {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final int b = 6;
   public static final ebh c = eax.aB;
   public static final int d = b(0);
   private static final ffk[] e = dmf.a(6, $$0 -> dmf.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      cyz $$7 = $$0.h();
      if ($$0.a(axk.aO) && $$1.c(c) == 0 && dmf.a($$7) instanceof dmw $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awn.dv, awo.e, 1.0F, 1.0F);
         $$2.b($$3, dmx.a($$8));
         $$2.a($$4, efh.c, $$3);
         $$4.b(awx.c.b($$7));
         return bud.a;
      } else {
         return bud.f;
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bud.a;
         }

         if ($$3.b(buc.a).f()) {
            return bud.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bud a(djb $$0, iu $$1, eah $$2, crc $$3) {
      if (!$$3.t(false)) {
         return bud.e;
      } else {
         $$3.a(awx.U);
         $$3.gu().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, efh.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, efh.f, $$1);
         }

         return bud.a;
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
