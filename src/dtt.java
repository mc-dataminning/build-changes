import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtt extends dne {
   public static final MapCodec<dtt> a = b(dtt::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final ecg d = ebw.bc;
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
   public MapCodec<dtt> a() {
      return a;
   }

   public dtt(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return but.a;
      } else {
         return (but)($$5 == bus.a && a($$4.b(bus.b)) && o($$1) ? but.e : but.f);
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$0.c(d) == 0) {
         return but.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return but.a;
      } else {
         if ($$3 instanceof arv $$5) {
            arv.a $$6 = $$5.T();
            arv.a $$7 = new arv.a($$1.aj(), $$2, 0.0F, false);
            if ($$6 == null || !$$6.a($$7)) {
               $$5.a($$7, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awr.wn, aws.e, 1.0F, 1.0F);
               return but.b;
            }
         }

         return but.c;
      }
   }

   private static boolean a(daa $$0) {
      return $$0.a(dae.fQ);
   }

   private static boolean o(ebg $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iw $$0, djz $$1) {
      exq $$2 = $$1.b_($$0);
      if (!$$2.a(axl.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            exq $$4 = $$1.b_($$0.e());
            return !$$4.a(axl.a);
         }
      }
   }

   private void d(ebg $$0, djz $$1, final iw $$2) {
      $$1.a($$2, false);
      boolean $$3 = jc.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axl.a);
      djt $$5 = new djt() {
         @Override
         public Optional<Float> a(djs $$0, djd $$1, iw $$2x, ebg $$3, exq $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dng.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ffs $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, djz.a.b);
   }

   public static boolean a(djz $$0) {
      return $$0.F_().m();
   }

   public static void a(@Nullable bwv $$0, djz $$1, iw $$2, ebg $$3) {
      ebg $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(egg.c, $$2, egg.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awr.wl, aws.e, 1.0F, 1.0F);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awr.wk, aws.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lz.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   public static int a(ebg $$0, int $$1) {
      return azq.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return a($$0, 15);
   }

   public static Optional<ffs> a(bxe<?> $$0, djh $$1, iw $$2) {
      Optional<ffs> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ffs> a(bxe<?> $$0, djh $$1, iw $$2, boolean $$3) {
      iw.a $$4 = new iw.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kb $$5 = (kb)var5.next();
         $$4.g($$2).h($$5);
         ffs $$6 = cus.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
