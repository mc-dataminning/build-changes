public class ahy implements zb<agb> {
   public static final ys<vr, ahy> a = zb.a(ahy::a, ahy::new);
   private final bqg b;
   private final int c;
   private final float d;
   private final float e;

   public ahy(bqg $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ahy(vr $$0) {
      this.b = $$0.b(bqg.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zd<ahy> a() {
      return afz.cd;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public bqg b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }
}
