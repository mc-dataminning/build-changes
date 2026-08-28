import javax.annotation.Nullable;

public class fqs extends fql {
   private static final wu u = wu.c("controls.keybinds.title");
   @Nullable
   public ffr a;
   public long s;
   private fqr v;
   private fhs w;

   public fqs(fnj $$0, ffx $$1) {
      super($$0, $$1, u);
   }

   @Override
   protected void aQ_() {
      this.v = this.r.c(new fqr(this, this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.w = fhs.a(wu.c("controls.resetAll"), $$0x -> {
         for (ffr $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.v.c();
      }).a();
      flj $$0 = this.r.b(flj.e().a(8));
      $$0.a(this.w);
      $$0.a(fhs.a(wt.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.r.a();
      this.v.a(this.m, this.r);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, ezh.b.c.a($$2));
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
            this.c.a(this.a, ezh.bv);
         } else {
            this.c.a(this.a, ezh.a($$0, $$1));
         }

         this.a = null;
         this.s = ac.c();
         this.v.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (ffr $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.w.j = $$4;
   }
}
