import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddk extends dde implements ddl {
   public static final MapCodec<ddk> a = b(ddk::new);
   public static final dqy b = dqx.e;
   private static final int c = 5;

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public ddk(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      dqh $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            aqh $$5 = (aqh)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(kx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(kx.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected ema b_(dqh $$0) {
      return emb.c.a(false);
   }

   public static void b(dae $$0, in $$1, dqh $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dae $$0, in $$1, dqh $$2, dqh $$3) {
      if (m($$2)) {
         dqh $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         in.a $$5 = $$1.j().c(is.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(is.b);
         }
      }
   }

   private static boolean m(dqh $$0) {
      return $$0.a(ddg.nd) || $$0.a(ddg.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dqh n(dqh $$0) {
      if ($$0.a(ddg.nd)) {
         return $$0;
      } else if ($$0.a(ddg.dW)) {
         return ddg.nd.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(ddg.kJ) ? ddg.nd.n().a(b, Boolean.valueOf(true)) : ddg.G.n();
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(kx.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avc.da, avd.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(kx.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(kx.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avc.cY, avd.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      $$3.a($$4, emb.c, emb.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == is.a || $$1 == is.b && !$$2.a(ddg.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.d());
      return $$3.a(ddg.nd) || $$3.a(ddg.kJ) || $$3.a(ddg.dW);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.a();
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.a;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   public csz a(@Nullable clh $$0, dae $$1, in $$2, dqh $$3) {
      $$1.a($$2, ddg.a.n(), 11);
      return new csz(ctc.qz);
   }

   @Override
   public Optional<avb> as_() {
      return emb.c.j();
   }
}
