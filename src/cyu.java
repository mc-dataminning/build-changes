import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cyu extends cwb {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cyu> a = b(cyu::new);
   public static final dka b = cys.a;
   public static final djx c = djw.A;
   private static final Map<cms, jj> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ji()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cyu> a() {
      return a;
   }

   public static void a(ctn $$0, jj $$1) {
      e.put($$0.k(), $$1);
   }

   protected cyu(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         dgu $$6 = $$1.c_($$2);
         if ($$6 instanceof dhm) {
            $$3.a((dhm)$$6);
            if ($$6 instanceof dhn) {
               $$3.a(asb.ac);
            } else {
               $$3.a(asb.ae);
            }
         }

         return bka.b;
      }
   }

   protected void a(and $$0, djg $$1, hx $$2) {
      dhm $$3 = $$0.a($$2, dgw.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jg $$4 = new jg($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dnq.a, $$2, dnq.a.a($$3.r()));
         } else {
            cmx $$6 = $$3.a($$5);
            jj $$7 = this.a($$6);
            if ($$7 != jj.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jj a(cmx $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
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
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhm($$0, $$1);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dhm) {
            ((dhm)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      bjw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ir a(jg $$0) {
      ic $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.a($$1.c_($$2));
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }
}
