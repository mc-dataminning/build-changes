import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dna extends dkg {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dna> a = b(dna::new);
   public static final dzk<jo> b = dmy.a;
   public static final dzd c = dzc.G;
   private static final ld f = new ld();
   public static final Map<cxu, le> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dna> a() {
      return a;
   }

   public static void a(dho $$0, le $$1) {
      d.put($$0.i(), $$1);
   }

   public static void a(dho $$0) {
      d.put($$0.i(), new li($$0.i()));
   }

   protected dna(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dwg $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dwh ? awu.ac : awu.ae);
      }

      return btq.a;
   }

   protected void a(arn $$0, dym $$1, jj $$2) {
      dwg $$3 = $$0.a($$2, dvn.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         lb $$4 = new lb($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(edm.a, $$2, edm.a.a($$3.m()));
         } else {
            cxy $$6 = $$3.a($$5);
            le $$7 = this.a($$0, $$6);
            if ($$7 != le.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected le a(dhp $$0, cxy $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         le $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static le a(cxy $$0) {
      return (le)($$0.c(kx.E) ? lf.c : f);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
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
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwg($$0, $$1);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   public static kc a(lb $$0) {
      return a($$0, 0.7, fcu.c);
   }

   public static kc a(lb $$0, double $$1, fcu $$2) {
      jo $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.a($$1.c_($$2));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }
}
