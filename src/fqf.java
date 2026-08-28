import javax.annotation.Nullable;

public class fqf extends fpo {
   private final fpa a;

   public fqf(fpa $$0, wp $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fpc $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.F() + this.A() / 2;
      int $$5 = this.G() + this.y() / 2;
      wp $$6 = this.B();
      $$0.b(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1);
      String $$7 = fux.a(af.c());
      $$0.b(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712);
   }

   @Override
   protected void a(ftn $$0) {
   }

   @Override
   public void a(hku $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public foz a(ftt $$0) {
      return null;
   }
}
