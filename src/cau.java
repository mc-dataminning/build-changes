import javax.annotation.Nullable;

public class cau extends caq {
   private static final bwz b = bwz.a().d();
   @Nullable
   private efg c;
   @Nullable
   private elt d;
   private boolean e;

   public cau(cao $$0) {
      super($$0);
   }

   @Override
   public cbe<cau> i() {
      return cbe.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dr(), this.a.dt(), this.a.dx());
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
   public elt g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         hx $$0 = this.a.dM().a(doq.a.f, new hx(drt.a(this.a.u())));
         int $$1 = this.a.gc() == null ? 0 : this.a.gc().e();
         if (this.a.eg().a($$1 + 3) == 0) {
            this.a.gb().a(cbe.c);
            return;
         }

         cfi $$2 = this.a.dM().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dk()) / 512.0;
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

   private void a(cfi $$0) {
      this.a.gb().a(cbe.b);
      this.a.gb().b(cbe.b).a($$0);
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

         this.d = new elt($$1, $$3, $$2);
      }
   }

   @Override
   public void a(can $$0, hx $$1, bkt $$2, @Nullable cfi $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
