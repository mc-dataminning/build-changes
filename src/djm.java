import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djm extends dde {
   public static final MapCodec<djm> a = b(djm::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final drh d = dqx.aZ;
   private static final ImmutableList<jr> e = ImmutableList.of(
      new jr(0, 0, -1), new jr(-1, 0, 0), new jr(0, 0, 1), new jr(1, 0, 0), new jr(-1, 0, -1), new jr(1, 0, -1), new jr(-1, 0, 1), new jr(1, 0, 1)
   );
   private static final ImmutableList<jr> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jr::o).iterator())
      .addAll(e.stream().map(jr::p).iterator())
      .add(new jr(0, 1, 0))
      .build();

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   public djm(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bpo.a($$2.B);
      } else {
         return $$5 == bpl.a && a($$4.b(bpl.b)) && m($$1) ? bpo.e : bpo.d;
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$0.c(d) == 0) {
         return bpm.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bpm.a($$1.B);
      } else {
         if (!$$1.B) {
            aqi $$5 = (aqi)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avc.vl, avd.e, 1.0F, 1.0F);
               return bpm.a;
            }
         }

         return bpm.b;
      }
   }

   private static boolean a(csz $$0) {
      return $$0.a(ctc.fu);
   }

   private static boolean m(dqh $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(in $$0, dad $$1) {
      ema $$2 = $$1.b_($$0);
      if (!$$2.a(avw.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ema $$4 = $$1.b_($$0.d());
            return !$$4.a(avw.a);
         }
      }
   }

   private void d(dqh $$0, dad $$1, final in $$2) {
      $$1.a($$2, false);
      boolean $$3 = is.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(avw.a);
      czw $$5 = new czw() {
         @Override
         public Optional<Float> a(czv $$0, czj $$1, in $$2x, dqh $$3, ema $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(ddg.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      etp $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, dad.a.b);
   }

   public static boolean a(dad $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable brh $$0, dad $$1, in $$2, dqh $$3) {
      dqh $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dva.c, $$2, dva.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avc.vj, avd.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avc.vi, avd.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(kx.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   public static int a(dqh $$0, int $$1) {
      return axz.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return a($$0, 15);
   }

   public static Optional<etp> a(brn<?> $$0, czn $$1, in $$2) {
      Optional<etp> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<etp> a(brn<?> $$0, czn $$1, in $$2, boolean $$3) {
      in.a $$4 = new in.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jr $$5 = (jr)var5.next();
         $$4.g($$2).h($$5);
         etp $$6 = cnh.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
