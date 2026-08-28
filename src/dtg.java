import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtg extends dmr {
   public static final MapCodec<dtg> a = b(dtg::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final ebt d = ebj.bc;
   private static final ImmutableList<ka> e = ImmutableList.of(
      new ka(0, 0, -1), new ka(-1, 0, 0), new ka(0, 0, 1), new ka(1, 0, 0), new ka(-1, 0, -1), new ka(1, 0, -1), new ka(-1, 0, 1), new ka(1, 0, 1)
   );
   private static final ImmutableList<ka> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(ka::p).iterator())
      .addAll(e.stream().map(ka::q).iterator())
      .add(new ka(0, 1, 0))
      .build();

   @Override
   public MapCodec<dtg> a() {
      return a;
   }

   public dtg(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bug.a;
      } else {
         return (bug)($$5 == buf.a && a($$4.b(buf.b)) && o($$1) ? bug.e : bug.f);
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$0.c(d) == 0) {
         return bug.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bug.a;
      } else {
         if ($$3 instanceof arr $$5) {
            arr.a $$6 = $$5.T();
            arr.a $$7 = new arr.a($$1.aj(), $$2, 0.0F, false);
            if ($$6 == null || !$$6.a($$7)) {
               $$5.a($$7, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wn, awo.e, 1.0F, 1.0F);
               return bug.b;
            }
         }

         return bug.c;
      }
   }

   private static boolean a(czn $$0) {
      return $$0.a(czr.fQ);
   }

   private static boolean o(eat $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iv $$0, djm $$1) {
      exa $$2 = $$1.b_($$0);
      if (!$$2.a(axh.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            exa $$4 = $$1.b_($$0.e());
            return !$$4.a(axh.a);
         }
      }
   }

   private void d(eat $$0, djm $$1, final iv $$2) {
      $$1.a($$2, false);
      boolean $$3 = jb.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axh.a);
      djg $$5 = new djg() {
         @Override
         public Optional<Float> a(djf $$0, diq $$1, iv $$2x, eat $$3, exa $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dmt.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ffc $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, djm.a.b);
   }

   public static boolean a(djm $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable bwi $$0, djm $$1, iv $$2, eat $$3) {
      eat $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(eft.c, $$2, eft.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wl, awo.e, 1.0F, 1.0F);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awn.wk, awo.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ly.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   public static int a(eat $$0, int $$1) {
      return azm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return a($$0, 15);
   }

   public static Optional<ffc> a(bwr<?> $$0, diu $$1, iv $$2) {
      Optional<ffc> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ffc> a(bwr<?> $$0, diu $$1, iv $$2, boolean $$3) {
      iv.a $$4 = new iv.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ka $$5 = (ka)var5.next();
         $$4.g($$2).h($$5);
         ffc $$6 = cuf.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
