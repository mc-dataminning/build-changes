import com.mojang.serialization.MapCodec;

public class dii extends dde {
   public static final MapCodec<dii> a = b(dii::new);
   public static final drf<is.a> b = dqx.H;
   protected static final int c = 2;
   protected static final eui d = dde.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eui e = dde.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.a.a));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.D_().j() && $$1.aa().b(czz.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, brn.bw)) {
            brh $$4 = brn.bw.a($$1, $$2.c(), bse.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      is.a $$6 = $$1.o();
      is.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ena($$3, $$4, $$7).c() ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if ($$3.cu()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avc.ut, avd.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.g()).a(this) && !$$1.a_($$2.h()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(kx.Z, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return csz.i;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((is.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, is.a.a);
               case a:
                  return $$0.a(b, is.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
