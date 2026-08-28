import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dos extends dly {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dos> a = b(dos::new);
   public static final ebm<jb> b = doq.a;
   public static final ebf c = ebe.G;
   private static final lg f = new lg();
   public static final Map<czg, lh> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dos> a() {
      return a;
   }

   public static void a(djg $$0, lh $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(djg $$0) {
      d.put($$0.h(), new ll($$0.h()));
   }

   protected dos(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyh $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dyi ? awx.ac : awx.ae);
      }

      return bug.a;
   }

   protected void a(arq $$0, eao $$1, iv $$2) {
      dyh $$3 = $$0.a($$2, dxo.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         le $$4 = new le($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(efo.a, $$2, efo.a.a($$3.m()));
         } else {
            czk $$6 = $$3.a($$5);
            lh $$7 = this.a($$0, $$6);
            if ($$7 != lh.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lh a(djh $$0, czk $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lh $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lh a(czk $$0) {
      return (lh)($$0.c(kk.D) ? li.c : f);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
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
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyh($$0, $$1);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   public static jp a(le $$0) {
      return a($$0, 0.7, fex.c);
   }

   public static jp a(le $$0, double $$1, fex $$2) {
      jb $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.a($$1.c_($$2));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }
}
