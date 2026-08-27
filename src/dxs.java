import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class dxs {
   protected cmz a;
   protected bgb b;
   protected final Int2ObjectMap<dxr> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cmz $$0, bgb $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = apa.d($$1.dd() + 1.0F);
      this.e = apa.d($$1.de() + 1.0F);
      this.f = apa.d($$1.dd() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected dxr b(gu $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected dxr b(int $$0, int $$1, int $$2) {
      return (dxr)this.c.computeIfAbsent(dxr.b($$0, $$1, $$2), $$3 -> new dxr($$0, $$1, $$2));
   }

   public abstract dxr a();

   public abstract dxx a(double var1, double var3, double var5);

   protected dxx a(dxr $$0) {
      return new dxx($$0);
   }

   public abstract int a(dxr[] var1, dxr var2);

   public abstract dxp a(cls var1, int var2, int var3, int var4, bgb var5);

   public abstract dxp a(cls var1, int var2, int var3, int var4);

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public void b(boolean $$0) {
      this.h = $$0;
   }

   public void c(boolean $$0) {
      this.i = $$0;
   }

   public void d(boolean $$0) {
      this.j = $$0;
   }

   public boolean d() {
      return this.g;
   }

   public boolean e() {
      return this.h;
   }

   public boolean f() {
      return this.i;
   }

   public boolean g() {
      return this.j;
   }
}
