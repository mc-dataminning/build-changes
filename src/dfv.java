import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfv extends det implements dmi {
   public static final MapCodec<dfv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfv::new)
   );
   protected static final ewy b = dfh.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dtb c = dta.r;
   public static final dtb d = dta.y;
   public static final dtb e = dta.C;
   public static final dte f = dta.R;
   private static final ewy g = dfh.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(boolean $$0, int $$1, dsj.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, jf.c));
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.c_($$3) instanceof dpv $$8) {
         cuc $$9 = $$4.b($$5);
         Optional<cyk<cxv>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(avr.av);
               return bqi.a;
            }

            return bqi.b;
         }
      }

      return bqi.d;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if ($$0.c(c) && $$3 instanceof btb) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dpv) {
            bqc.a($$1, $$2, ((dpv)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eoi.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$1 == jf.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dsk $$0) {
      return $$0.a(dfj.ij);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.dI, avi.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lj.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bsg $$0, dcg $$1, ja $$2, dsk $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dcf)$$1, $$2, $$3.c(d), true);
         }
      }

      dpp $$5 = $$1.c_($$2);
      if ($$5 instanceof dpv) {
         ((dpv)$$5).d();
      }

      $$1.a($$0, dxg.c, $$2);
   }

   @Override
   public boolean a(dcg $$0, ja $$1, dsk $$2, eoh $$3) {
      if (!$$2.c(dta.C) && $$3.a() == eoi.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avh.kf, avi.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.a(e, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      ja $$4 = $$2.a();
      if (!$$0.B && $$3.bR() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dta.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dcf $$0, ja $$1, boolean $$2, boolean $$3) {
      ayo $$4 = $$0.E_();
      ln $$5 = $$2 ? lj.au : lj.at;
      $$0.b(
         $$5,
         true,
         (double)$$1.u() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         (double)$$1.v() + $$4.j() + $$4.j(),
         (double)$$1.w() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if ($$3) {
         $$0.a(
            lj.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dcf $$0, ja $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ja $$3 = $$1.c($$2);
         dsk $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewv.c(g, $$4.b($$0, $$1, ewk.a()), ewj.i);
         if ($$5) {
            dsk $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dsk $$0) {
      return $$0.b(c) && $$0.a(avw.aV) && $$0.c(c);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(e) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dpr.G, dpv::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dpr.G, dpv::a) : a($$2, dpr.G, dpv::b);
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   public static boolean h(dsk $$0) {
      return $$0.a(avw.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
