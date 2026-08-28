import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eoj {
   protected eop a;
   protected bts b;
   protected final Int2ObjectMap<eoi> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dcm $$0, bts $$1) {
      this.a = new eop($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayz.d($$1.dj() + 1.0F);
      this.e = ayz.d($$1.dk() + 1.0F);
      this.f = ayz.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eoi b(iz $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eoi c(int $$0, int $$1, int $$2) {
      return (eoi)this.c.computeIfAbsent(eoi.b($$0, $$1, $$2), $$3 -> new eoi($$0, $$1, $$2));
   }

   public abstract eoi a();

   public abstract eor a(double var1, double var3, double var5);

   protected eor b(double $$0, double $$1, double $$2) {
      return new eor(this.c(ayz.a($$0), ayz.a($$1), ayz.a($$2)));
   }

   public abstract int a(eoi[] var1, eoi var2);

   public abstract eon a(eop var1, int var2, int var3, int var4, bts var5);

   public abstract eon a(eop var1, int var2, int var3, int var4);

   public eon a(bts $$0, iz $$1) {
      return this.a(new eop($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dsd $$0) {
      return $$0.a(awp.aK) || $$0.a(dfc.H) || $$0.a(dfc.kJ) || dfo.g($$0) || $$0.a(dfc.fv);
   }
}
