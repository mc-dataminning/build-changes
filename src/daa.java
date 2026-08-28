import javax.annotation.Nullable;

public abstract class daa implements dat<dbi> {
   protected final daz<?> a;
   protected final dag b;
   protected final String c;
   protected final dap d;
   protected final cwf e;
   protected final float f;
   protected final int g;
   @Nullable
   private das j;

   public daa(daz<?> $$0, String $$1, dag $$2, dap $$3, cwf $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(dbi $$0, dff $$1) {
      return this.d.a($$0.c());
   }

   public cwf a(dbi $$0, js.a $$1) {
      return this.e.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public das a() {
      if (this.j == null) {
         this.j = das.a(this.d);
      }

      return this.j;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cwf a(js.a $$0) {
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
   public daz<?> e() {
      return this.a;
   }

   public dag f() {
      return this.b;
   }

   public interface a<T extends daa> {
      T create(String var1, dag var2, dap var3, cwf var4, float var5, int var6);
   }
}
