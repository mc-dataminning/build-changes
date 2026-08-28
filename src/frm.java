import javax.annotation.Nullable;

public class frm extends frp implements azu {
   @Nullable
   private xl a;
   @Nullable
   private xl b;
   private int c;
   private boolean d;
   private final boolean s;

   public frm(boolean $$0) {
      super(fjo.a);
      this.s = $$0;
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void a(xl $$0) {
      this.b($$0);
   }

   @Override
   public void b(xl $$0) {
      this.a = $$0;
      this.c(xl.c("menu.working"));
   }

   @Override
   public void c(xl $$0) {
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
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      if (this.d) {
         if (this.s) {
            this.m.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.p, this.a, this.n / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.p, xl.i().b(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}
