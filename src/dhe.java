import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhe extends del {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhe> a = b(dhe::new);
   public static final dsw b = dhc.a;
   public static final dst c = dss.A;
   private static final ks f = new ks();
   public static final Map<cuk, kt> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dhe> a() {
      return a;
   }

   public static void a(dbx $$0, kt $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dbx $$0) {
      d.put($$0.r(), new kv($$0.r()));
   }

   protected dhe(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         dph $$5 = $$1.c_($$2);
         if ($$5 instanceof dpz) {
            $$3.a((dpz)$$5);
            if ($$5 instanceof dqa) {
               $$3.a(awk.ac);
            } else {
               $$3.a(awk.ae);
            }
         }

         return bqu.c;
      }
   }

   protected void a(arf $$0, dsc $$1, iz $$2) {
      dpz $$3 = $$0.a($$2, dpj.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dwv.a, $$2, dwv.a.a($$3.n()));
         } else {
            cup $$6 = $$3.a($$5);
            kt $$7 = this.a($$0, $$6);
            if ($$7 != kt.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kt a(dby $$0, cup $$1) {
      return (kt)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
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
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpz($$0, $$1);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      bqq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static js a(kq $$0) {
      return a($$0, 0.7, evr.b);
   }

   public static js a(kq $$0, double $$1, evr $$2) {
      je $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }
}
