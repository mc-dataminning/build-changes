import javax.annotation.Nullable;

public class fms extends flr {
   private static final wx s = wx.c("controls.keybinds.title");
   @Nullable
   public fdz a;
   public long r;
   private fmr u;
   private fga v;

   public fms(flz $$0, fef $$1) {
      super($$0, $$1, s);
   }

   @Override
   protected void aN_() {
      this.u = this.c(new fmr(this, this.m));
      this.v = fga.a(wx.c("controls.resetAll"), $$0 -> {
         for (fdz $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.u.d();
      }).a();
      super.aN_();
   }

   @Override
   protected void h() {
      fjr $$0 = this.d.b(fjr.e().a(8));
      $$0.a(this.v);
      $$0.a(fga.a(ww.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.u.a(this.n, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, exp.b.c.a($$2));
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
            this.c.a(this.a, exp.bv);
         } else {
            this.c.a(this.a, exp.a($$0, $$1));
         }

         this.a = null;
         this.r = ac.c();
         this.u.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fdz $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.v.j = $$4;
   }
}
