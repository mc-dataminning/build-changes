import javax.annotation.Nullable;

public class fla extends fld implements ayf {
   @Nullable
   private wu a;
   @Nullable
   private wu b;
   private int c;
   private boolean d;
   private final boolean r;

   public fla(boolean $$0) {
      super(fcw.a);
      this.r = $$0;
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
   public void a(wu $$0) {
      this.b($$0);
   }

   @Override
   public void b(wu $$0) {
      this.a = $$0;
      this.c(wu.c("menu.working"));
   }

   @Override
   public void c(wu $$0) {
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.p, wu.i().b(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}
