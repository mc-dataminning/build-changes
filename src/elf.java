import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class elf {
   protected ell a;
   protected bqq b;
   protected final Int2ObjectMap<ele> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(czk $$0, bqq $$1) {
      this.a = new ell($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = axk.d($$1.dg() + 1.0F);
      this.e = axk.d($$1.dh() + 1.0F);
      this.f = axk.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected ele b(ib $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected ele c(int $$0, int $$1, int $$2) {
      return (ele)this.c.computeIfAbsent(ele.b($$0, $$1, $$2), $$3 -> new ele($$0, $$1, $$2));
   }

   public abstract ele a();

   public abstract eln a(double var1, double var3, double var5);

   protected eln b(double $$0, double $$1, double $$2) {
      return new eln(this.c(axk.a($$0), axk.a($$1), axk.a($$2)));
   }

   public abstract int a(ele[] var1, ele var2);

   public abstract elj a(ell var1, int var2, int var3, int var4, bqq var5);

   public abstract elj a(ell var1, int var2, int var3, int var4);

   public elj a(bqq $$0, ib $$1) {
      return this.a(new ell($$0.dM(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(doz $$0) {
      return $$0.a(avc.aK) || $$0.a(dca.H) || $$0.a(dca.kJ) || dcm.g($$0) || $$0.a(dca.fv);
   }
}
