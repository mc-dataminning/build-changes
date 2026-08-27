import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvo extends cum implements dca {
   public static final MapCodec<cvo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, cvo::new)
   );
   protected static final ekn b = cva.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dhz c = dhy.r;
   public static final dhz d = dhy.y;
   public static final dhz e = dhy.C;
   public static final dic f = dhy.R;
   private static final ekn g = cva.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cvo> a() {
      return a;
   }

   public cvo(boolean $$0, int $$1, dhh.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, hx.c));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.c_($$2) instanceof dfj $$7) {
         clj $$8 = $$3.b($$4);
         Optional<coq<coa>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fU().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(arb.av);
               return bix.a;
            }

            return bix.b;
         }
      }

      return bix.d;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if ($$0.c(c) && $$3 instanceof blg && !cpw.j((blg)$$3)) {
         $$3.a($$1.ah().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfd $$5 = $$1.c_($$2);
         if ($$5 instanceof dfj) {
            bit.a($$1, $$2, ((dfj)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      csb $$1 = $$0.q();
      ht $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ect.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1 == hx.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dhi $$0) {
      return $$0.a(cvc.ij);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqr.db, aqs.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(js.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bkq $$0, csb $$1, ht $$2, dhi $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((csa)$$1, $$2, $$3.c(d), true);
         }
      }

      dfd $$5 = $$1.c_($$2);
      if ($$5 instanceof dfj) {
         ((dfj)$$5).f();
      }

      $$1.a($$0, dls.c, $$2);
   }

   @Override
   public boolean a(csb $$0, ht $$1, dhi $$2, ecs $$3) {
      if (!$$2.c(dhy.C) && $$3.a() == ect.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, aqr.js, aqs.e, 1.0F, 1.0F);
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
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dhy.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(csa $$0, ht $$1, boolean $$2, boolean $$3) {
      ats $$4 = $$0.E_();
      jv $$5 = $$2 ? js.ap : js.ao;
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
            js.Z,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(csa $$0, ht $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ht $$3 = $$1.c($$2);
         dhi $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ekk.c(g, $$4.b($$0, $$1, ejz.a()), ejy.i);
         if ($$5) {
            dhi $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dhi $$0) {
      return $$0.b(c) && $$0.a(arg.aU) && $$0.c(c);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(e) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dff.G, dfj::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dff.G, dfj::a) : a($$2, dff.G, dfj::b);
      }
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   public static boolean h(dhi $$0) {
      return $$0.a(arg.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
