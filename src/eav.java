import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eav {
   protected cqd a;
   protected bjd b;
   protected final Int2ObjectMap<eau> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cqd $$0, bjd $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = ars.d($$1.df() + 1.0F);
      this.e = ars.d($$1.dg() + 1.0F);
      this.f = ars.d($$1.df() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eau b(gw $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eau b(int $$0, int $$1, int $$2) {
      return (eau)this.c.computeIfAbsent(eau.b($$0, $$1, $$2), $$3 -> new eau($$0, $$1, $$2));
   }

   public abstract eau a();

   public abstract eba a(double var1, double var3, double var5);

   protected eba a(eau $$0) {
      return new eba($$0);
   }

   public abstract int a(eau[] var1, eau var2);

   public abstract eas a(cow var1, int var2, int var3, int var4, bjd var5);

   public abstract eas a(cow var1, int var2, int var3, int var4);

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
