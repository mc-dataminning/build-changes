import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpk extends djl implements djt {
   public static final MapCodec<dpk> a = b(dpk::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fbt f = fbq.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dww $$0, dww $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if (!($$3 instanceof bvg) || $$3.dw().a(this)) {
         $$3.a($$0, new faz(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azh $$4 = $$1.H_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lt.aM,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof ard $$6) {
         if ($$3.bY() && ($$6.O().b(dgd.c) || $$3 instanceof cow) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dgh $$0, dww $$1, ji $$2, buk $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bvg $$5) {
         bvg.a $$7 = $$5.eM();
         avz $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if ($$3 instanceof fbj $$4) {
         buk $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cla;
            if ($$6 || a($$5) && $$3.a(fbq.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fbq.a();
   }

   @Override
   protected fbt c(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return fbq.a();
   }

   public static boolean a(buk $$0) {
      if ($$0.aq().a(awt.h)) {
         return true;
      } else {
         return $$0 instanceof bvg ? ((bvg)$$0).a(bus.c).a(cws.qg) : false;
      }
   }

   @Override
   public cwo a(@Nullable cow $$0, dgi $$1, ji $$2, dww $$3) {
      $$1.a($$2, djn.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, djl.j($$3));
      }

      return new cwo(cws.ri);
   }

   @Override
   public Optional<avz> as_() {
      return Optional.of(awa.dn);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return true;
   }
}
