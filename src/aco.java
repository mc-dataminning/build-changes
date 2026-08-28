import java.util.List;

public class aco implements zf<abu> {
   public static final yw<wj, aco> a = zf.a(aco::a, aco::new);
   private final int b;
   private final int c;
   private final List<czn> d;
   private final czn e;

   public aco(int $$0, int $$1, jo<czn> $$2, czn $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jo.a($$2.size(), czn.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private aco(wj $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = czn.j.decode($$0);
      this.e = czn.h.decode($$0);
   }

   private void a(wj $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      czn.j.encode($$0, this.d);
      czn.h.encode($$0, this.e);
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

   public List<czn> e() {
      return this.d;
   }

   public czn f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
