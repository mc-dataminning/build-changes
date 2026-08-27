import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cyv extends cwc {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cyv> a = b(cyv::new);
   public static final dkb b = cyt.a;
   public static final djy c = djx.A;
   private static final Map<cmt, jj> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ji()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cyv> a() {
      return a;
   }

   public static void a(cto $$0, jj $$1) {
      e.put($$0.k(), $$1);
   }

   protected cyv(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         dgv $$6 = $$1.c_($$2);
         if ($$6 instanceof dhn) {
            $$3.a((dhn)$$6);
            if ($$6 instanceof dho) {
               $$3.a(asc.ac);
            } else {
               $$3.a(asc.ae);
            }
         }

         return bkb.b;
      }
   }

   protected void a(and $$0, djh $$1, hx $$2) {
      dhn $$3 = $$0.a($$2, dgx.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jg $$4 = new jg($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dnr.a, $$2, dnr.a.a($$3.r()));
         } else {
            cmy $$6 = $$3.a($$5);
            jj $$7 = this.a($$6);
            if ($$7 != jj.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jj a(cmy $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
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
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhn($$0, $$1);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dhn) {
            ((dhn)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      bjx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ir a(jg $$0) {
      ic $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cib.a($$1.c_($$2));
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }
}
