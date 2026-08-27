import com.mojang.serialization.MapCodec;

public class dhk extends dch {
   public static final MapCodec<dhk> a = b(dhk::new);
   public static final dqg<ij.a> b = dpy.H;
   protected static final int c = 2;
   protected static final etc d = dch.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final etc e = dch.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   public dhk(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.a.a));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.D_().j() && $$1.aa().b(czc.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bqg.bw)) {
            bqa $$4 = bqg.bw.a($$1, $$2.c(), bqx.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      ij.a $$6 = $$1.o();
      ij.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new emb($$3, $$4, $$7).c() ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auo.ul, aup.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(kn.aa, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return crs.i;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ij.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ij.a.a);
               case a:
                  return $$0.a(b, ij.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }
}
