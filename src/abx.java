public class abx implements yw<abl> {
   public static final yn<vl, abx> a = yw.a(abx::a, abx::new);
   private final bsv b;
   private final boolean c;

   public abx(bsv $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private abx(vl $$0) {
      this.b = bsv.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public yy<abx> a() {
      return agd.l;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bsv e() {
      return this.b;
   }
}
