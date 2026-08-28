import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eok {
   protected eoq a;
   protected btt b;
   protected final Int2ObjectMap<eoj> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dcn $$0, btt $$1) {
      this.a = new eoq($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayz.d($$1.dj() + 1.0F);
      this.e = ayz.d($$1.dk() + 1.0F);
      this.f = ayz.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eoj b(iz $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eoj c(int $$0, int $$1, int $$2) {
      return (eoj)this.c.computeIfAbsent(eoj.b($$0, $$1, $$2), $$3 -> new eoj($$0, $$1, $$2));
   }

   public abstract eoj a();

   public abstract eos a(double var1, double var3, double var5);

   protected eos b(double $$0, double $$1, double $$2) {
      return new eos(this.c(ayz.a($$0), ayz.a($$1), ayz.a($$2)));
   }

   public abstract int a(eoj[] var1, eoj var2);

   public abstract eoo a(eoq var1, int var2, int var3, int var4, btt var5);

   public abstract eoo a(eoq var1, int var2, int var3, int var4);

   public eoo a(btt $$0, iz $$1) {
      return this.a(new eoq($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dse $$0) {
      return $$0.a(awp.aK) || $$0.a(dfd.H) || $$0.a(dfd.kJ) || dfp.g($$0) || $$0.a(dfd.fv);
   }
}
