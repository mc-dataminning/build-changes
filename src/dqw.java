import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqw extends dkl {
   public static final MapCodec<dqw> a = b(dqw::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dyt d = dyk.ba;
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
   public MapCodec<dqw> a() {
      return a;
   }

   public dqw(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bti.a;
      } else {
         return (bti)($$5 == bth.a && a($$4.b(bth.b)) && o($$1) ? bti.e : bti.f);
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$0.c(d) == 0) {
         return bti.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bti.a;
      } else {
         if (!$$1.C) {
            asi $$5 = (asi)$$3;
            if ($$5.V() != $$1.ah() || !$$2.equals($$5.T())) {
               $$5.a($$1.ah(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.vT, axg.e, 1.0F, 1.0F);
               return bti.b;
            }
         }

         return bti.c;
      }
   }

   private static boolean a(cxo $$0) {
      return $$0.a(cxs.fH);
   }

   private static boolean o(dxu $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jh $$0, dhh $$1) {
      etw $$2 = $$1.b_($$0);
      if (!$$2.a(aya.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            etw $$4 = $$1.b_($$0.e());
            return !$$4.a(aya.a);
         }
      }
   }

   private void e(dxu $$0, dhh $$1, final jh $$2) {
      $$1.a($$2, false);
      boolean $$3 = jm.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(aya.a);
      dha $$5 = new dha() {
         @Override
         public Optional<Float> a(dgz $$0, dgm $$1, jh $$2x, dxu $$3, etw $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dkn.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fbx $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dhh.a.b);
   }

   public static boolean a(dhh $$0) {
      return $$0.G_().m();
   }

   public static void a(@Nullable bvj $$0, dhh $$1, jh $$2, dxu $$3) {
      dxu $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(ecq.c, $$2, ecq.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.vR, axg.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
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
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   public static int a(dxu $$0, int $$1) {
      return bae.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return a($$0, 15);
   }

   public static Optional<fbx> a(bvq<?> $$0, dgq $$1, jh $$2) {
      Optional<fbx> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fbx> a(bvq<?> $$0, dgq $$1, jh $$2, boolean $$3) {
      jh.a $$4 = new jh.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kl $$5 = (kl)var5.next();
         $$4.g($$2).h($$5);
         fbx $$6 = csb.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
