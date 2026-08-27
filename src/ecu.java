import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ecu {
   protected csf a;
   protected bla b;
   protected final Int2ObjectMap<ect> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(csf $$0, bla $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = ati.d($$1.df() + 1.0F);
      this.e = ati.d($$1.dg() + 1.0F);
      this.f = ati.d($$1.df() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected ect b(ht $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected ect b(int $$0, int $$1, int $$2) {
      return (ect)this.c.computeIfAbsent(ect.b($$0, $$1, $$2), $$3 -> new ect($$0, $$1, $$2));
   }

   public abstract ect a();

   public abstract ecz a(double var1, double var3, double var5);

   protected ecz a(ect $$0) {
      return new ecz($$0);
   }

   public abstract int a(ect[] var1, ect var2);

   public abstract ecr a(cqy var1, int var2, int var3, int var4, bla var5);

   public abstract ecr a(cqy var1, int var2, int var3, int var4);

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
