public class abz implements zf<abu> {
   public static final yw<vu, abz> a = zf.a(abz::a, abz::new);
   private final int b;
   private final iu c;
   private final int d;

   public abz(int $$0, iu $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abz(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zh<abz> a() {
      return agn.g;
   }

   public void a(abu $$0) {
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
