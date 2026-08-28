public class acp implements zf<abt> {
   public static final yw<vv, acp> a = zf.a(acp::a, acp::new);
   private final int b;
   private final int c;
   private final int d;

   public acp(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acp(vv $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(vv $$0) {
      $$0.k(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
   }

   @Override
   public zh<acp> a() {
      return agf.v;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
