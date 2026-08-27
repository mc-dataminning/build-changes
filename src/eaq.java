import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eaq {
   protected cpy a;
   protected bja b;
   protected final Int2ObjectMap<eap> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cpy $$0, bja $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = arp.d($$1.df() + 1.0F);
      this.e = arp.d($$1.dg() + 1.0F);
      this.f = arp.d($$1.df() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eap b(gu $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eap b(int $$0, int $$1, int $$2) {
      return (eap)this.c.computeIfAbsent(eap.b($$0, $$1, $$2), $$3 -> new eap($$0, $$1, $$2));
   }

   public abstract eap a();

   public abstract eav a(double var1, double var3, double var5);

   protected eav a(eap $$0) {
      return new eav($$0);
   }

   public abstract int a(eap[] var1, eap var2);

   public abstract ean a(cor var1, int var2, int var3, int var4, bja var5);

   public abstract ean a(cor var1, int var2, int var3, int var4);

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
