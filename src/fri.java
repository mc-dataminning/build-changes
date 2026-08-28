import javax.annotation.Nullable;

public class fri extends frb {
   private static final wy u = wy.c("controls.keybinds.title");
   @Nullable
   public fgg a;
   public long s;
   private frh v;
   private fig w;

   public fri(fnx $$0, fgm $$1) {
      super($$0, $$1, u);
   }

   @Override
   protected void aQ_() {
      this.v = this.r.c(new frh(this, this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      this.w = fig.a(wy.c("controls.resetAll"), $$0x -> {
         for (fgg $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.v.c();
      }).a();
      flx $$0 = this.r.b(flx.e().a(8));
      $$0.a(this.w);
      $$0.a(fig.a(wx.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.r.a();
      this.v.a(this.m, this.r);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, ezy.b.c.a($$2));
         this.a = null;
         this.v.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.c.a(this.a, ezy.bv);
         } else {
            this.c.a(this.a, ezy.a($$0, $$1));
         }

         this.a = null;
         this.s = ad.c();
         this.v.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fgg $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.w.j = $$4;
   }
}
