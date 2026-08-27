import javax.annotation.Nullable;

public class fge extends fgh implements aws {
   @Nullable
   private vs a;
   @Nullable
   private vs b;
   private int c;
   private boolean k;
   private final boolean l;

   public fge(boolean $$0) {
      super(eyc.a);
      this.l = $$0;
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   protected boolean aO_() {
      return false;
   }

   @Override
   public void a(vs $$0) {
      this.b($$0);
   }

   @Override
   public void b(vs $$0) {
      this.a = $$0;
      this.c(vs.c("menu.working"));
   }

   @Override
   public void c(vs $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.k = true;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (this.l) {
            this.f.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.i, this.a, this.g / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.i, vs.i().b(this.b).f(" " + this.c + "%"), this.g / 2, 90, 16777215);
         }
      }
   }
}
