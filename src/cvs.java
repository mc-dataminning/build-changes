import com.mojang.serialization.MapCodec;

public class cvs extends cwz implements cwt {
   public static final MapCodec<cvs> a = b(cvs::new);
   private static final emm b = emj.a(cwq.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cwq.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cvs> a() {
      return a;
   }

   protected cvs(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(cws.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      diw.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
