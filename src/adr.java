public class adr implements zs<ace> {
   public static final zj<wl, adr> a = zs.a(adr::a, adr::new);
   private final int b;
   private final iz c;
   private final int d;
   private final boolean e;

   public adr(int $$0, iz $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private adr(wl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zu<adr> a() {
      return agq.L;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public iz g() {
      return this.c;
   }
}
