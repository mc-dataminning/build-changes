import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dml extends djq {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dml> a = b(dml::new);
   public static final dyk<jm> b = dmj.a;
   public static final dye c = dyd.B;
   private static final la f = new la();
   public static final Map<cxg, lb> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dml> a() {
      return a;
   }

   public static void a(dgz $$0, lb $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dgz $$0) {
      d.put($$0.j(), new lf($$0.j()));
   }

   protected dml(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvj $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dvk ? axp.ac : axp.ae);
      }

      return bte.a;
   }

   protected void a(ash $$0, dxn $$1, jh $$2) {
      dvj $$3 = $$0.a($$2, dur.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ecj.a, $$2, ecj.a.a($$3.m()));
         } else {
            cxk $$6 = $$3.a($$5);
            lb $$7 = this.a($$0, $$6);
            if ($$7 != lb.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lb a(dha $$0, cxk $$1) {
      if (!$$1.a($$0.J())) {
         return f;
      } else {
         lb $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lb a(cxk $$0) {
      return (lb)($$0.b(ku.D) ? lc.c : f);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
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
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvj($$0, $$1);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      bta.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ka a(ky $$0) {
      return a($$0, 0.7, fbs.c);
   }

   public static ka a(ky $$0, double $$1, fbs $$2) {
      jm $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.a($$1.c_($$2));
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }
}
