import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkd extends dhk {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dkd> a = b(dkd::new);
   public static final dvx b = dkb.a;
   public static final dvu c = dvt.A;
   private static final kz f = new kz();
   public static final Map<cvt, la> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dkd> a() {
      return a;
   }

   public static void a(deu $$0, la $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(deu $$0) {
      d.put($$0.j(), new ld($$0.j()));
   }

   protected dkd(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsz $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dta ? awu.ac : awu.ae);
      }

      return bry.a;
   }

   protected void a(arm $$0, dvd $$1, jg $$2) {
      dsz $$3 = $$0.a($$2, dsi.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kx $$4 = new kx($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(eaa.a, $$2, eaa.a.a($$3.m()));
         } else {
            cvx $$6 = $$3.a($$5);
            la $$7 = this.a($$0, $$6);
            if ($$7 != la.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected la a(dev $$0, cvx $$1) {
      if (!$$1.a($$0.J())) {
         return f;
      } else {
         la $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static la a(cvx $$0) {
      return (la)($$0.b(kt.D) ? lb.c : f);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
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
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsz($$0, $$1);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      bru.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jz a(kx $$0) {
      return a($$0, 0.7, ezh.c);
   }

   public static jz a(kx $$0, double $$1, ezh $$2) {
      jl $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.a($$1.c_($$2));
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }
}
