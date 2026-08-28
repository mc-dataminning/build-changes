import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class esi {
   protected eso a;
   protected bvj b;
   protected final Int2ObjectMap<esh> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dfz $$0, bvj $$1) {
      this.a = new eso($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = azm.d($$1.dq() + 1.0F);
      this.e = azm.d($$1.dr() + 1.0F);
      this.f = azm.d($$1.dq() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected esh b(jh $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected esh c(int $$0, int $$1, int $$2) {
      return (esh)this.c.computeIfAbsent(esh.b($$0, $$1, $$2), $$3 -> new esh($$0, $$1, $$2));
   }

   public abstract esh a();

   public abstract esq a(double var1, double var3, double var5);

   protected esq b(double $$0, double $$1, double $$2) {
      return new esq(this.c(azm.a($$0), azm.a($$1), azm.a($$2)));
   }

   public abstract int a(esh[] var1, esh var2);

   public abstract esm a(eso var1, int var2, int var3, int var4, bvj var5);

   public abstract esm a(eso var1, int var2, int var3, int var4);

   public esm a(bvj $$0, jh $$1) {
      return this.a(new eso($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dvv $$0) {
      return $$0.a(axc.aM) || $$0.a(dis.H) || $$0.a(dis.kJ) || dje.h($$0) || $$0.a(dis.fv);
   }
}
