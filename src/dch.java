import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dch extends czo {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dch> a = b(dch::new);
   public static final dnv b = dcf.a;
   public static final dns c = dnr.A;
   private static final Map<cqh, jo> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jn()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dch> a() {
      return a;
   }

   public static void a(cxa $$0, jo $$1) {
      e.put($$0.l(), $$1);
   }

   protected dch(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dla) {
            $$3.a((dla)$$5);
            if ($$5 instanceof dlb) {
               $$3.a(aui.ac);
            } else {
               $$3.a(aui.ae);
            }
         }

         return bnd.b;
      }
   }

   protected void a(apf $$0, dnb $$1, ib $$2) {
      dla $$3 = $$0.a($$2, dkk.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jl $$4 = new jl($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(drp.a, $$2, drp.a.a($$3.n()));
         } else {
            cqm $$6 = $$3.a($$5);
            jo $$7 = this.a($$6);
            if ($$7 != jo.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jo a(cqm $$0) {
      return e.get($$0.d());
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
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
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dla($$0, $$1);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dla) {
            ((dla)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      bmz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static iv a(jl $$0) {
      ih $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.a($$1.c_($$2));
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }
}
