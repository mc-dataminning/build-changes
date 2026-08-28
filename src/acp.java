public class acp implements zv<ach> {
   public static final zm<wz, acp> a = zv.a(acp::a, acp::new);
   private final iz b;
   private final int c;
   private final int d;
   private final dex e;

   public acp(iz $$0, dex $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acp(wz $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zk.a(lq.f).decode($$0);
   }

   private void a(wz $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      zk.a(lq.f).encode($$0, this.e);
   }

   @Override
   public zx<acp> a() {
      return agt.j;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dex g() {
      return this.e;
   }
}
