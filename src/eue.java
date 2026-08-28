import javax.annotation.Nullable;

public class eue implements euf {
   private final dgh b;

   public eue(dgh $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jn $$0, dww $$1, ji $$2, ji $$3, int $$4, int $$5) {
      euf.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(ji $$0, djl $$1, @Nullable eug $$2) {
      dww $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dww $$0, ji $$1, djl $$2, @Nullable eug $$3, boolean $$4) {
      euf.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
