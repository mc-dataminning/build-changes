import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ewi {
   protected ewo b;
   protected bxb c;
   protected final Int2ObjectMap<ewh> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(djc $$0, bxb $$1) {
      this.b = new ewo($$0, $$1);
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

   protected ewh b(iu $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected ewh c(int $$0, int $$1, int $$2) {
      return (ewh)this.d.computeIfAbsent(ewh.b($$0, $$1, $$2), $$3 -> new ewh($$0, $$1, $$2));
   }

   public abstract ewh a();

   public abstract ewq a(double var1, double var3, double var5);

   protected ewq b(double $$0, double $$1, double $$2) {
      return new ewq(this.c(azk.a($$0), azk.a($$1), azk.a($$2)));
   }

   public abstract int a(ewh[] var1, ewh var2);

   public abstract ewm a(ewo var1, int var2, int var3, int var4, bxb var5);

   public abstract ewm a(ewo var1, int var2, int var3, int var4);

   public ewm a(bxb $$0, iu $$1) {
      return this.a(new ewo($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dzo $$0) {
      return $$0.a(axa.aN) || $$0.a(dlw.K) || $$0.a(dlw.ll) || dmj.h($$0) || $$0.a(dlw.fQ);
   }
}
