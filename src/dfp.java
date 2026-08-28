import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfp extends den implements dmc {
   public static final MapCodec<dfp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfp::new)
   );
   protected static final ewm b = dfb.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dsv c = dsu.r;
   public static final dsv d = dsu.y;
   public static final dsv e = dsu.C;
   public static final dsy f = dsu.R;
   private static final ewm g = dfb.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   public dfp(boolean $$0, int $$1, dsd.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, je.c));
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$2.c_($$3) instanceof dpp $$8) {
         cur $$9 = $$4.b($$5);
         Optional<cyz<cyl>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(awk.av);
               return bqy.a;
            }

            return bqy.b;
         }
      }

      return bqy.d;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if ($$0.c(c) && $$3 instanceof btr && !dad.j((btr)$$3)) {
         $$3.a($$1.aj().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dpp) {
            bqs.a($$1, $$2, ((dpp)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dcb $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eny.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$1 == je.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dse $$0) {
      return $$0.a(dfd.ij);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.dI, awb.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(li.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bsw $$0, dcb $$1, iz $$2, dse $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dca)$$1, $$2, $$3.c(d), true);
         }
      }

      dpj $$5 = $$1.c_($$2);
      if ($$5 instanceof dpp) {
         ((dpp)$$5).d();
      }

      $$1.a($$0, dwx.c, $$2);
   }

   @Override
   public boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      if (!$$2.c(dsu.C) && $$3.a() == eny.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, awa.kf, awb.e, 1.0F, 1.0F);
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
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dsu.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dca $$0, iz $$1, boolean $$2, boolean $$3) {
      azh $$4 = $$0.E_();
      lm $$5 = $$2 ? li.au : li.at;
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
            li.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dca $$0, iz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iz $$3 = $$1.c($$2);
         dse $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewj.c(g, $$4.b($$0, $$1, evy.a()), evx.i);
         if ($$5) {
            dse $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dse $$0) {
      return $$0.b(c) && $$0.a(awp.aV) && $$0.c(c);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(e) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dpl.G, dpp::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dpl.G, dpp::a) : a($$2, dpl.G, dpp::b);
      }
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   public static boolean h(dse $$0) {
      return $$0.a(awp.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
