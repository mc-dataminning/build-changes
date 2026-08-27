import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ehk {
   protected cwe a;
   protected bok b;
   protected final Int2ObjectMap<ehj> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cwe $$0, bok $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = awi.d($$1.dg() + 1.0F);
      this.e = awi.d($$1.dh() + 1.0F);
      this.f = awi.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected ehj b(hz $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected ehj b(int $$0, int $$1, int $$2) {
      return (ehj)this.c.computeIfAbsent(ehj.b($$0, $$1, $$2), $$3 -> new ehj($$0, $$1, $$2));
   }

   public abstract ehj a();

   public abstract ehp a(double var1, double var3, double var5);

   protected ehp a(ehj $$0) {
      return new ehp($$0);
   }

   public abstract int a(ehj[] var1, ehj var2);

   public abstract ehh a(cux var1, int var2, int var3, int var4, bok var5);

   public abstract ehh a(cux var1, int var2, int var3, int var4);

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
