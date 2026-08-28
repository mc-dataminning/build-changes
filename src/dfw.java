import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfw extends deu implements dmj {
   public static final MapCodec<dfw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfw::new)
   );
   protected static final exa b = dfi.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dtc c = dtb.r;
   public static final dtc d = dtb.y;
   public static final dtc e = dtb.C;
   public static final dtf f = dtb.R;
   private static final exa g = dfi.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   public dfw(boolean $$0, int $$1, dsk.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, jf.c));
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.c_($$3) instanceof dpw $$8) {
         cud $$9 = $$4.b($$5);
         Optional<cyl<cxw>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(avr.av);
               return bqj.a;
            }

            return bqj.b;
         }
      }

      return bqj.d;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if ($$0.c(c) && $$3 instanceof btc) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dpw) {
            bqd.a($$1, $$2, ((dpw)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dch $$1 = $$0.q();
      ja $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eok.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$1 == jf.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dsl $$0) {
      return $$0.a(dfk.ij);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
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

   public static void a(@Nullable bsh $$0, dch $$1, ja $$2, dsl $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dcg)$$1, $$2, $$3.c(d), true);
         }
      }

      dpq $$5 = $$1.c_($$2);
      if ($$5 instanceof dpw) {
         ((dpw)$$5).d();
      }

      $$1.a($$0, dxh.c, $$2);
   }

   @Override
   public boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      if (!$$2.c(dtb.C) && $$3.a() == eok.c) {
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
   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
      ja $$4 = $$2.a();
      if (!$$0.B && $$3.bS() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dtb.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dcg $$0, ja $$1, boolean $$2, boolean $$3) {
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

   public static boolean a(dcg $$0, ja $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ja $$3 = $$1.c($$2);
         dsl $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewx.c(g, $$4.b($$0, $$1, ewm.a()), ewl.i);
         if ($$5) {
            dsl $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dsl $$0) {
      return $$0.b(c) && $$0.a(avw.aV) && $$0.c(c);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(e) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dps.G, dpw::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dps.G, dpw::a) : a($$2, dps.G, dpw::b);
      }
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   public static boolean h(dsl $$0) {
      return $$0.a(avw.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
