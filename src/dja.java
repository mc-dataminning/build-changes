import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dja extends dgh {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dja> a = b(dja::new);
   public static final duu b = diy.a;
   public static final dur c = duq.A;
   private static final kx f = new kx();
   public static final Map<cvg, ky> d = ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends dja> a() {
      return a;
   }

   public static void a(ddr $$0, ky $$1) {
      d.put($$0.r(), $$1);
   }

   public static void a(ddr $$0) {
      d.put($$0.r(), new la($$0.r()));
   }

   protected dja(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof drx $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dry ? awn.ac : awn.ae);
      }

      return brk.a;
   }

   protected void a(arg $$0, dua $$1, je $$2) {
      drx $$3 = $$0.a($$2, drg.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kv $$4 = new kv($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dyx.a, $$2, dyx.a.a($$3.m()));
         } else {
            cvl $$6 = $$3.a($$5);
            ky $$7 = this.a($$0, $$6);
            if ($$7 != ky.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ky a(dds $$0, cvl $$1) {
      return (ky)(!$$1.a($$0.J()) ? f : d.get($$1.h()));
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
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
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drx($$0, $$1);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.d().g());
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      brg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jx a(kv $$0) {
      return a($$0, 0.7, eye.c);
   }

   public static jx a(kv $$0, double $$1, eye $$2) {
      jj $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.a($$1.c_($$2));
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }
}
