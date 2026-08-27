public abstract class cro implements csf<blp> {
   protected final csk<?> a;
   protected final cru b;
   protected final String c;
   protected final csc d;
   protected final cpd e;
   protected final float f;
   protected final int g;

   public cro(csk<?> $$0, String $$1, cru $$2, csc $$3, cpd $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(blp $$0, cvr $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cpd a(blp $$0, iw $$1) {
      return this.e.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public is<csc> a() {
      is<csc> $$0 = is.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cpd a(iw $$0) {
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
   public csk<?> e() {
      return this.a;
   }

   public cru f() {
      return this.b;
   }

   public interface a<T extends cro> {
      T create(String var1, cru var2, csc var3, cpd var4, float var5, int var6);
   }
}
