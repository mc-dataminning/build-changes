import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doa extends dlg {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<doa> a = b(doa::new);
   public static final eam<ja> b = dny.a;
   public static final eaf c = eae.G;
   private static final lf f = new lf();
   public static final Map<cyo, lg> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends doa> a() {
      return a;
   }

   public static void a(dio $$0, lg $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(dio $$0) {
      d.put($$0.h(), new lk($$0.h()));
   }

   protected doa(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxi $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dxj ? awv.ac : awv.ae);
      }

      return bty.a;
   }

   protected void a(aro $$0, dzo $$1, iu $$2) {
      dxi $$3 = $$0.a($$2, dwp.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ld $$4 = new ld($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(eeo.a, $$2, eeo.a.a($$3.m()));
         } else {
            cys $$6 = $$3.a($$5);
            lg $$7 = this.a($$0, $$6);
            if ($$7 != lg.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lg a(dip $$0, cys $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lg $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lg a(cys $$0) {
      return (lg)($$0.c(kj.D) ? lh.c : f);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
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
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxi($$0, $$1);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   public static jo a(ld $$0) {
      return a($$0, 0.7, fdw.c);
   }

   public static jo a(ld $$0, double $$1, fdw $$2) {
      ja $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.a($$1.c_($$2));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }
}
