import javax.annotation.Nullable;

public class euo extends euq implements ape {
   @Nullable
   private sw a;
   @Nullable
   private sw b;
   private int c;
   private boolean k;
   private final boolean l;

   public euo(boolean $$0) {
      super(enf.a);
      this.l = $$0;
   }

   @Override
   public boolean av_() {
      return false;
   }

   @Override
   protected boolean aH_() {
      return false;
   }

   @Override
   public void a(sw $$0) {
      this.b($$0);
   }

   @Override
   public void b(sw $$0) {
      this.a = $$0;
      this.c(sw.c("progress.working"));
   }

   @Override
   public void c(sw $$0) {
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
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (this.l) {
            this.f.a(null);
         }
      } else {
         this.a($$0);
         if (this.a != null) {
            $$0.a(this.i, this.a, this.g / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.i, sw.h().b(this.b).f(" " + this.c + "%"), this.g / 2, 90, 16777215);
         }

         super.a($$0, $$1, $$2, $$3);
      }
   }
}
