import com.mojang.serialization.MapCodec;

public class dev extends dct {
   public static final MapCodec<dev> d = b(dev::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dev> a() {
      return d;
   }

   public dev(drc.d $$0) {
      super($$0, ju.c);
   }

   @Override
   public boolean d(drd $$0) {
      return false;
   }

   protected static boolean a(daz $$0, dby.c $$1) {
      if ($$1 == dby.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dby.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, dby.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dby.c.b) {
            $$1.b($$2, dec.fu.n());
            $$1.a(null, dvw.c, $$2);
         } else if ($$3 == dby.c.c) {
            $$1.b($$2, dec.fw.n());
            $$1.a(null, dvw.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(emv $$0) {
      return true;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, emv $$3) {
      if ($$3 == emx.c) {
         drd $$4 = dec.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dvw.c, $$2, dvw.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == emx.e) {
         drd $$5 = dec.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dvw.c, $$2, dvw.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
