import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dox extends dmd {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dox> a = b(dox::new);
   public static final ebr<jb> b = dov.a;
   public static final ebk c = ebj.G;
   private static final lg f = new lg();
   public static final Map<czj, lh> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dox> a() {
      return a;
   }

   public static void a(djl $$0, lh $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(djl $$0) {
      d.put($$0.h(), new ll($$0.h()));
   }

   protected dox(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dym $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dyn ? awx.ac : awx.ae);
      }

      return bug.a;
   }

   protected void a(arq $$0, eat $$1, iv $$2) {
      dym $$3 = $$0.a($$2, dxt.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         le $$4 = new le($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(eft.a, $$2, eft.a.a($$3.m()));
         } else {
            czn $$6 = $$3.a($$5);
            lh $$7 = this.a($$0, $$6);
            if ($$7 != lh.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lh a(djm $$0, czn $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lh $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lh a(czn $$0) {
      return (lh)($$0.c(kk.D) ? li.c : f);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
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
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dym($$0, $$1);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   public static jp a(le $$0) {
      return a($$0, 0.7, ffc.c);
   }

   public static jp a(le $$0, double $$1, ffc $$2) {
      jb $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.a($$1.c_($$2));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }
}
