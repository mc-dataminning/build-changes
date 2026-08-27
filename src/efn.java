import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class efn {
   protected cuk a;
   protected bmq b;
   protected final Int2ObjectMap<efm> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cuk $$0, bmq $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = aup.d($$1.dg() + 1.0F);
      this.e = aup.d($$1.dh() + 1.0F);
      this.f = aup.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected efm b(hx $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected efm b(int $$0, int $$1, int $$2) {
      return (efm)this.c.computeIfAbsent(efm.b($$0, $$1, $$2), $$3 -> new efm($$0, $$1, $$2));
   }

   public abstract efm a();

   public abstract efs a(double var1, double var3, double var5);

   protected efs a(efm $$0) {
      return new efs($$0);
   }

   public abstract int a(efm[] var1, efm var2);

   public abstract efk a(ctd var1, int var2, int var3, int var4, bmq var5);

   public abstract efk a(ctd var1, int var2, int var3, int var4);

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
}
