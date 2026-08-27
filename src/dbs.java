import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbs extends cvz implements cwg {
   public static final MapCodec<dbs> a = b(dbs::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final elu f = elr.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   public dbs(dio.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dip $$0, dip $$1, ia $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public elu f(dip $$0, cse $$1, hv $$2) {
      return elr.a();
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!($$3 instanceof blv) || $$3.dn().a(this)) {
         $$3.a($$0, new elb(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            auf $$4 = $$1.F_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  jv.aH,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(aty.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aty.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Y().b(csu.c) || $$3 instanceof cer) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(csy $$0, dip $$1, hv $$2, blf $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof blv $$5) {
         blv.a $$7 = $$5.eG();
         arb $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$3 instanceof ell $$4) {
         blf $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cbd;
            if ($$6 || a($$5) && $$3.a(elr.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return elr.a();
   }

   @Override
   public elu c(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.a();
   }

   public static boolean a(blf $$0) {
      if ($$0.ai().a(aru.h)) {
         return true;
      } else {
         return $$0 instanceof blv ? ((blv)$$0).c(blk.c).a(cmk.py) : false;
      }
   }

   @Override
   public cmh a(@Nullable cer $$0, csz $$1, hv $$2, dip $$3) {
      $$1.a($$2, cwb.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, cvz.i($$3));
      }

      return new cmh(cmk.qy);
   }

   @Override
   public Optional<arb> au_() {
      return Optional.of(arc.cO);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return true;
   }
}
