import java.util.List;

public class acf implements yw<abl> {
   public static final yn<wa, acf> a = yw.a(acf::a, acf::new);
   private final int b;
   private final int c;
   private final List<cxh> d;
   private final cxh e;

   public acf(int $$0, int $$1, ka<cxh> $$2, cxh $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = ka.a($$2.size(), cxh.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acf(wa $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cxh.j.decode($$0);
      this.e = cxh.h.decode($$0);
   }

   private void a(wa $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cxh.j.encode($$0, this.d);
      cxh.h.encode($$0, this.e);
   }

   @Override
   public yy<acf> a() {
      return agd.t;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cxh> e() {
      return this.d;
   }

   public cxh f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
