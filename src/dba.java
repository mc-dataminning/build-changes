import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dba extends cut {
   public static final MapCodec<dba> a = b(dba::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dhw d = dhm.aZ;
   private static final ImmutableList<iw> e = ImmutableList.of(
      new iw(0, 0, -1), new iw(-1, 0, 0), new iw(0, 0, 1), new iw(1, 0, 0), new iw(-1, 0, -1), new iw(1, 0, -1), new iw(-1, 0, 1), new iw(1, 0, 1)
   );
   private static final ImmutableList<iw> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(iw::o).iterator())
      .addAll(e.stream().map(iw::p).iterator())
      .add(new iw(0, 1, 0))
      .build();

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   public dba(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      if ($$4 == bip.a && !a($$6) && a($$3.b(bip.b))) {
         return biq.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fT().d) {
            $$6.h(1);
         }

         return biq.a($$1.B);
      } else if ($$0.c(d) == 0) {
         return biq.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return biq.a($$1.B);
      } else {
         if (!$$1.B) {
            amb $$7 = (amb)$$3;
            if ($$7.R() != $$1.ac() || !$$2.equals($$7.P())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqn.tQ, aqo.e, 1.0F, 1.0F);
               return biq.a;
            }
         }

         return biq.b;
      }
   }

   private static boolean a(clb $$0) {
      return $$0.a(cle.eY);
   }

   private static boolean h(dgw $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ht $$0, crs $$1) {
      ecg $$2 = $$1.b_($$0);
      if (!$$2.a(arh.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ecg $$4 = $$1.b_($$0.d());
            return !$$4.a(arh.a);
         }
      }
   }

   private void d(dgw $$0, crs $$1, final ht $$2) {
      $$1.a($$2, false);
      boolean $$3 = hx.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(arh.a);
      crl $$5 = new crl() {
         @Override
         public Optional<Float> a(crk $$0, cqy $$1, ht $$2x, dgw $$3, ecg $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cuv.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eji $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, crs.a.b);
   }

   public static boolean a(crs $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bki $$0, crs $$1, ht $$2, dgw $$3) {
      dgw $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dlg.c, $$2, dlg.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqn.tO, aqo.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqn.tN, aqo.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(js.aC, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   public static int a(dgw $$0, int $$1) {
      return ati.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return a($$0, 15);
   }

   public static Optional<eji> a(bkm<?> $$0, crc $$1, ht $$2) {
      Optional<eji> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eji> a(bkm<?> $$0, crc $$1, ht $$2, boolean $$3) {
      ht.a $$4 = new ht.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         iw $$5 = (iw)var5.next();
         $$4.g($$2).h($$5);
         eji $$6 = cfi.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
