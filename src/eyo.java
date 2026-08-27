import javax.annotation.Nullable;

public class eyo extends exn {
   @Nullable
   public eql c;
   public long k;
   private eyn l;
   private esi m;

   public eyo(exv $$0, eqr $$1) {
      super($$0, $$1, te.c("controls.keybinds.title"));
   }

   @Override
   protected void aE_() {
      this.l = new eyn(this, this.f);
      this.e(this.l);
      this.m = this.d(esi.a(te.c("controls.resetAll"), $$0 -> {
         for (eql $$1 : this.b.X) {
            $$1.b($$1.i());
         }

         this.l.d();
      }).a(this.g / 2 - 155, this.h - 29, 150, 20).a());
      this.d(esi.a(td.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 155 + 160, this.h - 29, 150, 20).a());
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null) {
         this.b.a(this.c, ekc.b.c.a($$2));
         this.c = null;
         this.l.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.c != null) {
         if ($$0 == 256) {
            this.b.a(this.c, ekc.bv);
         } else {
            this.b.a(this.c, ekc.a($$0, $$1));
         }

         this.c = null;
         this.k = ac.b();
         this.l.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      boolean $$4 = false;

      for (eql $$5 : this.b.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.m.i = $$4;
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
