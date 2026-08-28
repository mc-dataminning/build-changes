import javax.annotation.Nullable;

public class flq extends fki {
   @Nullable
   protected flx a;
   protected boolean b;

   public flq(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, xc.a);
      this.b = $$4;
   }

   public void a(flx $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(foh $$0) {
      this.c($$0);
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(ghq::B, this.a.a(this.b, this.B()), this.D(), this.E(), this.g, this.h);
      }
   }
}
