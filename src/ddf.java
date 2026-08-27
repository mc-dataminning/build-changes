import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddf extends cwy {
   public static final MapCodec<ddf> a = b(ddf::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dkp d = dkf.aZ;
   private static final ImmutableList<jb> e = ImmutableList.of(
      new jb(0, 0, -1), new jb(-1, 0, 0), new jb(0, 0, 1), new jb(1, 0, 0), new jb(-1, 0, -1), new jb(1, 0, -1), new jb(-1, 0, 1), new jb(1, 0, 1)
   );
   private static final ImmutableList<jb> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jb::o).iterator())
      .addAll(e.stream().map(jb::p).iterator())
      .add(new jb(0, 1, 0))
      .build();

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   public ddf(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if (a($$0) && h($$1)) {
         a($$4, $$2, $$3, $$1);
         if (!$$4.fT().d) {
            $$0.h(1);
         }

         return bke.a($$2.B);
      } else {
         return $$5 == bkb.a && a($$4.b(bkb.b)) && h($$1) ? bke.e : bke.d;
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$0.c(d) == 0) {
         return bkc.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bkc.a($$1.B);
      } else {
         if (!$$1.B) {
            anf $$5 = (anf)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, art.uR, aru.e, 1.0F, 1.0F);
               return bkc.a;
            }
         }

         return bkc.b;
      }
   }

   private static boolean a(cng $$0) {
      return $$0.a(cnj.ft);
   }

   private static boolean h(djp $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(hx $$0, ctx $$1) {
      eez $$2 = $$1.b_($$0);
      if (!$$2.a(asn.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eez $$4 = $$1.b_($$0.d());
            return !$$4.a(asn.a);
         }
      }
   }

   private void d(djp $$0, ctx $$1, final hx $$2) {
      $$1.a($$2, false);
      boolean $$3 = ic.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(asn.a);
      ctq $$5 = new ctq() {
         @Override
         public Optional<Float> a(ctp $$0, ctd $$1, hx $$2x, djp $$3, eez $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cxa.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      emc $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, ctx.a.b);
   }

   public static boolean a(ctx $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable blw $$0, ctx $$1, hx $$2, djp $$3) {
      djp $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dnz.c, $$2, dnz.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, art.uP, aru.e, 1.0F, 1.0F);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, art.uO, aru.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(jx.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   public static int a(djp $$0, int $$1) {
      return aup.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return a($$0, 15);
   }

   public static Optional<emc> a(bmc<?> $$0, cth $$1, hx $$2) {
      Optional<emc> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<emc> a(bmc<?> $$0, cth $$1, hx $$2, boolean $$3) {
      hx.a $$4 = new hx.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jb $$5 = (jb)var5.next();
         $$4.g($$2).h($$5);
         emc $$6 = chn.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
