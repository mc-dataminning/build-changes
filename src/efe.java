import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class efe {
   protected cub a;
   protected bmm b;
   protected final Int2ObjectMap<efd> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cub $$0, bmm $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = aun.d($$1.dg() + 1.0F);
      this.e = aun.d($$1.dh() + 1.0F);
      this.f = aun.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected efd b(hx $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected efd b(int $$0, int $$1, int $$2) {
      return (efd)this.c.computeIfAbsent(efd.b($$0, $$1, $$2), $$3 -> new efd($$0, $$1, $$2));
   }

   public abstract efd a();

   public abstract efj a(double var1, double var3, double var5);

   protected efj a(efd $$0) {
      return new efj($$0);
   }

   public abstract int a(efd[] var1, efd var2);

   public abstract efb a(csu var1, int var2, int var3, int var4, bmm var5);

   public abstract efb a(csu var1, int var2, int var3, int var4);

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
