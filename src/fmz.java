import javax.annotation.Nullable;

public class fmz extends fnc implements azf {
   @Nullable
   private xo a;
   @Nullable
   private xo b;
   private int c;
   private boolean d;
   private final boolean r;

   public fmz(boolean $$0) {
      super(few.a);
      this.r = $$0;
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void a(xo $$0) {
      this.b($$0);
   }

   @Override
   public void b(xo $$0) {
      this.a = $$0;
      this.c(xo.c("menu.working"));
   }

   @Override
   public void c(xo $$0) {
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
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.p, xo.i().b(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}
