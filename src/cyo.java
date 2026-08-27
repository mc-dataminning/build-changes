import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cyo extends cvv {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cyo> a = b(cyo::new);
   public static final dju b = cym.a;
   public static final djr c = djq.A;
   private static final Map<cmm, jj> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ji()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cyo> a() {
      return a;
   }

   public static void a(cth $$0, jj $$1) {
      e.put($$0.k(), $$1);
   }

   protected cyo(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         dgo $$6 = $$1.c_($$2);
         if ($$6 instanceof dhg) {
            $$3.a((dhg)$$6);
            if ($$6 instanceof dhh) {
               $$3.a(arw.ac);
            } else {
               $$3.a(arw.ae);
            }
         }

         return bjv.b;
      }
   }

   protected void a(amz $$0, dja $$1, hx $$2) {
      dhg $$3 = $$0.a($$2, dgq.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jg $$4 = new jg($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dnk.a, $$2, dnk.a.a($$3.r()));
         } else {
            cmr $$6 = $$3.a($$5);
            jj $$7 = this.a($$6);
            if ($$7 != jj.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jj a(cmr $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
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
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhg($$0, $$1);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dhg) {
            ((dhg)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      bjr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ir a(jg $$0) {
      ic $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return chu.a($$1.c_($$2));
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }
}
