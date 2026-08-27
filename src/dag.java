import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dag extends cua {
   public static final MapCodec<dag> a = b(dag::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dhb d = dgr.aZ;
   private static final ImmutableList<iw> e = ImmutableList.of(
      new iw(0, 0, -1), new iw(-1, 0, 0), new iw(0, 0, 1), new iw(1, 0, 0), new iw(-1, 0, -1), new iw(1, 0, -1), new iw(-1, 0, 1), new iw(1, 0, 1)
   );
   private static final ImmutableList<iw> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(iw::o).iterator())
      .addAll(e.stream().map(iw::p).iterator())
      .add(new iw(0, 1, 0))
      .build();

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   public dag(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      if ($$4 == bia.a && !a($$6) && a($$3.b(bia.b))) {
         return bib.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fT().d) {
            $$6.h(1);
         }

         return bib.a($$1.B);
      } else if ($$0.c(d) == 0) {
         return bib.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bib.a($$1.B);
      } else {
         if (!$$1.B) {
            alr $$7 = (alr)$$3;
            if ($$7.R() != $$1.ac() || !$$2.equals($$7.P())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqd.tO, aqe.e, 1.0F, 1.0F);
               return bib.a;
            }
         }

         return bib.b;
      }
   }

   private static boolean a(ckj $$0) {
      return $$0.a(ckm.eY);
   }

   private static boolean h(dgb $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ht $$0, cqz $$1) {
      ebe $$2 = $$1.b_($$0);
      if (!$$2.a(aqx.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ebe $$4 = $$1.b_($$0.d());
            return !$$4.a(aqx.a);
         }
      }
   }

   private void d(dgb $$0, cqz $$1, final ht $$2) {
      $$1.a($$2, false);
      boolean $$3 = hx.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(aqx.a);
      cqs $$5 = new cqs() {
         @Override
         public Optional<Float> a(cqr $$0, cqf $$1, ht $$2x, dgb $$3, ebe $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cuc.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eif $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, cqz.a.b);
   }

   public static boolean a(cqz $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bjt $$0, cqz $$1, ht $$2, dgb $$3) {
      dgb $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dkl.c, $$2, dkl.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqd.tM, aqe.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqd.tL, aqe.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(js.aB, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   public static int a(dgb $$0, int $$1) {
      return asy.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return a($$0, 15);
   }

   public static Optional<eif> a(bjx<?> $$0, cqj $$1, ht $$2) {
      Optional<eif> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eif> a(bjx<?> $$0, cqj $$1, ht $$2, boolean $$3) {
      ht.a $$4 = new ht.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         iw $$5 = (iw)var5.next();
         $$4.g($$2).h($$5);
         eif $$6 = cet.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
