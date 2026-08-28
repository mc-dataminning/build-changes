import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhn extends deu {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhn> a = b(dhn::new);
   public static final dtf b = dhl.a;
   public static final dtc c = dtb.A;
   private static final kt f = new kt();
   public static final Map<cty, ku> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dhn> a() {
      return a;
   }

   public static void a(dcf $$0, ku $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dcf $$0) {
      d.put($$0.r(), new kw($$0.r()));
   }

   protected dhn(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dqj) {
            $$3.a((dqj)$$5);
            if ($$5 instanceof dqk) {
               $$3.a(avr.ac);
            } else {
               $$3.a(avr.ae);
            }
         }

         return bqh.c;
      }
   }

   protected void a(aqm $$0, dsl $$1, ja $$2) {
      dqj $$3 = $$0.a($$2, dps.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kr $$4 = new kr($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dxh.a, $$2, dxh.a.a($$3.n()));
         } else {
            cud $$6 = $$3.a($$5);
            ku $$7 = this.a($$0, $$6);
            if ($$7 != ku.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ku a(dcg $$0, cud $$1) {
      return (ku)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
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
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqj($$0, $$1);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      bqd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jt a(kr $$0) {
      return a($$0, 0.7, ewh.b);
   }

   public static jt a(kr $$0, double $$1, ewh $$2) {
      jf $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.a($$1.c_($$2));
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }
}
