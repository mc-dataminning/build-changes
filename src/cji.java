import javax.annotation.Nullable;

public class cji extends cce {
   private final cjh a;

   public cji(cjh $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dW().a(this.a.dB(), this.a.dD(), this.a.dH(), 10.0);
   }

   @Override
   public void a() {
      arc $$0 = (arc)this.a.dW();
      bsh $$1 = $$0.d_(this.a.dw());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bvf $$2 = bur.ax.a($$0, buq.k);
      if ($$2 != null) {
         $$2.e(this.a.dB(), this.a.dD(), this.a.dH());
         $$2.a(true);
         $$0.b($$2);
         cmf $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cjb $$5 = this.a($$1);
               if ($$5 != null) {
                  cmf $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dZ().a(0.0, 1.1485), 0.0, this.a.dZ().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cjb a(bsh $$0) {
      cjh $$1 = bur.bg.a(this.a.dW(), buq.k);
      if ($$1 != null) {
         $$1.a((arc)this.a.dW(), $$0, buq.k, null);
         $$1.a_(this.a.dB(), this.a.dD(), this.a.dH());
         $$1.aj = 60;
         $$1.aj();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cmf a(bsh $$0, cjb $$1) {
      cmf $$2 = bur.bf.a($$1.dW(), buq.k);
      if ($$2 != null) {
         $$2.a((arc)$$1.dW(), $$0, buq.k, null);
         $$2.a_($$1.dB(), $$1.dD(), $$1.dH());
         $$2.aj = 60;
         $$2.aj();
         if ($$2.a(bus.f).f()) {
            $$2.a(bus.f, new cwp(cwt.ql));
         }

         this.a($$2, bus.a, $$0);
         this.a($$2, bus.f, $$0);
      }

      return $$2;
   }

   private void a(cmf $$0, bus $$1, bsh $$2) {
      cwp $$3 = $$0.a($$1);
      $$3.b(kv.l, ddf.a);
      ddb.a($$3, $$0.dW().K_(), den.a, $$2, $$0.dZ());
      $$0.a($$1, $$3);
   }
}
