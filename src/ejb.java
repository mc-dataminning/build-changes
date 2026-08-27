import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ejb {
   protected cxm a;
   protected bpq b;
   protected final Int2ObjectMap<eja> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cxm $$0, bpq $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = aww.d($$1.dg() + 1.0F);
      this.e = aww.d($$1.dh() + 1.0F);
      this.f = aww.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eja b(ib $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eja b(int $$0, int $$1, int $$2) {
      return (eja)this.c.computeIfAbsent(eja.b($$0, $$1, $$2), $$3 -> new eja($$0, $$1, $$2));
   }

   public abstract eja a();

   public abstract ejg a(double var1, double var3, double var5);

   protected ejg a(eja $$0) {
      return new ejg($$0);
   }

   public abstract int a(eja[] var1, eja var2);

   public abstract eiy a(cwf var1, int var2, int var3, int var4, bpq var5);

   public abstract eiy a(cwf var1, int var2, int var3, int var4);

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
