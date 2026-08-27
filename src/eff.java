import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eff {
   protected cuc a;
   protected bmn b;
   protected final Int2ObjectMap<efe> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(cuc $$0, bmn $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = auo.d($$1.dg() + 1.0F);
      this.e = auo.d($$1.dh() + 1.0F);
      this.f = auo.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected efe b(hx $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected efe b(int $$0, int $$1, int $$2) {
      return (efe)this.c.computeIfAbsent(efe.b($$0, $$1, $$2), $$3 -> new efe($$0, $$1, $$2));
   }

   public abstract efe a();

   public abstract efk a(double var1, double var3, double var5);

   protected efk a(efe $$0) {
      return new efk($$0);
   }

   public abstract int a(efe[] var1, efe var2);

   public abstract efc a(csv var1, int var2, int var3, int var4, bmn var5);

   public abstract efc a(csv var1, int var2, int var3, int var4);

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
