import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class czg extends cye implements dfs {
   public static final MapCodec<czg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, czg::new)
   );
   protected static final eos b = cys.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dma c = dlz.r;
   public static final dma d = dlz.y;
   public static final dma e = dlz.C;
   public static final dmd f = dlz.R;
   private static final eos g = cys.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   public czg(boolean $$0, int $$1, dli.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ie.c));
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.c_($$3) instanceof djd $$8) {
         cpd $$9 = $$4.b($$5);
         Optional<csh<crt>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fU().d ? $$9.q() : $$9, $$10.get().b().d())) {
               $$4.a(atv.av);
               return bly.a;
            }

            return bly.b;
         }
      }

      return bly.d;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if ($$0.c(c) && $$3 instanceof boi && !ctn.j((boi)$$3)) {
         $$3.a($$1.ah().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof djd) {
            bls.a($$1, $$2, ((djd)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      cvs $$1 = $$0.q();
      hz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == egx.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return $$1 == ie.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dlj $$0) {
      return $$0.a(cyu.ij);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atl.dA, atm.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jz.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bnq $$0, cvs $$1, hz $$2, dlj $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cvr)$$1, $$2, $$3.c(d), true);
         }
      }

      dix $$5 = $$1.c_($$2);
      if ($$5 instanceof djd) {
         ((djd)$$5).f();
      }

      $$1.a($$0, dpw.c, $$2);
   }

   @Override
   public boolean a(cvs $$0, hz $$1, dlj $$2, egw $$3) {
      if (!$$2.c(dlz.C) && $$3.a() == egx.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, atl.jR, atm.e, 1.0F, 1.0F);
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
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      hz $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dlz.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cvr $$0, hz $$1, boolean $$2, boolean $$3) {
      awp $$4 = $$0.F_();
      kc $$5 = $$2 ? jz.ar : jz.aq;
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
            jz.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cvr $$0, hz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hz $$3 = $$1.c($$2);
         dlj $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eop.c(g, $$4.b($$0, $$1, eoe.a()), eod.i);
         if ($$5) {
            dlj $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dlj $$0) {
      return $$0.b(c) && $$0.a(aua.aU) && $$0.c(c);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(e) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, diz.G, djd::c) : null;
      } else {
         return $$1.c(c) ? a($$2, diz.G, djd::a) : a($$2, diz.G, djd::b);
      }
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   public static boolean h(dlj $$0) {
      return $$0.a(aua.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
