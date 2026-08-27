import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dgd extends ddk {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dgd> a = b(dgd::new);
   public static final drv b = dgb.a;
   public static final drs c = drr.A;
   public static final Map<ctj, ki> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new kh()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dgd> a() {
      return a;
   }

   public static void a(daw $$0, ki $$1) {
      d.put($$0.q(), $$1);
   }

   public static void a(daw $$0) {
      d.put($$0.q(), new kk($$0.q()));
   }

   protected dgd(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof doy) {
            $$3.a((doy)$$5);
            if ($$5 instanceof doz) {
               $$3.a(avr.ac);
            } else {
               $$3.a(avr.ae);
            }
         }

         return bpu.b;
      }
   }

   protected void a(aqm $$0, drb $$1, io $$2) {
      doy $$3 = $$0.a($$2, doi.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kf $$4 = new kf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dvu.a, $$2, dvu.a.a($$3.n()));
         } else {
            cto $$6 = $$3.a($$5);
            ki $$7 = this.a($$6);
            if ($$7 != ki.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ki a(cto $$0) {
      return d.get($$0.g());
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
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
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new doy($$0, $$1);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      bpq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jh a(kf $$0) {
      return a($$0, 0.7, euk.b);
   }

   public static jh a(kf $$0, double $$1, euk $$2) {
      it $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return cot.a($$1.c_($$2));
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }
}
