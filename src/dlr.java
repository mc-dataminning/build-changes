import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlr extends dix {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final dxt<jn> b = dlp.a;
   public static final dxn c = dxm.H;
   private static final lb f = new lb();
   public static final Map<cwk, lc> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dlr> a() {
      return a;
   }

   public static void a(dgg $$0, lc $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dgg $$0) {
      d.put($$0.j(), new lg($$0.j()));
   }

   protected dlr(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dus $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dut ? awk.ac : awk.ae);
      }

      return bsj.a;
   }

   protected void a(ard $$0, dww $$1, ji $$2) {
      dus $$3 = $$0.a($$2, dua.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kz $$4 = new kz($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ebs.a, $$2, ebs.a.a($$3.m()));
         } else {
            cwo $$6 = $$3.a($$5);
            lc $$7 = this.a($$0, $$6);
            if ($$7 != lc.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lc a(dgh $$0, cwo $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lc $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lc a(cwo $$0) {
      return (lc)($$0.b(kv.D) ? ld.c : f);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
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
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dus($$0, $$1);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static kb a(kz $$0) {
      return a($$0, 0.7, faz.c);
   }

   public static kb a(kz $$0, double $$1, faz $$2) {
      jn $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.a($$1.c_($$2));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }
}
