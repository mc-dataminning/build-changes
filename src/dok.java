import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dok extends diq implements dix {
   public static final MapCodec<dok> a = b(dok::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fas f = fap.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvv $$0, dvv $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (!($$3 instanceof bvh) || $$3.dw().a(this)) {
         $$3.a($$0, new ezy(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azu $$4 = $$1.G_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ls.aK,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azm.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azm.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof arp $$6) {
         if ($$3.bY() && ($$6.N().b(dfi.c) || $$3 instanceof cou) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dfm $$0, dvv $$1, jh $$2, bul $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bvh $$5) {
         bvh.a $$7 = $$5.eL();
         awm $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      if ($$3 instanceof fai $$4) {
         bul $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof clb;
            if ($$6 || a($$5) && $$3.a(fap.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fap.a();
   }

   @Override
   protected fas c(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.a();
   }

   public static boolean a(bul $$0) {
      if ($$0.aq().a(axg.h)) {
         return true;
      } else {
         return $$0 instanceof bvh ? ((bvh)$$0).a(but.c).a(cwq.pC) : false;
      }
   }

   @Override
   public cwm a(@Nullable cou $$0, dfn $$1, jh $$2, dvv $$3) {
      $$1.a($$2, dis.a.m(), 11);
      if (!$$1.A_()) {
         $$1.c(2001, $$2, diq.j($$3));
      }

      return new cwm(cwq.qC);
   }

   @Override
   public Optional<awm> as_() {
      return Optional.of(awn.dm);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return true;
   }
}
