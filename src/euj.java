import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class euj {
   protected eup b;
   protected bwh c;
   protected final Int2ObjectMap<eui> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dhu $$0, bwh $$1) {
      this.b = new eup($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = bae.d($$1.dq() + 1.0F);
      this.f = bae.d($$1.dr() + 1.0F);
      this.g = bae.d($$1.dq() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected eui b(jh $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eui c(int $$0, int $$1, int $$2) {
      return (eui)this.d.computeIfAbsent(eui.b($$0, $$1, $$2), $$3 -> new eui($$0, $$1, $$2));
   }

   public abstract eui a();

   public abstract eur a(double var1, double var3, double var5);

   protected eur b(double $$0, double $$1, double $$2) {
      return new eur(this.c(bae.a($$0), bae.a($$1), bae.a($$2)));
   }

   public abstract int a(eui[] var1, eui var2);

   public abstract eun a(eup var1, int var2, int var3, int var4, bwh var5);

   public abstract eun a(eup var1, int var2, int var3, int var4);

   public eun a(bwh $$0, jh $$1) {
      return this.a(new eup($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dxu $$0) {
      return $$0.a(axu.aN) || $$0.a(dkn.K) || $$0.a(dkn.le) || dla.h($$0) || $$0.a(dkn.fJ);
   }
}
