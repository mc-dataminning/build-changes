import java.util.List;

public class acg implements yw<abl> {
   public static final yn<wa, acg> a = yw.a(acg::a, acg::new);
   private final int b;
   private final int c;
   private final List<cwo> d;
   private final cwo e;

   public acg(int $$0, int $$1, ka<cwo> $$2, cwo $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = ka.a($$2.size(), cwo.j);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acg(wa $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cwo.i.decode($$0);
      this.e = cwo.g.decode($$0);
   }

   private void a(wa $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cwo.i.encode($$0, this.d);
      cwo.g.encode($$0, this.e);
   }

   @Override
   public yy<acg> a() {
      return age.u;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cwo> e() {
      return this.d;
   }

   public cwo f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
