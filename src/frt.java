import javax.annotation.Nullable;

public class frt extends fql {
   @Nullable
   protected fsa a;
   protected boolean b;

   public frt(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wu.a);
      this.b = $$4;
   }

   public void a(fsa $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fuk $$0) {
      this.c($$0);
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(goi::H, this.a.a(this.b, this.D()), this.F(), this.G(), this.g, this.h);
      }
   }
}
