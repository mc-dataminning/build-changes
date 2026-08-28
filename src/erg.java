import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class erg {
   protected erm a;
   protected bup b;
   protected final Int2ObjectMap<erf> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dew $$0, bup $$1) {
      this.a = new erm($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = azf.d($$1.dn() + 1.0F);
      this.e = azf.d($$1.do() + 1.0F);
      this.f = azf.d($$1.dn() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected erf b(jf $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected erf c(int $$0, int $$1, int $$2) {
      return (erf)this.c.computeIfAbsent(erf.b($$0, $$1, $$2), $$3 -> new erf($$0, $$1, $$2));
   }

   public abstract erf a();

   public abstract ero a(double var1, double var3, double var5);

   protected ero b(double $$0, double $$1, double $$2) {
      return new ero(this.c(azf.a($$0), azf.a($$1), azf.a($$2)));
   }

   public abstract int a(erf[] var1, erf var2);

   public abstract erk a(erm var1, int var2, int var3, int var4, bup var5);

   public abstract erk a(erm var1, int var2, int var3, int var4);

   public erk a(bup $$0, jf $$1) {
      return this.a(new erm($$0.dS(), $$0), $$1.u(), $$1.v(), $$1.w());
   }

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

   public static boolean a(dus $$0) {
      return $$0.a(awv.aL) || $$0.a(dho.H) || $$0.a(dho.kJ) || dia.h($$0) || $$0.a(dho.fv);
   }
}
