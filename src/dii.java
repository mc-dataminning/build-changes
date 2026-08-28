import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dii extends dfi {
   public static final MapCodec<dii> a = b(dii::new);
   protected static final exp b = dfw.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jd> c = jd.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jd::i).toList();

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   protected dii(dsz.d $$0) {
      super($$0);
   }

   public static boolean a(dcu $$0, jd $$1, jd $$2) {
      return $$0.a_($$1.a((kh)$$2)).a(awd.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awd.cw);
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jd $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lm.s,
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
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dra($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? a($$2, dqh.m, dra::a) : null;
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqq.c;
      }
   }

   @Nullable
   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      dqf $$3 = $$1.c_($$2);
      if ($$3 instanceof dra) {
         wy $$4 = ((bqv)$$3).O_();
         return new bra(($$2x, $$3x, $$4x) -> new cqn($$2x, $$3x, cqe.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
