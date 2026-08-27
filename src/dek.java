import com.mojang.serialization.MapCodec;

public class dek extends ddy {
   public static final MapCodec<dek> a = b(dek::new);
   public static final int b = 6;
   public static final dsb c = drr.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final evd[] g = new evd[]{
      ddy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ddy.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ddy.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ddy.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ddy.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ddy.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      ddy.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      ctj $$7 = $$0.g();
      if ($$0.a(awe.aJ) && $$1.c(c) == 0 && ddy.a($$7) instanceof den $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avh.dr, avi.e, 1.0F, 1.0F);
         $$2.b($$3, deo.a($$8));
         $$2.a($$4, dvu.c, $$3);
         $$4.b(avr.c.b($$7));
         return bpw.a;
      } else {
         return bpw.d;
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bpu.a;
         }

         if ($$3.b(bpt.a).e()) {
            return bpu.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bpu a(day $$0, io $$1, drb $$2, clw $$3) {
      if (!$$3.t(false)) {
         return bpu.d;
      } else {
         $$3.a(avr.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dvu.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dvu.f, $$1);
         }

         return bpu.a;
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
