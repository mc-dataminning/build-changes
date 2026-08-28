import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class did extends dfk {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<did> a = b(did::new);
   public static final dtw b = dib.a;
   public static final dtt c = dts.A;
   private static final kw f = new kw();
   public static final Map<cul, kx> d = ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends did> a() {
      return a;
   }

   public static void a(dcv $$0, kx $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dcv $$0) {
      d.put($$0.r(), new kz($$0.r()));
   }

   protected did(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof dra) {
            $$3.a((dra)$$5);
            if ($$5 instanceof drb) {
               $$3.a(avz.ac);
            } else {
               $$3.a(avz.ae);
            }
         }

         return bqr.c;
      }
   }

   protected void a(aqu $$0, dtc $$1, jd $$2) {
      dra $$3 = $$0.a($$2, dqj.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ku $$4 = new ku($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dxz.a, $$2, dxz.a.a($$3.n()));
         } else {
            cuq $$6 = $$3.a($$5);
            kx $$7 = this.a($$0, $$6);
            if ($$7 != kx.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kx a(dcw $$0, cuq $$1) {
      return (kx)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.d());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dra($$0, $$1);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      bqn.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jw a(ku $$0) {
      return a($$0, 0.7, exc.b);
   }

   public static jw a(ku $$0, double $$1, exc $$2) {
      ji $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }
}
