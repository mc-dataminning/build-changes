import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmf extends dfw {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dua d = dtq.aZ;
   private static final ImmutableList<kh> e = ImmutableList.of(
      new kh(0, 0, -1), new kh(-1, 0, 0), new kh(0, 0, 1), new kh(1, 0, 0), new kh(-1, 0, -1), new kh(1, 0, -1), new kh(-1, 0, 1), new kh(1, 0, 1)
   );
   private static final ImmutableList<kh> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kh::o).iterator())
      .addAll(e.stream().map(kh::p).iterator())
      .add(new kh(0, 1, 0))
      .build();

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   public dmf(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqs.a($$2.B);
      } else {
         return $$5 == bqp.a && a($$4.b(bqp.b)) && m($$1) ? bqs.e : bqs.d;
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$0.c(d) == 0) {
         return bqq.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqq.a($$1.B);
      } else {
         if (!$$1.B) {
            aqu $$5 = (aqu)$$3;
            if ($$5.U() != $$1.af() || !$$2.equals($$5.S())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.vz, avp.e, 1.0F, 1.0F);
               return bqq.a;
            }
         }

         return bqq.c;
      }
   }

   private static boolean a(cuo $$0) {
      return $$0.a(cur.fu);
   }

   private static boolean m(dta $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jd $$0, dcu $$1) {
      eoy $$2 = $$1.b_($$0);
      if (!$$2.a(awj.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eoy $$4 = $$1.b_($$0.d());
            return !$$4.a(awj.a);
         }
      }
   }

   private void d(dta $$0, dcu $$1, final jd $$2) {
      $$1.a($$2, false);
      boolean $$3 = ji.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awj.a);
      dcn $$5 = new dcn() {
         @Override
         public Optional<Float> a(dcm $$0, dca $$1, jd $$2x, dta $$3, eoy $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfy.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eww $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dcu.a.b);
   }

   public static boolean a(dcu $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsq $$0, dcu $$1, jd $$2, dta $$3) {
      dta $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dxw.c, $$2, dxw.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.vx, avp.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avo.vw, avp.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lm.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   public static int a(dta $$0, int $$1) {
      return ayn.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return a($$0, 15);
   }

   public static Optional<eww> a(bsw<?> $$0, dce $$1, jd $$2) {
      Optional<eww> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eww> a(bsw<?> $$0, dce $$1, jd $$2, boolean $$3) {
      jd.a $$4 = new jd.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kh $$5 = (kh)var5.next();
         $$4.g($$2).h($$5);
         eww $$6 = cow.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
