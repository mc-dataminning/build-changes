public abstract class cil implements cjc<bdq> {
   protected final cjf<?> a;
   protected final acq b;
   private final cir h;
   protected final String c;
   protected final ciz d;
   protected final cfz e;
   protected final float f;
   protected final int g;

   public cil(cjf<?> $$0, acq $$1, String $$2, cir $$3, ciz $$4, cfz $$5, float $$6, int $$7) {
      this.a = $$0;
      this.h = $$3;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$5;
      this.f = $$6;
      this.g = $$7;
   }

   @Override
   public boolean a(bdq $$0, cmm $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cfz a(bdq $$0, hs $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public hn<ciz> a() {
      hn<ciz> $$0 = hn.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cfz a(hs $$0) {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   public int d() {
      return this.g;
   }

   @Override
   public acq e() {
      return this.b;
   }

   @Override
   public cjf<?> f() {
      return this.a;
   }

   public cir g() {
      return this.h;
   }
}
