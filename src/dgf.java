import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dgf extends ddm {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dgf> a = b(dgf::new);
   public static final drx b = dgd.a;
   public static final dru c = drt.A;
   public static final Map<ctl, ki> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new kh()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dgf> a() {
      return a;
   }

   public static void a(day $$0, ki $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(day $$0) {
      d.put($$0.r(), new kk($$0.r()));
   }

   protected dgf(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dpa) {
            $$3.a((dpa)$$5);
            if ($$5 instanceof dpb) {
               $$3.a(avs.ac);
            } else {
               $$3.a(avs.ae);
            }
         }

         return bpw.b;
      }
   }

   protected void a(aqn $$0, drd $$1, io $$2) {
      dpa $$3 = $$0.a($$2, dok.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kf $$4 = new kf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dvw.a, $$2, dvw.a.a($$3.n()));
         } else {
            ctq $$6 = $$3.a($$5);
            ki $$7 = this.a($$6);
            if ($$7 != ki.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ki a(ctq $$0) {
      return d.get($$0.g());
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
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
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpa($$0, $$1);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      bps.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jh a(kf $$0) {
      return a($$0, 0.7, eum.b);
   }

   public static jh a(kf $$0, double $$1, eum $$2) {
      it $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.a($$1.c_($$2));
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }
}
