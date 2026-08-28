import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmk extends djq {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dyo<jn> b = dmi.a;
   public static final dyh c = dyg.G;
   private static final lb f = new lb();
   public static final Map<cxd, lc> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dmk> a() {
      return a;
   }

   public static void a(dgy $$0, lc $$1) {
      d.put($$0.i(), $$1);
   }

   public static void a(dgy $$0) {
      d.put($$0.i(), new lg($$0.i()));
   }

   protected dmk(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvm $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dvn ? awk.ac : awk.ae);
      }

      return bsy.a;
   }

   protected void a(ard $$0, dxq $$1, ji $$2) {
      dvm $$3 = $$0.a($$2, duu.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kz $$4 = new kz($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ecp.a, $$2, ecp.a.a($$3.m()));
         } else {
            cxh $$6 = $$3.a($$5);
            lc $$7 = this.a($$0, $$6);
            if ($$7 != lc.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lc a(dgz $$0, cxh $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lc $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lc a(cxh $$0) {
      return (lc)($$0.b(kv.E) ? ld.c : f);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
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
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvm($$0, $$1);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   public static kb a(kz $$0) {
      return a($$0, 0.7, fbx.c);
   }

   public static kb a(kz $$0, double $$1, fbx $$2) {
      jn $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.a($$1.c_($$2));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }
}
