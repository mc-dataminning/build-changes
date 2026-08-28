public class abx implements yv<abk> {
   public static final ym<vl, abx> a = yv.a(abx::a, abx::new);
   private final bsg b;
   private final boolean c;

   public abx(bsg $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private abx(vl $$0) {
      this.b = bsg.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public yx<abx> a() {
      return agd.m;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bsg e() {
      return this.b;
   }
}
