import com.mojang.serialization.MapCodec;

public class dki extends dna implements dkh {
   public static final MapCodec<dki> c = b(dki::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dki> a() {
      return c;
   }

   public dki(dwu.d $$0) {
      super($$0, jn.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azg $$0) {
      return 1;
   }

   @Override
   protected boolean h(dwv $$0) {
      return $$0.l();
   }

   @Override
   protected djk b() {
      return djm.sY;
   }

   @Override
   protected dwv a(dwv $$0, dwv $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dwv a(dwv $$0, azg $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
