import javax.annotation.Nullable;

public class eud implements eue {
   private final dgg b;

   public eud(dgg $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jn $$0, dwv $$1, ji $$2, ji $$3, int $$4, int $$5) {
      eue.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(ji $$0, djk $$1, @Nullable euf $$2) {
      dwv $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dwv $$0, ji $$1, djk $$2, @Nullable euf $$3, boolean $$4) {
      eue.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
