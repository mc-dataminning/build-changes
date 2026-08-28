import javax.annotation.Nullable;

public class exu implements exv {
   private final dja b;

   public exu(dja $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ja $$0, eah $$1, iu $$2, iu $$3, int $$4, int $$5) {
      exv.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(iu $$0, dmf $$1, @Nullable exw $$2) {
      eah $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(eah $$0, iu $$1, dmf $$2, @Nullable exw $$3, boolean $$4) {
      exv.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
