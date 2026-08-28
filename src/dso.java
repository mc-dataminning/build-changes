import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dso extends dma {
   public static final MapCodec<dso> a = b(dso::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final eaz d = eap.bc;
   private static final ImmutableList<jz> e = ImmutableList.of(
      new jz(0, 0, -1), new jz(-1, 0, 0), new jz(0, 0, 1), new jz(1, 0, 0), new jz(-1, 0, -1), new jz(1, 0, -1), new jz(-1, 0, 1), new jz(1, 0, 1)
   );
   private static final ImmutableList<jz> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jz::p).iterator())
      .addAll(e.stream().map(jz::q).iterator())
      .add(new jz(0, 1, 0))
      .build();

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bub.a;
      } else {
         return (bub)($$5 == bua.a && a($$4.b(bua.b)) && o($$1) ? bub.e : bub.f);
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$0.c(d) == 0) {
         return bub.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bub.a;
      } else {
         if (!$$1.C) {
            arr $$5 = (arr)$$3;
            if ($$5.V() != $$1.aj() || !$$2.equals($$5.T())) {
               $$5.a($$1.aj(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wk, awo.e, 1.0F, 1.0F);
               return bub.b;
            }
         }

         return bub.c;
      }
   }

   private static boolean a(cyy $$0) {
      return $$0.a(czc.fN);
   }

   private static boolean o(dzz $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iu $$0, div $$1) {
      ewg $$2 = $$1.b_($$0);
      if (!$$2.a(axh.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ewg $$4 = $$1.b_($$0.e());
            return !$$4.a(axh.a);
         }
      }
   }

   private void d(dzz $$0, div $$1, final iu $$2) {
      $$1.a($$2, false);
      boolean $$3 = ja.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axh.a);
      dip $$5 = new dip() {
         @Override
         public Optional<Float> a(dio $$0, dib $$1, iu $$2x, dzz $$3, ewg $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dmc.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fei $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, div.a.b);
   }

   public static boolean a(div $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable bwd $$0, div $$1, iu $$2, dzz $$3) {
      dzz $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(eez.c, $$2, eez.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wi, awo.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awn.wh, awo.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lx.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   public static int a(dzz $$0, int $$1) {
      return azm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return a($$0, 15);
   }

   public static Optional<fei> a(bwm<?> $$0, dif $$1, iu $$2) {
      Optional<fei> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fei> a(bwm<?> $$0, dif $$1, iu $$2, boolean $$3) {
      iu.a $$4 = new iu.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jz $$5 = (jz)var5.next();
         $$4.g($$2).h($$5);
         fei $$6 = ctq.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
