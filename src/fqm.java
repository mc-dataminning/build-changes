import javax.annotation.Nullable;

public class fqm extends fqf {
   private static final wu u = wu.c("controls.keybinds.title");
   @Nullable
   public ffl a;
   public long s;
   private fql v;
   private fhm w;

   public fqm(fnd $$0, ffr $$1) {
      super($$0, $$1, u);
   }

   @Override
   protected void aP_() {
      this.v = this.r.c(this.c(new fql(this, this.l)));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.w = fhm.a(wu.c("controls.resetAll"), $$0x -> {
         for (ffl $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.v.c();
      }).a();
      fld $$0 = this.r.b(fld.e().a(8));
      $$0.a(this.w);
      $$0.a(fhm.a(wt.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.r.a();
      this.v.a(this.m, this.r);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, ezb.b.c.a($$2));
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
            this.c.a(this.a, ezb.bv);
         } else {
            this.c.a(this.a, ezb.a($$0, $$1));
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
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (ffl $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.w.j = $$4;
   }
}
