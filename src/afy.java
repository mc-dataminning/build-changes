public class afy implements zj<aby> {
   public static final za<wn, afy> a = zj.a(afy::a, afy::new);
   private final jg<awq> b;
   private final aws c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afy(jg<awq> $$0, aws $$1, bwv $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ao();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afy(wn $$0) {
      this.b = awq.d.decode($$0);
      this.c = $$0.b(aws.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wn $$0) {
      awq.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zl<afy> a() {
      return agr.aV;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public jg<awq> b() {
      return this.b;
   }

   public aws e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public long i() {
      return this.g;
   }
}
