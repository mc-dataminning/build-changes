import javax.annotation.Nullable;

public class fcw extends fbu {
   @Nullable
   public eui c;
   public long k;
   private fcv l;
   private ewh m;

   public fcw(fcc $$0, euo $$1) {
      super($$0, $$1, vb.c("controls.keybinds.title"));
   }

   @Override
   protected void aP_() {
      this.l = new fcv(this, this.f);
      this.e(this.l);
      this.m = this.d(ewh.a(vb.c("controls.resetAll"), $$0 -> {
         for (eui $$1 : this.b.X) {
            $$1.b($$1.i());
         }

         this.l.e();
      }).a(this.g / 2 - 155, this.h - 29, 150, 20).a());
      this.d(ewh.a(va.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 155 + 160, this.h - 29, 150, 20).a());
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null) {
         this.b.a(this.c, eny.b.c.a($$2));
         this.c = null;
         this.l.e();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.c != null) {
         if ($$0 == 256) {
            this.b.a(this.c, eny.bv);
         } else {
            this.b.a(this.c, eny.a($$0, $$1));
         }

         this.c = null;
         this.k = ac.b();
         this.l.e();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      boolean $$4 = false;

      for (eui $$5 : this.b.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.m.i = $$4;
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
