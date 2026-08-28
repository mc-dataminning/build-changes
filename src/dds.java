import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dds extends dej {
   public static final dsu a = dit.aE;
   public static final dsr b = dsq.r;

   protected dds(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dds> a();

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqs.c;
      }
   }

   protected abstract void a(dbw var1, iz var2, cmv var3);

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof dot) {
            if ($$1 instanceof are) {
               bqo.a($$1, $$2, (dot)$$5);
               ((dot)$$5).a((are)$$1, evp.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
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
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpf> dpg<T> a(dbw $$0, dph<T> $$1, dph<? extends dot> $$2) {
      return $$0.B ? null : a($$1, $$2, dot::a);
   }
}
