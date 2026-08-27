import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eme {
   protected emk a;
   protected brg b;
   protected final Int2ObjectMap<emd> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dah $$0, brg $$1) {
      this.a = new emk($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = axw.d($$1.dh() + 1.0F);
      this.e = axw.d($$1.di() + 1.0F);
      this.f = axw.d($$1.dh() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected emd b(im $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected emd c(int $$0, int $$1, int $$2) {
      return (emd)this.c.computeIfAbsent(emd.b($$0, $$1, $$2), $$3 -> new emd($$0, $$1, $$2));
   }

   public abstract emd a();

   public abstract emm a(double var1, double var3, double var5);

   protected emm b(double $$0, double $$1, double $$2) {
      return new emm(this.c(axw.a($$0), axw.a($$1), axw.a($$2)));
   }

   public abstract int a(emd[] var1, emd var2);

   public abstract emi a(emk var1, int var2, int var3, int var4, brg var5);

   public abstract emi a(emk var1, int var2, int var3, int var4);

   public emi a(brg $$0, im $$1) {
      return this.a(new emk($$0.dN(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dpy $$0) {
      return $$0.a(avo.aK) || $$0.a(dcx.H) || $$0.a(dcx.kJ) || ddj.g($$0) || $$0.a(dcx.fv);
   }
}
