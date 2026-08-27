import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dey extends czf implements czm {
   public static final MapCodec<dey> a = b(dey::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final epo f = epl.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public dey(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dme $$0, dme $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected epo f(dme $$0, cvk $$1, ib $$2) {
      return epl.a();
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!($$3 instanceof box) || $$3.dk().a(this)) {
         $$3.a($$0, new eov(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            awt $$4 = $$1.F_();
            boolean $$5 = $$3.ab != $$3.do() || $$3.ad != $$3.du();
            if ($$5 && $$4.h()) {
               $$1.a(
                  kb.aH,
                  $$3.do(),
                  (double)($$2.v() + 1),
                  $$3.du(),
                  (double)(awm.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(awm.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bK() && ($$1.Z().b(cwa.c) || $$3 instanceof cia) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof box $$5) {
         box.a $$7 = $$5.eF();
         ato $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if ($$3 instanceof epf $$4) {
         bof $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cek;
            if ($$6 || a($$5) && $$3.a(epl.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return epl.a();
   }

   @Override
   protected epo c(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return epl.a();
   }

   public static boolean a(bof $$0) {
      if ($$0.ai().a(auh.h)) {
         return true;
      } else {
         return $$0 instanceof box ? ((box)$$0).c(bom.c).a(cpt.pA) : false;
      }
   }

   @Override
   public cpq a(@Nullable cia $$0, cwf $$1, ib $$2, dme $$3) {
      $$1.a($$2, czh.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, czf.i($$3));
      }

      return new cpq(cpt.qA);
   }

   @Override
   public Optional<ato> aw_() {
      return Optional.of(atp.de);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return true;
   }
}
