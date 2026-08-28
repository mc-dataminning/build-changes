import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class exi {
   protected exo b;
   protected bxl c;
   protected final Int2ObjectMap<exh> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dju $$0, bxl $$1) {
      this.b = new exo($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = azm.d($$1.dp() + 1.0F);
      this.f = azm.d($$1.dq() + 1.0F);
      this.g = azm.d($$1.dp() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected exh b(iv $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected exh c(int $$0, int $$1, int $$2) {
      return (exh)this.d.computeIfAbsent(exh.b($$0, $$1, $$2), $$3 -> new exh($$0, $$1, $$2));
   }

   public abstract exh a();

   public abstract exq a(double var1, double var3, double var5);

   protected exq b(double $$0, double $$1, double $$2) {
      return new exq(this.c(azm.a($$0), azm.a($$1), azm.a($$2)));
   }

   public abstract int a(exh[] var1, exh var2);

   public abstract exm a(exo var1, int var2, int var3, int var4, bxl var5);

   public abstract exm a(exo var1, int var2, int var3, int var4);

   public exm a(bxl $$0, iv $$1) {
      return this.a(new exo($$0.dU(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(eao $$0) {
      return $$0.a(axc.aN) || $$0.a(dmo.K) || $$0.a(dmo.lp) || dnc.h($$0) || $$0.a(dmo.fU);
   }
}
