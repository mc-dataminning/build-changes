import javax.annotation.Nullable;

public class fnu extends fnx implements ayu {
   @Nullable
   private wy a;
   @Nullable
   private wy b;
   private int c;
   private boolean q;
   private final boolean r;

   public fnu(boolean $$0) {
      super(fga.a);
      this.r = $$0;
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected boolean aO_() {
      return false;
   }

   @Override
   public void a(wy $$0) {
      this.b($$0);
   }

   @Override
   public void b(wy $$0) {
      this.a = $$0;
      this.c(wy.c("menu.working"));
   }

   @Override
   public void c(wy $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.q = true;
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      if (this.q) {
         if (this.r) {
            this.l.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.o, this.a, this.m / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.o, wy.i().b(this.b).f(" " + this.c + "%"), this.m / 2, 90, 16777215);
         }
      }
   }
}
