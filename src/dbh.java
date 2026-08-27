import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbh extends cva {
   public static final MapCodec<dbh> a = b(dbh::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dii d = dhy.aZ;
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
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      if ($$4 == biw.a && !a($$6) && a($$3.b(biw.b))) {
         return bix.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fU().d) {
            $$6.h(1);
         }

         return bix.a($$1.B);
      } else if ($$0.c(d) == 0) {
         return bix.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bix.a($$1.B);
      } else {
         if (!$$1.B) {
            amf $$7 = (amf)$$3;
            if ($$7.T() != $$1.ad() || !$$2.equals($$7.R())) {
               $$7.a($$1.ad(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqr.uh, aqs.e, 1.0F, 1.0F);
               return bix.a;
            }
         }

         return bix.b;
      }
   }

   private static boolean a(clj $$0) {
      return $$0.a(clm.ft);
   }

   private static boolean h(dhi $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ht $$0, csa $$1) {
      ecs $$2 = $$1.b_($$0);
      if (!$$2.a(arl.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ecs $$4 = $$1.b_($$0.d());
            return !$$4.a(arl.a);
         }
      }
   }

   private void d(dhi $$0, csa $$1, final ht $$2) {
      $$1.a($$2, false);
      boolean $$3 = hx.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(arl.a);
      crt $$5 = new crt() {
         @Override
         public Optional<Float> a(crs $$0, crg $$1, ht $$2x, dhi $$3, ecs $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cvc.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eju $$6 = $$2.b();
      $$1.a(null, $$1.ah().a($$6), $$5, $$6, 5.0F, true, csa.a.b);
   }

   public static boolean a(csa $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bkq $$0, csa $$1, ht $$2, dhi $$3) {
      dhi $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dls.c, $$2, dls.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqr.uf, aqs.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqr.ue, aqs.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(js.aC, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   public static int a(dhi $$0, int $$1) {
      return atm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return a($$0, 15);
   }

   public static Optional<eju> a(bku<?> $$0, crk $$1, ht $$2) {
      Optional<eju> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eju> a(bku<?> $$0, crk $$1, ht $$2, boolean $$3) {
      ht.a $$4 = new ht.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         iw $$5 = (iw)var5.next();
         $$4.g($$2).h($$5);
         eju $$6 = cfq.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
