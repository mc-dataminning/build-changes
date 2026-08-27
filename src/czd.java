import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class czd extends cwk {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<czd> a = b(czd::new);
   public static final dkj b = czb.a;
   public static final dkg c = dkf.A;
   private static final Map<cnb, jj> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ji()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends czd> a() {
      return a;
   }

   public static void a(ctw $$0, jj $$1) {
      e.put($$0.j(), $$1);
   }

   protected czd(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dhv) {
            $$3.a((dhv)$$5);
            if ($$5 instanceof dhw) {
               $$3.a(asd.ac);
            } else {
               $$3.a(asd.ae);
            }
         }

         return bkc.b;
      }
   }

   protected void a(ane $$0, djp $$1, hx $$2) {
      dhv $$3 = $$0.a($$2, dhf.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jg $$4 = new jg($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dnz.a, $$2, dnz.a.a($$3.r()));
         } else {
            cng $$6 = $$3.a($$5);
            jj $$7 = this.a($$6);
            if ($$7 != jj.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jj a(cng $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
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
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhv($$0, $$1);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dhv) {
            ((dhv)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      bjy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ir a(jg $$0) {
      ic $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.a($$1.c_($$2));
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }
}
