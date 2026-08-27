import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkg extends ddy {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dsb d = drr.aZ;
   private static final ImmutableList<js> e = ImmutableList.of(
      new js(0, 0, -1), new js(-1, 0, 0), new js(0, 0, 1), new js(1, 0, 0), new js(-1, 0, -1), new js(1, 0, -1), new js(-1, 0, 1), new js(1, 0, 1)
   );
   private static final ImmutableList<js> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(js::o).iterator())
      .addAll(e.stream().map(js::p).iterator())
      .add(new js(0, 1, 0))
      .build();

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bpw.a($$2.B);
      } else {
         return $$5 == bpt.a && a($$4.b(bpt.b)) && m($$1) ? bpw.e : bpw.d;
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$0.c(d) == 0) {
         return bpu.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bpu.a($$1.B);
      } else {
         if (!$$1.B) {
            aqn $$5 = (aqn)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.vw, avi.e, 1.0F, 1.0F);
               return bpu.a;
            }
         }

         return bpu.b;
      }
   }

   private static boolean a(cto $$0) {
      return $$0.a(ctr.fu);
   }

   private static boolean m(drb $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(io $$0, dax $$1) {
      emu $$2 = $$1.b_($$0);
      if (!$$2.a(awb.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            emu $$4 = $$1.b_($$0.d());
            return !$$4.a(awb.a);
         }
      }
   }

   private void d(drb $$0, dax $$1, final io $$2) {
      $$1.a($$2, false);
      boolean $$3 = it.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awb.a);
      daq $$5 = new daq() {
         @Override
         public Optional<Float> a(dap $$0, dad $$1, io $$2x, drb $$3, emu $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dea.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      euk $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, dax.a.b);
   }

   public static boolean a(dax $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bru $$0, dax $$1, io $$2, drb $$3) {
      drb $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dvu.c, $$2, dvu.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.vu, avi.e, 1.0F, 1.0F);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avh.vt, avi.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ky.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   public static int a(drb $$0, int $$1) {
      return ayd.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return a($$0, 15);
   }

   public static Optional<euk> a(bsa<?> $$0, dah $$1, io $$2) {
      Optional<euk> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<euk> a(bsa<?> $$0, dah $$1, io $$2, boolean $$3) {
      io.a $$4 = new io.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         js $$5 = (js)var5.next();
         $$4.g($$2).h($$5);
         euk $$6 = cnw.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
