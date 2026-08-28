import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkj extends dhq {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dwd b = dkh.a;
   public static final dwa c = dvz.A;
   private static final la f = new la();
   public static final Map<cvx, lb> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dkj> a() {
      return a;
   }

   public static void a(dfa $$0, lb $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dfa $$0) {
      d.put($$0.j(), new le($$0.j()));
   }

   protected dkj(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtf $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dtg ? awv.ac : awv.ae);
      }

      return bsd.a;
   }

   protected void a(arn $$0, dvj $$1, jh $$2) {
      dtf $$3 = $$0.a($$2, dso.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(eag.a, $$2, eag.a.a($$3.m()));
         } else {
            cwb $$6 = $$3.a($$5);
            lb $$7 = this.a($$0, $$6);
            if ($$7 != lb.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lb a(dfb $$0, cwb $$1) {
      if (!$$1.a($$0.J())) {
         return f;
      } else {
         lb $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lb a(cwb $$0) {
      return (lb)($$0.b(ku.D) ? lc.c : f);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.d());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtf($$0, $$1);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      brz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ka a(ky $$0) {
      return a($$0, 0.7, ezn.c);
   }

   public static ka a(ky $$0, double $$1, ezn $$2) {
      jm $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return cro.a($$1.c_($$2));
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }
}
