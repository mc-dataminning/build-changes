import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpu extends dna {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dpu> a = b(dpu::new);
   public static final eco<jc> b = dps.a;
   public static final ech c = ecg.G;
   private static final lh f = new lh();
   public static final Map<dag, li> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dpu> a() {
      return a;
   }

   public static void a(dki $$0, li $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(dki $$0) {
      d.put($$0.h(), new lm($$0.h()));
   }

   protected dpu(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dzj $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dzk ? axi.ac : axi.ae);
      }

      return bvc.a;
   }

   protected void a(asb $$0, ebq $$1, iw $$2) {
      dzj $$3 = $$0.a($$2, dyq.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         lf $$4 = new lf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(egq.a, $$2, egq.a.a($$3.m()));
         } else {
            dak $$6 = $$3.a($$5);
            li $$7 = this.a($$0, $$6);
            if ($$7 != li.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected li a(dkj $$0, dak $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         li $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static li a(dak $$0) {
      return (li)($$0.c(kl.D) ? lj.c : f);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
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
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzj($$0, $$1);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   public static jq a(lf $$0) {
      return a($$0, 0.7, fgc.c);
   }

   public static jq a(lf $$0, double $$1, fgc $$2) {
      jc $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.a($$1.c_($$2));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }
}
