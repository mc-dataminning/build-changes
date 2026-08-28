import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhd extends dek {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhd> a = b(dhd::new);
   public static final dsv b = dhb.a;
   public static final dss c = dsr.A;
   private static final ks f = new ks();
   public static final Map<cuj, kt> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dhd> a() {
      return a;
   }

   public static void a(dbw $$0, kt $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dbw $$0) {
      d.put($$0.r(), new kv($$0.r()));
   }

   protected dhd(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof dpy) {
            $$3.a((dpy)$$5);
            if ($$5 instanceof dpz) {
               $$3.a(awj.ac);
            } else {
               $$3.a(awj.ae);
            }
         }

         return bqt.c;
      }
   }

   protected void a(are $$0, dsb $$1, iz $$2) {
      dpy $$3 = $$0.a($$2, dpi.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dwu.a, $$2, dwu.a.a($$3.n()));
         } else {
            cuo $$6 = $$3.a($$5);
            kt $$7 = this.a($$0, $$6);
            if ($$7 != kt.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kt a(dbx $$0, cuo $$1) {
      return (kt)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
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
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpy($$0, $$1);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      bqp.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static js a(kq $$0) {
      return a($$0, 0.7, evq.b);
   }

   public static js a(kq $$0, double $$1, evq $$2) {
      je $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.a($$1.c_($$2));
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }
}
