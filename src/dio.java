import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dio extends dch {
   public static final MapCodec<dio> a = b(dio::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dqi d = dpy.aZ;
   private static final ImmutableList<ji> e = ImmutableList.of(
      new ji(0, 0, -1), new ji(-1, 0, 0), new ji(0, 0, 1), new ji(1, 0, 0), new ji(-1, 0, -1), new ji(1, 0, -1), new ji(-1, 0, 1), new ji(1, 0, 1)
   );
   private static final ImmutableList<ji> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(ji::o).iterator())
      .addAll(e.stream().map(ji::p).iterator())
      .add(new ji(0, 1, 0))
      .build();

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return boh.a($$2.B);
      } else {
         return $$5 == boe.a && a($$4.b(boe.b)) && m($$1) ? boh.e : boh.d;
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$0.c(d) == 0) {
         return bof.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bof.a($$1.B);
      } else {
         if (!$$1.B) {
            apv $$5 = (apv)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auo.vd, aup.e, 1.0F, 1.0F);
               return bof.a;
            }
         }

         return bof.b;
      }
   }

   private static boolean a(crs $$0) {
      return $$0.a(crv.ft);
   }

   private static boolean m(dpi $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(id $$0, czg $$1) {
      elb $$2 = $$1.b_($$0);
      if (!$$2.a(avj.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            elb $$4 = $$1.b_($$0.d());
            return !$$4.a(avj.a);
         }
      }
   }

   private void d(dpi $$0, czg $$1, final id $$2) {
      $$1.a($$2, false);
      boolean $$3 = ij.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(avj.a);
      cyz $$5 = new cyz() {
         @Override
         public Optional<Float> a(cyy $$0, cym $$1, id $$2x, dpi $$3, elb $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dcj.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      esj $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, czg.a.b);
   }

   public static boolean a(czg $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bqa $$0, czg $$1, id $$2, dpi $$3) {
      dpi $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dub.c, $$2, dub.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auo.vb, aup.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, auo.va, aup.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(kn.aF, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   public static int a(dpi $$0, int $$1) {
      return axm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return a($$0, 15);
   }

   public static Optional<esj> a(bqg<?> $$0, cyq $$1, id $$2) {
      Optional<esj> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<esj> a(bqg<?> $$0, cyq $$1, id $$2, boolean $$3) {
      id.a $$4 = new id.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ji $$5 = (ji)var5.next();
         $$4.g($$2).h($$5);
         esj $$6 = cma.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
