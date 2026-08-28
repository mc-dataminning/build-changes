import com.mojang.serialization.MapCodec;

public class dqv extends dnd {
   public static final MapCodec<dqv> a = b(dqv::new);

   @Override
   public MapCodec<dqv> a() {
      return a;
   }

   public dqv(dww.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgi $$0, dwx $$1, ji $$2, buk $$3, float $$4) {
      if (!$$3.cf()) {
         $$3.a($$4, 0.0F, $$0.ak().l());
      }
   }

   @Override
   public void a(dfn $$0, buk $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(buk $$0) {
      fba $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvg ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, buk $$3) {
      double $$4 = Math.abs($$3.dz().e);
      if ($$4 < 0.1 && !$$3.ce()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dz().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
