import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends deu implements diq {
   public static final MapCodec<dng> a = b(dng::new);
   public static final dtj<dtv> b = dtb.bj;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   protected dng(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtv.b));
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drg($$0, $$1);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      dpq $$5 = $$1.c_($$2);
      if ($$5 instanceof drg) {
         return ((drg)$$5).a($$3) ? bqh.a($$1.B) : bqh.e;
      } else {
         return bqh.e;
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, @Nullable btc $$3, cud $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpq $$5 = $$0.c_($$1);
            if ($$5 instanceof drg) {
               ((drg)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if ($$1 instanceof aqm) {
         if ($$1.c_($$2) instanceof drg $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqm)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqm $$0, drg $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
