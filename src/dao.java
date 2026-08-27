import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dao extends czm implements dha {
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dao::new)
   );
   protected static final eqk b = daa.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dnq c = dnp.r;
   public static final dnq d = dnp.y;
   public static final dnq e = dnp.C;
   public static final dnt f = dnp.R;
   private static final eqk g = daa.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   public dao(boolean $$0, int $$1, dmy.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ih.c));
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$2.c_($$3) instanceof dkm $$8) {
         cqk $$9 = $$4.b($$5);
         Optional<ctp<ctb>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fM() ? $$9.q() : $$9, $$10.get().b().d())) {
               $$4.a(aui.av);
               return bne.a;
            }

            return bne.b;
         }
      }

      return bne.d;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if ($$0.c(c) && $$3 instanceof bpo && !cuv.j((bpo)$$3)) {
         $$3.a($$1.ah().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof dkm) {
            bmy.a($$1, $$2, ((dkm)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      cxa $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eio.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1 == ih.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dmz $$0) {
      return $$0.a(dac.ij);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.dD, atz.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(kc.W, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bow $$0, cxa $$1, ib $$2, dmz $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cwz)$$1, $$2, $$3.c(d), true);
         }
      }

      dkg $$5 = $$1.c_($$2);
      if ($$5 instanceof dkm) {
         ((dkm)$$5).d();
      }

      $$1.a($$0, drn.c, $$2);
   }

   @Override
   public boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      if (!$$2.c(dnp.C) && $$3.a() == eio.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, aty.jU, atz.e, 1.0F, 1.0F);
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
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dnp.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cwz $$0, ib $$1, boolean $$2, boolean $$3) {
      axd $$4 = $$0.E_();
      kf $$5 = $$2 ? kc.as : kc.ar;
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
            kc.ac,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cwz $$0, ib $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ib $$3 = $$1.c($$2);
         dmz $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eqh.c(g, $$4.b($$0, $$1, epw.a()), epv.i);
         if ($$5) {
            dmz $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dmz $$0) {
      return $$0.b(c) && $$0.a(aun.aV) && $$0.c(c);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(e) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dki.G, dkm::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dki.G, dkm::a) : a($$2, dki.G, dkm::b);
      }
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   public static boolean h(dmz $$0) {
      return $$0.a(aun.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
