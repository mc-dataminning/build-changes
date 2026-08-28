import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmt extends djy {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dys<jm> b = dmr.a;
   public static final dym c = dyl.B;
   private static final la f = new la();
   public static final Map<cxl, lb> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dmt> a() {
      return a;
   }

   public static void a(dhh $$0, lb $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dhh $$0) {
      d.put($$0.j(), new lf($$0.j()));
   }

   protected dmt(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvr $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dvs ? axp.ac : axp.ae);
      }

      return btj.a;
   }

   protected void a(ash $$0, dxv $$1, jh $$2) {
      dvr $$3 = $$0.a($$2, duz.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ecr.a, $$2, ecr.a.a($$3.m()));
         } else {
            cxp $$6 = $$3.a($$5);
            lb $$7 = this.a($$0, $$6);
            if ($$7 != lb.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lb a(dhi $$0, cxp $$1) {
      if (!$$1.a($$0.J())) {
         return f;
      } else {
         lb $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lb a(cxp $$0) {
      return (lb)($$0.b(ku.D) ? lc.c : f);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
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
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvr($$0, $$1);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      btf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ka a(ky $$0) {
      return a($$0, 0.7, fby.c);
   }

   public static ka a(ky $$0, double $$1, fby $$2) {
      jm $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.a($$1.c_($$2));
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }
}
