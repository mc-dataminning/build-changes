import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dls extends diy {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dls> a = b(dls::new);
   public static final dxu<jn> b = dlq.a;
   public static final dxo c = dxn.H;
   private static final lb f = new lb();
   public static final Map<cwl, lc> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dls> a() {
      return a;
   }

   public static void a(dgh $$0, lc $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dgh $$0) {
      d.put($$0.j(), new lg($$0.j()));
   }

   protected dls(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dut $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof duu ? awk.ac : awk.ae);
      }

      return bsj.a;
   }

   protected void a(arc $$0, dwx $$1, ji $$2) {
      dut $$3 = $$0.a($$2, dub.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kz $$4 = new kz($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ebt.a, $$2, ebt.a.a($$3.m()));
         } else {
            cwp $$6 = $$3.a($$5);
            lc $$7 = this.a($$0, $$6);
            if ($$7 != lc.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lc a(dgi $$0, cwp $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lc $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lc a(cwp $$0) {
      return (lc)($$0.b(kv.D) ? ld.c : f);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
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
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dut($$0, $$1);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static kb a(kz $$0) {
      return a($$0, 0.7, fba.c);
   }

   public static kb a(kz $$0, double $$1, fba $$2) {
      jn $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.a($$1.c_($$2));
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }
}
