import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkv extends dic {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final dws<jm> b = dkt.a;
   public static final dwm c = dwl.A;
   private static final la f = new la();
   public static final Map<cwi, lb> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dkv> a() {
      return a;
   }

   public static void a(dfl $$0, lb $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dfl $$0) {
      d.put($$0.j(), new lf($$0.j()));
   }

   protected dkv(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtr $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dts ? awx.ac : awx.ae);
      }

      return bsk.a;
   }

   protected void a(arp $$0, dvv $$1, jh $$2) {
      dtr $$3 = $$0.a($$2, dta.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ear.a, $$2, ear.a.a($$3.m()));
         } else {
            cwm $$6 = $$3.a($$5);
            lb $$7 = this.a($$0, $$6);
            if ($$7 != lb.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lb a(dfm $$0, cwm $$1) {
      if (!$$1.a($$0.J())) {
         return f;
      } else {
         lb $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lb a(cwm $$0) {
      return (lb)($$0.b(ku.D) ? lc.c : f);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
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
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtr($$0, $$1);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ka a(ky $$0) {
      return a($$0, 0.7, ezy.c);
   }

   public static ka a(ky $$0, double $$1, ezy $$2) {
      jm $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.a($$1.c_($$2));
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }
}
