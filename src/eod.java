import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eod {
   protected eoj a;
   protected btm b;
   protected final Int2ObjectMap<eoc> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dcg $$0, btm $$1) {
      this.a = new eoj($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayu.d($$1.dj() + 1.0F);
      this.e = ayu.d($$1.dk() + 1.0F);
      this.f = ayu.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eoc b(iz $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eoc c(int $$0, int $$1, int $$2) {
      return (eoc)this.c.computeIfAbsent(eoc.b($$0, $$1, $$2), $$3 -> new eoc($$0, $$1, $$2));
   }

   public abstract eoc a();

   public abstract eol a(double var1, double var3, double var5);

   protected eol b(double $$0, double $$1, double $$2) {
      return new eol(this.c(ayu.a($$0), ayu.a($$1), ayu.a($$2)));
   }

   public abstract int a(eoc[] var1, eoc var2);

   public abstract eoh a(eoj var1, int var2, int var3, int var4, btm var5);

   public abstract eoh a(eoj var1, int var2, int var3, int var4);

   public eoh a(btm $$0, iz $$1) {
      return this.a(new eoj($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(drx $$0) {
      return $$0.a(awl.aK) || $$0.a(dew.H) || $$0.a(dew.kJ) || dfi.g($$0) || $$0.a(dew.fv);
   }
}
