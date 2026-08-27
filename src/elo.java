import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class elo {
   protected elu a;
   protected bqv b;
   protected final Int2ObjectMap<eln> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(czt $$0, bqv $$1) {
      this.a = new elu($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = axm.d($$1.dg() + 1.0F);
      this.e = axm.d($$1.dh() + 1.0F);
      this.f = axm.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eln b(id $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eln c(int $$0, int $$1, int $$2) {
      return (eln)this.c.computeIfAbsent(eln.b($$0, $$1, $$2), $$3 -> new eln($$0, $$1, $$2));
   }

   public abstract eln a();

   public abstract elw a(double var1, double var3, double var5);

   protected elw b(double $$0, double $$1, double $$2) {
      return new elw(this.c(axm.a($$0), axm.a($$1), axm.a($$2)));
   }

   public abstract int a(eln[] var1, eln var2);

   public abstract els a(elu var1, int var2, int var3, int var4, bqv var5);

   public abstract els a(elu var1, int var2, int var3, int var4);

   public els a(bqv $$0, id $$1) {
      return this.a(new elu($$0.dM(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dpi $$0) {
      return $$0.a(ave.aK) || $$0.a(dcj.H) || $$0.a(dcj.kJ) || dcv.g($$0) || $$0.a(dcj.fv);
   }
}
