import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnx extends dhl implements djx {
   public static final MapCodec<dnx> c = b(dnx::new);
   public static final dua<dty> d = dhl.b;
   protected static final float e = 6.0F;
   protected static final exn f = dfc.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnx> a() {
      return c;
   }

   public dnx(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return f;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.d($$1, $$2, iw.b) && !$$0.a(dfe.lH);
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(dfe.cg);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      if ($$1 != null) {
         epe $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awj.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      if ($$0.c(d) == dty.a) {
         dtc $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dty.b;
      } else {
         epe $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awj.a) && $$4.e() == 8;
      }
   }

   @Override
   protected epe b_(dtc $$0) {
      return epf.c.a(false);
   }

   @Override
   public boolean a(@Nullable cly $$0, dbg $$1, ir $$2, dtc $$3, epd $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, ir $$1, dtc $$2, epe $$3) {
      return false;
   }
}
