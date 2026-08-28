import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eyn {
   protected eyt b;
   protected byh c;
   protected final Int2ObjectMap<eym> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dkw $$0, byh $$1) {
      this.b = new eyt($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = azz.d($$1.dq() + 1.0F);
      this.f = azz.d($$1.dr() + 1.0F);
      this.g = azz.d($$1.dq() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected eym b(iw $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eym c(int $$0, int $$1, int $$2) {
      return (eym)this.d.computeIfAbsent(eym.b($$0, $$1, $$2), $$3 -> new eym($$0, $$1, $$2));
   }

   public abstract eym a();

   public abstract eyv a(double var1, double var3, double var5);

   protected eyv b(double $$0, double $$1, double $$2) {
      return new eyv(this.c(azz.a($$0), azz.a($$1), azz.a($$2)));
   }

   public abstract int a(eym[] var1, eym var2);

   public abstract eyr a(eyt var1, int var2, int var3, int var4, byh var5);

   public abstract eyr a(eyt var1, int var2, int var3, int var4);

   public eyr a(byh $$0, iw $$1) {
      return this.a(new eyt($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   public void b(boolean $$0) {
      this.i = $$0;
   }

   public void c(boolean $$0) {
      this.j = $$0;
   }

   public void d(boolean $$0) {
      this.k = $$0;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public boolean f() {
      return this.j;
   }

   public boolean g() {
      return this.k;
   }

   public static boolean a(ebq $$0) {
      return $$0.a(axn.aN) || $$0.a(dnq.K) || $$0.a(dnq.lp) || doe.h($$0) || $$0.a(dnq.fU);
   }
}
