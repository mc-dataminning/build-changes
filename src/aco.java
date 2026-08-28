import java.util.List;

public class aco implements zf<abt> {
   public static final yw<wj, aco> a = zf.a(aco::a, aco::new);
   private final int b;
   private final int c;
   private final List<cuo> d;
   private final cuo e;

   public aco(int $$0, int $$1, jv<cuo> $$2, cuo $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jv.a($$2.size(), cuo.l);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private aco(wj $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cuo.j.decode($$0);
      this.e = cuo.h.decode($$0);
   }

   private void a(wj $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cuo.j.encode($$0, this.d);
      cuo.h.encode($$0, this.e);
   }

   @Override
   public zh<aco> a() {
      return agf.u;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cuo> e() {
      return this.d;
   }

   public cuo f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
