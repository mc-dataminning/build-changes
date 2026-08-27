import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class diy extends dde implements ddl {
   public static final MapCodec<diy> a = b(diy::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eui f = euf.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dqh $$0, dqh $$1, is $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected eui f(dqh $$0, czj $$1, in $$2) {
      return euf.a();
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!($$3 instanceof bsa) || $$3.do().a(this)) {
         $$3.a($$0, new etp(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ayg $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.ds() || $$3.af != $$3.dy();
            if ($$5 && $$4.h()) {
               $$1.a(
                  kx.aH,
                  $$3.ds(),
                  (double)($$2.v() + 1),
                  $$3.dy(),
                  (double)(axz.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(axz.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bO() && ($$1.aa().b(czz.c) || $$3 instanceof clh) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bsa $$5) {
         bsa.a $$7 = $$5.eJ();
         avb $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      if ($$3 instanceof etz $$4) {
         brh $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof chq;
            if ($$6 || a($$5) && $$3.a(euf.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return euf.a();
   }

   @Override
   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.a();
   }

   public static boolean a(brh $$0) {
      if ($$0.ai().a(avu.h)) {
         return true;
      } else {
         return $$0 instanceof bsa ? ((bsa)$$0).d(bro.c).a(ctc.pB) : false;
      }
   }

   @Override
   public csz a(@Nullable clh $$0, dae $$1, in $$2, dqh $$3) {
      $$1.a($$2, ddg.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dde.i($$3));
      }

      return new csz(ctc.qB);
   }

   @Override
   public Optional<avb> as_() {
      return Optional.of(avc.dm);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return true;
   }
}
