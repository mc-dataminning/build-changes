import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djs extends ddy implements def {
   public static final MapCodec<djs> a = b(djs::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final evd f = eva.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dra.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drb $$0, drb $$1, it $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected evd f(drb $$0, dad $$1, io $$2) {
      return eva.a();
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (!($$3 instanceof bso) || $$3.dq().a(this)) {
         $$3.a($$0, new euk(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ayk $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ky.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(ayd.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayd.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.aa().b(dat.c) || $$3 instanceof clw) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dax $$0, drb $$1, io $$2, bru $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bso $$5) {
         bso.a $$7 = $$5.eL();
         avg $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$3 instanceof euu $$4) {
         bru $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cif;
            if ($$6 || a($$5) && $$3.a(eva.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return eva.a();
   }

   @Override
   protected evd c(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.a();
   }

   public static boolean a(bru $$0) {
      if ($$0.ak().a(avz.h)) {
         return true;
      } else {
         return $$0 instanceof bso ? ((bso)$$0).a(bsb.c).a(ctr.pB) : false;
      }
   }

   @Override
   public cto a(@Nullable clw $$0, day $$1, io $$2, drb $$3) {
      $$1.a($$2, dea.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, ddy.i($$3));
      }

      return new cto(ctr.qB);
   }

   @Override
   public Optional<avg> as_() {
      return Optional.of(avh.dm);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return true;
   }
}
