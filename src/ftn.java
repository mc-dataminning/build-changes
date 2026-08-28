import javax.annotation.Nullable;

public class ftn extends ftg {
   private static final xd v = xd.c("controls.keybinds.title");
   @Nullable
   public fij a;
   public long u;
   private ftm w;
   private fkk x;

   public ftn(fqd $$0, fip $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void E() {
      this.w = this.s.c(new ftm(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      this.x = fkk.a(xd.c("controls.resetAll"), $$0x -> {
         for (fij $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.c();
      }).a();
      foc $$0 = this.s.b(foc.e().a(8));
      $$0.a(this.x);
      $$0.a(fkk.a(xc.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fbz.b.c.a($$2));
         this.a = null;
         this.w.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.a.b(fbz.bv);
         } else {
            this.a.b(fbz.a($$0, $$1));
         }

         this.a = null;
         this.u = ad.c();
         this.w.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fij $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
