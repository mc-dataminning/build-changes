import javax.annotation.Nullable;

public class fcx extends fda implements aut {
   @Nullable
   private vf a;
   @Nullable
   private vf b;
   private int c;
   private boolean k;
   private final boolean l;

   public fcx(boolean $$0) {
      super(euz.a);
      this.l = $$0;
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void a(vf $$0) {
      this.b($$0);
   }

   @Override
   public void b(vf $$0) {
      this.a = $$0;
      this.c(vf.c("menu.working"));
   }

   @Override
   public void c(vf $$0) {
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
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.i, vf.i().b(this.b).f(" " + this.c + "%"), this.g / 2, 90, 16777215);
         }
      }
   }
}
