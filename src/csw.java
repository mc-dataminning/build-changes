public abstract class csw implements ctn<bmv> {
   protected final cts<?> a;
   protected final ctc b;
   protected final String c;
   protected final ctk d;
   protected final cqk e;
   protected final float f;
   protected final int g;

   public csw(cts<?> $$0, String $$1, ctc $$2, ctk $$3, cqk $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bmv $$0, cwz $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cqk a(bmv $$0, iz $$1) {
      return this.e.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iu<ctk> a() {
      iu<ctk> $$0 = iu.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cqk a(iz $$0) {
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
   public cts<?> e() {
      return this.a;
   }

   public ctc f() {
      return this.b;
   }

   public interface a<T extends csw> {
      T create(String var1, ctc var2, ctk var3, cqk var4, float var5, int var6);
   }
}
