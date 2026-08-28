import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class err {
   protected erx a;
   protected bux b;
   protected final Int2ObjectMap<erq> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dfi $$0, bux $$1) {
      this.a = new erx($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = azj.d($$1.ds() + 1.0F);
      this.e = azj.d($$1.dt() + 1.0F);
      this.f = azj.d($$1.ds() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected erq b(jg $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected erq c(int $$0, int $$1, int $$2) {
      return (erq)this.c.computeIfAbsent(erq.b($$0, $$1, $$2), $$3 -> new erq($$0, $$1, $$2));
   }

   public abstract erq a();

   public abstract erz a(double var1, double var3, double var5);

   protected erz b(double $$0, double $$1, double $$2) {
      return new erz(this.c(azj.a($$0), azj.a($$1), azj.a($$2)));
   }

   public abstract int a(erq[] var1, erq var2);

   public abstract erv a(erx var1, int var2, int var3, int var4, bux var5);

   public abstract erv a(erx var1, int var2, int var3, int var4);

   public erv a(bux $$0, jg $$1) {
      return this.a(new erx($$0.dX(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dvd $$0) {
      return $$0.a(awz.aL) || $$0.a(dia.H) || $$0.a(dia.kJ) || dim.h($$0) || $$0.a(dia.fv);
   }
}
