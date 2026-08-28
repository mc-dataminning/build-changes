import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eud {
   protected euj b;
   protected bvz c;
   protected final Int2ObjectMap<euc> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dhm $$0, bvz $$1) {
      this.b = new euj($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = azu.d($$1.dr() + 1.0F);
      this.f = azu.d($$1.ds() + 1.0F);
      this.g = azu.d($$1.dr() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected euc b(jh $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected euc c(int $$0, int $$1, int $$2) {
      return (euc)this.d.computeIfAbsent(euc.b($$0, $$1, $$2), $$3 -> new euc($$0, $$1, $$2));
   }

   public abstract euc a();

   public abstract eul a(double var1, double var3, double var5);

   protected eul b(double $$0, double $$1, double $$2) {
      return new eul(this.c(azu.a($$0), azu.a($$1), azu.a($$2)));
   }

   public abstract int a(euc[] var1, euc var2);

   public abstract euh a(euj var1, int var2, int var3, int var4, bvz var5);

   public abstract euh a(euj var1, int var2, int var3, int var4);

   public euh a(bvz $$0, jh $$1) {
      return this.a(new euj($$0.dW(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dxo $$0) {
      return $$0.a(axk.aN) || $$0.a(dkf.K) || $$0.a(dkf.ll) || dks.h($$0) || $$0.a(dkf.fQ);
   }
}
