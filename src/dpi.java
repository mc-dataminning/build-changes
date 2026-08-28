import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpi extends dmo {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dpi> a = b(dpi::new);
   public static final ecc<jb> b = dpg.a;
   public static final ebv c = ebu.G;
   private static final lg f = new lg();
   public static final Map<czu, lh> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dpi> a() {
      return a;
   }

   public static void a(djw $$0, lh $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(djw $$0) {
      d.put($$0.h(), new ll($$0.h()));
   }

   protected dpi(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyx $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dyy ? awz.ac : awz.ae);
      }

      return bur.a;
   }

   protected void a(ars $$0, ebe $$1, iv $$2) {
      dyx $$3 = $$0.a($$2, dye.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         le $$4 = new le($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ege.a, $$2, ege.a.a($$3.m()));
         } else {
            czy $$6 = $$3.a($$5);
            lh $$7 = this.a($$0, $$6);
            if ($$7 != lh.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lh a(djx $$0, czy $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lh $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lh a(czy $$0) {
      return (lh)($$0.c(kk.D) ? li.c : f);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.d());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyx($$0, $$1);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   public static jp a(le $$0) {
      return a($$0, 0.7, ffq.c);
   }

   public static jp a(le $$0, double $$1, ffq $$2) {
      jb $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.a($$1.c_($$2));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }
}
