import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dns extends dhy implements dif {
   public static final MapCodec<dns> a = b(dns::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fab f = ezy.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvd $$0, dvd $$1, jl $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!($$3 instanceof buv) || $$3.dy().a(this)) {
         $$3.a($$0, new ezh(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azr $$4 = $$1.E_();
            boolean $$5 = $$3.ab != $$3.dC() || $$3.ad != $$3.dI();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lq.aK,
                  $$3.dC(),
                  (double)($$2.v() + 1),
                  $$3.dI(),
                  (double)(azj.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azj.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.C) {
         if ($$3.bZ() && ($$1.ac().b(der.c) || $$3 instanceof coh) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof buv $$5) {
         buv.a $$7 = $$5.eP();
         awj $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$3 instanceof ezr $$4) {
         btz $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof ckp;
            if ($$6 || a($$5) && $$3.a(ezy.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ezy.a();
   }

   @Override
   protected fab c(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ezy.a();
   }

   public static boolean a(btz $$0) {
      if ($$0.aq().a(axd.h)) {
         return true;
      } else {
         return $$0 instanceof buv ? ((buv)$$0).a(buh.c).a(cwb.pC) : false;
      }
   }

   @Override
   public cvx a(@Nullable coh $$0, dew $$1, jg $$2, dvd $$3) {
      $$1.a($$2, dia.a.m(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, dhy.j($$3));
      }

      return new cvx(cwb.qC);
   }

   @Override
   public Optional<awj> au_() {
      return Optional.of(awk.dm);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return true;
   }
}
