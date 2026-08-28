import javax.annotation.Nullable;

public class fny extends fmx {
   private static final xp s = xp.c("controls.keybinds.title");
   @Nullable
   public fff a;
   public long r;
   private fnx u;
   private fhg v;

   public fny(fnf $$0, ffl $$1) {
      super($$0, $$1, s);
   }

   @Override
   protected void aM_() {
      this.u = this.c(new fnx(this, this.m));
      this.v = fhg.a(xp.c("controls.resetAll"), $$0 -> {
         for (fff $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.u.c();
      }).a();
      super.aM_();
   }

   @Override
   protected void h() {
      fkx $$0 = this.d.b(fkx.e().a(8));
      $$0.a(this.v);
      $$0.a(fhg.a(xo.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.u.a(this.n, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, eyv.b.c.a($$2));
         this.a = null;
         this.u.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.c.a(this.a, eyv.bv);
         } else {
            this.c.a(this.a, eyv.a($$0, $$1));
         }

         this.a = null;
         this.r = ac.c();
         this.u.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fff $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.v.j = $$4;
   }
}
