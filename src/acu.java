public class acu implements zv<ach> {
   public static final zm<wl, acu> a = zv.a(acu::a, acu::new);
   private final bqp b;
   private final boolean c;

   public acu(bqp $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acu(wl $$0) {
      this.b = bqp.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zx<acu> a() {
      return agt.m;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bqp e() {
      return this.b;
   }
}
