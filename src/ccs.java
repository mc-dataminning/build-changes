import javax.annotation.Nullable;

public class ccs extends cco {
   private static final byu b = byu.a().d();
   @Nullable
   private ehe c;
   @Nullable
   private ens d;
   private boolean e;

   public ccs(ccm $$0) {
      super($$0);
   }

   @Override
   public cdc<ccs> i() {
      return cdc.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dr(), this.a.dt(), this.a.dx());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.O || this.a.P) {
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
   public ens g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         hz $$0 = this.a.dM().a(dqo.a.f, new hz(dtr.a(this.a.u())));
         int $$1 = this.a.ge() == null ? 0 : this.a.ge().e();
         if (this.a.eh().a($$1 + 3) == 0) {
            this.a.gd().a(cdc.c);
            return;
         }

         chh $$2 = this.a.dM().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dk()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.eh().a((int)($$3 + 2.0)) == 0 || this.a.eh().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.A();
         int $$6 = $$5;
         if (this.a.eh().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.ge() != null && this.a.ge().e() >= 0) {
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

   private void a(chh $$0) {
      this.a.gd().a(cdc.b);
      this.a.gd().b(cdc.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jd $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eh().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ens($$1, $$3, $$2);
      }
   }

   @Override
   public void a(ccl $$0, hz $$1, bmn $$2, @Nullable chh $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
