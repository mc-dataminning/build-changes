import javax.annotation.Nullable;

public class cbb extends cax {
   private static final bxd b = bxd.a().d();
   @Nullable
   private efo c;
   @Nullable
   private emc d;
   private boolean e;

   public cbb(cav $$0) {
      super($$0);
   }

   @Override
   public cbl<cbb> i() {
      return cbl.a;
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
   public emc g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         hx $$0 = this.a.dL().a(doy.a.f, new hx(dsb.a(this.a.u())));
         int $$1 = this.a.gd() == null ? 0 : this.a.gd().e();
         if (this.a.eg().a($$1 + 3) == 0) {
            this.a.gc().a(cbl.c);
            return;
         }

         cfq $$2 = this.a.dL().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dj()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.eg().a((int)($$3 + 2.0)) == 0 || this.a.eg().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.A();
         int $$6 = $$5;
         if (this.a.eg().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gd() != null && this.a.gd().e() >= 0) {
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

   private void a(cfq $$0) {
      this.a.gc().a(cbl.b);
      this.a.gc().b(cbl.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jb $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eg().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new emc($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cau $$0, hx $$1, bkv $$2, @Nullable cfq $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
