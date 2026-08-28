import javax.annotation.Nullable;

public class evc implements evd {
   private final dgz b;

   public evc(dgz $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jn $$0, dxq $$1, ji $$2, ji $$3, int $$4, int $$5) {
      evd.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(ji $$0, dke $$1, @Nullable eve $$2) {
      dxq $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dxq $$0, ji $$1, dke $$2, @Nullable eve $$3, boolean $$4) {
      evd.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
