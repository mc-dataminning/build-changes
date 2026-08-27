import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class een {
   protected ctl a;
   protected blx b;
   protected final Int2ObjectMap<eem> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(ctl $$0, blx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = aty.d($$1.dg() + 1.0F);
      this.e = aty.d($$1.dh() + 1.0F);
      this.f = aty.d($$1.dg() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eem b(hv $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   protected eem b(int $$0, int $$1, int $$2) {
      return (eem)this.c.computeIfAbsent(eem.b($$0, $$1, $$2), $$3 -> new eem($$0, $$1, $$2));
   }

   public abstract eem a();

   public abstract ees a(double var1, double var3, double var5);

   protected ees a(eem $$0) {
      return new ees($$0);
   }

   public abstract int a(eem[] var1, eem var2);

   public abstract eek a(cse var1, int var2, int var3, int var4, blx var5);

   public abstract eek a(cse var1, int var2, int var3, int var4);

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
