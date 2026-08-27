import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cwx extends cuf {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cwx> a = b(cwx::new);
   public static final dhq b = cwv.a;
   public static final dhn c = dhm.A;
   private static final Map<ckw, je> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jd()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cwx> a() {
      return a;
   }

   public static void a(crr $$0, je $$1) {
      e.put($$0.k(), $$1);
   }

   protected cwx(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         der $$6 = $$1.c_($$2);
         if ($$6 instanceof dfj) {
            $$3.a((dfj)$$6);
            if ($$6 instanceof dfk) {
               $$3.a(aqx.ac);
            } else {
               $$3.a(aqx.ae);
            }
         }

         return biq.b;
      }
   }

   protected void a(ama $$0, dgw $$1, ht $$2) {
      dfj $$3 = $$0.a($$2, det.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jb $$4 = new jb($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dlg.a, $$2, dlg.a.a($$3.q()));
         } else {
            clb $$6 = $$3.a($$5);
            je $$7 = this.a($$6);
            if ($$7 != je.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected je a(clb $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
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
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfj($$0, $$1);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dfj) {
            ((dfj)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      bim.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static im a(jb $$0) {
      hx $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.a($$1.c_($$2));
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }
}
