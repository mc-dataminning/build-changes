import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dik extends dfk {
   public static final MapCodec<dik> a = b(dik::new);
   protected static final ext b = dfy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jd> c = jd.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jd::j).toList();

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   protected dik(dtb.d $$0) {
      super($$0);
   }

   public static boolean a(dcw $$0, jd $$1, jd $$2) {
      return $$0.a_($$1.a((kh)$$2)).a(awe.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awe.cw);
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
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
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0.B ? a($$2, dqj.m, drc::a) : null;
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqr.c;
      }
   }

   @Nullable
   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      dqh $$3 = $$1.c_($$2);
      if ($$3 instanceof drc) {
         wz $$4 = ((bqw)$$3).S_();
         return new brb(($$2x, $$3x, $$4x) -> new cqp($$2x, $$3x, cqg.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }
}
