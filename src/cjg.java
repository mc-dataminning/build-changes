import javax.annotation.Nullable;

public class cjg extends ccc {
   private final cjf a;

   public cjg(cjf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dY().a(this.a.dD(), this.a.dF(), this.a.dJ(), 10.0);
   }

   @Override
   public void a() {
      arq $$0 = (arq)this.a.dY();
      bsf $$1 = $$0.d_(this.a.dy());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bvd $$2 = bup.am.a($$0, buo.k);
      if ($$2 != null) {
         $$2.e(this.a.dD(), this.a.dF(), this.a.dJ());
         $$2.a(true);
         $$0.b($$2);
         cmd $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               ciz $$5 = this.a($$1);
               if ($$5 != null) {
                  cmd $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.eb().a(0.0, 1.1485), 0.0, this.a.eb().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private ciz a(bsf $$0) {
      cjf $$1 = bup.aO.a(this.a.dY(), buo.k);
      if ($$1 != null) {
         $$1.a((arq)this.a.dY(), $$0, buo.k, null);
         $$1.a_(this.a.dD(), this.a.dF(), this.a.dJ());
         $$1.ak = 60;
         $$1.gb();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cmd a(bsf $$0, ciz $$1) {
      cmd $$2 = bup.aN.a($$1.dY(), buo.k);
      if ($$2 != null) {
         $$2.a((arq)$$1.dY(), $$0, buo.k, null);
         $$2.a_($$1.dD(), $$1.dF(), $$1.dJ());
         $$2.ak = 60;
         $$2.gb();
         if ($$2.a(buq.f).f()) {
            $$2.a(buq.f, new cwf(cwj.pH));
         }

         this.a($$2, buq.a, $$0);
         this.a($$2, buq.f, $$0);
      }

      return $$2;
   }

   private void a(cmd $$0, buq $$1, bsf $$2) {
      cwf $$3 = $$0.a($$1);
      $$3.b(ku.l, dcc.a);
      dby.a($$3, $$0.dY().H_(), ddk.a, $$2, $$0.eb());
      $$0.a($$1, $$3);
   }
}
