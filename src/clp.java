import javax.annotation.Nullable;

public class clp extends cef {
   private final clo a;

   public clp(clo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dU().a(this.a.dz(), this.a.dB(), this.a.dF(), 10.0);
   }

   @Override
   public void a() {
      arq $$0 = (arq)this.a.dU();
      bue $$1 = $$0.d_(this.a.du());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bxi $$2 = bwr.aw.a($$0, bwq.k);
      if ($$2 != null) {
         $$2.d(this.a.dz(), this.a.dB(), this.a.dF());
         $$2.a(true);
         $$0.b($$2);
         cow $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cli $$5 = this.a($$1);
               if ($$5 != null) {
                  cow $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.i(this.a.dX().a(0.0, 1.1485), 0.0, this.a.dX().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cli a(bue $$0) {
      clo $$1 = bwr.bg.a(this.a.dU(), bwq.k);
      if ($$1 != null) {
         $$1.a((arq)this.a.dU(), $$0, bwq.k, null);
         $$1.a_(this.a.dz(), this.a.dB(), this.a.dF());
         $$1.aj = 60;
         $$1.gb();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cow a(bue $$0, cli $$1) {
      cow $$2 = bwr.bf.a($$1.dU(), bwq.k);
      if ($$2 != null) {
         $$2.a((arq)$$1.dU(), $$0, bwq.k, null);
         $$2.a_($$1.dz(), $$1.dB(), $$1.dF());
         $$2.aj = 60;
         $$2.gb();
         if ($$2.a(bws.f).f()) {
            $$2.a(bws.f, new czn(czr.qu));
         }

         this.a($$2, bws.a, $$0);
         this.a($$2, bws.f, $$0);
      }

      return $$2;
   }

   private void a(cow $$0, bws $$1, bue $$2) {
      czn $$3 = $$0.a($$1);
      $$3.b(kk.l, dgg.a);
      dgc.a($$3, $$0.dU().F_(), dho.a, $$2, $$0.dX());
      $$0.a($$1, $$3);
   }
}
