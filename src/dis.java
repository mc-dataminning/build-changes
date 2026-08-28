import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dis extends dhq implements dpf {
   public static final MapCodec<dis> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dis::new)
   );
   protected static final fah b = die.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dwa c = dvz.r;
   public static final dwa d = dvz.y;
   public static final dwa e = dvz.C;
   public static final dwd f = dvz.R;
   private static final fah g = die.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(boolean $$0, int $$1, dvi.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jm.c));
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$2.c_($$3) instanceof dss $$8) {
         cwb $$9 = $$4.b($$5);
         Optional<dar<dab>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.C && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(awv.av);
               return bsd.b;
            }

            return bsd.c;
         }
      }

      return bsd.f;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$0.c(c) && $$3 instanceof bva) {
         $$3.a($$1.ai().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsm $$5 = $$1.c_($$2);
         if ($$5 instanceof dss) {
            brz.a($$1, $$2, ((dss)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dfc $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == erl.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1 == jm.a ? $$0.b(d, Boolean.valueOf(this.o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean o(dvj $$0) {
      return $$0.a(dig.ij);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.dJ, awm.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lr.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bue $$0, dfc $$1, jh $$2, dvj $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dfb)$$1, $$2, $$3.c(d), true);
         }
      }

      dsm $$5 = $$1.c_($$2);
      if ($$5 instanceof dss) {
         ((dss)$$5).d();
      }

      $$1.a($$0, eag.c, $$2);
   }

   @Override
   public boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      if (!$$2.c(dvz.C) && $$3.a() == erl.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, awl.kg, awm.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.b(e, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      jh $$4 = $$2.b();
      if (!$$0.C && $$3.bZ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dvz.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dfb $$0, jh $$1, boolean $$2, boolean $$3) {
      azs $$4 = $$0.E_();
      lv $$5 = $$2 ? lr.au : lr.at;
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
            lr.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dfb $$0, jh $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jh $$3 = $$1.c($$2);
         dvj $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fae.c(g, $$4.b($$0, $$1, ezs.a()), ezr.i);
         if ($$5) {
            dvj $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dvj $$0) {
      return $$0.b(c) && $$0.a(axa.aW) && $$0.c(c);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(e) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dss($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      if ($$0.C) {
         return $$1.c(c) ? a($$2, dso.G, dss::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dso.G, dss::a) : a($$2, dso.G, dss::b);
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   public static boolean i(dvj $$0) {
      return $$0.a(axa.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
