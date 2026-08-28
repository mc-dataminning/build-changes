import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dks extends djp implements drj {
   public static final MapCodec<dks> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dks::new)
   );
   protected static final fcl b = dkd.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dyf c = dye.v;
   public static final dyf d = dye.E;
   public static final dyf e = dye.J;
   public static final dyl<jm> f = dye.U;
   private static final fcl g = dkd.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(boolean $$0, int $$1, dxn.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jm.c));
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$2.c_($$3) instanceof duw $$8) {
         cxg $$9 = $$4.b($$5);
         if ($$2.Q().a(dce.h).a($$9)) {
            if ($$2 instanceof arx $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(axf.av);
               return bta.b;
            }

            return bta.c;
         }
      }

      return bta.f;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$0.c(c) && $$3 instanceof bvx) {
         $$3.a($$1.ak().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duq $$5 = $$1.c_($$2);
         if ($$5 instanceof duw) {
            bsw.a($$1, $$2, ((duw)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == etr.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return $$4 == jm.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dxo $$0) {
      return $$0.a(dkf.iH);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awv.dK, aww.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ls.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bvb $$0, dha $$1, jh $$2, dxo $$3) {
      if ($$1.B_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dgz)$$1, $$2, $$3.c(d), true);
         }
      }

      duq $$5 = $$1.c_($$2);
      if ($$5 instanceof duw) {
         ((duw)$$5).d();
      }

      $$1.a($$0, eck.c, $$2);
   }

   @Override
   public boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      if (!$$2.c(dye.J) && $$3.a() == etr.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.B_()) {
               $$0.a(null, $$1, awv.kF, aww.e, 1.0F, 1.0F);
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
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof arx $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dye.v, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dgz $$0, jh $$1, boolean $$2, boolean $$3) {
      bac $$4 = $$0.H_();
      lw $$5 = $$2 ? ls.aw : ls.av;
      $$0.a(
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
            ls.ag,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dgz $$0, jh $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jh $$3 = $$1.c($$2);
         dxo $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fci.c(g, $$4.b($$0, $$1, fbw.a()), fbv.i);
         if ($$5) {
            dxo $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dxo $$0) {
      return $$0.b(c) && $$0.a(axk.aX) && $$0.c(c);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(e) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new duw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      if ($$0 instanceof arx $$3) {
         if ($$1.c(c)) {
            dcc.a<dco, dbg> $$4 = dcc.a(dcg.e);
            return a($$2, dus.H, ($$2x, $$3x, $$4x, $$5) -> duw.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dus.H, duw::a);
         }
      } else {
         return $$1.c(c) ? a($$2, dus.H, duw::b) : null;
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   public static boolean i(dxo $$0) {
      return $$0.a(axk.aX, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
