import java.util.List;

public class abh implements yb<aam> {
   public static final xs<vf, abh> a = yb.a(abh::a, abh::new);
   private final int b;
   private final int c;
   private final List<cqm> d;
   private final cqm e;

   public abh(int $$0, int $$1, iu<cqm> $$2, cqm $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = iu.a($$2.size(), cqm.h);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).q());
      }

      this.e = $$3.q();
   }

   private abh(vf $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cqm.g.decode($$0);
      this.e = cqm.f.decode($$0);
   }

   private void a(vf $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cqm.g.encode($$0, this.d);
      cqm.f.encode($$0, this.e);
   }

   @Override
   public yd<abh> a() {
      return aex.u;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cqm> e() {
      return this.d;
   }

   public cqm f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
