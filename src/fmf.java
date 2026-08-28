import javax.annotation.Nullable;

public class fmf extends fkx {
   @Nullable
   protected fmm a;
   protected boolean b;

   public fmf(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, xg.a);
      this.b = $$4;
   }

   public void a(fmm $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fox $$0) {
      this.c($$0);
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(gig::B, this.a.a(this.b, this.B()), this.D(), this.E(), this.g, this.h);
      }
   }
}
