import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class czt extends cyr implements dgf {
   public static final MapCodec<czt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, czt::new)
   );
   protected static final epo b = czf.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dmv c = dmu.r;
   public static final dmv d = dmu.y;
   public static final dmv e = dmu.C;
   public static final dmy f = dmu.R;
   private static final epo g = czf.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<czt> a() {
      return a;
   }

   public czt(boolean $$0, int $$1, dmd.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ih.c));
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.c_($$3) instanceof djr $$8) {
         cpq $$9 = $$4.b($$5);
         Optional<csu<csg>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fW().d ? $$9.q() : $$9, $$10.get().b().d())) {
               $$4.a(atz.av);
               return bmn.a;
            }

            return bmn.b;
         }
      }

      return bmn.d;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if ($$0.c(c) && $$3 instanceof box && !cua.j((box)$$3)) {
         $$3.a($$1.ah().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof djr) {
            bmh.a($$1, $$2, ((djr)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      cwf $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ehs.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return $$1 == ih.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dme $$0) {
      return $$0.a(czh.ij);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atp.dA, atq.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(kb.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bof $$0, cwf $$1, ib $$2, dme $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cwe)$$1, $$2, $$3.c(d), true);
         }
      }

      djl $$5 = $$1.c_($$2);
      if ($$5 instanceof djr) {
         ((djr)$$5).d();
      }

      $$1.a($$0, dqr.c, $$2);
   }

   @Override
   public boolean a(cwf $$0, ib $$1, dme $$2, ehr $$3) {
      if (!$$2.c(dmu.C) && $$3.a() == ehs.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, atp.jR, atq.e, 1.0F, 1.0F);
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
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.bK() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dmu.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cwe $$0, ib $$1, boolean $$2, boolean $$3) {
      awt $$4 = $$0.F_();
      ke $$5 = $$2 ? kb.ar : kb.aq;
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
            kb.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cwe $$0, ib $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ib $$3 = $$1.c($$2);
         dme $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = epl.c(g, $$4.b($$0, $$1, epa.a()), eoz.i);
         if ($$5) {
            dme $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dme $$0) {
      return $$0.b(c) && $$0.a(aue.aU) && $$0.c(c);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(e) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, djn.G, djr::c) : null;
      } else {
         return $$1.c(c) ? a($$2, djn.G, djr::a) : a($$2, djn.G, djr::b);
      }
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   public static boolean h(dme $$0) {
      return $$0.a(aue.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
