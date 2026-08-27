import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dat extends cya {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dat> a = b(dat::new);
   public static final dlz b = dar.a;
   public static final dlw c = dlv.A;
   private static final Map<cou, jl> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jk()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dat> a() {
      return a;
   }

   public static void a(cvm $$0, jl $$1) {
      e.put($$0.j(), $$1);
   }

   protected dat(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof djl) {
            $$3.a((djl)$$5);
            if ($$5 instanceof djm) {
               $$3.a(atu.ac);
            } else {
               $$3.a(atu.ae);
            }
         }

         return blu.b;
      }
   }

   protected void a(aov $$0, dlf $$1, hz $$2) {
      djl $$3 = $$0.a($$2, div.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ji $$4 = new ji($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dpp.a, $$2, dpp.a.a($$3.r()));
         } else {
            coz $$6 = $$3.a($$5);
            jl $$7 = this.a($$6);
            if ($$7 != jl.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jl a(coz $$0) {
      return e.get($$0.d());
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
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
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djl($$0, $$1);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof djl) {
            ((djl)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      blq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static it a(ji $$0) {
      ie $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return ckb.a($$1.c_($$2));
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }
}
