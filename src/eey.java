import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eey {
   protected ctv a;
   protected bmh b;
   protected final Int2ObjectMap<eex> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(ctv $$0, bmh $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = aui.d($$1.dg() + 1.0F);
      this.e = aui.d($$1.dh() + 1.0F);
      this.f = aui.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eex b(hx $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eex b(int $$0, int $$1, int $$2) {
      return (eex)this.c.computeIfAbsent(eex.b($$0, $$1, $$2), $$3 -> new eex($$0, $$1, $$2));
   }

   public abstract eex a();

   public abstract efd a(double var1, double var3, double var5);

   protected efd a(eex $$0) {
      return new efd($$0);
   }

   public abstract int a(eex[] var1, eex var2);

   public abstract eev a(cso var1, int var2, int var3, int var4, bmh var5);

   public abstract eev a(cso var1, int var2, int var3, int var4);

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
