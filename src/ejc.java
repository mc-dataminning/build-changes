import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ejc {
   protected cxo a;
   protected bpr b;
   protected final Int2ObjectMap<ejb> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cxo $$0, bpr $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = aww.d($$1.dg() + 1.0F);
      this.e = aww.d($$1.dh() + 1.0F);
      this.f = aww.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected ejb b(ib $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected ejb c(int $$0, int $$1, int $$2) {
      return (ejb)this.c.computeIfAbsent(ejb.b($$0, $$1, $$2), $$3 -> new ejb($$0, $$1, $$2));
   }

   public abstract ejb a();

   public abstract eji a(double var1, double var3, double var5);

   protected eji b(double $$0, double $$1, double $$2) {
      return new eji(this.c(aww.a($$0), aww.a($$1), aww.a($$2)));
   }

   public abstract int a(ejb[] var1, ejb var2);

   public abstract ejg a(cwh var1, int var2, int var3, int var4, bpr var5);

   public abstract ejg a(cwh var1, int var2, int var3, int var4);

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

   public static boolean a(dnb $$0) {
      return $$0.a(aun.aK) || $$0.a(dae.H) || $$0.a(dae.kJ) || daq.g($$0) || $$0.a(dae.fv);
   }
}
