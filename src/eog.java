import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eog {
   protected eom a;
   protected btp b;
   protected final Int2ObjectMap<eof> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dcj $$0, btp $$1) {
      this.a = new eom($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayx.d($$1.dj() + 1.0F);
      this.e = ayx.d($$1.dk() + 1.0F);
      this.f = ayx.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eof b(iz $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eof c(int $$0, int $$1, int $$2) {
      return (eof)this.c.computeIfAbsent(eof.b($$0, $$1, $$2), $$3 -> new eof($$0, $$1, $$2));
   }

   public abstract eof a();

   public abstract eoo a(double var1, double var3, double var5);

   protected eoo b(double $$0, double $$1, double $$2) {
      return new eoo(this.c(ayx.a($$0), ayx.a($$1), ayx.a($$2)));
   }

   public abstract int a(eof[] var1, eof var2);

   public abstract eok a(eom var1, int var2, int var3, int var4, btp var5);

   public abstract eok a(eom var1, int var2, int var3, int var4);

   public eok a(btp $$0, iz $$1) {
      return this.a(new eom($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dsa $$0) {
      return $$0.a(awo.aK) || $$0.a(dez.H) || $$0.a(dez.kJ) || dfl.g($$0) || $$0.a(dez.fv);
   }
}
