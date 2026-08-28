import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlt extends diz {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dxv<jn> b = dlr.a;
   public static final dxp c = dxo.H;
   private static final lb f = new lb();
   public static final Map<cwm, lc> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dlt> a() {
      return a;
   }

   public static void a(dgi $$0, lc $$1) {
      d.put($$0.j(), $$1);
   }

   public static void a(dgi $$0) {
      d.put($$0.j(), new lg($$0.j()));
   }

   protected dlt(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duu $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof duv ? awk.ac : awk.ae);
      }

      return bsl.a;
   }

   protected void a(ard $$0, dwy $$1, ji $$2) {
      duu $$3 = $$0.a($$2, duc.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kz $$4 = new kz($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ebu.a, $$2, ebu.a.a($$3.m()));
         } else {
            cwq $$6 = $$3.a($$5);
            lc $$7 = this.a($$0, $$6);
            if ($$7 != lc.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lc a(dgj $$0, cwq $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lc $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lc a(cwq $$0) {
      return (lc)($$0.b(kv.D) ? ld.c : f);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
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
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new duu($$0, $$1);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      bsh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static kb a(kz $$0) {
      return a($$0, 0.7, fbb.c);
   }

   public static kb a(kz $$0, double $$1, fbb $$2) {
      jn $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.a($$1.c_($$2));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }
}
