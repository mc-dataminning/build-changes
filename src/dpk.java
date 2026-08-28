import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpk extends dmq {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final ece<jc> b = dpi.a;
   public static final ebx c = ebw.G;
   private static final lh f = new lh();
   public static final Map<czw, li> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dpk> a() {
      return a;
   }

   public static void a(djy $$0, li $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(djy $$0) {
      d.put($$0.h(), new lm($$0.h()));
   }

   protected dpk(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyz $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dza ? axb.ac : axb.ae);
      }

      return but.a;
   }

   protected void a(aru $$0, ebg $$1, iw $$2) {
      dyz $$3 = $$0.a($$2, dyg.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         lf $$4 = new lf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(egg.a, $$2, egg.a.a($$3.m()));
         } else {
            daa $$6 = $$3.a($$5);
            li $$7 = this.a($$0, $$6);
            if ($$7 != li.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected li a(djz $$0, daa $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         li $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static li a(daa $$0) {
      return (li)($$0.c(kl.D) ? lj.c : f);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
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
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyz($$0, $$1);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   public static jq a(lf $$0) {
      return a($$0, 0.7, ffs.c);
   }

   public static jq a(lf $$0, double $$1, ffs $$2) {
      jc $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.a($$1.c_($$2));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }
}
