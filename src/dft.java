import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dft extends daa implements dah {
   public static final MapCodec<dft> a = b(dft::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eqk f = eqh.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dmz $$0, dmz $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected eqk f(dmz $$0, cwf $$1, ib $$2) {
      return eqh.a();
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (!($$3 instanceof bpo) || $$3.dn().a(this)) {
         $$3.a($$0, new epr(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            axd $$4 = $$1.E_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  kc.aI,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(aww.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aww.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Z().b(cwv.c) || $$3 instanceof cis) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cwz $$0, dmz $$1, ib $$2, bow $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bpo $$5) {
         bpo.a $$7 = $$5.eI();
         atx $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if ($$3 instanceof eqb $$4) {
         bow $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cfc;
            if ($$6 || a($$5) && $$3.a(eqh.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return eqh.a();
   }

   @Override
   protected eqk c(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return eqh.a();
   }

   public static boolean a(bow $$0) {
      if ($$0.ai().a(auq.h)) {
         return true;
      } else {
         return $$0 instanceof bpo ? ((bpo)$$0).d(bpd.c).a(cqn.pA) : false;
      }
   }

   @Override
   public cqk a(@Nullable cis $$0, cxa $$1, ib $$2, dmz $$3) {
      $$1.a($$2, dac.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, daa.i($$3));
      }

      return new cqk(cqn.qA);
   }

   @Override
   public Optional<atx> av_() {
      return Optional.of(aty.dh);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return true;
   }
}
