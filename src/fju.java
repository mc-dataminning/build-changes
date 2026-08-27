import javax.annotation.Nullable;

public class fju extends fjx implements axs {
   @Nullable
   private wi a;
   @Nullable
   private wi b;
   private int c;
   private boolean d;
   private final boolean o;

   public fju(boolean $$0) {
      super(fbq.a);
      this.o = $$0;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void a(wi $$0) {
      this.b($$0);
   }

   @Override
   public void b(wi $$0) {
      this.a = $$0;
      this.c(wi.c("menu.working"));
   }

   @Override
   public void c(wi $$0) {
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
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.m, wi.i().b(this.b).f(" " + this.c + "%"), this.k / 2, 90, 16777215);
         }
      }
   }
}
