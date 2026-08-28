import javax.annotation.Nullable;

public abstract class czw implements dap<dbf> {
   protected final dav<?> a;
   protected final dac b;
   protected final String c;
   protected final dal d;
   protected final cwb e;
   protected final float f;
   protected final int g;
   @Nullable
   private dao j;

   public czw(dav<?> $$0, String $$1, dac $$2, dal $$3, cwb $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(dbf $$0, dfb $$1) {
      return this.d.a($$0.c());
   }

   public cwb a(dbf $$0, js.a $$1) {
      return this.e.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public dao a() {
      if (this.j == null) {
         this.j = dao.a(this.d);
      }

      return this.j;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cwb a(js.a $$0) {
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
   public dav<?> e() {
      return this.a;
   }

   public dac f() {
      return this.b;
   }

   public interface a<T extends czw> {
      T create(String var1, dac var2, dal var3, cwb var4, float var5, int var6);
   }
}
