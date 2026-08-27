import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eba {
   protected cqi a;
   protected bji b;
   protected final Int2ObjectMap<eaz> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cqi $$0, bji $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = arx.d($$1.dg() + 1.0F);
      this.e = arx.d($$1.dh() + 1.0F);
      this.f = arx.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eaz b(gw $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eaz b(int $$0, int $$1, int $$2) {
      return (eaz)this.c.computeIfAbsent(eaz.b($$0, $$1, $$2), $$3 -> new eaz($$0, $$1, $$2));
   }

   public abstract eaz a();

   public abstract ebf a(double var1, double var3, double var5);

   protected ebf a(eaz $$0) {
      return new ebf($$0);
   }

   public abstract int a(eaz[] var1, eaz var2);

   public abstract eax a(cpb var1, int var2, int var3, int var4, bji var5);

   public abstract eax a(cpb var1, int var2, int var3, int var4);

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
