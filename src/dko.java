import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dko extends dhv {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dko> a = b(dko::new);
   public static final dwl<jm> b = dkm.a;
   public static final dwf c = dwe.A;
   private static final la f = new la();
   public static final Map<cwb, lb> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dko> a() {
      return a;
   }

   public static void a(dfe $$0, lb $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dfe $$0) {
      d.put($$0.j(), new lf($$0.j()));
   }

   protected dko(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtk $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dtl ? awy.ac : awy.ae);
      }

      return bsh.a;
   }

   protected void a(arq $$0, dvo $$1, jh $$2) {
      dtk $$3 = $$0.a($$2, dst.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(eak.a, $$2, eak.a.a($$3.m()));
         } else {
            cwf $$6 = $$3.a($$5);
            lb $$7 = this.a($$0, $$6);
            if ($$7 != lb.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lb a(dff $$0, cwf $$1) {
      if (!$$1.a($$0.J())) {
         return f;
      } else {
         lb $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lb a(cwf $$0) {
      return (lb)($$0.b(ku.D) ? lc.c : f);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
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
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtk($$0, $$1);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      bsd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ka a(ky $$0) {
      return a($$0, 0.7, ezr.c);
   }

   public static ka a(ky $$0, double $$1, ezr $$2) {
      jm $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return crs.a($$1.c_($$2));
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }
}
