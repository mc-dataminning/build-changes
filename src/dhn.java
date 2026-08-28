import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhn extends den {
   public static final MapCodec<dhn> a = b(dhn::new);
   protected static final ewm b = dfb.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<iz> c = iz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iz::i).toList();

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   protected dhn(dsd.d $$0) {
      super($$0);
   }

   public static boolean a(dca $$0, iz $$1, iz $$2) {
      return $$0.a_($$1.a((kd)$$2)).a(awp.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awp.cw);
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iz $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               li.s,
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
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? a($$2, dpl.m, dqd::a) : null;
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqw.c;
      }
   }

   @Nullable
   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      dpj $$3 = $$1.c_($$2);
      if ($$3 instanceof dqd) {
         xp $$4 = ((brb)$$3).O_();
         return new brg(($$2x, $$3x, $$4x) -> new cqq($$2x, $$3x, cqh.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
