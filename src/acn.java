public class acn implements zs<ach> {
   public static final zj<wi, acn> a = zs.a(acn::a, acn::new);
   private final int b;
   private final jh c;
   private final int d;

   public acn(int $$0, jh $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acn(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zu<acn> a() {
      return agw.h;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
