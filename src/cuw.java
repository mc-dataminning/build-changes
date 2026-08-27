import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cuw extends csi {
   private static final Logger c = LogUtils.getLogger();
   public static final dgd a = cuu.a;
   public static final dga b = dfz.A;
   private static final Map<cja, ih> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ig()));
   private static final int e = 4;

   public static void a(cpu $$0, ih $$1) {
      d.put($$0.k(), $$1);
   }

   protected cuw(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         dcv $$6 = $$1.c_($$2);
         if ($$6 instanceof ddm) {
            $$3.a((ddm)$$6);
            if ($$6 instanceof ddn) {
               $$3.a(apn.ac);
            } else {
               $$3.a(apn.ae);
            }
         }

         return bgy.b;
      }
   }

   protected void a(akq $$0, dfj $$1, gw $$2) {
      ddm $$3 = $$0.a($$2, dcx.f).orElse(null);
      if ($$3 == null) {
         c.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         id $$4 = new id($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(djt.a, $$2, djt.a.a($$3.q()));
         } else {
            cjf $$6 = $$3.a($$5);
            ih $$7 = this.a($$6);
            if ($$7 != ih.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ih a(cjf $$0) {
      return d.get($$0.d());
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.c());
      boolean $$7 = $$0.c(b);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddm($$0, $$1);
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.d().g());
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof ddm) {
            ((ddm)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof ddm) {
            bgu.a($$1, $$2, (ddm)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public static ho a(id $$0) {
      ha $$1 = $$0.d().c(a);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return cel.a($$1.c_($$2));
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }
}
