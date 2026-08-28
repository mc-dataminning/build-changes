public class age implements zs<ach> {
   public static final zj<ww, age> a = zs.a(age::a, age::new);
   private final jq<awn> b;
   private final awp c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public age(jq<awn> $$0, awp $$1, bui $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.as();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private age(ww $$0) {
      this.b = awn.d.decode($$0);
      this.c = $$0.b(awp.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(ww $$0) {
      awn.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zu<age> a() {
      return agw.aS;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public jq<awn> b() {
      return this.b;
   }

   public awp e() {
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
