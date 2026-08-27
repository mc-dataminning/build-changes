import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfm extends czf {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dne d = dmu.aZ;
   private static final ImmutableList<jf> e = ImmutableList.of(
      new jf(0, 0, -1), new jf(-1, 0, 0), new jf(0, 0, 1), new jf(1, 0, 0), new jf(-1, 0, -1), new jf(1, 0, -1), new jf(-1, 0, 1), new jf(1, 0, 1)
   );
   private static final ImmutableList<jf> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jf::o).iterator())
      .addAll(e.stream().map(jf::p).iterator())
      .add(new jf(0, 1, 0))
      .build();

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         if (!$$4.fW().d) {
            $$0.h(1);
         }

         return bmn.a($$2.B);
      } else {
         return $$5 == bmk.a && a($$4.b(bmk.b)) && m($$1) ? bmn.e : bmn.d;
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$0.c(d) == 0) {
         return bml.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bml.a($$1.B);
      } else {
         if (!$$1.B) {
            apb $$5 = (apb)$$3;
            if ($$5.T() != $$1.ad() || !$$2.equals($$5.R())) {
               $$5.a($$1.ad(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atp.uS, atq.e, 1.0F, 1.0F);
               return bml.a;
            }
         }

         return bml.b;
      }
   }

   private static boolean a(cpq $$0) {
      return $$0.a(cpt.ft);
   }

   private static boolean m(dme $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ib $$0, cwe $$1) {
      ehr $$2 = $$1.b_($$0);
      if (!$$2.a(auj.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ehr $$4 = $$1.b_($$0.d());
            return !$$4.a(auj.a);
         }
      }
   }

   private void d(dme $$0, cwe $$1, final ib $$2) {
      $$1.a($$2, false);
      boolean $$3 = ih.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(auj.a);
      cvx $$5 = new cvx() {
         @Override
         public Optional<Float> a(cvw $$0, cvk $$1, ib $$2x, dme $$3, ehr $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(czh.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eov $$6 = $$2.b();
      $$1.a(null, $$1.ah().a($$6), $$5, $$6, 5.0F, true, cwe.a.b);
   }

   public static boolean a(cwe $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable bof $$0, cwe $$1, ib $$2, dme $$3) {
      dme $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dqr.c, $$2, dqr.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atp.uQ, atq.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, atp.uP, atq.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(kb.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   public static int a(dme $$0, int $$1) {
      return awm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return a($$0, 15);
   }

   public static Optional<eov> a(bol<?> $$0, cvo $$1, ib $$2) {
      Optional<eov> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eov> a(bol<?> $$0, cvo $$1, ib $$2, boolean $$3) {
      ib.a $$4 = new ib.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jf $$5 = (jf)var5.next();
         $$4.g($$2).h($$5);
         eov $$6 = cjy.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
