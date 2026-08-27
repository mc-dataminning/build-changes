import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dfa extends dch {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dfa> a = b(dfa::new);
   public static final dqs b = dey.a;
   public static final dqp c = dqo.A;
   private static final Map<cry, kh> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new kg()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dfa> a() {
      return a;
   }

   public static void a(czt $$0, kh $$1) {
      e.put($$0.p(), $$1);
   }

   protected dfa(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dnv) {
            $$3.a((dnv)$$5);
            if ($$5 instanceof dnw) {
               $$3.a(avj.ac);
            } else {
               $$3.a(avj.ae);
            }
         }

         return boq.b;
      }
   }

   protected void a(aqe $$0, dpy $$1, im $$2) {
      dnv $$3 = $$0.a($$2, dnf.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ke $$4 = new ke($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dur.a, $$2, dur.a.a($$3.n()));
         } else {
            csd $$6 = $$3.a($$5);
            kh $$7 = this.a($$6);
            if ($$7 != kh.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kh a(csd $$0) {
      return e.get($$0.f());
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
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
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnv($$0, $$1);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      bom.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jf a(ke $$0) {
      ir $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.a($$1.c_($$2));
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }
}
