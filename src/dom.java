import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dom extends die {
   public static final MapCodec<dom> a = b(dom::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dwj d = dvz.aZ;
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
   public MapCodec<dom> a() {
      return a;
   }

   public dom(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bsd.a;
      } else {
         return (bsd)($$5 == bsc.a && a($$4.b(bsc.b)) && o($$1) ? bsd.e : bsd.f);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$0.c(d) == 0) {
         return bsd.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bsd.a;
      } else {
         if (!$$1.C) {
            aro $$5 = (aro)$$3;
            if ($$5.W() != $$1.ag() || !$$2.equals($$5.U())) {
               $$5.a($$1.ag(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.vy, awm.e, 1.0F, 1.0F);
               return bsd.b;
            }
         }

         return bsd.c;
      }
   }

   private static boolean a(cwb $$0) {
      return $$0.a(cwf.fu);
   }

   private static boolean o(dvj $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jh $$0, dfb $$1) {
      erk $$2 = $$1.b_($$0);
      if (!$$2.a(axg.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            erk $$4 = $$1.b_($$0.e());
            return !$$4.a(axg.a);
         }
      }
   }

   private void e(dvj $$0, dfb $$1, final jh $$2) {
      $$1.a($$2, false);
      boolean $$3 = jm.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axg.a);
      deu $$5 = new deu() {
         @Override
         public Optional<Float> a(det $$0, deg $$1, jh $$2x, dvj $$3, erk $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dig.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ezn $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, dfb.a.b);
   }

   public static boolean a(dfb $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bue $$0, dfb $$1, jh $$2, dvj $$3) {
      dvj $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(eag.c, $$2, eag.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.vw, awm.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awl.vv, awm.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lr.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   public static int a(dvj $$0, int $$1) {
      return azk.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return a($$0, 15);
   }

   public static Optional<ezn> a(bul<?> $$0, dek $$1, jh $$2) {
      Optional<ezn> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ezn> a(bul<?> $$0, dek $$1, jh $$2, boolean $$3) {
      jh.a $$4 = new jh.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kl $$5 = (kl)var5.next();
         $$4.g($$2).h($$5);
         ezn $$6 = cqp.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
