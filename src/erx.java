import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class erx {
   protected esd a;
   protected bvc b;
   protected final Int2ObjectMap<erw> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dfo $$0, bvc $$1) {
      this.a = new esd($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = azk.d($$1.ds() + 1.0F);
      this.e = azk.d($$1.dt() + 1.0F);
      this.f = azk.d($$1.ds() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected erw b(jh $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected erw c(int $$0, int $$1, int $$2) {
      return (erw)this.c.computeIfAbsent(erw.b($$0, $$1, $$2), $$3 -> new erw($$0, $$1, $$2));
   }

   public abstract erw a();

   public abstract esf a(double var1, double var3, double var5);

   protected esf b(double $$0, double $$1, double $$2) {
      return new esf(this.c(azk.a($$0), azk.a($$1), azk.a($$2)));
   }

   public abstract int a(erw[] var1, erw var2);

   public abstract esb a(esd var1, int var2, int var3, int var4, bvc var5);

   public abstract esb a(esd var1, int var2, int var3, int var4);

   public esb a(bvc $$0, jh $$1) {
      return this.a(new esd($$0.dX(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dvj $$0) {
      return $$0.a(axa.aL) || $$0.a(dig.H) || $$0.a(dig.kJ) || dis.h($$0) || $$0.a(dig.fv);
   }
}
