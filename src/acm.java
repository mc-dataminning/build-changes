import java.util.List;

public class acm implements zd<abs> {
   public static final yu<wh, acm> a = zd.a(acm::a, acm::new);
   private final int b;
   private final int c;
   private final List<cys> d;
   private final cys e;

   public acm(int $$0, int $$1, jn<cys> $$2, cys $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jn.a($$2.size(), cys.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acm(wh $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cys.j.decode($$0);
      this.e = cys.h.decode($$0);
   }

   private void a(wh $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cys.j.encode($$0, this.d);
      cys.h.encode($$0, this.e);
   }

   @Override
   public zf<acm> a() {
      return agl.t;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cys> e() {
      return this.d;
   }

   public cys f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
