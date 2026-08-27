import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eau {
   protected cqo a;
   protected bjo b;
   protected final Int2ObjectMap<eat> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cqo $$0, bjo $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = asb.d($$1.df() + 1.0F);
      this.e = asb.d($$1.dg() + 1.0F);
      this.f = asb.d($$1.df() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eat b(gw $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eat b(int $$0, int $$1, int $$2) {
      return (eat)this.c.computeIfAbsent(eat.b($$0, $$1, $$2), $$3 -> new eat($$0, $$1, $$2));
   }

   public abstract eat a();

   public abstract eaz a(double var1, double var3, double var5);

   protected eaz a(eat $$0) {
      return new eaz($$0);
   }

   public abstract int a(eat[] var1, eat var2);

   public abstract ear a(cph var1, int var2, int var3, int var4, bjo var5);

   public abstract ear a(cph var1, int var2, int var3, int var4);

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
