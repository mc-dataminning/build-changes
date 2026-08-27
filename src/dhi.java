import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhi extends den {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final dtw b = dhg.a;
   public static final dtt c = dts.A;
   private static final Map<cuc, km> e = ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new kl()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dhi> a() {
      return a;
   }

   public static void a(dbz $$0, km $$1) {
      e.put($$0.q(), $$1);
   }

   protected dhi(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof dqu) {
            $$3.a((dqu)$$5);
            if ($$5 instanceof dqv) {
               $$3.a(avz.ad);
            } else {
               $$3.a(avz.af);
            }
         }

         return bqa.b;
      }
   }

   protected void a(aqt $$0, dtc $$1, ir $$2) {
      dqu $$3 = $$0.a($$2, dqe.g).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kj $$4 = new kj($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dxv.a, $$2, dxv.a.a($$3.n()));
         } else {
            cuh $$6 = $$3.a($$5);
            km $$7 = this.a($$6);
            if ($$7 != km.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected km a(cuh $$0) {
      return e.get($$0.f());
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.c());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqu($$0, $$1);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jk a(kj $$0) {
      iw $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.a($$1.c_($$2));
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }
}
