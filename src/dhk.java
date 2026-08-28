import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dhk extends der {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhk> a = b(dhk::new);
   public static final dtb b = dhi.a;
   public static final dsy c = dsx.A;
   private static final kt f = new kt();
   public static final Map<ctv, ku> d = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dhk> a() {
      return a;
   }

   public static void a(dcc $$0, ku $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(dcc $$0) {
      d.put($$0.r(), new kw($$0.r()));
   }

   protected dhk(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dqf) {
            $$3.a((dqf)$$5);
            if ($$5 instanceof dqg) {
               $$3.a(avp.ac);
            } else {
               $$3.a(avp.ae);
            }
         }

         return bqd.c;
      }
   }

   protected void a(aqk $$0, dsh $$1, ja $$2) {
      dqf $$3 = $$0.a($$2, dpp.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kr $$4 = new kr($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dxa.a, $$2, dxa.a.a($$3.n()));
         } else {
            cua $$6 = $$3.a($$5);
            ku $$7 = this.a($$0, $$6);
            if ($$7 != ku.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ku a(dcd $$0, cua $$1) {
      return (ku)(!$$1.a($$0.J()) ? f : d.get($$1.g()));
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
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
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqf($$0, $$1);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      bpz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jt a(kr $$0) {
      return a($$0, 0.7, evz.b);
   }

   public static jt a(kr $$0, double $$1, evz $$2) {
      jf $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.a($$1.c_($$2));
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }
}
