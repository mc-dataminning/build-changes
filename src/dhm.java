import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhm extends det {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhm> a = b(dhm::new);
   public static final dte b = dhk.a;
   public static final dtb c = dta.A;
   private static final kt f = new kt();
   public static final Map<ctx, ku> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dhm> a() {
      return a;
   }

   public static void a(dce $$0, ku $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dce $$0) {
      d.put($$0.r(), new kw($$0.r()));
   }

   protected dhm(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dqi) {
            $$3.a((dqi)$$5);
            if ($$5 instanceof dqj) {
               $$3.a(avr.ac);
            } else {
               $$3.a(avr.ae);
            }
         }

         return bqg.c;
      }
   }

   protected void a(aqm $$0, dsk $$1, ja $$2) {
      dqi $$3 = $$0.a($$2, dpr.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kr $$4 = new kr($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dxg.a, $$2, dxg.a.a($$3.n()));
         } else {
            cuc $$6 = $$3.a($$5);
            ku $$7 = this.a($$0, $$6);
            if ($$7 != ku.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ku a(dcf $$0, cuc $$1) {
      return (ku)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
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
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqi($$0, $$1);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      bqc.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jt a(kr $$0) {
      return a($$0, 0.7, ewf.b);
   }

   public static jt a(kr $$0, double $$1, ewf $$2) {
      jf $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return cph.a($$1.c_($$2));
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }
}
