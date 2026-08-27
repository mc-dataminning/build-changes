import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cye extends cvl {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cye> a = b(cye::new);
   public static final djj b = cyc.a;
   public static final djg c = djf.A;
   private static final Map<cmc, jh> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jg()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cye> a() {
      return a;
   }

   public static void a(csx $$0, jh $$1) {
      e.put($$0.k(), $$1);
   }

   protected cye(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         dgd $$6 = $$1.c_($$2);
         if ($$6 instanceof dgv) {
            $$3.a((dgv)$$6);
            if ($$6 instanceof dgw) {
               $$3.a(arm.ac);
            } else {
               $$3.a(arm.ae);
            }
         }

         return bjl.b;
      }
   }

   protected void a(amp $$0, dip $$1, hv $$2) {
      dgv $$3 = $$0.a($$2, dgf.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         je $$4 = new je($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dmz.a, $$2, dmz.a.a($$3.r()));
         } else {
            cmh $$6 = $$3.a($$5);
            jh $$7 = this.a($$6);
            if ($$7 != jh.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jh a(cmh $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
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
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgv($$0, $$1);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgv) {
            ((dgv)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      bjh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ip a(je $$0) {
      ia $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.a($$1.c_($$2));
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }
}
