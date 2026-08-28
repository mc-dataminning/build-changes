import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class drh extends dku {
   public static final MapCodec<drh> a = b(drh::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dzm d = dzc.bc;
   private static final ImmutableList<kn> e = ImmutableList.of(
      new kn(0, 0, -1), new kn(-1, 0, 0), new kn(0, 0, 1), new kn(1, 0, 0), new kn(-1, 0, -1), new kn(1, 0, -1), new kn(-1, 0, 1), new kn(1, 0, 1)
   );
   private static final ImmutableList<kn> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kn::p).iterator())
      .addAll(e.stream().map(kn::q).iterator())
      .add(new kn(0, 1, 0))
      .build();

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   public drh(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return btq.a;
      } else {
         return (btq)($$5 == btp.a && a($$4.b(btp.b)) && o($$1) ? btq.e : btq.f);
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$0.c(d) == 0) {
         return btq.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return btq.a;
      } else {
         if (!$$1.C) {
            aro $$5 = (aro)$$3;
            if ($$5.V() != $$1.aj() || !$$2.equals($$5.T())) {
               $$5.a($$1.aj(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.wj, awl.e, 1.0F, 1.0F);
               return btq.b;
            }
         }

         return btq.c;
      }
   }

   private static boolean a(cxy $$0) {
      return $$0.a(cyc.fL);
   }

   private static boolean o(dym $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jj $$0, dhp $$1) {
      eut $$2 = $$1.b_($$0);
      if (!$$2.a(axf.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eut $$4 = $$1.b_($$0.e());
            return !$$4.a(axf.a);
         }
      }
   }

   private void e(dym $$0, dhp $$1, final jj $$2) {
      $$1.a($$2, false);
      boolean $$3 = jo.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axf.a);
      dhj $$5 = new dhj() {
         @Override
         public Optional<Float> a(dhi $$0, dgv $$1, jj $$2x, dym $$3, eut $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dkw.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fcu $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, dhp.a.b);
   }

   public static boolean a(dhp $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable bvs $$0, dhp $$1, jj $$2, dym $$3) {
      dym $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(edm.c, $$2, edm.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.wh, awl.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awk.wg, awl.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lv.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   public static int a(dym $$0, int $$1) {
      return azk.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return a($$0, 15);
   }

   public static Optional<fcu> a(bwb<?> $$0, dgz $$1, jj $$2) {
      Optional<fcu> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fcu> a(bwb<?> $$0, dgz $$1, jj $$2, boolean $$3) {
      jj.a $$4 = new jj.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kn $$5 = (kn)var5.next();
         $$4.g($$2).h($$5);
         fcu $$6 = csn.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
