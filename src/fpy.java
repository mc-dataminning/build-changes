import javax.annotation.Nullable;

public class fpy extends fop {
   @Nullable
   protected fqf a;
   protected boolean b;

   public fpy(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wn.a);
      this.b = $$4;
   }

   public void a(fqf $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fsp $$0) {
      this.c($$0);
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(gmh::H, this.a.a(this.b, this.D()), this.F(), this.G(), this.g, this.h);
      }
   }
}
