import com.mojang.serialization.MapCodec;

public class dda extends deh implements deb {
   public static final MapCodec<dda> a = b(dda::new);
   private static final evd b = eva.a(ddy.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), ddy.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   protected dda(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(dea.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      dqq.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
