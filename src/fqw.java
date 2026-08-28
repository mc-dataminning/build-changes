import javax.annotation.Nullable;

public class fqw extends fpo {
   @Nullable
   protected frd a;
   protected boolean b;

   public fqw(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wo.a);
      this.b = $$4;
   }

   public void a(frd $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(ftn $$0) {
      this.c($$0);
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(gnh::H, this.a.a(this.b, this.D()), this.F(), this.G(), this.g, this.h);
      }
   }
}
