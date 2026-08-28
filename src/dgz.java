import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dgz extends deg {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dgz> a = b(dgz::new);
   public static final dsr b = dgx.a;
   public static final dso c = dsn.A;
   private static final ks f = new ks();
   public static final Map<cuf, kt> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dgz> a() {
      return a;
   }

   public static void a(dbs $$0, kt $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dbs $$0) {
      d.put($$0.r(), new kv($$0.r()));
   }

   protected dgz(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof dpu) {
            $$3.a((dpu)$$5);
            if ($$5 instanceof dpv) {
               $$3.a(awg.ac);
            } else {
               $$3.a(awg.ae);
            }
         }

         return bqp.c;
      }
   }

   protected void a(arb $$0, drx $$1, iz $$2) {
      dpu $$3 = $$0.a($$2, dpe.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dwq.a, $$2, dwq.a.a($$3.n()));
         } else {
            cuk $$6 = $$3.a($$5);
            kt $$7 = this.a($$0, $$6);
            if ($$7 != kt.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kt a(dbt $$0, cuk $$1) {
      return (kt)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
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
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpu($$0, $$1);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      bql.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static js a(kq $$0) {
      return a($$0, 0.7, evm.b);
   }

   public static js a(kq $$0, double $$1, evm $$2) {
      je $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return cpp.a($$1.c_($$2));
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }
}
