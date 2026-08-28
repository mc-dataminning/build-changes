import javax.annotation.Nullable;

public class fpk extends fob {
   @Nullable
   protected fpr a;
   protected boolean b;

   public fpk(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, xu.a);
      this.b = $$4;
   }

   public void a(fpr $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fsb $$0) {
      this.c($$0);
   }

   @Override
   public void b(fnq $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(glt::B, this.a.a(this.b, this.B()), this.D(), this.E(), this.g, this.h);
      }
   }
}
