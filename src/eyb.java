import javax.annotation.Nullable;

public class eyb implements eyc {
   private final djh b;

   public eyb(djh $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jb $$0, eao $$1, iv $$2, iv $$3, int $$4, int $$5) {
      eyc.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(iv $$0, dmm $$1, @Nullable eyd $$2) {
      eao $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(eao $$0, iv $$1, dmm $$2, @Nullable eyd $$3, boolean $$4) {
      eyc.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
