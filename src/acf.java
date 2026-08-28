import java.util.List;

public class acf implements yv<abk> {
   public static final ym<vz, acf> a = yv.a(acf::a, acf::new);
   private final int b;
   private final int c;
   private final List<cwn> d;
   private final cwn e;

   public acf(int $$0, int $$1, ka<cwn> $$2, cwn $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = ka.a($$2.size(), cwn.j);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acf(vz $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cwn.i.decode($$0);
      this.e = cwn.g.decode($$0);
   }

   private void a(vz $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cwn.i.encode($$0, this.d);
      cwn.g.encode($$0, this.e);
   }

   @Override
   public yx<acf> a() {
      return agd.u;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cwn> e() {
      return this.d;
   }

   public cwn f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
