import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dev extends cyo {
   public static final MapCodec<dev> a = b(dev::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dmf d = dlv.aZ;
   private static final ImmutableList<jd> e = ImmutableList.of(
      new jd(0, 0, -1), new jd(-1, 0, 0), new jd(0, 0, 1), new jd(1, 0, 0), new jd(-1, 0, -1), new jd(1, 0, -1), new jd(-1, 0, 1), new jd(1, 0, 1)
   );
   private static final ImmutableList<jd> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jd::o).iterator())
      .addAll(e.stream().map(jd::p).iterator())
      .add(new jd(0, 1, 0))
      .build();

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public dev(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         if (!$$4.fU().d) {
            $$0.h(1);
         }

         return blw.a($$2.B);
      } else {
         return $$5 == blt.a && a($$4.b(blt.b)) && m($$1) ? blw.e : blw.d;
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$0.c(d) == 0) {
         return blu.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return blu.a($$1.B);
      } else {
         if (!$$1.B) {
            aow $$5 = (aow)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atk.uR, atl.e, 1.0F, 1.0F);
               return blu.a;
            }
         }

         return blu.b;
      }
   }

   private static boolean a(coz $$0) {
      return $$0.a(cpc.ft);
   }

   private static boolean m(dlf $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(hz $$0, cvn $$1) {
      egp $$2 = $$1.b_($$0);
      if (!$$2.a(aue.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            egp $$4 = $$1.b_($$0.d());
            return !$$4.a(aue.a);
         }
      }
   }

   private void d(dlf $$0, cvn $$1, final hz $$2) {
      $$1.a($$2, false);
      boolean $$3 = ie.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(aue.a);
      cvg $$5 = new cvg() {
         @Override
         public Optional<Float> a(cvf $$0, cut $$1, hz $$2x, dlf $$3, egp $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cyq.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ens $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, cvn.a.b);
   }

   public static boolean a(cvn $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable bno $$0, cvn $$1, hz $$2, dlf $$3) {
      dlf $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dpp.c, $$2, dpp.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atk.uP, atl.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, atk.uO, atl.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(jz.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   public static int a(dlf $$0, int $$1) {
      return awh.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return a($$0, 15);
   }

   public static Optional<ens> a(bnu<?> $$0, cux $$1, hz $$2) {
      Optional<ens> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ens> a(bnu<?> $$0, cux $$1, hz $$2, boolean $$3) {
      hz.a $$4 = new hz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jd $$5 = (jd)var5.next();
         $$4.g($$2).h($$5);
         ens $$6 = cjf.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
