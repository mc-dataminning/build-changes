import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgj extends dac {
   public static final MapCodec<dgj> a = b(dgj::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dob d = dnr.aZ;
   private static final ImmutableList<jg> e = ImmutableList.of(
      new jg(0, 0, -1), new jg(-1, 0, 0), new jg(0, 0, 1), new jg(1, 0, 0), new jg(-1, 0, -1), new jg(1, 0, -1), new jg(-1, 0, 1), new jg(1, 0, 1)
   );
   private static final ImmutableList<jg> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jg::o).iterator())
      .addAll(e.stream().map(jg::p).iterator())
      .add(new jg(0, 1, 0))
      .build();

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bnf.a($$2.B);
      } else {
         return $$5 == bnc.a && a($$4.b(bnc.b)) && m($$1) ? bnf.e : bnf.d;
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$0.c(d) == 0) {
         return bnd.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bnd.a($$1.B);
      } else {
         if (!$$1.B) {
            apg $$5 = (apg)$$3;
            if ($$5.T() != $$1.ad() || !$$2.equals($$5.R())) {
               $$5.a($$1.ad(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.va, atz.e, 1.0F, 1.0F);
               return bnd.a;
            }
         }

         return bnd.b;
      }
   }

   private static boolean a(cqm $$0) {
      return $$0.a(cqp.ft);
   }

   private static boolean m(dnb $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ib $$0, cxb $$1) {
      eip $$2 = $$1.b_($$0);
      if (!$$2.a(aus.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eip $$4 = $$1.b_($$0.d());
            return !$$4.a(aus.a);
         }
      }
   }

   private void d(dnb $$0, cxb $$1, final ib $$2) {
      $$1.a($$2, false);
      boolean $$3 = ih.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(aus.a);
      cwu $$5 = new cwu() {
         @Override
         public Optional<Float> a(cwt $$0, cwh $$1, ib $$2x, dnb $$3, eip $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dae.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ept $$6 = $$2.b();
      $$1.a(null, $$1.ah().a($$6), $$5, $$6, 5.0F, true, cxb.a.b);
   }

   public static boolean a(cxb $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable box $$0, cxb $$1, ib $$2, dnb $$3) {
      dnb $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(drp.c, $$2, drp.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.uY, atz.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, aty.uX, atz.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(kc.aF, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   public static int a(dnb $$0, int $$1) {
      return aww.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return a($$0, 15);
   }

   public static Optional<ept> a(bpd<?> $$0, cwl $$1, ib $$2) {
      Optional<ept> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ept> a(bpd<?> $$0, cwl $$1, ib $$2, boolean $$3) {
      ib.a $$4 = new ib.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jg $$5 = (jg)var5.next();
         $$4.g($$2).h($$5);
         ept $$6 = cku.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
