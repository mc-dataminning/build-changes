import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class epr {
   protected epx a;
   protected bsq b;
   protected final Int2ObjectMap<epq> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dcn $$0, bsq $$1) {
      this.a = new epx($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = aym.d($$1.do() + 1.0F);
      this.e = aym.d($$1.dp() + 1.0F);
      this.f = aym.d($$1.do() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected epq b(ir $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected epq c(int $$0, int $$1, int $$2) {
      return (epq)this.c.computeIfAbsent(epq.b($$0, $$1, $$2), $$3 -> new epq($$0, $$1, $$2));
   }

   public abstract epq a();

   public abstract epz a(double var1, double var3, double var5);

   protected epz b(double $$0, double $$1, double $$2) {
      return new epz(this.c(aym.a($$0), aym.a($$1), aym.a($$2)));
   }

   public abstract int a(epq[] var1, epq var2);

   public abstract epv a(epx var1, int var2, int var3, int var4, bsq var5);

   public abstract epv a(epx var1, int var2, int var3, int var4);

   public epv a(bsq $$0, ir $$1) {
      return this.a(new epx($$0.dU(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dtc $$0) {
      return $$0.a(awe.aM) || $$0.a(dfe.am) || $$0.a(dfe.lH) || dfq.g($$0) || $$0.a(dfe.gn);
   }
}
