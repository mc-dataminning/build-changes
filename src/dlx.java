import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlx extends diw {
   public static final MapCodec<dlx> a = b(dlx::new);
   protected static final fbs b = djk.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ji> c = ji.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ji::j).toList();

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dwu.d $$0) {
      super($$0);
   }

   public static boolean a(dgg $$0, ji $$1, ji $$2) {
      return $$0.a_($$1.a((km)$$2)).a(awo.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awo.cz);
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
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
   public dtx a(ji $$0, dwv $$1) {
      return new dut($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? a($$2, dtz.n, dut::a) : null;
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsi.a;
   }

   @Nullable
   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      dtx $$3 = $$1.c_($$2);
      if ($$3 instanceof dut) {
         wo $$4 = ((bsl)$$3).p_();
         return new bsq(($$2x, $$3x, $$4x) -> new csw($$2x, $$3x, csn.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
