import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class etm {
   protected ets b;
   protected bvj c;
   protected final Int2ObjectMap<etl> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dgv $$0, bvj $$1) {
      this.b = new ets($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = ayz.d($$1.dq() + 1.0F);
      this.f = ayz.d($$1.dr() + 1.0F);
      this.g = ayz.d($$1.dq() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected etl b(ji $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected etl c(int $$0, int $$1, int $$2) {
      return (etl)this.d.computeIfAbsent(etl.b($$0, $$1, $$2), $$3 -> new etl($$0, $$1, $$2));
   }

   public abstract etl a();

   public abstract etu a(double var1, double var3, double var5);

   protected etu b(double $$0, double $$1, double $$2) {
      return new etu(this.c(ayz.a($$0), ayz.a($$1), ayz.a($$2)));
   }

   public abstract int a(etl[] var1, etl var2);

   public abstract etq a(ets var1, int var2, int var3, int var4, bvj var5);

   public abstract etq a(ets var1, int var2, int var3, int var4);

   public etq a(bvj $$0, ji $$1) {
      return this.a(new ets($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dwx $$0) {
      return $$0.a(awp.aN) || $$0.a(djo.K) || $$0.a(djo.ll) || dkb.h($$0) || $$0.a(djo.fQ);
   }
}
