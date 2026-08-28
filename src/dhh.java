import com.mojang.serialization.MapCodec;

public class dhh extends dgv {
   public static final MapCodec<dhh> a = b(dhh::new);
   public static final int b = 6;
   public static final dva c = duq.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eyx[] g = new eyx[]{
      dgv.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dgv.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dgv.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dgv.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dgv.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dgv.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dgv.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      cvg $$7 = $$0.h();
      if ($$0.a(axb.aJ) && $$1.c(c) == 0 && dgv.a($$7) instanceof dhk $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awd.ds, awe.e, 1.0F, 1.0F);
         $$2.b($$3, dhl.a($$8));
         $$2.a($$4, dyx.c, $$3);
         $$4.b(awn.c.b($$7));
         return brk.a;
      } else {
         return brk.f;
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return brk.a;
         }

         if ($$3.b(brj.a).f()) {
            return brk.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static brk a(ddt $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$3.u(false)) {
         return brk.e;
      } else {
         $$3.a(awn.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dyx.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dyx.f, $$1);
         }

         return brk.a;
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
