public class acp implements zs<ach> {
   public static final zj<ww, acp> a = zs.a(acp::a, acp::new);
   private final jh b;
   private final int c;
   private final int d;
   private final dij e;

   public acp(jh $$0, dij $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acp(ww $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zh.a(ma.f).decode($$0);
   }

   private void a(ww $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      zh.a(ma.f).encode($$0, this.e);
   }

   @Override
   public zu<acp> a() {
      return agw.j;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dij g() {
      return this.e;
   }
}
