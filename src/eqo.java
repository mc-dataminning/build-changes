import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eqo {
   protected equ a;
   protected buh b;
   protected final Int2ObjectMap<eqn> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(def $$0, buh $$1) {
      this.a = new equ($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = azc.d($$1.dn() + 1.0F);
      this.e = azc.d($$1.do() + 1.0F);
      this.f = azc.d($$1.dn() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eqn b(je $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eqn c(int $$0, int $$1, int $$2) {
      return (eqn)this.c.computeIfAbsent(eqn.b($$0, $$1, $$2), $$3 -> new eqn($$0, $$1, $$2));
   }

   public abstract eqn a();

   public abstract eqw a(double var1, double var3, double var5);

   protected eqw b(double $$0, double $$1, double $$2) {
      return new eqw(this.c(azc.a($$0), azc.a($$1), azc.a($$2)));
   }

   public abstract int a(eqn[] var1, eqn var2);

   public abstract eqs a(equ var1, int var2, int var3, int var4, buh var5);

   public abstract eqs a(equ var1, int var2, int var3, int var4);

   public eqs a(buh $$0, je $$1) {
      return this.a(new equ($$0.dS(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dua $$0) {
      return $$0.a(aws.aL) || $$0.a(dgx.H) || $$0.a(dgx.kJ) || dhj.h($$0) || $$0.a(dgx.fv);
   }
}
