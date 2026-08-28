import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eyb {
   protected eyh b;
   protected bxw c;
   protected final Int2ObjectMap<eya> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dkk $$0, bxw $$1) {
      this.b = new eyh($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = azo.d($$1.dq() + 1.0F);
      this.f = azo.d($$1.dr() + 1.0F);
      this.g = azo.d($$1.dq() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected eya b(iv $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eya c(int $$0, int $$1, int $$2) {
      return (eya)this.d.computeIfAbsent(eya.b($$0, $$1, $$2), $$3 -> new eya($$0, $$1, $$2));
   }

   public abstract eya a();

   public abstract eyj a(double var1, double var3, double var5);

   protected eyj b(double $$0, double $$1, double $$2) {
      return new eyj(this.c(azo.a($$0), azo.a($$1), azo.a($$2)));
   }

   public abstract int a(eya[] var1, eya var2);

   public abstract eyf a(eyh var1, int var2, int var3, int var4, bxw var5);

   public abstract eyf a(eyh var1, int var2, int var3, int var4);

   public eyf a(bxw $$0, iv $$1) {
      return this.a(new eyh($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(ebe $$0) {
      return $$0.a(axe.aN) || $$0.a(dne.K) || $$0.a(dne.lp) || dns.h($$0) || $$0.a(dne.fU);
   }
}
