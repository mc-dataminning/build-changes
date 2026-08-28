import javax.annotation.Nullable;

public abstract class cza implements czt<daj> {
   protected final czz<?> a;
   protected final czg b;
   protected final String c;
   protected final czp d;
   protected final cvl e;
   protected final float f;
   protected final int g;
   @Nullable
   private czs j;

   public cza(czz<?> $$0, String $$1, czg $$2, czp $$3, cvl $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(daj $$0, dds $$1) {
      return this.d.a($$0.c());
   }

   public cvl a(daj $$0, jp.a $$1) {
      return this.e.u();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public czs a() {
      if (this.j == null) {
         this.j = czs.a(this.d);
      }

      return this.j;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cvl a(jp.a $$0) {
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
   public czz<?> e() {
      return this.a;
   }

   public czg f() {
      return this.b;
   }

   public interface a<T extends cza> {
      T create(String var1, czg var2, czp var3, cvl var4, float var5, int var6);
   }
}
