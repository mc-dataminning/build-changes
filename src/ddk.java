import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddk extends cxn implements czv {
   public static final MapCodec<ddk> c = b(ddk::new);
   public static final dil<dij> d = cxn.b;
   protected static final float e = 6.0F;
   protected static final eks f = cvf.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<ddk> a() {
      return c;
   }

   public ddk(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return f;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.d($$1, $$2, ib.b) && !$$0.a(cvh.kJ);
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(cvh.bw);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = super.a($$0);
      if ($$1 != null) {
         ecx $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(arp.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      if ($$0.c(d) == dij.a) {
         dhn $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dij.b;
      } else {
         ecx $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(arp.a) && $$4.e() == 8;
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return ecy.c.a(false);
   }

   @Override
   public boolean a(@Nullable cdz $$0, crl $$1, hx $$2, dhn $$3, ecw $$4) {
      return false;
   }

   @Override
   public boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      return false;
   }
}
