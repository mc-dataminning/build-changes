import javax.annotation.Nullable;

public class fuf extends fui implements azf {
   @Nullable
   private wo a;
   @Nullable
   private wo b;
   private int c;
   private boolean d;
   private final boolean s;

   public fuf(boolean $$0) {
      super(fky.a);
      this.s = $$0;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected boolean aQ_() {
      return false;
   }

   @Override
   public void a(wo $$0) {
      this.b($$0);
   }

   @Override
   public void b(wo $$0) {
      this.a = $$0;
      this.c(wo.c("menu.working"));
   }

   @Override
   public void c(wo $$0) {
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
   public void a(fob $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.p, wo.i().b(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}
