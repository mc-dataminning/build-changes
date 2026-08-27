import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ebs {
   protected crm a;
   protected bkl b;
   protected final Int2ObjectMap<ebr> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(crm $$0, bkl $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = asy.d($$1.df() + 1.0F);
      this.e = asy.d($$1.dg() + 1.0F);
      this.f = asy.d($$1.df() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected ebr b(ht $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected ebr b(int $$0, int $$1, int $$2) {
      return (ebr)this.c.computeIfAbsent(ebr.b($$0, $$1, $$2), $$3 -> new ebr($$0, $$1, $$2));
   }

   public abstract ebr a();

   public abstract ebx a(double var1, double var3, double var5);

   protected ebx a(ebr $$0) {
      return new ebx($$0);
   }

   public abstract int a(ebr[] var1, ebr var2);

   public abstract ebp a(cqf var1, int var2, int var3, int var4, bkl var5);

   public abstract ebp a(cqf var1, int var2, int var3, int var4);

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
