import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class epp {
   protected epv a;
   protected btp b;
   protected final Int2ObjectMap<epo> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(ddj $$0, btp $$1) {
      this.a = new epv($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayo.d($$1.dk() + 1.0F);
      this.e = ayo.d($$1.dl() + 1.0F);
      this.f = ayo.d($$1.dk() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected epo b(jd $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected epo c(int $$0, int $$1, int $$2) {
      return (epo)this.c.computeIfAbsent(epo.b($$0, $$1, $$2), $$3 -> new epo($$0, $$1, $$2));
   }

   public abstract epo a();

   public abstract epx a(double var1, double var3, double var5);

   protected epx b(double $$0, double $$1, double $$2) {
      return new epx(this.c(ayo.a($$0), ayo.a($$1), ayo.a($$2)));
   }

   public abstract int a(epo[] var1, epo var2);

   public abstract ept a(epv var1, int var2, int var3, int var4, btp var5);

   public abstract ept a(epv var1, int var2, int var3, int var4);

   public ept a(btp $$0, jd $$1) {
      return this.a(new epv($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dtc $$0) {
      return $$0.a(awe.aK) || $$0.a(dga.H) || $$0.a(dga.kJ) || dgm.g($$0) || $$0.a(dga.fv);
   }
}
