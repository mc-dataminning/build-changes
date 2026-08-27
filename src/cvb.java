public abstract class cvb implements cvs<bny> {
   protected final cvx<?> a;
   protected final cvh b;
   protected final String c;
   protected final cvp d;
   protected final crs e;
   protected final float f;
   protected final int g;

   public cvb(cvx<?> $$0, String $$1, cvh $$2, cvp $$3, crs $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bny $$0, czg $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public crs a(bny $$0, jb $$1) {
      return this.e.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iw<cvp> a() {
      iw<cvp> $$0 = iw.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public crs a(jb $$0) {
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
   public cvx<?> e() {
      return this.a;
   }

   public cvh f() {
      return this.b;
   }

   public interface a<T extends cvb> {
      T create(String var1, cvh var2, cvp var3, crs var4, float var5, int var6);
   }
}
