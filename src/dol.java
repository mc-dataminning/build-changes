import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dol extends dlr {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dol> a = b(dol::new);
   public static final ebf<ja> b = doj.a;
   public static final eay c = eax.G;
   private static final lf f = new lf();
   public static final Map<cyz, lg> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dol> a() {
      return a;
   }

   public static void a(diz $$0, lg $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(diz $$0) {
      d.put($$0.h(), new lk($$0.h()));
   }

   protected dol(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dya $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dyb ? awx.ac : awx.ae);
      }

      return bud.a;
   }

   protected void a(arq $$0, eah $$1, iu $$2) {
      dya $$3 = $$0.a($$2, dxh.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ld $$4 = new ld($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(efh.a, $$2, efh.a.a($$3.m()));
         } else {
            czd $$6 = $$3.a($$5);
            lg $$7 = this.a($$0, $$6);
            if ($$7 != lg.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lg a(dja $$0, czd $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lg $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lg a(czd $$0) {
      return (lg)($$0.c(kj.D) ? lh.c : f);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.d());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dya($$0, $$1);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   public static jo a(ld $$0) {
      return a($$0, 0.7, feq.c);
   }

   public static jo a(ld $$0, double $$1, feq $$2) {
      ja $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.a($$1.c_($$2));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }
}
