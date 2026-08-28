import java.util.List;

public class acy implements zo<acd> {
   public static final zf<ws, acy> a = zo.a(acy::a, acy::new);
   private final int b;
   private final int c;
   private final List<cvx> d;
   private final cvx e;

   public acy(int $$0, int $$1, jy<cvx> $$2, cvx $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jy.a($$2.size(), cvx.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acy(ws $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cvx.j.decode($$0);
      this.e = cvx.h.decode($$0);
   }

   private void a(ws $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cvx.j.encode($$0, this.d);
      cvx.h.encode($$0, this.e);
   }

   @Override
   public zq<acy> a() {
      return ags.u;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cvx> e() {
      return this.d;
   }

   public cvx f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
