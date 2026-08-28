import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlc extends dfi implements dfp {
   public static final MapCodec<dlc> a = b(dlc::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final exa f = ewx.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsl $$0, dsl $$1, jf $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected exa f(dsl $$0, dbm $$1, ja $$2) {
      return ewx.a();
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!($$3 instanceof btc) || $$3.ds().a(this)) {
         $$3.a($$0, new ewh(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ayo $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.dw() || $$3.af != $$3.dC();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lj.aK,
                  $$3.dw(),
                  (double)($$2.v() + 1),
                  $$3.dC(),
                  (double)(ayg.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayg.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.B) {
         if ($$3.bS() && ($$1.ab().b(dcc.c) || $$3 instanceof cml) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.d(false);
      }
   }

   @Override
   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btc $$5) {
         btc.a $$7 = $$5.eJ();
         avg $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$3 instanceof ewr $$4) {
         bsh $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof ciu;
            if ($$6 || a($$5) && $$3.a(ewx.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewx.a();
   }

   @Override
   protected exa c(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return ewx.a();
   }

   public static boolean a(bsh $$0) {
      if ($$0.am().a(awa.h)) {
         return true;
      } else {
         return $$0 instanceof btc ? ((btc)$$0).a(bso.c).a(cug.pB) : false;
      }
   }

   @Override
   public cud a(@Nullable cml $$0, dch $$1, ja $$2, dsl $$3) {
      $$1.a($$2, dfk.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dfi.i($$3));
      }

      return new cud(cug.qB);
   }

   @Override
   public Optional<avg> as_() {
      return Optional.of(avh.dm);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return true;
   }
}
