import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class evg {
   protected evm b;
   protected bwt c;
   protected final Int2ObjectMap<evf> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dic $$0, bwt $$1) {
      this.b = new evm($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = azk.d($$1.dq() + 1.0F);
      this.f = azk.d($$1.dr() + 1.0F);
      this.g = azk.d($$1.dq() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected evf b(jj $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected evf c(int $$0, int $$1, int $$2) {
      return (evf)this.d.computeIfAbsent(evf.b($$0, $$1, $$2), $$3 -> new evf($$0, $$1, $$2));
   }

   public abstract evf a();

   public abstract evo a(double var1, double var3, double var5);

   protected evo b(double $$0, double $$1, double $$2) {
      return new evo(this.c(azk.a($$0), azk.a($$1), azk.a($$2)));
   }

   public abstract int a(evf[] var1, evf var2);

   public abstract evk a(evm var1, int var2, int var3, int var4, bwt var5);

   public abstract evk a(evm var1, int var2, int var3, int var4);

   public evk a(bwt $$0, jj $$1) {
      return this.a(new evm($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dym $$0) {
      return $$0.a(awz.aN) || $$0.a(dkw.K) || $$0.a(dkw.ll) || dlj.h($$0) || $$0.a(dkw.fQ);
   }
}
