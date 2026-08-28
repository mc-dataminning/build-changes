import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsh extends dlu {
   public static final MapCodec<dsh> a = b(dsh::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final eao d = eae.bc;
   private static final ImmutableList<jz> e = ImmutableList.of(
      new jz(0, 0, -1), new jz(-1, 0, 0), new jz(0, 0, 1), new jz(1, 0, 0), new jz(-1, 0, -1), new jz(1, 0, -1), new jz(-1, 0, 1), new jz(1, 0, 1)
   );
   private static final ImmutableList<jz> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jz::p).iterator())
      .addAll(e.stream().map(jz::q).iterator())
      .add(new jz(0, 1, 0))
      .build();

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bty.a;
      } else {
         return (bty)($$5 == btx.a && a($$4.b(btx.b)) && o($$1) ? bty.e : bty.f);
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$0.c(d) == 0) {
         return bty.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bty.a;
      } else {
         if (!$$1.C) {
            arp $$5 = (arp)$$3;
            if ($$5.V() != $$1.aj() || !$$2.equals($$5.T())) {
               $$5.a($$1.aj(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.wj, awm.e, 1.0F, 1.0F);
               return bty.b;
            }
         }

         return bty.c;
      }
   }

   private static boolean a(cys $$0) {
      return $$0.a(cyw.fL);
   }

   private static boolean o(dzo $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iu $$0, dip $$1) {
      evv $$2 = $$1.b_($$0);
      if (!$$2.a(axf.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            evv $$4 = $$1.b_($$0.e());
            return !$$4.a(axf.a);
         }
      }
   }

   private void d(dzo $$0, dip $$1, final iu $$2) {
      $$1.a($$2, false);
      boolean $$3 = ja.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axf.a);
      dij $$5 = new dij() {
         @Override
         public Optional<Float> a(dii $$0, dhv $$1, iu $$2x, dzo $$3, evv $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dlw.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fdw $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, dip.a.b);
   }

   public static boolean a(dip $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable bwa $$0, dip $$1, iu $$2, dzo $$3) {
      dzo $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(eeo.c, $$2, eeo.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.wh, awm.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awl.wg, awm.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lx.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   public static int a(dzo $$0, int $$1) {
      return azk.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return a($$0, 15);
   }

   public static Optional<fdw> a(bwj<?> $$0, dhz $$1, iu $$2) {
      Optional<fdw> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fdw> a(bwj<?> $$0, dhz $$1, iu $$2, boolean $$3) {
      iu.a $$4 = new iu.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jz $$5 = (jz)var5.next();
         $$4.g($$2).h($$5);
         fdw $$6 = ctk.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
