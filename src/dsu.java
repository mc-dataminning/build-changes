import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsu extends dmf {
   public static final MapCodec<dsu> a = b(dsu::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final ebh d = eax.bc;
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
   public MapCodec<dsu> a() {
      return a;
   }

   public dsu(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bud.a;
      } else {
         return (bud)($$5 == buc.a && a($$4.b(buc.b)) && o($$1) ? bud.e : bud.f);
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$0.c(d) == 0) {
         return bud.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bud.a;
      } else {
         if (!$$1.C) {
            arr $$5 = (arr)$$3;
            if ($$5.V() != $$1.aj() || !$$2.equals($$5.T())) {
               $$5.a($$1.aj(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wn, awo.e, 1.0F, 1.0F);
               return bud.b;
            }
         }

         return bud.c;
      }
   }

   private static boolean a(czd $$0) {
      return $$0.a(czh.fQ);
   }

   private static boolean o(eah $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iu $$0, dja $$1) {
      ewo $$2 = $$1.b_($$0);
      if (!$$2.a(axh.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ewo $$4 = $$1.b_($$0.e());
            return !$$4.a(axh.a);
         }
      }
   }

   private void d(eah $$0, dja $$1, final iu $$2) {
      $$1.a($$2, false);
      boolean $$3 = ja.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axh.a);
      diu $$5 = new diu() {
         @Override
         public Optional<Float> a(dit $$0, dig $$1, iu $$2x, eah $$3, ewo $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dmh.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      feq $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, dja.a.b);
   }

   public static boolean a(dja $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable bwf $$0, dja $$1, iu $$2, eah $$3) {
      eah $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(efh.c, $$2, efh.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wl, awo.e, 1.0F, 1.0F);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awn.wk, awo.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lx.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   public static int a(eah $$0, int $$1) {
      return azm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return a($$0, 15);
   }

   public static Optional<feq> a(bwo<?> $$0, dik $$1, iu $$2) {
      Optional<feq> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<feq> a(bwo<?> $$0, dik $$1, iu $$2, boolean $$3) {
      iu.a $$4 = new iu.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jz $$5 = (jz)var5.next();
         $$4.g($$2).h($$5);
         feq $$6 = ctv.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
