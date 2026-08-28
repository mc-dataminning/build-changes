import com.mojang.serialization.MapCodec;

public class dkj extends dmz implements dkh {
   public static final MapCodec<dkj> c = b(dkj::new);

   @Override
   public MapCodec<dkj> a() {
      return c;
   }

   public dkj(dwu.d $$0) {
      super($$0, jn.a, s_, false);
      this.l(this.F.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dna c() {
      return (dna)djm.sX;
   }

   @Override
   protected dwv a(dwv $$0, dwv $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(cwr.xw);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      return dkh.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(t_);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
