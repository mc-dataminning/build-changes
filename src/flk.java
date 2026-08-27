public class flk extends flq {
   private static final int a = 3;
   private final fog b;
   private final biw D;
   private final biw E;
   private int F;
   private final ftb G;

   public flk(ftb $$0, fog $$1, fis $$2, biw $$3, biw $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.do());
   }

   private flk(ftb $$0, fog $$1, fis $$2, biw $$3, biw $$4, ehh $$5) {
      super($$2, $$3.dq(), $$3.ds(), $$3.dw(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private biw a(biw $$0) {
      return (biw)(!($$0 instanceof byt) ? $$0 : ((byt)$$0).C());
   }

   @Override
   public flu b() {
      return flu.e;
   }

   @Override
   public void a(eln $$0, eqa $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = asb.d((double)$$2, this.E.ac, this.E.dq());
      double $$5 = asb.d((double)$$2, this.E.ad, (this.E.ds() + this.E.du()) / 2.0);
      double $$6 = asb.d((double)$$2, this.E.ae, this.E.dw());
      double $$7 = asb.d((double)$$3, this.D.dq(), $$4);
      double $$8 = asb.d((double)$$3, this.D.ds(), $$5);
      double $$9 = asb.d((double)$$3, this.D.dw(), $$6);
      foa.a $$10 = this.b.b();
      ehh $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dB(), $$2, new elj(), $$10, this.G.a(this.D, $$2));
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
