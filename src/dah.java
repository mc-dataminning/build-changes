import javax.annotation.Nullable;

public abstract class dah implements dba<dbp> {
   protected final dbg<?> a;
   protected final dan b;
   protected final String c;
   protected final daw d;
   protected final cwm e;
   protected final float f;
   protected final int g;
   @Nullable
   private daz j;

   public dah(dbg<?> $$0, String $$1, dan $$2, daw $$3, cwm $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(dbp $$0, dfm $$1) {
      return this.d.a($$0.c());
   }

   public cwm a(dbp $$0, js.a $$1) {
      return this.e.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public daz a() {
      if (this.j == null) {
         this.j = daz.a(this.d);
      }

      return this.j;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cwm a(js.a $$0) {
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
   public dbg<?> e() {
      return this.a;
   }

   public dan f() {
      return this.b;
   }

   public interface a<T extends dah> {
      T create(String var1, dan var2, daw var3, cwm var4, float var5, int var6);
   }
}
