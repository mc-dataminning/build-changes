import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpf extends dmd {
   public static final MapCodec<dpf> a = b(dpf::new);
   public static final List<iv> b = iv.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iv::j).toList();
   private static final ffw c = dmr.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   protected dpf(eas.d $$0) {
      super($$0);
   }

   public static boolean a(djm $$0, iv $$1, iv $$2) {
      return $$0.a_($$1.a((ka)$$2)).a(axc.cC) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axc.cD);
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
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
   public dxr a(iv $$0, eat $$1) {
      return new dyo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? a($$2, dxt.n, dyo::a) : null;
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      dxr $$3 = $$1.c_($$2);
      if ($$3 instanceof dyo) {
         wy $$4 = ((buj)$$3).m_();
         return new buo(($$2x, $$3x, $$4x) -> new cwb($$2x, $$3x, cvs.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
