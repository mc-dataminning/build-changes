public class fhg extends fhm {
   private static final int a = 3;
   private final fkd b;
   private final bfj D;
   private final bfj E;
   private int F;
   private final fow G;

   public fhg(fow $$0, fkd $$1, few $$2, bfj $$3, bfj $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dl());
   }

   private fhg(fow $$0, fkd $$1, few $$2, bfj $$3, bfj $$4, eei $$5) {
      super($$2, $$3.dn(), $$3.dp(), $$3.dt(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private bfj a(bfj $$0) {
      return (bfj)(!($$0 instanceof bvh) ? $$0 : ((bvh)$$0).x());
   }

   @Override
   public fhq b() {
      return fhq.e;
   }

   @Override
   public void a(ein $$0, emz $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = apa.d((double)$$2, this.E.ab, this.E.dn());
      double $$5 = apa.d((double)$$2, this.E.ac, (this.E.dp() + this.E.dr()) / 2.0);
      double $$6 = apa.d((double)$$2, this.E.ad, this.E.dt());
      double $$7 = apa.d((double)$$3, this.D.dn(), $$4);
      double $$8 = apa.d((double)$$3, this.D.dp(), $$5);
      double $$9 = apa.d((double)$$3, this.D.dt(), $$6);
      fjx.a $$10 = this.b.b();
      eei $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dy(), $$2, new eij(), $$10, this.G.a(this.D, $$2));
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
