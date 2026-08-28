import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgk extends dfi implements dmy {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dgk::new)
   );
   protected static final exp b = dfw.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dtr c = dtq.r;
   public static final dtr d = dtq.y;
   public static final dtr e = dtq.C;
   public static final dtu f = dtq.R;
   private static final exp g = dfw.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(boolean $$0, int $$1, dsz.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ji.c));
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.c_($$3) instanceof dql $$8) {
         cuo $$9 = $$4.b($$5);
         Optional<cyz<cyk>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(avy.av);
               return bqs.a;
            }

            return bqs.b;
         }
      }

      return bqs.d;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if ($$0.c(c) && $$3 instanceof btl) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof dql) {
            bqm.a($$1, $$2, ((dql)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dcv $$1 = $$0.q();
      jd $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eoz.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1 == ji.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dta $$0) {
      return $$0.a(dfy.ij);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.dI, avp.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lm.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bsq $$0, dcv $$1, jd $$2, dta $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dcu)$$1, $$2, $$3.c(d), true);
         }
      }

      dqf $$5 = $$1.c_($$2);
      if ($$5 instanceof dql) {
         ((dql)$$5).d();
      }

      $$1.a($$0, dxw.c, $$2);
   }

   @Override
   public boolean a(dcv $$0, jd $$1, dta $$2, eoy $$3) {
      if (!$$2.c(dtq.C) && $$3.a() == eoz.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avo.kf, avp.e, 1.0F, 1.0F);
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
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      jd $$4 = $$2.a();
      if (!$$0.B && $$3.bR() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dtq.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dcu $$0, jd $$1, boolean $$2, boolean $$3) {
      ayv $$4 = $$0.E_();
      lq $$5 = $$2 ? lm.au : lm.at;
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
            lm.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dcu $$0, jd $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jd $$3 = $$1.c($$2);
         dta $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = exm.c(g, $$4.b($$0, $$1, exb.a()), exa.i);
         if ($$5) {
            dta $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dta $$0) {
      return $$0.b(c) && $$0.a(awd.aV) && $$0.c(c);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(e) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dql($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dqh.G, dql::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dqh.G, dql::a) : a($$2, dqh.G, dql::b);
      }
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   public static boolean h(dta $$0) {
      return $$0.a(awd.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
