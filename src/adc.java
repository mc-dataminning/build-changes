import java.util.List;

public class adc implements zs<ach> {
   public static final zj<ww, adc> a = zs.a(adc::a, adc::new);
   private final int b;
   private final int c;
   private final List<cwf> d;
   private final cwf e;

   public adc(int $$0, int $$1, jz<cwf> $$2, cwf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jz.a($$2.size(), cwf.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private adc(ww $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cwf.j.decode($$0);
      this.e = cwf.h.decode($$0);
   }

   private void a(ww $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cwf.j.encode($$0, this.d);
      cwf.h.encode($$0, this.e);
   }

   @Override
   public zu<adc> a() {
      return agw.u;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cwf> e() {
      return this.d;
   }

   public cwf f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
