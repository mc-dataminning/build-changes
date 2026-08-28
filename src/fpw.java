import javax.annotation.Nullable;

public class fpw extends fon {
   @Nullable
   protected fqd a;
   protected boolean b;

   public fpw(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wn.a);
      this.b = $$4;
   }

   public void a(fqd $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fsn $$0) {
      this.c($$0);
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(gmf::H, this.a.a(this.b, this.D()), this.F(), this.G(), this.g, this.h);
      }
   }
}
