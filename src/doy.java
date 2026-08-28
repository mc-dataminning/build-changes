import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class doy extends diq {
   public static final MapCodec<doy> a = b(doy::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dwu d = dwl.aZ;
   private static final ImmutableList<kl> e = ImmutableList.of(
      new kl(0, 0, -1), new kl(-1, 0, 0), new kl(0, 0, 1), new kl(1, 0, 0), new kl(-1, 0, -1), new kl(1, 0, -1), new kl(-1, 0, 1), new kl(1, 0, 1)
   );
   private static final ImmutableList<kl> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kl::p).iterator())
      .addAll(e.stream().map(kl::q).iterator())
      .add(new kl(0, 1, 0))
      .build();

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   public doy(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bsk.a;
      } else {
         return (bsk)($$5 == bsj.a && a($$4.b(bsj.b)) && o($$1) ? bsk.e : bsk.f);
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$0.c(d) == 0) {
         return bsk.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bsk.a;
      } else {
         if (!$$1.C) {
            arq $$5 = (arq)$$3;
            if ($$5.V() != $$1.ag() || !$$2.equals($$5.T())) {
               $$5.a($$1.ag(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.vy, awo.e, 1.0F, 1.0F);
               return bsk.b;
            }
         }

         return bsk.c;
      }
   }

   private static boolean a(cwm $$0) {
      return $$0.a(cwq.fu);
   }

   private static boolean o(dvv $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jh $$0, dfm $$1) {
      erv $$2 = $$1.b_($$0);
      if (!$$2.a(axi.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            erv $$4 = $$1.b_($$0.e());
            return !$$4.a(axi.a);
         }
      }
   }

   private void e(dvv $$0, dfm $$1, final jh $$2) {
      $$1.a($$2, false);
      boolean $$3 = jm.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axi.a);
      dff $$5 = new dff() {
         @Override
         public Optional<Float> a(dfe $$0, der $$1, jh $$2x, dvv $$3, erv $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dis.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ezy $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, dfm.a.b);
   }

   public static boolean a(dfm $$0) {
      return $$0.F_().m();
   }

   public static void a(@Nullable bul $$0, dfm $$1, jh $$2, dvv $$3) {
      dvv $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(ear.c, $$2, ear.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.vw, awo.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awn.vv, awo.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ls.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   public static int a(dvv $$0, int $$1) {
      return azm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return a($$0, 15);
   }

   public static Optional<ezy> a(bus<?> $$0, dev $$1, jh $$2) {
      Optional<ezy> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ezy> a(bus<?> $$0, dev $$1, jh $$2, boolean $$3) {
      jh.a $$4 = new jh.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kl $$5 = (kl)var5.next();
         $$4.g($$2).h($$5);
         ezy $$6 = cqz.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
