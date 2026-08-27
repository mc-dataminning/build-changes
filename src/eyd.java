import javax.annotation.Nullable;

public class eyd extends eyf implements arw {
   @Nullable
   private ti a;
   @Nullable
   private ti b;
   private int c;
   private boolean k;
   private final boolean l;

   public eyd(boolean $$0) {
      super(eqi.a);
      this.l = $$0;
   }

   @Override
   public boolean at_() {
      return false;
   }

   @Override
   protected boolean aC_() {
      return false;
   }

   @Override
   public void a(ti $$0) {
      this.b($$0);
   }

   @Override
   public void b(ti $$0) {
      this.a = $$0;
      this.c(ti.c("progress.working"));
   }

   @Override
   public void c(ti $$0) {
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
   public void a(esa $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.i, ti.h().b(this.b).f(" " + this.c + "%"), this.g / 2, 90, 16777215);
         }
      }
   }
}
