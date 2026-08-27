import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class enj {
   protected enp a;
   protected bss b;
   protected final Int2ObjectMap<eni> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dbm $$0, bss $$1) {
      this.a = new enp($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayf.d($$1.dj() + 1.0F);
      this.e = ayf.d($$1.dk() + 1.0F);
      this.f = ayf.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eni b(io $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eni c(int $$0, int $$1, int $$2) {
      return (eni)this.c.computeIfAbsent(eni.b($$0, $$1, $$2), $$3 -> new eni($$0, $$1, $$2));
   }

   public abstract eni a();

   public abstract enr a(double var1, double var3, double var5);

   protected enr b(double $$0, double $$1, double $$2) {
      return new enr(this.c(ayf.a($$0), ayf.a($$1), ayf.a($$2)));
   }

   public abstract int a(eni[] var1, eni var2);

   public abstract enn a(enp var1, int var2, int var3, int var4, bss var5);

   public abstract enn a(enp var1, int var2, int var3, int var4);

   public enn a(bss $$0, io $$1) {
      return this.a(new enp($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(drd $$0) {
      return $$0.a(avx.aK) || $$0.a(dec.H) || $$0.a(dec.kJ) || deo.g($$0) || $$0.a(dec.fv);
   }
}
