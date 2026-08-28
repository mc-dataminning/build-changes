public class abt implements zb<abn> {
   public static final ys<vr, abt> a = zb.a(abt::a, abt::new);
   private final int b;
   private final ja c;
   private final int d;

   public abt(int $$0, ja $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abt(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zd<abt> a() {
      return afz.h;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ja e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
