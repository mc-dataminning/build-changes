import com.mojang.serialization.MapCodec;

public class dlk extends ddy {
   public static final MapCodec<dlk> a = b(dlk::new);
   protected static final evd b = ddy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected evd b_(drb $$0, dad $$1, io $$2) {
      return eva.b();
   }

   @Override
   protected evd c(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.b();
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      dee.b($$1, $$2.c(), $$0);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.b && $$2.a(dea.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   protected float d(drb $$0, dad $$1, io $$2) {
      return 0.2F;
   }
}
