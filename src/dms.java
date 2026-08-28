import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dms extends djx {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dms> a = b(dms::new);
   public static final dyr<jm> b = dmq.a;
   public static final dyl c = dyk.B;
   private static final la f = new la();
   public static final Map<cxk, lb> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dms> a() {
      return a;
   }

   public static void a(dhg $$0, lb $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dhg $$0) {
      d.put($$0.j(), new lf($$0.j()));
   }

   protected dms(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvq $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dvr ? axp.ac : axp.ae);
      }

      return bti.a;
   }

   protected void a(ash $$0, dxu $$1, jh $$2) {
      dvq $$3 = $$0.a($$2, duy.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ecq.a, $$2, ecq.a.a($$3.m()));
         } else {
            cxo $$6 = $$3.a($$5);
            lb $$7 = this.a($$0, $$6);
            if ($$7 != lb.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lb a(dhh $$0, cxo $$1) {
      if (!$$1.a($$0.J())) {
         return f;
      } else {
         lb $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lb a(cxo $$0) {
      return (lb)($$0.b(ku.D) ? lc.c : f);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
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
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvq($$0, $$1);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      bte.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ka a(ky $$0) {
      return a($$0, 0.7, fbx.c);
   }

   public static ka a(ky $$0, double $$1, fbx $$2) {
      jm $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.a($$1.c_($$2));
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }
}
