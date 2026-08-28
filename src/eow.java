import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eow {
   protected epc a;
   protected bte b;
   protected final Int2ObjectMap<eov> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dct $$0, bte $$1) {
      this.a = new epc($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayg.d($$1.dl() + 1.0F);
      this.e = ayg.d($$1.dm() + 1.0F);
      this.f = ayg.d($$1.dl() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eov b(ja $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eov c(int $$0, int $$1, int $$2) {
      return (eov)this.c.computeIfAbsent(eov.b($$0, $$1, $$2), $$3 -> new eov($$0, $$1, $$2));
   }

   public abstract eov a();

   public abstract epe a(double var1, double var3, double var5);

   protected epe b(double $$0, double $$1, double $$2) {
      return new epe(this.c(ayg.a($$0), ayg.a($$1), ayg.a($$2)));
   }

   public abstract int a(eov[] var1, eov var2);

   public abstract epa a(epc var1, int var2, int var3, int var4, bte var5);

   public abstract epa a(epc var1, int var2, int var3, int var4);

   public epa a(bte $$0, ja $$1) {
      return this.a(new epc($$0.dR(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dsl $$0) {
      return $$0.a(avw.aK) || $$0.a(dfk.H) || $$0.a(dfk.kJ) || dfw.g($$0) || $$0.a(dfk.fv);
   }
}
