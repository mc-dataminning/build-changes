import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnh extends dkg {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final List<jj> b = jj.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jj::j).toList();
   private static final fdo c = dku.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   protected dnh(dyl.d $$0) {
      super($$0);
   }

   public static boolean a(dhp $$0, jj $$1, jj $$2) {
      return $$0.a_($$1.a((kn)$$2)).a(awz.cA) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awz.cB);
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jj $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lv.s,
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
   public dvl a(jj $$0, dym $$1) {
      return new dwi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? a($$2, dvn.n, dwi::a) : null;
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return btq.a;
   }

   @Nullable
   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      dvl $$3 = $$1.c_($$2);
      if ($$3 instanceof dwi) {
         wv $$4 = ((btt)$$3).m_();
         return new bty(($$2x, $$3x, $$4x) -> new cuj($$2x, $$3x, cua.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
