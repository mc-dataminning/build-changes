import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class emn {
   protected emt a;
   protected bsc b;
   protected final Int2ObjectMap<emm> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(daq $$0, bsc $$1) {
      this.a = new emt($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = axz.d($$1.dh() + 1.0F);
      this.e = axz.d($$1.di() + 1.0F);
      this.f = axz.d($$1.dh() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected emm b(in $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected emm c(int $$0, int $$1, int $$2) {
      return (emm)this.c.computeIfAbsent(emm.b($$0, $$1, $$2), $$3 -> new emm($$0, $$1, $$2));
   }

   public abstract emm a();

   public abstract emv a(double var1, double var3, double var5);

   protected emv b(double $$0, double $$1, double $$2) {
      return new emv(this.c(axz.a($$0), axz.a($$1), axz.a($$2)));
   }

   public abstract int a(emm[] var1, emm var2);

   public abstract emr a(emt var1, int var2, int var3, int var4, bsc var5);

   public abstract emr a(emt var1, int var2, int var3, int var4);

   public emr a(bsc $$0, in $$1) {
      return this.a(new emt($$0.dN(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dqh $$0) {
      return $$0.a(avr.aK) || $$0.a(ddg.H) || $$0.a(ddg.kJ) || dds.g($$0) || $$0.a(ddg.fv);
   }
}
