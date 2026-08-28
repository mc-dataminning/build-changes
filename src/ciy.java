import javax.annotation.Nullable;

public class ciy extends ciu {
   private static final cev b = cev.a().d();
   @Nullable
   private eqp c;
   @Nullable
   private eye d;
   private boolean e;

   public ciy(cis $$0) {
      super($$0);
   }

   @Override
   public cji<ciy> i() {
      return cji.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dx(), this.a.dz(), this.a.dD());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
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
   public eye g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         je $$0 = this.a.dS().a(dzw.a.f, new je(edb.a(this.a.q())));
         int $$1 = this.a.gm() == null ? 0 : this.a.gm().e();
         if (this.a.dV().a($$1 + 3) == 0) {
            this.a.gl().a(cji.c);
            return;
         }

         cnp $$2 = this.a.dS().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dq()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.dV().a((int)($$3 + 2.0)) == 0 || this.a.dV().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.dV().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gm() != null && this.a.gm().e() >= 0) {
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

   private void a(cnp $$0) {
      this.a.gl().a(cji.b);
      this.a.gl().b(cji.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ki $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dV().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eye($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cir $$0, je $$1, bsb $$2, @Nullable cnp $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
