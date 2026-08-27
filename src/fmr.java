import javax.annotation.Nullable;

public class fmr extends flq {
   private static final wx s = wx.c("controls.keybinds.title");
   @Nullable
   public fdx a;
   public long r;
   private fmq u;
   private ffz v;

   public fmr(fly $$0, fed $$1) {
      super($$0, $$1, s);
   }

   @Override
   protected void aM_() {
      this.u = this.c(new fmq(this, this.m));
      this.v = ffz.a(wx.c("controls.resetAll"), $$0 -> {
         for (fdx $$1 : this.c.X) {
            $$1.b($$1.i());
         }

         this.u.d();
      }).a();
      super.aM_();
   }

   @Override
   protected void h() {
      fjq $$0 = this.d.b(fjq.e().a(8));
      $$0.a(this.v);
      $$0.a(ffz.a(ww.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.u.a(this.n, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, exn.b.c.a($$2));
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
            this.c.a(this.a, exn.bv);
         } else {
            this.c.a(this.a, exn.a($$0, $$1));
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
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fdx $$5 : this.c.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.v.j = $$4;
   }
}
