import javax.annotation.Nullable;

public class cgr extends bzo {
   private final cgq a;

   public cgr(cgq $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dP().a(this.a.du(), this.a.dw(), this.a.dA(), 10.0);
   }

   @Override
   public void e() {
      aqn $$0 = (aqn)this.a.dP();
      bpu $$1 = $$0.d_(this.a.dp());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bsp $$2 = bsc.am.a((daz)$$0);
      if ($$2 != null) {
         $$2.e(this.a.du(), this.a.dw(), this.a.dA());
         $$2.a(true);
         $$0.b($$2);
         cjm $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cgk $$5 = this.a($$1);
               if ($$5 != null) {
                  cjm $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.el().a(0.0, 1.1485), 0.0, this.a.el().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cgk a(bpu $$0) {
      cgq $$1 = bsc.aO.a(this.a.dP());
      if ($$1 != null) {
         $$1.a((aqn)this.a.dP(), $$0, bsu.k, null);
         $$1.a_(this.a.du(), this.a.dw(), this.a.dA());
         $$1.am = 60;
         $$1.fT();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cjm a(bpu $$0, cgk $$1) {
      cjm $$2 = bsc.aN.a($$1.dP());
      if ($$2 != null) {
         $$2.a((aqn)$$1.dP(), $$0, bsu.k, null);
         $$2.a_($$1.du(), $$1.dw(), $$1.dA());
         $$2.am = 60;
         $$2.fT();
         if ($$2.a(bsd.f).e()) {
            $$2.a(bsd.f, new ctq(ctt.pG));
         }

         col $$3 = $$1.dP().J();
         $$2.a(bsd.a, czc.a($$3, $$2.el(), this.a($$2.eX()), (int)(5.0F + $$0.d() * (float)$$2.el().a(18)), false));
         $$2.a(bsd.f, czc.a($$3, $$2.el(), this.a($$2.a(bsd.f)), (int)(5.0F + $$0.d() * (float)$$2.el().a(18)), false));
      }

      return $$2;
   }

   private ctq a(ctq $$0) {
      $$0.b(kb.j, czg.a);
      return $$0;
   }
}
