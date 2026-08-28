import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlq extends diw {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final dxs<jn> b = dlo.a;
   public static final dxm c = dxl.H;
   private static final lb f = new lb();
   public static final Map<cwj, lc> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dlq> a() {
      return a;
   }

   public static void a(dgf $$0, lc $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dgf $$0) {
      d.put($$0.j(), new lg($$0.j()));
   }

   protected dlq(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dur $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dus ? awj.ac : awj.ae);
      }

      return bsi.a;
   }

   protected void a(arc $$0, dwv $$1, ji $$2) {
      dur $$3 = $$0.a($$2, dtz.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kz $$4 = new kz($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ebr.a, $$2, ebr.a.a($$3.m()));
         } else {
            cwn $$6 = $$3.a($$5);
            lc $$7 = this.a($$0, $$6);
            if ($$7 != lc.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lc a(dgg $$0, cwn $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lc $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lc a(cwn $$0) {
      return (lc)($$0.b(kv.D) ? ld.c : f);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
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
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dur($$0, $$1);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      bse.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static kb a(kz $$0) {
      return a($$0, 0.7, fay.c);
   }

   public static kb a(kz $$0, double $$1, fay $$2) {
      jn $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.a($$1.c_($$2));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }
}
