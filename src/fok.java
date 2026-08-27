import javax.annotation.Nullable;

public class fok extends fon implements ays {
   @Nullable
   private xe a;
   @Nullable
   private xe b;
   private int c;
   private boolean d;
   private final boolean r;

   public fok(boolean $$0) {
      super(fgb.a);
      this.r = $$0;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void a(xe $$0) {
      this.b($$0);
   }

   @Override
   public void b(xe $$0) {
      this.a = $$0;
      this.c(xe.c("menu.working"));
   }

   @Override
   public void c(xe $$0) {
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
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      if (this.d) {
         if (this.r) {
            this.m.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.p, this.a, this.n / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.p, xe.i().a(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}
