import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class epl {
   protected epr a;
   protected btn b;
   protected final Int2ObjectMap<epk> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(ddh $$0, btn $$1) {
      this.a = new epr($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayn.d($$1.dk() + 1.0F);
      this.e = ayn.d($$1.dl() + 1.0F);
      this.f = ayn.d($$1.dk() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected epk b(jd $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected epk c(int $$0, int $$1, int $$2) {
      return (epk)this.c.computeIfAbsent(epk.b($$0, $$1, $$2), $$3 -> new epk($$0, $$1, $$2));
   }

   public abstract epk a();

   public abstract ept a(double var1, double var3, double var5);

   protected ept b(double $$0, double $$1, double $$2) {
      return new ept(this.c(ayn.a($$0), ayn.a($$1), ayn.a($$2)));
   }

   public abstract int a(epk[] var1, epk var2);

   public abstract epp a(epr var1, int var2, int var3, int var4, btn var5);

   public abstract epp a(epr var1, int var2, int var3, int var4);

   public epp a(btn $$0, jd $$1) {
      return this.a(new epr($$0.dQ(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dta $$0) {
      return $$0.a(awd.aK) || $$0.a(dfy.H) || $$0.a(dfy.kJ) || dgk.g($$0) || $$0.a(dfy.fv);
   }
}
