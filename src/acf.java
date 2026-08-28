public class acf implements zj<aby> {
   public static final za<wn, acf> a = zj.a(acf::a, acf::new);
   private final iw b;
   private final int c;
   private final int d;
   private final dne e;

   public acf(iw $$0, dne $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acf(wn $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yy.a(mi.i).decode($$0);
   }

   private void a(wn $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      yy.a(mi.i).encode($$0, this.e);
   }

   @Override
   public zl<acf> a() {
      return agr.i;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dne g() {
      return this.e;
   }
}
