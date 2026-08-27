import javax.annotation.Nullable;

public class exx extends exz implements art {
   @Nullable
   private tf a;
   @Nullable
   private tf b;
   private int c;
   private boolean k;
   private final boolean l;

   public exx(boolean $$0) {
      super(eqe.a);
      this.l = $$0;
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   protected boolean aD_() {
      return false;
   }

   @Override
   public void a(tf $$0) {
      this.b($$0);
   }

   @Override
   public void b(tf $$0) {
      this.a = $$0;
      this.c(tf.c("progress.working"));
   }

   @Override
   public void c(tf $$0) {
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.i, tf.h().b(this.b).f(" " + this.c + "%"), this.g / 2, 90, 16777215);
         }
      }
   }
}
