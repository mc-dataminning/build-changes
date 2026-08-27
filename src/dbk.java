import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dbk extends cyr {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dbk> a = b(dbk::new);
   public static final dmy b = dbi.a;
   public static final dmv c = dmu.A;
   private static final Map<cpl, jn> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jm()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dbk> a() {
      return a;
   }

   public static void a(cwd $$0, jn $$1) {
      e.put($$0.l(), $$1);
   }

   protected dbk(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof dkd) {
            $$3.a((dkd)$$5);
            if ($$5 instanceof dke) {
               $$3.a(atz.ac);
            } else {
               $$3.a(atz.ae);
            }
         }

         return bml.b;
      }
   }

   protected void a(apa $$0, dme $$1, ib $$2) {
      dkd $$3 = $$0.a($$2, djn.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jk $$4 = new jk($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dqr.a, $$2, dqr.a.a($$3.n()));
         } else {
            cpq $$6 = $$3.a($$5);
            jn $$7 = this.a($$6);
            if ($$7 != jn.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jn a(cpq $$0) {
      return e.get($$0.d());
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
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
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkd($$0, $$1);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof dkd) {
            ((dkd)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      bmh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static iv a(jk $$0) {
      ih $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return cku.a($$1.c_($$2));
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }
}
