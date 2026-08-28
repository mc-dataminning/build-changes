import javax.annotation.Nullable;

public class ftd extends fsw {
   private static final xd v = xd.c("controls.keybinds.title");
   @Nullable
   public fhz a;
   public long u;
   private ftc w;
   private fka x;

   public ftd(fpt $$0, fif $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void E() {
      this.w = this.s.c(new ftc(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      this.x = fka.a(xd.c("controls.resetAll"), $$0x -> {
         for (fhz $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.c();
      }).a();
      fns $$0 = this.s.b(fns.e().a(8));
      $$0.a(this.x);
      $$0.a(fka.a(xc.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fbk.b.c.a($$2));
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
            this.a.b(fbk.bv);
         } else {
            this.a.b(fbk.a($$0, $$1));
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
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fhz $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
