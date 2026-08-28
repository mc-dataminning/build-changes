import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqq extends dkd {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dyn d = dye.bc;
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
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bta.a;
      } else {
         return (bta)($$5 == bsz.a && a($$4.b(bsz.b)) && o($$1) ? bta.e : bta.f);
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$0.c(d) == 0) {
         return bta.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bta.a;
      } else {
         if (!$$1.C) {
            ary $$5 = (ary)$$3;
            if ($$5.V() != $$1.ai() || !$$2.equals($$5.T())) {
               $$5.a($$1.ai(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awv.vZ, aww.e, 1.0F, 1.0F);
               return bta.b;
            }
         }

         return bta.c;
      }
   }

   private static boolean a(cxg $$0) {
      return $$0.a(cxk.fJ);
   }

   private static boolean o(dxo $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jh $$0, dgz $$1) {
      etq $$2 = $$1.b_($$0);
      if (!$$2.a(axq.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            etq $$4 = $$1.b_($$0.e());
            return !$$4.a(axq.a);
         }
      }
   }

   private void e(dxo $$0, dgz $$1, final jh $$2) {
      $$1.a($$2, false);
      boolean $$3 = jm.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axq.a);
      dgs $$5 = new dgs() {
         @Override
         public Optional<Float> a(dgr $$0, dge $$1, jh $$2x, dxo $$3, etq $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dkf.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fbr $$6 = $$2.b();
      $$1.a(null, $$1.ak().a($$6), $$5, $$6, 5.0F, true, dgz.a.b);
   }

   public static boolean a(dgz $$0) {
      return $$0.G_().m();
   }

   public static void a(@Nullable bvb $$0, dgz $$1, jh $$2, dxo $$3) {
      dxo $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(eck.c, $$2, eck.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awv.vX, aww.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awv.vW, aww.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ls.aJ, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   public static int a(dxo $$0, int $$1) {
      return azu.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return a($$0, 15);
   }

   public static Optional<fbr> a(bvi<?> $$0, dgi $$1, jh $$2) {
      Optional<fbr> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fbr> a(bvi<?> $$0, dgi $$1, jh $$2, boolean $$3) {
      jh.a $$4 = new jh.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kl $$5 = (kl)var5.next();
         $$4.g($$2).h($$5);
         fbr $$6 = crt.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
