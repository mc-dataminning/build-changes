import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dax extends cye {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dax> a = b(dax::new);
   public static final dmd b = dav.a;
   public static final dma c = dlz.A;
   private static final Map<coy, jl> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jk()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dax> a() {
      return a;
   }

   public static void a(cvq $$0, jl $$1) {
      e.put($$0.j(), $$1);
   }

   protected dax(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof djp) {
            $$3.a((djp)$$5);
            if ($$5 instanceof djq) {
               $$3.a(atv.ac);
            } else {
               $$3.a(atv.ae);
            }
         }

         return blw.b;
      }
   }

   protected void a(aow $$0, dlj $$1, hz $$2) {
      djp $$3 = $$0.a($$2, diz.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ji $$4 = new ji($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dpw.a, $$2, dpw.a.a($$3.r()));
         } else {
            cpd $$6 = $$3.a($$5);
            jl $$7 = this.a($$6);
            if ($$7 != jl.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jl a(cpd $$0) {
      return e.get($$0.d());
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
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
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djp($$0, $$1);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof djp) {
            ((djp)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      bls.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static it a(ji $$0) {
      ie $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.a($$1.c_($$2));
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }
}
