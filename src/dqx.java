import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqx extends dkm {
   public static final MapCodec<dqx> a = b(dqx::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dyu d = dyl.ba;
   private static final ImmutableList<kl> e = ImmutableList.of(
      new kl(0, 0, -1), new kl(-1, 0, 0), new kl(0, 0, 1), new kl(1, 0, 0), new kl(-1, 0, -1), new kl(1, 0, -1), new kl(-1, 0, 1), new kl(1, 0, 1)
   );
   private static final ImmutableList<kl> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kl::p).iterator())
      .addAll(e.stream().map(kl::q).iterator())
      .add(new kl(0, 1, 0))
      .build();

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return btj.a;
      } else {
         return (btj)($$5 == bti.a && a($$4.b(bti.b)) && o($$1) ? btj.e : btj.f);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$0.c(d) == 0) {
         return btj.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return btj.a;
      } else {
         if (!$$1.C) {
            asi $$5 = (asi)$$3;
            if ($$5.V() != $$1.ah() || !$$2.equals($$5.T())) {
               $$5.a($$1.ah(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.vT, axg.e, 1.0F, 1.0F);
               return btj.b;
            }
         }

         return btj.c;
      }
   }

   private static boolean a(cxp $$0) {
      return $$0.a(cxt.fH);
   }

   private static boolean o(dxv $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jh $$0, dhi $$1) {
      etx $$2 = $$1.b_($$0);
      if (!$$2.a(aya.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            etx $$4 = $$1.b_($$0.e());
            return !$$4.a(aya.a);
         }
      }
   }

   private void e(dxv $$0, dhi $$1, final jh $$2) {
      $$1.a($$2, false);
      boolean $$3 = jm.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(aya.a);
      dhb $$5 = new dhb() {
         @Override
         public Optional<Float> a(dha $$0, dgn $$1, jh $$2x, dxv $$3, etx $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dko.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fby $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dhi.a.b);
   }

   public static boolean a(dhi $$0) {
      return $$0.G_().m();
   }

   public static void a(@Nullable bvk $$0, dhi $$1, jh $$2, dxv $$3) {
      dxv $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(ecr.c, $$2, ecr.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.vR, axg.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, axf.vQ, axg.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ls.aI, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   public static int a(dxv $$0, int $$1) {
      return bae.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return a($$0, 15);
   }

   public static Optional<fby> a(bvr<?> $$0, dgr $$1, jh $$2) {
      Optional<fby> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fby> a(bvr<?> $$0, dgr $$1, jh $$2, boolean $$3) {
      jh.a $$4 = new jh.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kl $$5 = (kl)var5.next();
         $$4.g($$2).h($$5);
         fby $$6 = csc.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
