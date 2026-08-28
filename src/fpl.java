import javax.annotation.Nullable;

public class fpl extends foc {
   @Nullable
   protected fps a;
   protected boolean b;

   public fpl(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, xu.a);
      this.b = $$4;
   }

   public void a(fps $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fsc $$0) {
      this.c($$0);
   }

   @Override
   public void b(fnr $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(glu::C, this.a.a(this.b, this.B()), this.D(), this.E(), this.g, this.h);
      }
   }
}
