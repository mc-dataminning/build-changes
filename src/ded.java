import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class ded extends dbk {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<ded> a = b(ded::new);
   public static final dpt b = deb.a;
   public static final dpq c = dpp.A;
   private static final Map<cre, jx> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jw()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends ded> a() {
      return a;
   }

   public static void a(cyw $$0, jx $$1) {
      e.put($$0.p(), $$1);
   }

   protected ded(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dmx) {
            $$3.a((dmx)$$5);
            if ($$5 instanceof dmy) {
               $$3.a(auw.ac);
            } else {
               $$3.a(auw.ae);
            }
         }

         return boa.b;
      }
   }

   protected void a(aps $$0, doz $$1, ib $$2) {
      dmx $$3 = $$0.a($$2, dmh.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ju $$4 = new ju($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dts.a, $$2, dts.a.a($$3.n()));
         } else {
            crj $$6 = $$3.a($$5);
            jx $$7 = this.a($$6);
            if ($$7 != jx.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jx a(crj $$0) {
      return e.get($$0.f());
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
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
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmx($$0, $$1);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      bnw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static iv a(ju $$0) {
      ih $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.a($$1.c_($$2));
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }
}
