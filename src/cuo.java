import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuo extends ctm implements daz {
   public static final MapCodec<cuo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, cuo::new)
   );
   protected static final eiy b = cua.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dgs c = dgr.r;
   public static final dgs d = dgr.y;
   public static final dgs e = dgr.C;
   public static final dgv f = dgr.R;
   private static final eiy g = cua.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cuo> a() {
      return a;
   }

   public cuo(boolean $$0, int $$1, dga.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, hx.c));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.c_($$2) instanceof ded $$7) {
         ckj $$8 = $$3.b($$4);
         Optional<cno<cna>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fT().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(aqn.av);
               return bib.a;
            }

            return bib.b;
         }
      }

      return bib.d;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if ($$0.c(c) && $$3 instanceof bkj && !cov.j((bkj)$$3)) {
         $$3.a($$1.ag().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         ddx $$5 = $$1.c_($$2);
         if ($$5 instanceof ded) {
            bhx.a($$1, $$2, ((ded)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      cra $$1 = $$0.q();
      ht $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ebf.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return $$1 == hx.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dgb $$0) {
      return $$0.a(cuc.ij);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqd.db, aqe.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(js.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bjt $$0, cra $$1, ht $$2, dgb $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cqz)$$1, $$2, $$3.c(d), true);
         }
      }

      ddx $$5 = $$1.c_($$2);
      if ($$5 instanceof ded) {
         ((ded)$$5).f();
      }

      $$1.a($$0, dkl.c, $$2);
   }

   @Override
   public boolean a(cra $$0, ht $$1, dgb $$2, ebe $$3) {
      if (!$$2.c(dgr.C) && $$3.a() == ebf.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, aqd.ja, aqe.e, 1.0F, 1.0F);
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
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.bM() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dgr.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cqz $$0, ht $$1, boolean $$2, boolean $$3) {
      ate $$4 = $$0.E_();
      jv $$5 = $$2 ? js.ao : js.an;
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

   public static boolean a(cqz $$0, ht $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ht $$3 = $$1.c($$2);
         dgb $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eiv.c(g, $$4.b($$0, $$1, eik.a()), eij.i);
         if ($$5) {
            dgb $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dgb $$0) {
      return $$0.b(c) && $$0.a(aqs.aU) && $$0.c(c);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(e) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new ded($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, ddz.G, ded::c) : null;
      } else {
         return $$1.c(c) ? a($$2, ddz.G, ded::a) : a($$2, ddz.G, ded::b);
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   public static boolean h(dgb $$0) {
      return $$0.a(aqs.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
