import javax.annotation.Nullable;

public class fti extends fsa {
   @Nullable
   protected ftp a;
   protected boolean b;

   public fti(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wx.a);
      this.b = $$4;
   }

   public void a(ftp $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fvz $$0) {
      this.c($$0);
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(gqc::H, this.a.a(this.b, this.D()), this.F(), this.G(), this.g, this.h);
      }
   }
}
