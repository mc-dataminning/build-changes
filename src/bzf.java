import javax.annotation.Nullable;

public class bzf extends bzb {
   private static final bvk b = bvk.a().d();
   @Nullable
   private ecv c;
   @Nullable
   private eji d;
   private boolean e;

   public bzf(byz $$0) {
      super($$0);
   }

   @Override
   public bzp<bzf> i() {
      return bzp.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dq(), this.a.ds(), this.a.dw());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
         this.j();
      }
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Nullable
   @Override
   public eji g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ht $$0 = this.a.dL().a(dmf.a.f, new ht(dpi.a(this.a.s())));
         int $$1 = this.a.gc() == null ? 0 : this.a.gc().e();
         if (this.a.ef().a($$1 + 3) == 0) {
            this.a.gb().a(bzp.c);
            return;
         }

         cdm $$2 = this.a.dL().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dj()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ef().a((int)($$3 + 2.0)) == 0 || this.a.ef().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.ef().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gc() != null && this.a.gc().e() >= 0) {
            $$6 %= 12;
            if ($$6 < 0) {
               $$6 += 12;
            }
         } else {
            $$6 -= 12;
            $$6 &= 7;
            $$6 += 12;
         }

         this.c = this.a.a($$5, $$6, null);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
   }

   private void a(cdm $$0) {
      this.a.gb().a(bzp.b);
      this.a.gb().b(bzp.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         iw $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ef().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eji($$1, $$3, $$2);
      }
   }

   @Override
   public void a(byy $$0, ht $$1, bjg $$2, @Nullable cdm $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
