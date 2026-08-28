import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkz extends dff implements dfm {
   public static final MapCodec<dkz> a = b(dkz::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ews f = ewp.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsh $$0, dsh $$1, jf $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      return ewp.a();
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!($$3 instanceof bsy) || $$3.dq().a(this)) {
         $$3.a($$0, new evz(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            aym $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lj.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(aye.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aye.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.ab().b(dbz.c) || $$3 instanceof cmh) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bsy $$5) {
         bsy.a $$7 = $$5.eH();
         ave $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if ($$3 instanceof ewj $$4) {
         bsd $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof ciq;
            if ($$6 || a($$5) && $$3.a(ewp.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewp.a();
   }

   @Override
   protected ews c(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ewp.a();
   }

   public static boolean a(bsd $$0) {
      if ($$0.ak().a(avy.h)) {
         return true;
      } else {
         return $$0 instanceof bsy ? ((bsy)$$0).a(bsk.c).a(cud.pB) : false;
      }
   }

   @Override
   public cua a(@Nullable cmh $$0, dce $$1, ja $$2, dsh $$3) {
      $$1.a($$2, dfh.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dff.i($$3));
      }

      return new cua(cud.qB);
   }

   @Override
   public Optional<ave> as_() {
      return Optional.of(avf.dm);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return true;
   }
}
