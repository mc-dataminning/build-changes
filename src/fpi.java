import javax.annotation.Nullable;

public class fpi extends foe {
   private static final xe s = xe.c("controls.keybinds.title");
   @Nullable
   public fgh a;
   public long r;
   private fph u;
   private fin v;

   public fpi(fon $$0, fgn $$1) {
      super($$0, $$1, s);
   }

   @Override
   protected void aN_() {
      this.u = this.c(new fph(this, this.m));
      this.v = fin.a(xe.c("controls.resetAll"), $$0 -> {
         for (fgh $$1 : this.c.Y) {
            $$1.b($$1.i());
         }

         this.u.d();
      }).a();
      super.aN_();
   }

   @Override
   protected void h() {
      fme $$0 = this.d.b(fme.e().a(8));
      $$0.a(this.v);
      $$0.a(fin.a(xd.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.u.a(this.n, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, ezx.b.c.a($$2));
         this.a = null;
         this.u.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.c.a(this.a, ezx.bv);
         } else {
            this.c.a(this.a, ezx.a($$0, $$1));
         }

         this.a = null;
         this.r = ad.b();
         this.u.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fgh $$5 : this.c.Y) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.v.j = $$4;
   }
}
