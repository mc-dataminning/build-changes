import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dud extends dno {
   public static final MapCodec<dud> a = b(dud::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final ecq d = ecg.bc;
   private static final ImmutableList<kb> e = ImmutableList.of(
      new kb(0, 0, -1), new kb(-1, 0, 0), new kb(0, 0, 1), new kb(1, 0, 0), new kb(-1, 0, -1), new kb(1, 0, -1), new kb(-1, 0, 1), new kb(1, 0, 1)
   );
   private static final ImmutableList<kb> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kb::p).iterator())
      .addAll(e.stream().map(kb::q).iterator())
      .add(new kb(0, 1, 0))
      .build();

   @Override
   public MapCodec<dud> a() {
      return a;
   }

   public dud(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bvc.a;
      } else {
         return (bvc)($$5 == bvb.a && a($$4.b(bvb.b)) && o($$1) ? bvc.e : bvc.f);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$0.c(d) == 0) {
         return bvc.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bvc.a;
      } else {
         if ($$3 instanceof asc $$5) {
            asc.a $$6 = $$5.S();
            asc.a $$7 = new asc.a($$1.aj(), $$2, 0.0F, false);
            if ($$6 == null || !$$6.a($$7)) {
               $$5.a($$7, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awy.wn, awz.e, 1.0F, 1.0F);
               return bvc.b;
            }
         }

         return bvc.c;
      }
   }

   private static boolean a(dak $$0) {
      return $$0.a(dao.fQ);
   }

   private static boolean o(ebq $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iw $$0, dkj $$1) {
      eya $$2 = $$1.b_($$0);
      if (!$$2.a(axs.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eya $$4 = $$1.b_($$0.e());
            return !$$4.a(axs.a);
         }
      }
   }

   private void d(ebq $$0, dkj $$1, final iw $$2) {
      $$1.a($$2, false);
      boolean $$3 = jc.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axs.a);
      dkd $$5 = new dkd() {
         @Override
         public Optional<Float> a(dkc $$0, djn $$1, iw $$2x, ebq $$3, eya $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dnq.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fgc $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, dkj.a.b);
   }

   public static boolean a(dkj $$0) {
      return $$0.F_().m();
   }

   public static void a(@Nullable bxe $$0, dkj $$1, iw $$2, ebq $$3) {
      ebq $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(egq.c, $$2, egq.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awy.wl, awz.e, 1.0F, 1.0F);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awy.wk, awz.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lz.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   public static int a(ebq $$0, int $$1) {
      return azz.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return a($$0, 15);
   }

   public static Optional<fgc> a(bxn<?> $$0, djr $$1, iw $$2) {
      Optional<fgc> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fgc> a(bxn<?> $$0, djr $$1, iw $$2, boolean $$3) {
      iw.a $$4 = new iw.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kb $$5 = (kb)var5.next();
         $$4.g($$2).h($$5);
         fgc $$6 = cvb.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
