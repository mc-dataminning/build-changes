import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class exn {
   protected ext b;
   protected bxl c;
   protected final Int2ObjectMap<exm> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(djz $$0, bxl $$1) {
      this.b = new ext($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = azm.d($$1.dp() + 1.0F);
      this.f = azm.d($$1.dq() + 1.0F);
      this.g = azm.d($$1.dp() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected exm b(iv $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected exm c(int $$0, int $$1, int $$2) {
      return (exm)this.d.computeIfAbsent(exm.b($$0, $$1, $$2), $$3 -> new exm($$0, $$1, $$2));
   }

   public abstract exm a();

   public abstract exv a(double var1, double var3, double var5);

   protected exv b(double $$0, double $$1, double $$2) {
      return new exv(this.c(azm.a($$0), azm.a($$1), azm.a($$2)));
   }

   public abstract int a(exm[] var1, exm var2);

   public abstract exr a(ext var1, int var2, int var3, int var4, bxl var5);

   public abstract exr a(ext var1, int var2, int var3, int var4);

   public exr a(bxl $$0, iv $$1) {
      return this.a(new ext($$0.dU(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(eat $$0) {
      return $$0.a(axc.aN) || $$0.a(dmt.K) || $$0.a(dmt.lp) || dnh.h($$0) || $$0.a(dmt.fU);
   }
}
