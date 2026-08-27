import com.mojang.serialization.MapCodec;

public class ddc extends dba {
   public static final MapCodec<ddc> d = b(ddc::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<ddc> a() {
      return d;
   }

   public ddc(dph.d $$0) {
      super($$0, jk.c);
   }

   @Override
   public boolean d(dpi $$0) {
      return false;
   }

   protected static boolean a(czg $$0, daf.c $$1) {
      if ($$1 == daf.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == daf.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, daf.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == daf.c.b) {
            $$1.b($$2, dcj.fu.n());
            $$1.a(null, dub.c, $$2);
         } else if ($$3 == daf.c.c) {
            $$1.b($$2, dcj.fw.n());
            $$1.a(null, dub.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ela $$0) {
      return true;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, ela $$3) {
      if ($$3 == elc.c) {
         dpi $$4 = dcj.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dub.c, $$2, dub.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == elc.e) {
         dpi $$5 = dcj.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dub.c, $$2, dub.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
