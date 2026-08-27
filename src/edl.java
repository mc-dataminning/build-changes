import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class edl {
   protected css a;
   protected bln b;
   protected final Int2ObjectMap<edk> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(css $$0, bln $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = atq.d($$1.dh() + 1.0F);
      this.e = atq.d($$1.di() + 1.0F);
      this.f = atq.d($$1.dh() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected edk b(hx $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected edk b(int $$0, int $$1, int $$2) {
      return (edk)this.c.computeIfAbsent(edk.b($$0, $$1, $$2), $$3 -> new edk($$0, $$1, $$2));
   }

   public abstract edk a();

   public abstract edq a(double var1, double var3, double var5);

   protected edq a(edk $$0) {
      return new edq($$0);
   }

   public abstract int a(edk[] var1, edk var2);

   public abstract edi a(crl var1, int var2, int var3, int var4, bln var5);

   public abstract edi a(crl var1, int var2, int var3, int var4);

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
