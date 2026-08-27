import com.mojang.serialization.MapCodec;

public class dir extends ddy {
   public static final MapCodec<dir> a = b(dir::new);
   private static final int b = 20;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dra.d $$0) {
      super($$0);
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bru $$3) {
      if (!$$3.bW() && $$3 instanceof bso && !cza.j((bso)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
