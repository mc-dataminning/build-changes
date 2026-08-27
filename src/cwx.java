import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwx extends cvv implements ddj {
   public static final MapCodec<cwx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, cwx::new)
   );
   protected static final emf b = cwj.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final djr c = djq.r;
   public static final djr d = djq.y;
   public static final djr e = djq.C;
   public static final dju f = djq.R;
   private static final emf g = cwj.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cwx> a() {
      return a;
   }

   public cwx(boolean $$0, int $$1, diz.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ic.c));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.c_($$2) instanceof dgu $$7) {
         cmr $$8 = $$3.b($$4);
         Optional<cpx<cpj>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fT().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(arw.av);
               return bjv.a;
            }

            return bjv.b;
         }
      }

      return bjv.d;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if ($$0.c(c) && $$3 instanceof bmf && !cre.j((bmf)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgo $$5 = $$1.c_($$2);
         if ($$5 instanceof dgu) {
            bjr.a($$1, $$2, ((dgu)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      ctj $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eel.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1 == ic.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dja $$0) {
      return $$0.a(cwl.ij);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arm.dk, arn.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jx.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable blp $$0, ctj $$1, hx $$2, dja $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cti)$$1, $$2, $$3.c(d), true);
         }
      }

      dgo $$5 = $$1.c_($$2);
      if ($$5 instanceof dgu) {
         ((dgu)$$5).f();
      }

      $$1.a($$0, dnk.c, $$2);
   }

   @Override
   public boolean a(ctj $$0, hx $$1, dja $$2, eek $$3) {
      if (!$$2.c(djq.C) && $$3.a() == eel.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, arm.jB, arn.e, 1.0F, 1.0F);
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
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(djq.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cti $$0, hx $$1, boolean $$2, boolean $$3) {
      aup $$4 = $$0.F_();
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

   public static boolean a(cti $$0, hx $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hx $$3 = $$1.c($$2);
         dja $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = emc.c(g, $$4.b($$0, $$1, elr.a()), elq.i);
         if ($$5) {
            dja $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dja $$0) {
      return $$0.b(c) && $$0.a(asb.aU) && $$0.c(c);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(e) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dgq.G, dgu::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dgq.G, dgu::a) : a($$2, dgq.G, dgu::b);
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   public static boolean h(dja $$0) {
      return $$0.a(asb.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
