import javax.annotation.Nullable;

public class fkq extends fjp {
   private static final wi p = wi.c("controls.keybinds.title");
   @Nullable
   public fbw a;
   public long o;
   private fkp q;
   private fdy r;

   public fkq(fjx $$0, fcc $$1) {
      super($$0, $$1, p);
   }

   @Override
   protected void aM_() {
      this.q = this.c(new fkp(this, this.j));
      this.r = fdy.a(wi.c("controls.resetAll"), $$0 -> {
         for (fbw $$1 : this.c.X) {
            $$1.b($$1.i());
         }

         this.q.d();
      }).a();
      super.aM_();
   }

   @Override
   protected void h() {
      fhp $$0 = this.d.b(fhp.e().a(8));
      $$0.a(this.r);
      $$0.a(fdy.a(wh.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.q.a(this.k, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, evm.b.c.a($$2));
         this.a = null;
         this.q.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.c.a(this.a, evm.bv);
         } else {
            this.c.a(this.a, evm.a($$0, $$1));
         }

         this.a = null;
         this.o = ac.b();
         this.q.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fbw $$5 : this.c.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.r.j = $$4;
   }
}
