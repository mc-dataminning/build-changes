import javax.annotation.Nullable;

public class ffb extends ffe implements awn {
   @Nullable
   private vq a;
   @Nullable
   private vq b;
   private int c;
   private boolean k;
   private final boolean l;

   public ffb(boolean $$0) {
      super(ewz.a);
      this.l = $$0;
   }

   @Override
   public boolean aO_() {
      return false;
   }

   @Override
   protected boolean aP_() {
      return false;
   }

   @Override
   public void a(vq $$0) {
      this.b($$0);
   }

   @Override
   public void b(vq $$0) {
      this.a = $$0;
      this.c(vq.c("menu.working"));
   }

   @Override
   public void c(vq $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.k = true;
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (this.l) {
            this.f.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.i, this.a, this.g / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.i, vq.i().b(this.b).f(" " + this.c + "%"), this.g / 2, 90, 16777215);
         }
      }
   }
}
