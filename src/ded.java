import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ded extends dej {
   public static final MapCodec<ded> a = b(ded::new);
   public static final dsu b = dsq.P;
   public static final dsr c = dsq.u;

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof doy) {
            $$3.a((doy)$$5);
            $$3.a(awj.ar);
            clm.a($$3, true);
         }

         return bqs.c;
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      bqo.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      dpf $$4 = $$1.c_($$2);
      if ($$4 instanceof doy) {
         ((doy)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new doy($$0, $$1);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
