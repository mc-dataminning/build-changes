import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class erc {
   protected eri a;
   protected bum b;
   protected final Int2ObjectMap<erb> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(det $$0, bum $$1) {
      this.a = new eri($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = azd.d($$1.dn() + 1.0F);
      this.e = azd.d($$1.do() + 1.0F);
      this.f = azd.d($$1.dn() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected erb b(je $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected erb c(int $$0, int $$1, int $$2) {
      return (erb)this.c.computeIfAbsent(erb.b($$0, $$1, $$2), $$3 -> new erb($$0, $$1, $$2));
   }

   public abstract erb a();

   public abstract erk a(double var1, double var3, double var5);

   protected erk b(double $$0, double $$1, double $$2) {
      return new erk(this.c(azd.a($$0), azd.a($$1), azd.a($$2)));
   }

   public abstract int a(erb[] var1, erb var2);

   public abstract erg a(eri var1, int var2, int var3, int var4, bum var5);

   public abstract erg a(eri var1, int var2, int var3, int var4);

   public erg a(bum $$0, je $$1) {
      return this.a(new eri($$0.dS(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(duo $$0) {
      return $$0.a(awt.aL) || $$0.a(dhl.H) || $$0.a(dhl.kJ) || dhx.h($$0) || $$0.a(dhl.fv);
   }
}
