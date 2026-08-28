import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmq extends dgv implements dhc {
   public static final MapCodec<dmq> a = b(dmq::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eyx f = eyu.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dua $$0, dua $$1, jj $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!($$3 instanceof buf) || $$3.dt().a(this)) {
         $$3.a($$0, new eye(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azk $$4 = $$1.C_();
            boolean $$5 = $$3.ab != $$3.dx() || $$3.ad != $$3.dD();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ln.aK,
                  $$3.dx(),
                  (double)($$2.v() + 1),
                  $$3.dD(),
                  (double)(azc.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azc.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.B) {
         if ($$3.bV() && ($$1.ac().b(ddo.c) || $$3 instanceof cnp) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof buf $$5) {
         buf.a $$7 = $$5.eK();
         awc $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if ($$3 instanceof eyo $$4) {
         btj $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cjy;
            if ($$6 || a($$5) && $$3.a(eyu.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return eyu.a();
   }

   @Override
   protected eyx c(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return eyu.a();
   }

   public static boolean a(btj $$0) {
      if ($$0.ao().a(aww.h)) {
         return true;
      } else {
         return $$0 instanceof buf ? ((buf)$$0).a(btr.c).a(cvo.pC) : false;
      }
   }

   @Override
   public cvl a(@Nullable cnp $$0, ddt $$1, je $$2, dua $$3) {
      $$1.a($$2, dgx.a.o(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dgv.j($$3));
      }

      return new cvl(cvo.qC);
   }

   @Override
   public Optional<awc> av_() {
      return Optional.of(awd.dm);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return true;
   }
}
