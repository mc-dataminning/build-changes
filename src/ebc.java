import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ebc {
   protected cqk a;
   protected bjk b;
   protected final Int2ObjectMap<ebb> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cqk $$0, bjk $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = ary.d($$1.df() + 1.0F);
      this.e = ary.d($$1.dg() + 1.0F);
      this.f = ary.d($$1.df() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected ebb b(gw $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected ebb b(int $$0, int $$1, int $$2) {
      return (ebb)this.c.computeIfAbsent(ebb.b($$0, $$1, $$2), $$3 -> new ebb($$0, $$1, $$2));
   }

   public abstract ebb a();

   public abstract ebh a(double var1, double var3, double var5);

   protected ebh a(ebb $$0) {
      return new ebh($$0);
   }

   public abstract int a(ebb[] var1, ebb var2);

   public abstract eaz a(cpd var1, int var2, int var3, int var4, bjk var5);

   public abstract eaz a(cpd var1, int var2, int var3, int var4);

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
