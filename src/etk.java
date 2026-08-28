import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class etk {
   protected etq b;
   protected bvh c;
   protected final Int2ObjectMap<etj> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dgt $$0, bvh $$1) {
      this.b = new etq($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = ayy.d($$1.dr() + 1.0F);
      this.f = ayy.d($$1.ds() + 1.0F);
      this.g = ayy.d($$1.dr() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected etj b(ji $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected etj c(int $$0, int $$1, int $$2) {
      return (etj)this.d.computeIfAbsent(etj.b($$0, $$1, $$2), $$3 -> new etj($$0, $$1, $$2));
   }

   public abstract etj a();

   public abstract ets a(double var1, double var3, double var5);

   protected ets b(double $$0, double $$1, double $$2) {
      return new ets(this.c(ayy.a($$0), ayy.a($$1), ayy.a($$2)));
   }

   public abstract int a(etj[] var1, etj var2);

   public abstract eto a(etq var1, int var2, int var3, int var4, bvh var5);

   public abstract eto a(etq var1, int var2, int var3, int var4);

   public eto a(bvh $$0, ji $$1) {
      return this.a(new etq($$0.dW(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dwv $$0) {
      return $$0.a(awo.aN) || $$0.a(djm.K) || $$0.a(djm.ll) || djz.h($$0) || $$0.a(djm.fQ);
   }
}
