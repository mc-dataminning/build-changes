import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlh extends dez {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dtc d = dss.aZ;
   private static final ImmutableList<kd> e = ImmutableList.of(
      new kd(0, 0, -1), new kd(-1, 0, 0), new kd(0, 0, 1), new kd(1, 0, 0), new kd(-1, 0, -1), new kd(1, 0, -1), new kd(-1, 0, 1), new kd(1, 0, 1)
   );
   private static final ImmutableList<kd> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kd::o).iterator())
      .addAll(e.stream().map(kd::p).iterator())
      .add(new kd(0, 1, 0))
      .build();

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqw.a($$2.B);
      } else {
         return $$5 == bqt.a && a($$4.b(bqt.b)) && m($$1) ? bqw.e : bqw.d;
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$0.c(d) == 0) {
         return bqu.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqu.a($$1.B);
      } else {
         if (!$$1.B) {
            arg $$5 = (arg)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vw, awb.e, 1.0F, 1.0F);
               return bqu.a;
            }
         }

         return bqu.c;
      }
   }

   private static boolean a(cup $$0) {
      return $$0.a(cus.fu);
   }

   private static boolean m(dsc $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iz $$0, dby $$1) {
      env $$2 = $$1.b_($$0);
      if (!$$2.a(awv.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            env $$4 = $$1.b_($$0.d());
            return !$$4.a(awv.a);
         }
      }
   }

   private void d(dsc $$0, dby $$1, final iz $$2) {
      $$1.a($$2, false);
      boolean $$3 = je.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awv.a);
      dbr $$5 = new dbr() {
         @Override
         public Optional<Float> a(dbq $$0, dbe $$1, iz $$2x, dsc $$3, env $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfb.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      evr $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dby.a.b);
   }

   public static boolean a(dby $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsu $$0, dby $$1, iz $$2, dsc $$3) {
      dsc $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dwv.c, $$2, dwv.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vu, awb.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awa.vt, awb.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(li.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   public static int a(dsc $$0, int $$1) {
      return ayz.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return a($$0, 15);
   }

   public static Optional<evr> a(bta<?> $$0, dbi $$1, iz $$2) {
      Optional<evr> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<evr> a(bta<?> $$0, dbi $$1, iz $$2, boolean $$3) {
      iz.a $$4 = new iz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kd $$5 = (kd)var5.next();
         $$4.g($$2).h($$5);
         evr $$6 = coy.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
