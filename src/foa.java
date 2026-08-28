import javax.annotation.Nullable;

public class foa extends fod implements ayv {
   @Nullable
   private wz a;
   @Nullable
   private wz b;
   private int c;
   private boolean r;
   private final boolean s;

   public foa(boolean $$0) {
      super(fgg.a);
      this.s = $$0;
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Override
   protected boolean aS_() {
      return false;
   }

   @Override
   public void a(wz $$0) {
      this.b($$0);
   }

   @Override
   public void b(wz $$0) {
      this.a = $$0;
      this.c(wz.c("menu.working"));
   }

   @Override
   public void c(wz $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.r = true;
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.r) {
         if (this.s) {
            this.l.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.o, this.a, this.m / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.o, wz.i().b(this.b).f(" " + this.c + "%"), this.m / 2, 90, 16777215);
         }
      }
   }
}
