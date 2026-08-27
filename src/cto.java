import com.mojang.serialization.MapCodec;

public class cto extends ctc {
   public static final MapCodec<cto> a = b(cto::new);
   public static final int b = 6;
   public static final dgd c = dft.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eia[] g = new eia[]{
      ctc.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ctc.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ctc.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ctc.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ctc.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ctc.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ctc.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cto> a() {
      return a;
   }

   protected cto(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      cjg $$7 = $$6.d();
      if ($$6.a(aqd.ai) && $$0.c(c) == 0) {
         ctc $$8 = ctc.a($$7);
         if ($$8 instanceof ctr) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, apg.cK, aph.e, 1.0F, 1.0F);
            $$1.b($$2, cts.a($$8));
            $$1.a($$3, djn.c, $$2);
            $$3.b(apq.c.b($$7));
            return bhe.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bhe.a;
         }

         if ($$6.b()) {
            return bhe.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bhe a(cqc $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$3.t(false)) {
         return bhe.d;
      } else {
         $$3.a(apq.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, djn.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, djn.f, $$1);
         }

         return bhe.a;
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
