import javax.annotation.Nullable;

public class fhz extends fgx {
   @Nullable
   public eze c;
   public long k;
   private fhy l;
   private fbg m;

   public fhz(fhf $$0, ezk $$1) {
      super($$0, $$1, vu.c("controls.keybinds.title"));
   }

   @Override
   protected void aO_() {
      this.l = this.c(new fhy(this, this.f));
      this.m = this.c(fbg.a(vu.c("controls.resetAll"), $$0 -> {
         for (eze $$1 : this.b.X) {
            $$1.b($$1.i());
         }

         this.l.d();
      }).a(this.g / 2 - 155, this.h - 29, 150, 20).a());
      this.c(fbg.a(vt.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 155 + 160, this.h - 29, 150, 20).a());
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null) {
         this.b.a(this.c, esu.b.c.a($$2));
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
            this.b.a(this.c, esu.bv);
         } else {
            this.b.a(this.c, esu.a($$0, $$1));
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
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      boolean $$4 = false;

      for (eze $$5 : this.b.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.m.j = $$4;
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
