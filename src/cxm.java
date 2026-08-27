import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxm extends cwk implements ddy {
   public static final MapCodec<cxm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, cxm::new)
   );
   protected static final emv b = cwy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dkg c = dkf.r;
   public static final dkg d = dkf.y;
   public static final dkg e = dkf.C;
   public static final dkj f = dkf.R;
   private static final emv g = cwy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cxm> a() {
      return a;
   }

   public cxm(boolean $$0, int $$1, djo.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ic.c));
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.c_($$3) instanceof dhj $$8) {
         cng $$9 = $$4.b($$5);
         Optional<cqm<cpy>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fT().d ? $$9.p() : $$9, $$10.get().b().d())) {
               $$4.a(asd.av);
               return bke.a;
            }

            return bke.b;
         }
      }

      return bke.d;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if ($$0.c(c) && $$3 instanceof bmo && !crt.j((bmo)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dhj) {
            bjy.a($$1, $$2, ((dhj)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      cty $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == efa.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$1 == ic.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(djp $$0) {
      return $$0.a(cxa.ij);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, art.dz, aru.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jx.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable blw $$0, cty $$1, hx $$2, djp $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((ctx)$$1, $$2, $$3.c(d), true);
         }
      }

      dhd $$5 = $$1.c_($$2);
      if ($$5 instanceof dhj) {
         ((dhj)$$5).f();
      }

      $$1.a($$0, dnz.c, $$2);
   }

   @Override
   public boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      if (!$$2.c(dkf.C) && $$3.a() == efa.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, art.jQ, aru.e, 1.0F, 1.0F);
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
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dkf.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(ctx $$0, hx $$1, boolean $$2, boolean $$3) {
      auw $$4 = $$0.F_();
      ka $$5 = $$2 ? jx.ar : jx.aq;
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
            jx.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(ctx $$0, hx $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hx $$3 = $$1.c($$2);
         djp $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ems.c(g, $$4.b($$0, $$1, emh.a()), emg.i);
         if ($$5) {
            djp $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(djp $$0) {
      return $$0.b(c) && $$0.a(asi.aU) && $$0.c(c);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(e) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dhf.G, dhj::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dhf.G, dhj::a) : a($$2, dhf.G, dhj::b);
      }
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   public static boolean h(djp $$0) {
      return $$0.a(asi.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
