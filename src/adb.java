import java.util.List;

public class adb implements zr<acg> {
   public static final zi<wv, adb> a = zr.a(adb::a, adb::new);
   private final int b;
   private final int c;
   private final List<cxg> d;
   private final cxg e;

   public adb(int $$0, int $$1, jz<cxg> $$2, cxg $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jz.a($$2.size(), cxg.j);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private adb(wv $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cxg.i.decode($$0);
      this.e = cxg.g.decode($$0);
   }

   private void a(wv $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cxg.i.encode($$0, this.d);
      cxg.g.encode($$0, this.e);
   }

   @Override
   public zt<adb> a() {
      return agz.u;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cxg> e() {
      return this.d;
   }

   public cxg f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
