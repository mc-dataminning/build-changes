import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djd extends dcv {
   public static final MapCodec<djd> a = b(djd::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dqy d = dqo.aZ;
   private static final ImmutableList<jq> e = ImmutableList.of(
      new jq(0, 0, -1), new jq(-1, 0, 0), new jq(0, 0, 1), new jq(1, 0, 0), new jq(-1, 0, -1), new jq(1, 0, -1), new jq(-1, 0, 1), new jq(1, 0, 1)
   );
   private static final ImmutableList<jq> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jq::o).iterator())
      .addAll(e.stream().map(jq::p).iterator())
      .add(new jq(0, 1, 0))
      .build();

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bos.a($$2.B);
      } else {
         return $$5 == bop.a && a($$4.b(bop.b)) && m($$1) ? bos.e : bos.d;
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$0.c(d) == 0) {
         return boq.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return boq.a($$1.B);
      } else {
         if (!$$1.B) {
            aqf $$5 = (aqf)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auz.vk, ava.e, 1.0F, 1.0F);
               return boq.a;
            }
         }

         return boq.b;
      }
   }

   private static boolean a(csd $$0) {
      return $$0.a(csg.fu);
   }

   private static boolean m(dpy $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(im $$0, czu $$1) {
      elr $$2 = $$1.b_($$0);
      if (!$$2.a(avt.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            elr $$4 = $$1.b_($$0.d());
            return !$$4.a(avt.a);
         }
      }
   }

   private void d(dpy $$0, czu $$1, final im $$2) {
      $$1.a($$2, false);
      boolean $$3 = ir.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(avt.a);
      czn $$5 = new czn() {
         @Override
         public Optional<Float> a(czm $$0, cza $$1, im $$2x, dpy $$3, elr $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dcx.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      etf $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, czu.a.b);
   }

   public static boolean a(czu $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bql $$0, czu $$1, im $$2, dpy $$3) {
      dpy $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dur.c, $$2, dur.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auz.vi, ava.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, auz.vh, ava.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(kw.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   public static int a(dpy $$0, int $$1) {
      return axw.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return a($$0, 15);
   }

   public static Optional<etf> a(bqr<?> $$0, cze $$1, im $$2) {
      Optional<etf> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<etf> a(bqr<?> $$0, cze $$1, im $$2, boolean $$3) {
      im.a $$4 = new im.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jq $$5 = (jq)var5.next();
         $$4.g($$2).h($$5);
         etf $$6 = cml.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
