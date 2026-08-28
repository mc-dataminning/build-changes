import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dib extends dfi {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dib> a = b(dib::new);
   public static final dtu b = dhz.a;
   public static final dtr c = dtq.A;
   private static final kw f = new kw();
   public static final Map<cuj, kx> d = ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dib> a() {
      return a;
   }

   public static void a(dct $$0, kx $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dct $$0) {
      d.put($$0.r(), new kz($$0.r()));
   }

   protected dib(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof dqy) {
            $$3.a((dqy)$$5);
            if ($$5 instanceof dqz) {
               $$3.a(avy.ac);
            } else {
               $$3.a(avy.ae);
            }
         }

         return bqq.c;
      }
   }

   protected void a(aqt $$0, dta $$1, jd $$2) {
      dqy $$3 = $$0.a($$2, dqh.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ku $$4 = new ku($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dxw.a, $$2, dxw.a.a($$3.n()));
         } else {
            cuo $$6 = $$3.a($$5);
            kx $$7 = this.a($$0, $$6);
            if ($$7 != kx.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kx a(dcu $$0, cuo $$1) {
      return (kx)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
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
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqy($$0, $$1);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      bqm.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jw a(ku $$0) {
      return a($$0, 0.7, eww.b);
   }

   public static jw a(ku $$0, double $$1, eww $$2) {
      ji $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }
}
