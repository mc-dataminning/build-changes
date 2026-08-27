import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgh extends daa {
   public static final MapCodec<dgh> a = b(dgh::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dnz d = dnp.aZ;
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
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bne.a($$2.B);
      } else {
         return $$5 == bnb.a && a($$4.b(bnb.b)) && m($$1) ? bne.e : bne.d;
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$0.c(d) == 0) {
         return bnc.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bnc.a($$1.B);
      } else {
         if (!$$1.B) {
            apg $$5 = (apg)$$3;
            if ($$5.T() != $$1.ad() || !$$2.equals($$5.R())) {
               $$5.a($$1.ad(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.uV, atz.e, 1.0F, 1.0F);
               return bnc.a;
            }
         }

         return bnc.b;
      }
   }

   private static boolean a(cqk $$0) {
      return $$0.a(cqn.ft);
   }

   private static boolean m(dmz $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ib $$0, cwz $$1) {
      ein $$2 = $$1.b_($$0);
      if (!$$2.a(aus.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ein $$4 = $$1.b_($$0.d());
            return !$$4.a(aus.a);
         }
      }
   }

   private void d(dmz $$0, cwz $$1, final ib $$2) {
      $$1.a($$2, false);
      boolean $$3 = ih.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(aus.a);
      cws $$5 = new cws() {
         @Override
         public Optional<Float> a(cwr $$0, cwf $$1, ib $$2x, dmz $$3, ein $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dac.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      epr $$6 = $$2.b();
      $$1.a(null, $$1.ah().a($$6), $$5, $$6, 5.0F, true, cwz.a.b);
   }

   public static boolean a(cwz $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bow $$0, cwz $$1, ib $$2, dmz $$3) {
      dmz $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(drn.c, $$2, drn.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.uT, atz.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, aty.uS, atz.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(kc.aF, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   public static int a(dmz $$0, int $$1) {
      return aww.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return a($$0, 15);
   }

   public static Optional<epr> a(bpc<?> $$0, cwj $$1, ib $$2) {
      Optional<epr> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<epr> a(bpc<?> $$0, cwj $$1, ib $$2, boolean $$3) {
      ib.a $$4 = new ib.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jg $$5 = (jg)var5.next();
         $$4.g($$2).h($$5);
         epr $$6 = cks.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
