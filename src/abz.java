public class abz implements zd<abs> {
   public static final yu<wh, abz> a = zd.a(abz::a, abz::new);
   private final iu b;
   private final int c;
   private final int d;
   private final dlu e;

   public abz(iu $$0, dlu $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abz(wh $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = ys.a(mg.i).decode($$0);
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      ys.a(mg.i).encode($$0, this.e);
   }

   @Override
   public zf<abz> a() {
      return agl.i;
   }

   public void a(abs $$0) {
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

   public dlu g() {
      return this.e;
   }
}
