import com.mojang.serialization.MapCodec;

public class djc extends diq {
   public static final MapCodec<djc> a = b(djc::new);
   public static final int b = 6;
   public static final dwu c = dwl.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fas[] g = new fas[]{
      diq.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      diq.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      diq.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      diq.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      diq.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      diq.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      diq.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      cwi $$7 = $$0.h();
      if ($$0.a(axl.aO) && $$1.c(c) == 0 && diq.a($$7) instanceof djf $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awn.ds, awo.e, 1.0F, 1.0F);
         $$2.b($$3, djg.a($$8));
         $$2.a($$4, ear.c, $$3);
         $$4.b(awx.c.b($$7));
         return bsk.a;
      } else {
         return bsk.f;
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsk.a;
         }

         if ($$3.b(bsj.a).f()) {
            return bsk.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsk a(dfn $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$3.u(false)) {
         return bsk.e;
      } else {
         $$3.a(awx.U);
         $$3.gr().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ear.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ear.f, $$1);
         }

         return bsk.a;
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
