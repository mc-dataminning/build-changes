import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class euk {
   protected euq b;
   protected bwi c;
   protected final Int2ObjectMap<euj> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dhv $$0, bwi $$1) {
      this.b = new euq($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = bae.d($$1.dr() + 1.0F);
      this.f = bae.d($$1.ds() + 1.0F);
      this.g = bae.d($$1.dr() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected euj b(jh $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected euj c(int $$0, int $$1, int $$2) {
      return (euj)this.d.computeIfAbsent(euj.b($$0, $$1, $$2), $$3 -> new euj($$0, $$1, $$2));
   }

   public abstract euj a();

   public abstract eus a(double var1, double var3, double var5);

   protected eus b(double $$0, double $$1, double $$2) {
      return new eus(this.c(bae.a($$0), bae.a($$1), bae.a($$2)));
   }

   public abstract int a(euj[] var1, euj var2);

   public abstract euo a(euq var1, int var2, int var3, int var4, bwi var5);

   public abstract euo a(euq var1, int var2, int var3, int var4);

   public euo a(bwi $$0, jh $$1) {
      return this.a(new euq($$0.dW(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dxv $$0) {
      return $$0.a(axu.aN) || $$0.a(dko.K) || $$0.a(dko.le) || dlb.h($$0) || $$0.a(dko.fJ);
   }
}
