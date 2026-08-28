import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqp extends dke {
   public static final MapCodec<dqp> a = b(dqp::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dym d = dyd.ba;
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
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bte.a;
      } else {
         return (bte)($$5 == btd.a && a($$4.b(btd.b)) && o($$1) ? bte.e : bte.f);
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$0.c(d) == 0) {
         return bte.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bte.a;
      } else {
         if (!$$1.C) {
            asi $$5 = (asi)$$3;
            if ($$5.V() != $$1.ah() || !$$2.equals($$5.T())) {
               $$5.a($$1.ah(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.vS, axg.e, 1.0F, 1.0F);
               return bte.b;
            }
         }

         return bte.c;
      }
   }

   private static boolean a(cxk $$0) {
      return $$0.a(cxo.fH);
   }

   private static boolean o(dxn $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jh $$0, dha $$1) {
      etp $$2 = $$1.b_($$0);
      if (!$$2.a(aya.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            etp $$4 = $$1.b_($$0.e());
            return !$$4.a(aya.a);
         }
      }
   }

   private void e(dxn $$0, dha $$1, final jh $$2) {
      $$1.a($$2, false);
      boolean $$3 = jm.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(aya.a);
      dgt $$5 = new dgt() {
         @Override
         public Optional<Float> a(dgs $$0, dgf $$1, jh $$2x, dxn $$3, etp $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dkg.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fbs $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dha.a.b);
   }

   public static boolean a(dha $$0) {
      return $$0.G_().m();
   }

   public static void a(@Nullable bvf $$0, dha $$1, jh $$2, dxn $$3) {
      dxn $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(ecj.c, $$2, ecj.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.vQ, axg.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, axf.vP, axg.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ls.aI, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   public static int a(dxn $$0, int $$1) {
      return bae.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return a($$0, 15);
   }

   public static Optional<fbs> a(bvm<?> $$0, dgj $$1, jh $$2) {
      Optional<fbs> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fbs> a(bvm<?> $$0, dgj $$1, jh $$2, boolean $$3) {
      jh.a $$4 = new jh.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kl $$5 = (kl)var5.next();
         $$4.g($$2).h($$5);
         fbs $$6 = crx.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
