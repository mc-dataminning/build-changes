import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eif {
   protected cwr a;
   protected boz b;
   protected final Int2ObjectMap<eie> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cwr $$0, boz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = awm.d($$1.dd() + 1.0F);
      this.e = awm.d($$1.de() + 1.0F);
      this.f = awm.d($$1.dd() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eie b(ib $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eie b(int $$0, int $$1, int $$2) {
      return (eie)this.c.computeIfAbsent(eie.b($$0, $$1, $$2), $$3 -> new eie($$0, $$1, $$2));
   }

   public abstract eie a();

   public abstract eik a(double var1, double var3, double var5);

   protected eik a(eie $$0) {
      return new eik($$0);
   }

   public abstract int a(eie[] var1, eie var2);

   public abstract eic a(cvk var1, int var2, int var3, int var4, boz var5);

   public abstract eic a(cvk var1, int var2, int var3, int var4);

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
