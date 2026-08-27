import javax.annotation.Nullable;

public class buh extends bud {
   private static final bqm b = bqm.a().d();
   @Nullable
   private dxt c;
   @Nullable
   private eei d;
   private boolean e;

   public buh(bub $$0) {
      super($$0);
   }

   @Override
   public bur<buh> i() {
      return bur.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dn(), this.a.dp(), this.a.dt());
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
   public eei g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         gu $$0 = this.a.dI().a(dhk.a.f, new gu(dkn.a(this.a.q())));
         int $$1 = this.a.fX() == null ? 0 : this.a.fX().e();
         if (this.a.ec().a($$1 + 3) == 0) {
            this.a.fW().a(bur.c);
            return;
         }

         byo $$2 = this.a.dI().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dg()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ec().a((int)($$3 + 2.0)) == 0 || this.a.ec().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.w();
         int $$6 = $$5;
         if (this.a.ec().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.fX() != null && this.a.fX().e() >= 0) {
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

   private void a(byo $$0) {
      this.a.fW().a(bur.b);
      this.a.fW().b(bur.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         hz $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ec().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eei($$1, $$3, $$2);
      }
   }

   @Override
   public void a(bua $$0, gu $$1, ben $$2, @Nullable byo $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
