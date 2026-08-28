import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class esb {
   protected esh a;
   protected bvg b;
   protected final Int2ObjectMap<esa> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dfs $$0, bvg $$1) {
      this.a = new esh($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = azn.d($$1.dt() + 1.0F);
      this.e = azn.d($$1.du() + 1.0F);
      this.f = azn.d($$1.dt() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected esa b(jh $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected esa c(int $$0, int $$1, int $$2) {
      return (esa)this.c.computeIfAbsent(esa.b($$0, $$1, $$2), $$3 -> new esa($$0, $$1, $$2));
   }

   public abstract esa a();

   public abstract esj a(double var1, double var3, double var5);

   protected esj b(double $$0, double $$1, double $$2) {
      return new esj(this.c(azn.a($$0), azn.a($$1), azn.a($$2)));
   }

   public abstract int a(esa[] var1, esa var2);

   public abstract esf a(esh var1, int var2, int var3, int var4, bvg var5);

   public abstract esf a(esh var1, int var2, int var3, int var4);

   public esf a(bvg $$0, jh $$1) {
      return this.a(new esh($$0.dY(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dvo $$0) {
      return $$0.a(axd.aM) || $$0.a(dil.H) || $$0.a(dil.kJ) || dix.h($$0) || $$0.a(dil.fv);
   }
}
