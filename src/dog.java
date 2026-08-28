import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dog extends dlm {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dog> a = b(dog::new);
   public static final eax<ja> b = doe.a;
   public static final eaq c = eap.G;
   private static final lf f = new lf();
   public static final Map<cyu, lg> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dog> a() {
      return a;
   }

   public static void a(diu $$0, lg $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(diu $$0) {
      d.put($$0.h(), new lk($$0.h()));
   }

   protected dog(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxs $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dxt ? awx.ac : awx.ae);
      }

      return bub.a;
   }

   protected void a(arq $$0, dzz $$1, iu $$2) {
      dxs $$3 = $$0.a($$2, dwz.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         ld $$4 = new ld($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(eez.a, $$2, eez.a.a($$3.m()));
         } else {
            cyy $$6 = $$3.a($$5);
            lg $$7 = this.a($$0, $$6);
            if ($$7 != lg.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected lg a(div $$0, cyy $$1) {
      if (!$$1.a($$0.K())) {
         return f;
      } else {
         lg $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static lg a(cyy $$0) {
      return (lg)($$0.c(kj.D) ? lh.c : f);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
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
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxs($$0, $$1);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   public static jo a(ld $$0) {
      return a($$0, 0.7, fei.c);
   }

   public static jo a(ld $$0, double $$1, fei $$2) {
      ja $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.a($$1.c_($$2));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }
}
