import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dma extends diz {
   public static final MapCodec<dma> a = b(dma::new);
   protected static final fbv b = djn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ji> c = ji.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ji::j).toList();

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   protected dma(dwx.d $$0) {
      super($$0);
   }

   public static boolean a(dgj $$0, ji $$1, ji $$2) {
      return $$0.a_($$1.a((km)$$2)).a(awp.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awp.cz);
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ji $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lt.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new duw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? a($$2, duc.n, duw::a) : null;
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsl.a;
   }

   @Nullable
   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      dua $$3 = $$1.c_($$2);
      if ($$3 instanceof duw) {
         wp $$4 = ((bso)$$3).p_();
         return new bst(($$2x, $$3x, $$4x) -> new csz($$2x, $$3x, csq.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
