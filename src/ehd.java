import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ehd {
   protected cwa a;
   protected boi b;
   protected final Int2ObjectMap<ehc> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cwa $$0, boi $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = awh.d($$1.dg() + 1.0F);
      this.e = awh.d($$1.dh() + 1.0F);
      this.f = awh.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected ehc b(hz $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected ehc b(int $$0, int $$1, int $$2) {
      return (ehc)this.c.computeIfAbsent(ehc.b($$0, $$1, $$2), $$3 -> new ehc($$0, $$1, $$2));
   }

   public abstract ehc a();

   public abstract ehi a(double var1, double var3, double var5);

   protected ehi a(ehc $$0) {
      return new ehi($$0);
   }

   public abstract int a(ehc[] var1, ehc var2);

   public abstract eha a(cut var1, int var2, int var3, int var4, boi var5);

   public abstract eha a(cut var1, int var2, int var3, int var4);

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
