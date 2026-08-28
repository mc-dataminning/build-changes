import javax.annotation.Nullable;

public class fro extends frh {
   private static final wz v = wz.c("controls.keybinds.title");
   @Nullable
   public fgm a;
   public long u;
   private frn w;
   private fim x;

   public fro(fod $$0, fgs $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void D() {
      this.w = this.s.c(new frn(this, this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void C() {
      this.x = fim.a(wz.c("controls.resetAll"), $$0x -> {
         for (fgm $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.w.c();
      }).a();
      fmd $$0 = this.s.b(fmd.e().a(8));
      $$0.a(this.x);
      $$0.a(fim.a(wy.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.m, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, fae.b.c.a($$2));
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
            this.c.a(this.a, fae.bv);
         } else {
            this.c.a(this.a, fae.a($$0, $$1));
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
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fgm $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
