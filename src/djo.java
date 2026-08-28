import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djo extends dgv {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<djo> a = b(djo::new);
   public static final dvi b = djm.a;
   public static final dvf c = dve.A;
   private static final kx f = new kx();
   public static final Map<cvk, ky> d = ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends djo> a() {
      return a;
   }

   public static void a(def $$0, ky $$1) {
      d.put($$0.q(), $$1);
   }

   public static void a(def $$0) {
      d.put($$0.q(), new la($$0.q()));
   }

   protected djo(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dsl $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dsm ? awo.ac : awo.ae);
      }

      return brp.a;
   }

   protected void a(arh $$0, duo $$1, je $$2) {
      dsl $$3 = $$0.a($$2, dru.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kv $$4 = new kv($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dzl.a, $$2, dzl.a.a($$3.m()));
         } else {
            cvp $$6 = $$3.a($$5);
            ky $$7 = this.a($$0, $$6);
            if ($$7 != ky.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ky a(deg $$0, cvp $$1) {
      return (ky)(!$$1.a($$0.J()) ? f : d.get($$1.h()));
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.d());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsl($$0, $$1);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.d().g());
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      brl.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jx a(kv $$0) {
      return a($$0, 0.7, eys.c);
   }

   public static jx a(kv $$0, double $$1, eys $$2) {
      jj $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.a($$1.c_($$2));
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }
}
