public class afd implements yz<abk> {
   public static final yq<wd, afd> a = yz.a(afd::a, afd::new);
   private final iv<auy> b;
   private final ava c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afd(iv<auy> $$0, ava $$1, bql $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.aj();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afd(wd $$0) {
      this.b = auy.d.decode($$0);
      this.c = $$0.b(ava.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wd $$0) {
      auy.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zb<afd> a() {
      return afv.aR;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public iv<auy> b() {
      return this.b;
   }

   public ava e() {
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
