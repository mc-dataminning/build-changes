import com.mojang.serialization.MapCodec;

public class dub extends dmf {
   public static final MapCodec<dub> a = b(dub::new);
   private static final ffk b = dmf.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dub> a() {
      return a;
   }

   public dub(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      return ffh.b();
   }

   @Override
   protected ffk c(eah $$0, dig $$1, iu $$2, fev $$3) {
      return ffh.b();
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      dmm.b($$1, $$2.d(), $$0);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == ja.b && $$6.a(dmh.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected float c(eah $$0, dig $$1, iu $$2) {
      return 0.2F;
   }
}
