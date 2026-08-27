import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvt extends cur implements dcf {
   public static final MapCodec<cvt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, cvt::new)
   );
   protected static final eks b = cvf.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final die c = did.r;
   public static final die d = did.y;
   public static final die e = did.C;
   public static final dih f = did.R;
   private static final eks g = cvf.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cvt> a() {
      return a;
   }

   public cvt(boolean $$0, int $$1, dhm.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ib.c));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.c_($$2) instanceof dfo $$7) {
         clo $$8 = $$3.b($$4);
         Optional<cov<cof>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fU().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(arf.av);
               return bjb.a;
            }

            return bjb.b;
         }
      }

      return bjb.d;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if ($$0.c(c) && $$3 instanceof bll && !cqb.j((bll)$$3)) {
         $$3.a($$1.ah().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfi $$5 = $$1.c_($$2);
         if ($$5 instanceof dfo) {
            bix.a($$1, $$2, ((dfo)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      csg $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ecy.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1 == ib.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dhn $$0) {
      return $$0.a(cvh.ij);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqv.db, aqw.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jw.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bkv $$0, csg $$1, hx $$2, dhn $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((csf)$$1, $$2, $$3.c(d), true);
         }
      }

      dfi $$5 = $$1.c_($$2);
      if ($$5 instanceof dfo) {
         ((dfo)$$5).f();
      }

      $$1.a($$0, dlx.c, $$2);
   }

   @Override
   public boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      if (!$$2.c(did.C) && $$3.a() == ecy.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, aqv.js, aqw.e, 1.0F, 1.0F);
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
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(did.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(csf $$0, hx $$1, boolean $$2, boolean $$3) {
      atw $$4 = $$0.F_();
      jz $$5 = $$2 ? jw.ap : jw.ao;
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
            jw.Z,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(csf $$0, hx $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hx $$3 = $$1.c($$2);
         dhn $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ekp.c(g, $$4.b($$0, $$1, eke.a()), ekd.i);
         if ($$5) {
            dhn $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dhn $$0) {
      return $$0.b(c) && $$0.a(ark.aU) && $$0.c(c);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(e) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dfk.G, dfo::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dfk.G, dfo::a) : a($$2, dfk.G, dfo::b);
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   public static boolean h(dhn $$0) {
      return $$0.a(ark.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
