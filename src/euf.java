import javax.annotation.Nullable;

public class euf implements eug {
   private final dgi b;

   public euf(dgi $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jn $$0, dwx $$1, ji $$2, ji $$3, int $$4, int $$5) {
      eug.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(ji $$0, djm $$1, @Nullable euh $$2) {
      dwx $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dwx $$0, ji $$1, djm $$2, @Nullable euh $$3, boolean $$4) {
      eug.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
