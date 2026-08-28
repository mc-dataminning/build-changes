import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhg extends den {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dsy b = dhe.a;
   public static final dsv c = dsu.A;
   private static final ks f = new ks();
   public static final Map<cum, kt> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dhg> a() {
      return a;
   }

   public static void a(dbz $$0, kt $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dbz $$0) {
      d.put($$0.r(), new kv($$0.r()));
   }

   protected dhg(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dqb) {
            $$3.a((dqb)$$5);
            if ($$5 instanceof dqc) {
               $$3.a(awk.ac);
            } else {
               $$3.a(awk.ae);
            }
         }

         return bqw.c;
      }
   }

   protected void a(arf $$0, dse $$1, iz $$2) {
      dqb $$3 = $$0.a($$2, dpl.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dwx.a, $$2, dwx.a.a($$3.n()));
         } else {
            cur $$6 = $$3.a($$5);
            kt $$7 = this.a($$0, $$6);
            if ($$7 != kt.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kt a(dca $$0, cur $$1) {
      return (kt)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
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
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqb($$0, $$1);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      bqs.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static js a(kq $$0) {
      return a($$0, 0.7, evt.b);
   }

   public static js a(kq $$0, double $$1, evt $$2) {
      je $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.a($$1.c_($$2));
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }
}
