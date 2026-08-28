import javax.annotation.Nullable;

public class cji extends cce {
   private final cjh a;

   public cji(cjh $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      ard $$0 = (ard)this.a.dV();
      bsh $$1 = $$0.d_(this.a.dv());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bvf $$2 = bur.aw.a($$0, buq.k);
      if ($$2 != null) {
         $$2.e(this.a.dA(), this.a.dC(), this.a.dG());
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
                     $$5.j(this.a.dY().a(0.0, 1.1485), 0.0, this.a.dY().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cjb a(bsh $$0) {
      cjh $$1 = bur.bf.a(this.a.dV(), buq.k);
      if ($$1 != null) {
         $$1.a((ard)this.a.dV(), $$0, buq.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.fY();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cmf a(bsh $$0, cjb $$1) {
      cmf $$2 = bur.be.a($$1.dV(), buq.k);
      if ($$2 != null) {
         $$2.a((ard)$$1.dV(), $$0, buq.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.fY();
         if ($$2.a(bus.f).f()) {
            $$2.a(bus.f, new cwo(cws.ql));
         }

         this.a($$2, bus.a, $$0);
         this.a($$2, bus.f, $$0);
      }

      return $$2;
   }

   private void a(cmf $$0, bus $$1, bsh $$2) {
      cwo $$3 = $$0.a($$1);
      $$3.b(kv.l, dde.a);
      dda.a($$3, $$0.dV().K_(), dem.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
