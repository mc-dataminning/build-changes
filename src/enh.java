import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class enh {
   protected enn a;
   protected bsq b;
   protected final Int2ObjectMap<eng> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dbk $$0, bsq $$1) {
      this.a = new enn($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayd.d($$1.dj() + 1.0F);
      this.e = ayd.d($$1.dk() + 1.0F);
      this.f = ayd.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eng b(io $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eng c(int $$0, int $$1, int $$2) {
      return (eng)this.c.computeIfAbsent(eng.b($$0, $$1, $$2), $$3 -> new eng($$0, $$1, $$2));
   }

   public abstract eng a();

   public abstract enp a(double var1, double var3, double var5);

   protected enp b(double $$0, double $$1, double $$2) {
      return new enp(this.c(ayd.a($$0), ayd.a($$1), ayd.a($$2)));
   }

   public abstract int a(eng[] var1, eng var2);

   public abstract enl a(enn var1, int var2, int var3, int var4, bsq var5);

   public abstract enl a(enn var1, int var2, int var3, int var4);

   public enl a(bsq $$0, io $$1) {
      return this.a(new enn($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(drb $$0) {
      return $$0.a(avw.aK) || $$0.a(dea.H) || $$0.a(dea.kJ) || dem.g($$0) || $$0.a(dea.fv);
   }
}
