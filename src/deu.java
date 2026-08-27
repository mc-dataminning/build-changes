import com.mojang.serialization.MapCodec;

public class deu extends cwz implements cwt {
   public static final MapCodec<deu> a = b(deu::new);
   protected static final float b = 6.0F;
   protected static final emm c = cwq.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   protected deu(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return true;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      cyy $$4 = (cyy)($$3.a(cws.bu) ? cws.iI : cws.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         cyy.a($$0, $$4.o(), $$2, 2);
      }
   }
}
