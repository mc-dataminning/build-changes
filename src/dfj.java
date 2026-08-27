import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dfj extends dcq {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dfj> a = b(dfj::new);
   public static final drb b = dfh.a;
   public static final dqy c = dqx.A;
   private static final Map<csu, ki> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new kh()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dfj> a() {
      return a;
   }

   public static void a(dac $$0, ki $$1) {
      e.put($$0.q(), $$1);
   }

   protected dfj(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof doe) {
            $$3.a((doe)$$5);
            if ($$5 instanceof dof) {
               $$3.a(avm.ac);
            } else {
               $$3.a(avm.ae);
            }
         }

         return bpm.b;
      }
   }

   protected void a(aqh $$0, dqh $$1, in $$2) {
      doe $$3 = $$0.a($$2, dno.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kf $$4 = new kf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dva.a, $$2, dva.a.a($$3.n()));
         } else {
            csz $$6 = $$3.a($$5);
            ki $$7 = this.a($$6);
            if ($$7 != ki.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ki a(csz $$0) {
      return e.get($$0.f());
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
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
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doe($$0, $$1);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      bpi.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jg a(kf $$0) {
      is $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.a($$1.c_($$2));
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }
}
