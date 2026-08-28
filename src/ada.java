import java.util.List;

public class ada implements zq<acf> {
   public static final zh<wu, ada> a = zq.a(ada::a, ada::new);
   private final int b;
   private final int c;
   private final List<cwm> d;
   private final cwm e;

   public ada(int $$0, int $$1, jz<cwm> $$2, cwm $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jz.a($$2.size(), cwm.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private ada(wu $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cwm.j.decode($$0);
      this.e = cwm.h.decode($$0);
   }

   private void a(wu $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cwm.j.encode($$0, this.d);
      cwm.h.encode($$0, this.e);
   }

   @Override
   public zs<ada> a() {
      return agu.u;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cwm> e() {
      return this.d;
   }

   public cwm f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
