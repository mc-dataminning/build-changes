import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class ewt {
   protected ewz b;
   protected bxe c;
   protected final Int2ObjectMap<ews> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dji $$0, bxe $$1) {
      this.b = new ewz($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = azm.d($$1.dq() + 1.0F);
      this.f = azm.d($$1.dr() + 1.0F);
      this.g = azm.d($$1.dq() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected ews b(iu $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected ews c(int $$0, int $$1, int $$2) {
      return (ews)this.d.computeIfAbsent(ews.b($$0, $$1, $$2), $$3 -> new ews($$0, $$1, $$2));
   }

   public abstract ews a();

   public abstract exb a(double var1, double var3, double var5);

   protected exb b(double $$0, double $$1, double $$2) {
      return new exb(this.c(azm.a($$0), azm.a($$1), azm.a($$2)));
   }

   public abstract int a(ews[] var1, ews var2);

   public abstract ewx a(ewz var1, int var2, int var3, int var4, bxe var5);

   public abstract ewx a(ewz var1, int var2, int var3, int var4);

   public ewx a(bxe $$0, iu $$1) {
      return this.a(new ewz($$0.dV(), $$0), $$1.u(), $$1.v(), $$1.w());
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   public void b(boolean $$0) {
      this.i = $$0;
   }

   public void c(boolean $$0) {
      this.j = $$0;
   }

   public void d(boolean $$0) {
      this.k = $$0;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public boolean f() {
      return this.j;
   }

   public boolean g() {
      return this.k;
   }

   public static boolean a(dzz $$0) {
      return $$0.a(axc.aN) || $$0.a(dmc.K) || $$0.a(dmc.lm) || dmp.h($$0) || $$0.a(dmc.fR);
   }
}
