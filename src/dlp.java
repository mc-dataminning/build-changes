import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlp extends dfh {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dtk d = dta.aZ;
   private static final ImmutableList<ke> e = ImmutableList.of(
      new ke(0, 0, -1), new ke(-1, 0, 0), new ke(0, 0, 1), new ke(1, 0, 0), new ke(-1, 0, -1), new ke(1, 0, -1), new ke(-1, 0, 1), new ke(1, 0, 1)
   );
   private static final ImmutableList<ke> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(ke::o).iterator())
      .addAll(e.stream().map(ke::p).iterator())
      .add(new ke(0, 1, 0))
      .build();

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqi.a($$2.B);
      } else {
         return $$5 == bqf.a && a($$4.b(bqf.b)) && m($$1) ? bqi.e : bqi.d;
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$0.c(d) == 0) {
         return bqg.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqg.a($$1.B);
      } else {
         if (!$$1.B) {
            aqn $$5 = (aqn)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.vz, avi.e, 1.0F, 1.0F);
               return bqg.a;
            }
         }

         return bqg.c;
      }
   }

   private static boolean a(cuc $$0) {
      return $$0.a(cuf.fu);
   }

   private static boolean m(dsk $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ja $$0, dcf $$1) {
      eoh $$2 = $$1.b_($$0);
      if (!$$2.a(awc.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eoh $$4 = $$1.b_($$0.d());
            return !$$4.a(awc.a);
         }
      }
   }

   private void d(dsk $$0, dcf $$1, final ja $$2) {
      $$1.a($$2, false);
      boolean $$3 = jf.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awc.a);
      dby $$5 = new dby() {
         @Override
         public Optional<Float> a(dbx $$0, dbl $$1, ja $$2x, dsk $$3, eoh $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfj.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ewf $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dcf.a.b);
   }

   public static boolean a(dcf $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsg $$0, dcf $$1, ja $$2, dsk $$3) {
      dsk $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dxg.c, $$2, dxg.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.vx, avi.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avh.vw, avi.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lj.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   public static int a(dsk $$0, int $$1) {
      return ayg.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return a($$0, 15);
   }

   public static Optional<ewf> a(bsm<?> $$0, dbp $$1, ja $$2) {
      Optional<ewf> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ewf> a(bsm<?> $$0, dbp $$1, ja $$2, boolean $$3) {
      ja.a $$4 = new ja.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ke $$5 = (ke)var5.next();
         $$4.g($$2).h($$5);
         ewf $$6 = cok.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
