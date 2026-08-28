import javax.annotation.Nullable;

public class fnx extends fmw {
   private static final xp s = xp.c("controls.keybinds.title");
   @Nullable
   public ffe a;
   public long r;
   private fnw u;
   private fhf v;

   public fnx(fne $$0, ffk $$1) {
      super($$0, $$1, s);
   }

   @Override
   protected void aM_() {
      this.u = this.c(new fnw(this, this.m));
      this.v = fhf.a(xp.c("controls.resetAll"), $$0 -> {
         for (ffe $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.u.c();
      }).a();
      super.aM_();
   }

   @Override
   protected void h() {
      fkw $$0 = this.d.b(fkw.e().a(8));
      $$0.a(this.v);
      $$0.a(fhf.a(xo.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.u.a(this.n, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, eyu.b.c.a($$2));
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
            this.c.a(this.a, eyu.bv);
         } else {
            this.c.a(this.a, eyu.a($$0, $$1));
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (ffe $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.v.j = $$4;
   }
}
