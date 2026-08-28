import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnh extends dhm implements dht {
   public static final MapCodec<dnh> a = b(dnh::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ezq f = ezn.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dur.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dus $$0, dus $$1, jk $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!($$3 instanceof bun) || $$3.dt().a(this)) {
         $$3.a($$0, new eyw(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azn $$4 = $$1.D_();
            boolean $$5 = $$3.ab != $$3.dx() || $$3.ad != $$3.dD();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lo.aK,
                  $$3.dx(),
                  (double)($$2.v() + 1),
                  $$3.dD(),
                  (double)(azf.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azf.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.B) {
         if ($$3.bV() && ($$1.ac().b(def.c) || $$3 instanceof cnx) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bun $$5) {
         bun.a $$7 = $$5.eK();
         awf $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$3 instanceof ezg $$4) {
         btr $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof ckg;
            if ($$6 || a($$5) && $$3.a(ezn.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ezn.a();
   }

   @Override
   protected ezq c(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.a();
   }

   public static boolean a(btr $$0) {
      if ($$0.ao().a(awz.h)) {
         return true;
      } else {
         return $$0 instanceof bun ? ((bun)$$0).a(btz.c).a(cvw.pC) : false;
      }
   }

   @Override
   public cvs a(@Nullable cnx $$0, dek $$1, jf $$2, dus $$3) {
      $$1.a($$2, dho.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dhm.j($$3));
      }

      return new cvs(cvw.qC);
   }

   @Override
   public Optional<awf> au_() {
      return Optional.of(awg.dm);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return true;
   }
}
