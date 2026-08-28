import javax.annotation.Nullable;

public class fnb extends fne implements azg {
   @Nullable
   private xp a;
   @Nullable
   private xp b;
   private int c;
   private boolean d;
   private final boolean r;

   public fnb(boolean $$0) {
      super(fey.a);
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
   public void a(xp $$0) {
      this.b($$0);
   }

   @Override
   public void b(xp $$0) {
      this.a = $$0;
      this.c(xp.c("menu.working"));
   }

   @Override
   public void c(xp $$0) {
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.p, xp.i().b(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}
