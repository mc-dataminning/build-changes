import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmh extends dfy {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final duc d = dts.aZ;
   private static final ImmutableList<kh> e = ImmutableList.of(
      new kh(0, 0, -1), new kh(-1, 0, 0), new kh(0, 0, 1), new kh(1, 0, 0), new kh(-1, 0, -1), new kh(1, 0, -1), new kh(-1, 0, 1), new kh(1, 0, 1)
   );
   private static final ImmutableList<kh> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kh::p).iterator())
      .addAll(e.stream().map(kh::q).iterator())
      .add(new kh(0, 1, 0))
      .build();

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqt.a($$2.B);
      } else {
         return $$5 == bqq.a && a($$4.b(bqq.b)) && m($$1) ? bqt.e : bqt.d;
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$0.c(d) == 0) {
         return bqr.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqr.a($$1.B);
      } else {
         if (!$$1.B) {
            aqv $$5 = (aqv)$$3;
            if ($$5.U() != $$1.af() || !$$2.equals($$5.S())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avp.vz, avq.e, 1.0F, 1.0F);
               return bqr.a;
            }
         }

         return bqr.c;
      }
   }

   private static boolean a(cuq $$0) {
      return $$0.a(cut.fu);
   }

   private static boolean m(dtc $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jd $$0, dcw $$1) {
      epe $$2 = $$1.b_($$0);
      if (!$$2.a(awk.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            epe $$4 = $$1.b_($$0.e());
            return !$$4.a(awk.a);
         }
      }
   }

   private void d(dtc $$0, dcw $$1, final jd $$2) {
      $$1.a($$2, false);
      boolean $$3 = ji.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(awk.a);
      dcp $$5 = new dcp() {
         @Override
         public Optional<Float> a(dco $$0, dcc $$1, jd $$2x, dtc $$3, epe $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dga.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      exc $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dcw.a.b);
   }

   public static boolean a(dcw $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsr $$0, dcw $$1, jd $$2, dtc $$3) {
      dtc $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dxz.c, $$2, dxz.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avp.vx, avq.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avp.vw, avq.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lm.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   public static int a(dtc $$0, int $$1) {
      return ayo.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return a($$0, 15);
   }

   public static Optional<exc> a(bsx<?> $$0, dcg $$1, jd $$2) {
      Optional<exc> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<exc> a(bsx<?> $$0, dcg $$1, jd $$2, boolean $$3) {
      jd.a $$4 = new jd.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kh $$5 = (kh)var5.next();
         $$4.g($$2).h($$5);
         exc $$6 = coy.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
