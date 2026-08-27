import java.util.List;

public class abb implements xx<aag> {
   public static final xo<vb, abb> a = xx.a(abb::a, abb::new);
   private final int b;
   private final int c;
   private final List<cpd> d;
   private final cpd e;

   public abb(int $$0, int $$1, is<cpd> $$2, cpd $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = is.a($$2.size(), cpd.h);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).q());
      }

      this.e = $$3.q();
   }

   private abb(vb $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.n();
      this.d = cpd.g.decode($$0);
      this.e = cpd.f.decode($$0);
   }

   private void a(vb $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cpd.g.encode($$0, this.d);
      cpd.f.encode($$0, this.e);
   }

   @Override
   public xz<abb> a() {
      return aeq.u;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cpd> e() {
      return this.d;
   }

   public cpd f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
