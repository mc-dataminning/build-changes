import java.util.List;

public class adc implements zv<ach> {
   public static final zm<wz, adc> a = zv.a(adc::a, adc::new);
   private final int b;
   private final int c;
   private final List<cun> d;
   private final cun e;

   public adc(int $$0, int $$1, jr<cun> $$2, cun $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jr.a($$2.size(), cun.l);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private adc(wz $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cun.j.decode($$0);
      this.e = cun.h.decode($$0);
   }

   private void a(wz $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cun.j.encode($$0, this.d);
      cun.h.encode($$0, this.e);
   }

   @Override
   public zx<adc> a() {
      return agt.u;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cun> e() {
      return this.d;
   }

   public cun f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
