import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cxk extends cur {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cxk> a = b(cxk::new);
   public static final dih b = cxi.a;
   public static final die c = did.A;
   private static final Map<clj, ji> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jh()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cxk> a() {
      return a;
   }

   public static void a(cse $$0, ji $$1) {
      e.put($$0.k(), $$1);
   }

   protected cxk(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         dfi $$6 = $$1.c_($$2);
         if ($$6 instanceof dga) {
            $$3.a((dga)$$6);
            if ($$6 instanceof dgb) {
               $$3.a(arf.ac);
            } else {
               $$3.a(arf.ae);
            }
         }

         return bjb.b;
      }
   }

   protected void a(ami $$0, dhn $$1, hx $$2) {
      dga $$3 = $$0.a($$2, dfk.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jf $$4 = new jf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dlx.a, $$2, dlx.a.a($$3.r()));
         } else {
            clo $$6 = $$3.a($$5);
            ji $$7 = this.a($$6);
            if ($$7 != ji.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ji a(clo $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
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
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dga($$0, $$1);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dga) {
            ((dga)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      bix.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static iq a(jf $$0) {
      ib $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.a($$1.c_($$2));
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }
}
