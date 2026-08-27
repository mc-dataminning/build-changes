import javax.annotation.Nullable;

public class fjl extends fjo implements axq {
   @Nullable
   private wg a;
   @Nullable
   private wg b;
   private int c;
   private boolean d;
   private final boolean o;

   public fjl(boolean $$0) {
      super(fbh.a);
      this.o = $$0;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void a(wg $$0) {
      this.b($$0);
   }

   @Override
   public void b(wg $$0) {
      this.a = $$0;
      this.c(wg.c("menu.working"));
   }

   @Override
   public void c(wg $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.d = true;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      if (this.d) {
         if (this.o) {
            this.j.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.m, this.a, this.k / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.m, wg.i().b(this.b).f(" " + this.c + "%"), this.k / 2, 90, 16777215);
         }
      }
   }
}
