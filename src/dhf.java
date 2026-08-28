import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhf extends dem {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final dsx b = dhd.a;
   public static final dsu c = dst.A;
   private static final ks f = new ks();
   public static final Map<cul, kt> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dhf> a() {
      return a;
   }

   public static void a(dby $$0, kt $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dby $$0) {
      d.put($$0.r(), new kv($$0.r()));
   }

   protected dhf(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dqa) {
            $$3.a((dqa)$$5);
            if ($$5 instanceof dqb) {
               $$3.a(awk.ac);
            } else {
               $$3.a(awk.ae);
            }
         }

         return bqv.c;
      }
   }

   protected void a(arf $$0, dsd $$1, iz $$2) {
      dqa $$3 = $$0.a($$2, dpk.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dww.a, $$2, dww.a.a($$3.n()));
         } else {
            cuq $$6 = $$3.a($$5);
            kt $$7 = this.a($$0, $$6);
            if ($$7 != kt.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kt a(dbz $$0, cuq $$1) {
      return (kt)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
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
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqa($$0, $$1);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      bqr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static js a(kq $$0) {
      return a($$0, 0.7, evs.b);
   }

   public static js a(kq $$0, double $$1, evs $$2) {
      je $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.a($$1.c_($$2));
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }
}
