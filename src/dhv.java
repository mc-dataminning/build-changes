import com.mojang.serialization.MapCodec;

public class dhv extends dhj {
   public static final MapCodec<dhv> a = b(dhv::new);
   public static final int b = 6;
   public static final dvo c = dve.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ezm[] g = new ezm[]{
      dhj.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhj.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhj.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhj.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhj.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhj.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhj.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      cvk $$7 = $$0.h();
      if ($$0.a(axc.aJ) && $$1.c(c) == 0 && dhj.a($$7) instanceof dhy $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awe.ds, awf.e, 1.0F, 1.0F);
         $$2.b($$3, dhz.a($$8));
         $$2.a($$4, dzl.c, $$3);
         $$4.b(awo.c.b($$7));
         return brp.a;
      } else {
         return brp.f;
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return brp.a;
         }

         if ($$3.b(bro.a).f()) {
            return brp.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static brp a(deh $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$3.u(false)) {
         return brp.e;
      } else {
         $$3.a(awo.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dzl.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dzl.f, $$1);
         }

         return brp.a;
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
