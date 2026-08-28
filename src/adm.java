import java.util.List;

public class adm implements aac<acr> {
   public static final zt<xg, adm> a = aac.a(adm::a, adm::new);
   private final int b;
   private final int c;
   private final List<cxo> d;
   private final cxo e;

   public adm(int $$0, int $$1, jz<cxo> $$2, cxo $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jz.a($$2.size(), cxo.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private adm(xg $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cxo.j.decode($$0);
      this.e = cxo.h.decode($$0);
   }

   private void a(xg $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cxo.j.encode($$0, this.d);
      cxo.h.encode($$0, this.e);
   }

   @Override
   public aae<adm> a() {
      return ahk.u;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cxo> e() {
      return this.d;
   }

   public cxo f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
