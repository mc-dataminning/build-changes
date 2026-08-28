import java.util.List;

public class acv implements zl<aca> {
   public static final zc<wp, acv> a = zl.a(acv::a, acv::new);
   private final int b;
   private final int c;
   private final List<cvs> d;
   private final cvs e;

   public acv(int $$0, int $$1, jx<cvs> $$2, cvs $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jx.a($$2.size(), cvs.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).u());
      }

      this.e = $$3.u();
   }

   private acv(wp $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cvs.j.decode($$0);
      this.e = cvs.h.decode($$0);
   }

   private void a(wp $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cvs.j.encode($$0, this.d);
      cvs.h.encode($$0, this.e);
   }

   @Override
   public zn<acv> a() {
      return agp.u;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cvs> e() {
      return this.d;
   }

   public cvs f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
