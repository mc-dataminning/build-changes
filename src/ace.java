public class ace implements wu<yo> {
   private final ie<arb> a;
   private final ard b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public ace(ie<arb> $$0, ard $$1, blf $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.aj();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public ace(ue $$0) {
      this.a = $$0.a(kb.b.t(), arb::b);
      this.b = $$0.b(ard.class);
      this.c = $$0.n();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(kb.b.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public ie<arb> a() {
      return this.a;
   }

   public ard d() {
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

   public long h() {
      return this.f;
   }

   public void a(yo $$0) {
      $$0.a(this);
   }
}
