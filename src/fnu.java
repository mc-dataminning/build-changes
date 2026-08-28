import javax.annotation.Nullable;

public class fnu extends fmt {
   private static final xo s = xo.c("controls.keybinds.title");
   @Nullable
   public ffb a;
   public long r;
   private fnt u;
   private fhc v;

   public fnu(fnb $$0, ffh $$1) {
      super($$0, $$1, s);
   }

   @Override
   protected void aM_() {
      this.u = this.c(new fnt(this, this.m));
      this.v = fhc.a(xo.c("controls.resetAll"), $$0 -> {
         for (ffb $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.u.d();
      }).a();
      super.aM_();
   }

   @Override
   protected void h() {
      fkt $$0 = this.d.b(fkt.e().a(8));
      $$0.a(this.v);
      $$0.a(fhc.a(xn.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.u.a(this.n, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, eyr.b.c.a($$2));
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
            this.c.a(this.a, eyr.bv);
         } else {
            this.c.a(this.a, eyr.a($$0, $$1));
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
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (ffb $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.v.j = $$4;
   }
}
