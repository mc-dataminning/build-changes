public class fnp extends fnv {
   private static final int a = 3;
   private final fqn b;
   private final bki D;
   private final bki E;
   private int F;
   private final fvi G;

   public fnp(fvi $$0, fqn $$1, fkw $$2, bki $$3, bki $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.do());
   }

   private fnp(fvi $$0, fqn $$1, fkw $$2, bki $$3, bki $$4, eji $$5) {
      super($$2, $$3.dq(), $$3.ds(), $$3.dw(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private bki a(bki $$0) {
      return (bki)(!($$0 instanceof caf) ? $$0 : ((caf)$$0).C());
   }

   @Override
   public fnz b() {
      return fnz.e;
   }

   @Override
   public void a(eno $$0, esc $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ati.d((double)$$2, this.E.ac, this.E.dq());
      double $$5 = ati.d((double)$$2, this.E.ad, (this.E.ds() + this.E.du()) / 2.0);
      double $$6 = ati.d((double)$$2, this.E.ae, this.E.dw());
      double $$7 = ati.d((double)$$3, this.D.dq(), $$4);
      double $$8 = ati.d((double)$$3, this.D.ds(), $$5);
      double $$9 = ati.d((double)$$3, this.D.dw(), $$6);
      fqh.a $$10 = this.b.c();
      eji $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dB(), $$2, new enk(), $$10, this.G.a(this.D, $$2));
      $$10.b();
   }

   @Override
   public void a() {
      this.F++;
      if (this.F == 3) {
         this.k();
      }
   }
}
