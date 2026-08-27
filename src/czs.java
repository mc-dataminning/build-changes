import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class czs extends cua implements cuh {
   public static final MapCodec<czs> a = b(czs::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eiy f = eiv.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgb $$0, dgb $$1, hx $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      return eiv.a();
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!($$3 instanceof bkj) || $$3.dm().a(this)) {
         $$3.a($$0, new eif(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ate $$4 = $$1.E_();
            boolean $$5 = $$3.ac != $$3.dq() || $$3.ae != $$3.dw();
            if ($$5 && $$4.h()) {
               $$1.a(
                  js.aE,
                  $$3.dq(),
                  (double)($$2.v() + 1),
                  $$3.dw(),
                  (double)(asy.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(asy.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cqv.c) || $$3 instanceof ccx) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, ht $$2, bjt $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bkj $$5) {
         bkj.a $$7 = $$5.eF();
         aqc $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$3 instanceof eip $$4) {
         bjt $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof bzp;
            if ($$6 || a($$5) && $$3.a(eiv.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return eiv.a();
   }

   @Override
   public eiy b(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return eiv.a();
   }

   public static boolean a(bjt $$0) {
      if ($$0.ag().a(aqv.h)) {
         return true;
      } else {
         return $$0 instanceof bkj ? ((bkj)$$0).c(bjy.c).a(ckm.oN) : false;
      }
   }

   @Override
   public ckj a(@Nullable ccx $$0, cra $$1, ht $$2, dgb $$3) {
      $$1.a($$2, cuc.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, cua.i($$3));
      }

      return new ckj(ckm.pN);
   }

   @Override
   public Optional<aqc> at_() {
      return Optional.of(aqd.cF);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return true;
   }
}
