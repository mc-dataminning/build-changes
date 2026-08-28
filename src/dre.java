import com.mojang.serialization.MapCodec;

public class dre extends dmf {
   public static final MapCodec<dre> a = b(dre::new);
   private static final int b = 20;

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(eag.d $$0) {
      super($$0);
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bwf $$3) {
      if (!$$3.ce() && $$3 instanceof bxe) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
