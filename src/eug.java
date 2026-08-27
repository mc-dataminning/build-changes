public class eug extends eui {
   private final it b;
   private final io c;
   private final boolean d;
   private final boolean e;

   public static eug a(euk $$0, it $$1, io $$2) {
      return new eug(true, $$0, $$1, $$2, false);
   }

   public eug(euk $$0, it $$1, io $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eug(boolean $$0, euk $$1, it $$2, io $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eug a(it $$0) {
      return new eug(this.d, this.a, $$0, this.c, this.e);
   }

   public eug a(io $$0) {
      return new eug(this.d, this.a, this.b, $$0, this.e);
   }

   public io a() {
      return this.c;
   }

   public it b() {
      return this.b;
   }

   @Override
   public eui.a c() {
      return this.d ? eui.a.a : eui.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
