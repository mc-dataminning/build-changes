import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eoh {
   protected eon a;
   protected btq b;
   protected final Int2ObjectMap<eog> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dck $$0, btq $$1) {
      this.a = new eon($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = ayy.d($$1.dj() + 1.0F);
      this.e = ayy.d($$1.dk() + 1.0F);
      this.f = ayy.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eog b(iz $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eog c(int $$0, int $$1, int $$2) {
      return (eog)this.c.computeIfAbsent(eog.b($$0, $$1, $$2), $$3 -> new eog($$0, $$1, $$2));
   }

   public abstract eog a();

   public abstract eop a(double var1, double var3, double var5);

   protected eop b(double $$0, double $$1, double $$2) {
      return new eop(this.c(ayy.a($$0), ayy.a($$1), ayy.a($$2)));
   }

   public abstract int a(eog[] var1, eog var2);

   public abstract eol a(eon var1, int var2, int var3, int var4, btq var5);

   public abstract eol a(eon var1, int var2, int var3, int var4);

   public eol a(btq $$0, iz $$1) {
      return this.a(new eon($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dsb $$0) {
      return $$0.a(awo.aK) || $$0.a(dfa.H) || $$0.a(dfa.kJ) || dfm.g($$0) || $$0.a(dfa.fv);
   }
}
