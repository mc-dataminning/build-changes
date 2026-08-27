import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dez extends cys {
   public static final MapCodec<dez> a = b(dez::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dmj d = dlz.aZ;
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
   public MapCodec<dez> a() {
      return a;
   }

   public dez(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         if (!$$4.fU().d) {
            $$0.h(1);
         }

         return bly.a($$2.B);
      } else {
         return $$5 == blv.a && a($$4.b(blv.b)) && m($$1) ? bly.e : bly.d;
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$0.c(d) == 0) {
         return blw.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return blw.a($$1.B);
      } else {
         if (!$$1.B) {
            aox $$5 = (aox)$$3;
            if ($$5.T() != $$1.ad() || !$$2.equals($$5.R())) {
               $$5.a($$1.ad(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atl.uS, atm.e, 1.0F, 1.0F);
               return blw.a;
            }
         }

         return blw.b;
      }
   }

   private static boolean a(cpd $$0) {
      return $$0.a(cpg.ft);
   }

   private static boolean m(dlj $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(hz $$0, cvr $$1) {
      egw $$2 = $$1.b_($$0);
      if (!$$2.a(auf.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            egw $$4 = $$1.b_($$0.d());
            return !$$4.a(auf.a);
         }
      }
   }

   private void d(dlj $$0, cvr $$1, final hz $$2) {
      $$1.a($$2, false);
      boolean $$3 = ie.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(auf.a);
      cvk $$5 = new cvk() {
         @Override
         public Optional<Float> a(cvj $$0, cux $$1, hz $$2x, dlj $$3, egw $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cyu.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      enz $$6 = $$2.b();
      $$1.a(null, $$1.ah().a($$6), $$5, $$6, 5.0F, true, cvr.a.b);
   }

   public static boolean a(cvr $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable bnq $$0, cvr $$1, hz $$2, dlj $$3) {
      dlj $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dpw.c, $$2, dpw.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atl.uQ, atm.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, atl.uP, atm.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(jz.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   public static int a(dlj $$0, int $$1) {
      return awi.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return a($$0, 15);
   }

   public static Optional<enz> a(bnw<?> $$0, cvb $$1, hz $$2) {
      Optional<enz> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<enz> a(bnw<?> $$0, cvb $$1, hz $$2, boolean $$3) {
      hz.a $$4 = new hz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jd $$5 = (jd)var5.next();
         $$4.g($$2).h($$5);
         enz $$6 = cjj.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
