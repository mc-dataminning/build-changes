public class acb implements zf<abu> {
   public static final yw<wj, acb> a = zf.a(acb::a, acb::new);
   private final iu b;
   private final int c;
   private final int d;
   private final dmf e;

   public acb(iu $$0, dmf $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acb(wj $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yu.a(mg.i).decode($$0);
   }

   private void a(wj $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      yu.a(mg.i).encode($$0, this.e);
   }

   @Override
   public zh<acb> a() {
      return agn.i;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dmf g() {
      return this.e;
   }
}
