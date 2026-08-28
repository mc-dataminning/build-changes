import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eou {
   protected epa a;
   protected btd b;
   protected final Int2ObjectMap<eot> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dcs $$0, btd $$1) {
      this.a = new epa($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayg.d($$1.dk() + 1.0F);
      this.e = ayg.d($$1.dl() + 1.0F);
      this.f = ayg.d($$1.dk() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eot b(ja $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eot c(int $$0, int $$1, int $$2) {
      return (eot)this.c.computeIfAbsent(eot.b($$0, $$1, $$2), $$3 -> new eot($$0, $$1, $$2));
   }

   public abstract eot a();

   public abstract epc a(double var1, double var3, double var5);

   protected epc b(double $$0, double $$1, double $$2) {
      return new epc(this.c(ayg.a($$0), ayg.a($$1), ayg.a($$2)));
   }

   public abstract int a(eot[] var1, eot var2);

   public abstract eoy a(epa var1, int var2, int var3, int var4, btd var5);

   public abstract eoy a(epa var1, int var2, int var3, int var4);

   public eoy a(btd $$0, ja $$1) {
      return this.a(new epa($$0.dQ(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dsk $$0) {
      return $$0.a(avw.aK) || $$0.a(dfj.H) || $$0.a(dfj.kJ) || dfv.g($$0) || $$0.a(dfj.fv);
   }
}
