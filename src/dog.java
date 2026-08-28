import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dog extends dhy {
   public static final MapCodec<dog> a = b(dog::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dwd d = dvt.aZ;
   private static final ImmutableList<kk> e = ImmutableList.of(
      new kk(0, 0, -1), new kk(-1, 0, 0), new kk(0, 0, 1), new kk(1, 0, 0), new kk(-1, 0, -1), new kk(1, 0, -1), new kk(-1, 0, 1), new kk(1, 0, 1)
   );
   private static final ImmutableList<kk> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kk::p).iterator())
      .addAll(e.stream().map(kk::q).iterator())
      .add(new kk(0, 1, 0))
      .build();

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bry.a;
      } else {
         return (bry)($$5 == brx.a && a($$4.b(brx.b)) && o($$1) ? bry.e : bry.f);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$0.c(d) == 0) {
         return bry.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bry.a;
      } else {
         if (!$$1.C) {
            arn $$5 = (arn)$$3;
            if ($$5.W() != $$1.ag() || !$$2.equals($$5.U())) {
               $$5.a($$1.ag(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.vy, awl.e, 1.0F, 1.0F);
               return bry.b;
            }
         }

         return bry.c;
      }
   }

   private static boolean a(cvx $$0) {
      return $$0.a(cwb.fu);
   }

   private static boolean o(dvd $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jg $$0, dev $$1) {
      ere $$2 = $$1.b_($$0);
      if (!$$2.a(axf.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ere $$4 = $$1.b_($$0.e());
            return !$$4.a(axf.a);
         }
      }
   }

   private void e(dvd $$0, dev $$1, final jg $$2) {
      $$1.a($$2, false);
      boolean $$3 = jl.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axf.a);
      deo $$5 = new deo() {
         @Override
         public Optional<Float> a(den $$0, dea $$1, jg $$2x, dvd $$3, ere $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dia.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ezh $$6 = $$2.b();
      $$1.a(null, $$1.ak().a($$6), $$5, $$6, 5.0F, true, dev.a.b);
   }

   public static boolean a(dev $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable btz $$0, dev $$1, jg $$2, dvd $$3) {
      dvd $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(eaa.c, $$2, eaa.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.vw, awl.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awk.vv, awl.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lq.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   public static int a(dvd $$0, int $$1) {
      return azj.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return a($$0, 15);
   }

   public static Optional<ezh> a(bug<?> $$0, dee $$1, jg $$2) {
      Optional<ezh> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ezh> a(bug<?> $$0, dee $$1, jg $$2, boolean $$3) {
      jg.a $$4 = new jg.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kk $$5 = (kk)var5.next();
         $$4.g($$2).h($$5);
         ezh $$6 = cqk.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
