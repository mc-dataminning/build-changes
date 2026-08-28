import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkv extends dfb implements dfi {
   public static final MapCodec<dkv> a = b(dkv::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ewm f = ewj.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dse $$0, dse $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ewm f(dse $$0, dbg $$1, iz $$2) {
      return ewj.a();
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (!($$3 instanceof btr) || $$3.dq().a(this)) {
         $$3.a($$0, new evt(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azh $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  li.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.ab().b(dbw.c) || $$3 instanceof cmz) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dca $$0, dse $$1, iz $$2, bsw $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btr $$5) {
         btr.a $$7 = $$5.eL();
         avz $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$3 instanceof ewd $$4) {
         bsw $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cji;
            if ($$6 || a($$5) && $$3.a(ewj.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewj.a();
   }

   @Override
   protected ewm c(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ewj.a();
   }

   public static boolean a(bsw $$0) {
      if ($$0.ak().a(awt.h)) {
         return true;
      } else {
         return $$0 instanceof btr ? ((btr)$$0).a(btd.c).a(cuu.pB) : false;
      }
   }

   @Override
   public cur a(@Nullable cmz $$0, dcb $$1, iz $$2, dse $$3) {
      $$1.a($$2, dfd.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dfb.i($$3));
      }

      return new cur(cuu.qB);
   }

   @Override
   public Optional<avz> ar_() {
      return Optional.of(awa.dm);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return true;
   }
}
