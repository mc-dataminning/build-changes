import javax.annotation.Nullable;

public class flg extends fjy {
   @Nullable
   protected fln a;
   protected boolean b;

   public flg(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, xc.a);
      this.b = $$4;
   }

   public void a(fln $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fnx $$0) {
      this.c($$0);
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(ghe::C, this.a.a(this.b, this.B()), this.D(), this.E(), this.g, this.h);
      }
   }
}
