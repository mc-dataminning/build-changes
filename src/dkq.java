import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkq extends dhq {
   public static final MapCodec<dkq> a = b(dkq::new);
   protected static final fah b = die.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jh> c = jh.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jh::j).toList();

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(dvi.d $$0) {
      super($$0);
   }

   public static boolean a(dfb $$0, jh $$1, jh $$2) {
      return $$0.a_($$1.a((kl)$$2)).a(axa.cx) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axa.cy);
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jh $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lr.s,
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
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dth($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? a($$2, dso.m, dth::a) : null;
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsd.a;
   }

   @Nullable
   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      dsm $$3 = $$1.c_($$2);
      if ($$3 instanceof dth) {
         xi $$4 = ((bsg)$$3).S_();
         return new bsl(($$2x, $$3x, $$4x) -> new csk($$2x, $$3x, csb.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
