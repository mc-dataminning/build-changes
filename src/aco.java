import java.util.List;

public class aco implements zf<abu> {
   public static final yw<wj, aco> a = zf.a(aco::a, aco::new);
   private final int b;
   private final int c;
   private final List<czk> d;
   private final czk e;

   public aco(int $$0, int $$1, jo<czk> $$2, czk $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jo.a($$2.size(), czk.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private aco(wj $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = czk.j.decode($$0);
      this.e = czk.h.decode($$0);
   }

   private void a(wj $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      czk.j.encode($$0, this.d);
      czk.h.encode($$0, this.e);
   }

   @Override
   public zh<aco> a() {
      return agn.t;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<czk> e() {
      return this.d;
   }

   public czk f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
