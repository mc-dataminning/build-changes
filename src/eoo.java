import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class eoo {
   protected eou a;
   protected bta b;
   protected final Int2ObjectMap<eon> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   protected boolean j;

   public void a(dcq $$0, bta $$1) {
      this.a = new eou($$0, $$1);
      this.b = $$1;
      this.c.clear();
      this.d = aye.d($$1.dj() + 1.0F);
      this.e = aye.d($$1.dk() + 1.0F);
      this.f = aye.d($$1.dj() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   protected eon b(ja $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected eon c(int $$0, int $$1, int $$2) {
      return (eon)this.c.computeIfAbsent(eon.b($$0, $$1, $$2), $$3 -> new eon($$0, $$1, $$2));
   }

   public abstract eon a();

   public abstract eow a(double var1, double var3, double var5);

   protected eow b(double $$0, double $$1, double $$2) {
      return new eow(this.c(aye.a($$0), aye.a($$1), aye.a($$2)));
   }

   public abstract int a(eon[] var1, eon var2);

   public abstract eos a(eou var1, int var2, int var3, int var4, bta var5);

   public abstract eos a(eou var1, int var2, int var3, int var4);

   public eos a(bta $$0, ja $$1) {
      return this.a(new eou($$0.dP(), $$0), $$1.u(), $$1.v(), $$1.w());
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

   public static boolean a(dsh $$0) {
      return $$0.a(avu.aK) || $$0.a(dfh.H) || $$0.a(dfh.kJ) || dft.g($$0) || $$0.a(dfh.fv);
   }
}
