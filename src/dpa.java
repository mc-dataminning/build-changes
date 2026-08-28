import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpa extends dly {
   public static final MapCodec<dpa> a = b(dpa::new);
   public static final List<iv> b = iv.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iv::j).toList();
   private static final ffr c = dmm.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   protected dpa(ean.d $$0) {
      super($$0);
   }

   public static boolean a(djh $$0, iv $$1, iv $$2) {
      return $$0.a_($$1.a((ka)$$2)).a(axc.cC) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axc.cD);
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iv $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ly.s,
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
   public dxm a(iv $$0, eao $$1) {
      return new dyj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? a($$2, dxo.n, dyj::a) : null;
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      dxm $$3 = $$1.c_($$2);
      if ($$3 instanceof dyj) {
         wy $$4 = ((buj)$$3).m_();
         return new buo(($$2x, $$3x, $$4x) -> new cvy($$2x, $$3x, cvp.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
