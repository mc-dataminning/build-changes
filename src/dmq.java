import com.mojang.serialization.MapCodec;

public class dmq extends dkn {
   public static final MapCodec<dmq> c = b(dmq::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dmq> a() {
      return c;
   }

   public dmq(dzn.d $$0) {
      super($$0, kb.c);
   }

   @Override
   public boolean d(dzo $$0) {
      return false;
   }

   protected static boolean a(dip $$0, djs.c $$1) {
      if ($$1 == djs.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == djs.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, djs.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == djs.c.b) {
            $$1.b($$2, dlw.fP.m());
            $$1.a(null, eeo.c, $$2);
         } else if ($$3 == djs.c.c) {
            $$1.b($$2, dlw.fR.m());
            $$1.a(null, eeo.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(evu $$0) {
      return true;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, evu $$3) {
      if ($$3 == evw.c) {
         dzo $$4 = dlw.fP.m();
         $$1.b($$2, $$4);
         $$1.a(eeo.c, $$2, eeo.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == evw.e) {
         dzo $$5 = dlw.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(eeo.c, $$2, eeo.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
