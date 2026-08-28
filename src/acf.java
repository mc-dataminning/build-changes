public class acf implements zk<abz> {
   public static final zb<wa, acf> a = zk.a(acf::a, acf::new);
   private final int b;
   private final je c;
   private final int d;

   public acf(int $$0, je $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acf(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zm<acf> a() {
      return ago.h;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public je e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
