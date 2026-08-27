import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cxf extends cum {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cxf> a = b(cxf::new);
   public static final dic b = cxd.a;
   public static final dhz c = dhy.A;
   private static final Map<cle, je> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jd()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cxf> a() {
      return a;
   }

   public static void a(crz $$0, je $$1) {
      e.put($$0.k(), $$1);
   }

   protected cxf(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         dfd $$6 = $$1.c_($$2);
         if ($$6 instanceof dfv) {
            $$3.a((dfv)$$6);
            if ($$6 instanceof dfw) {
               $$3.a(arb.ac);
            } else {
               $$3.a(arb.ae);
            }
         }

         return bix.b;
      }
   }

   protected void a(ame $$0, dhi $$1, ht $$2) {
      dfv $$3 = $$0.a($$2, dff.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jb $$4 = new jb($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dls.a, $$2, dls.a.a($$3.q()));
         } else {
            clj $$6 = $$3.a($$5);
            je $$7 = this.a($$6);
            if ($$7 != je.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected je a(clj $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.c());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfv($$0, $$1);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfv) {
            ((dfv)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      bit.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static im a(jb $$0) {
      hx $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.a($$1.c_($$2));
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }
}
