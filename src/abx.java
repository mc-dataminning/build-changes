public class abx implements zd<abs> {
   public static final yu<vs, abx> a = zd.a(abx::a, abx::new);
   private final int b;
   private final iu c;
   private final int d;

   public abx(int $$0, iu $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abx(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zf<abx> a() {
      return agl.g;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iu e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
