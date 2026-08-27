public class aer implements yn<aay> {
   public static final ye<vr, aer> a = yn.a(aer::a, aer::new);
   private final il<aul> b;
   private final aun c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public aer(il<aul> $$0, aun $$1, bpv $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.aj();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aer(vr $$0) {
      this.b = aul.d.decode($$0);
      this.c = $$0.b(aun.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(vr $$0) {
      aul.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public yp<aer> a() {
      return afj.aR;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public il<aul> b() {
      return this.b;
   }

   public aun e() {
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
