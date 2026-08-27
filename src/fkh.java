import javax.annotation.Nullable;

public class fkh extends fjg {
   private static final wg p = wg.c("controls.keybinds.title");
   @Nullable
   public fbn a;
   public long o;
   private fkg q;
   private fdp r;

   public fkh(fjo $$0, fbt $$1) {
      super($$0, $$1, p);
   }

   @Override
   protected void aN_() {
      this.q = this.c(new fkg(this, this.j));
      this.r = fdp.a(wg.c("controls.resetAll"), $$0 -> {
         for (fbn $$1 : this.c.X) {
            $$1.b($$1.i());
         }

         this.q.d();
      }).a();
      super.aN_();
   }

   @Override
   protected void h() {
      fhg $$0 = this.d.b(fhg.e().a(8));
      $$0.a(this.r);
      $$0.a(fdp.a(wf.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.q.a(this.k, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, evd.b.c.a($$2));
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
            this.c.a(this.a, evd.bv);
         } else {
            this.c.a(this.a, evd.a($$0, $$1));
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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fbn $$5 : this.c.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.r.j = $$4;
   }
}
