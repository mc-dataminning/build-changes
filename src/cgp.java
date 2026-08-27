import javax.annotation.Nullable;

public class cgp extends bzl {
   private final cgo a;

   public cgp(cgo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dU().a(this.a.dz(), this.a.dB(), this.a.dF(), 10.0);
   }

   @Override
   public void e() {
      aqt $$0 = (aqt)this.a.dU();
      bpy $$1 = $$0.d_(this.a.du());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bsn $$2 = bsb.an.a((dca)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dz(), this.a.dB(), this.a.dF());
         $$2.a(true);
         $$0.b($$2);
         cjm $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cgi $$5 = this.a($$1);
               if ($$5 != null) {
                  cjm $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.et().a(0.0, 1.1485), 0.0, this.a.et().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cgi a(bpy $$0) {
      cgo $$1 = bsb.aQ.a(this.a.dU());
      if ($$1 != null) {
         $$1.a((aqt)this.a.dU(), $$0, bss.k, null);
         $$1.a_(this.a.dz(), this.a.dB(), this.a.dF());
         $$1.aq = 60;
         $$1.gc();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cjm a(bpy $$0, cgi $$1) {
      cjm $$2 = bsb.aP.a($$1.dU());
      if ($$2 != null) {
         $$2.a((aqt)$$1.dU(), $$0, bss.k, null);
         $$2.a_($$1.dz(), $$1.dB(), $$1.dF());
         $$2.aq = 60;
         $$2.gc();
         if ($$2.d(bsc.f).d()) {
            $$2.a(bsc.f, new cuh(cuk.qZ));
         }

         $$2.a(bsc.a, dae.a($$2.et(), this.a($$2.fg()), (int)(5.0F + $$0.d() * (float)$$2.et().a(18)), false));
         $$2.a(bsc.f, dae.a($$2.et(), this.a($$2.d(bsc.f)), (int)(5.0F + $$0.d() * (float)$$2.et().a(18)), false));
      }

      return $$2;
   }

   private cuh a(cuh $$0) {
      $$0.b(ke.i, dai.a);
      return $$0;
   }
}
