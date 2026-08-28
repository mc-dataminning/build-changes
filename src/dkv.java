import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkv extends dhv {
   public static final MapCodec<dkv> a = b(dkv::new);
   protected static final fal b = dij.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jh> c = jh.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jh::j).toList();

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   protected dkv(dvn.d $$0) {
      super($$0);
   }

   public static boolean a(dff $$0, jh $$1, jh $$2) {
      return $$0.a_($$1.a((kl)$$2)).a(axd.cx) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axd.cy);
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jh $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ls.s,
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
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0.C ? a($$2, dst.m, dtm::a) : null;
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsh.a;
   }

   @Nullable
   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      dsr $$3 = $$1.c_($$2);
      if ($$3 instanceof dtm) {
         xl $$4 = ((bsk)$$3).S_();
         return new bsp(($$2x, $$3x, $$4x) -> new cso($$2x, $$3x, csf.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
