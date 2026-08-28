import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsy extends dkg implements doe {
   public static final MapCodec<dsy> a = b(dsy::new);
   public static final dzk<dzw> b = dzc.bm;

   @Override
   public MapCodec<dsy> a() {
      return a;
   }

   protected dsy(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dzw.b));
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxe($$0, $$1);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      dvl $$5 = $$1.c_($$2);
      if ($$5 instanceof dxe) {
         return (btq)(((dxe)$$5).a($$3) ? btq.a : btq.e);
      } else {
         return btq.e;
      }
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, @Nullable bwr $$3, cxy $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dvl $$5 = $$0.c_($$1);
            if ($$5 instanceof dxe) {
               ((dxe)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$1 instanceof arn) {
         if ($$1.c_($$2) instanceof dxe $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((arn)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(arn $$0, dxe $$1) {
      switch ($$1.v()) {
         case a:
            $$1.c(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.C();
         case d:
      }
   }
}
