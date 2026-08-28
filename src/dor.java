import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dor extends dij {
   public static final MapCodec<dor> a = b(dor::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dwn d = dwe.aZ;
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
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bsh.a;
      } else {
         return (bsh)($$5 == bsg.a && a($$4.b(bsg.b)) && o($$1) ? bsh.e : bsh.f);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$0.c(d) == 0) {
         return bsh.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bsh.a;
      } else {
         if (!$$1.C) {
            arr $$5 = (arr)$$3;
            if ($$5.W() != $$1.ag() || !$$2.equals($$5.U())) {
               $$5.a($$1.ag(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awo.vy, awp.e, 1.0F, 1.0F);
               return bsh.b;
            }
         }

         return bsh.c;
      }
   }

   private static boolean a(cwf $$0) {
      return $$0.a(cwj.fu);
   }

   private static boolean o(dvo $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jh $$0, dff $$1) {
      ero $$2 = $$1.b_($$0);
      if (!$$2.a(axj.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ero $$4 = $$1.b_($$0.e());
            return !$$4.a(axj.a);
         }
      }
   }

   private void e(dvo $$0, dff $$1, final jh $$2) {
      $$1.a($$2, false);
      boolean $$3 = jm.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axj.a);
      dey $$5 = new dey() {
         @Override
         public Optional<Float> a(dex $$0, dek $$1, jh $$2x, dvo $$3, ero $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dil.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ezr $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, dff.a.b);
   }

   public static boolean a(dff $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bui $$0, dff $$1, jh $$2, dvo $$3) {
      dvo $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(eak.c, $$2, eak.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awo.vw, awp.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awo.vv, awp.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ls.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   public static int a(dvo $$0, int $$1) {
      return azn.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return a($$0, 15);
   }

   public static Optional<ezr> a(bup<?> $$0, deo $$1, jh $$2) {
      Optional<ezr> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ezr> a(bup<?> $$0, deo $$1, jh $$2, boolean $$3) {
      jh.a $$4 = new jh.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kl $$5 = (kl)var5.next();
         $$4.g($$2).h($$5);
         ezr $$6 = cqt.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
