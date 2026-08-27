import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcm extends dbk implements diy {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dcm::new)
   );
   protected static final est b = dby.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dpq c = dpp.r;
   public static final dpq d = dpp.y;
   public static final dpq e = dpp.C;
   public static final dpt f = dpp.R;
   private static final est g = dby.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public dcm(boolean $$0, int $$1, doy.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ih.c));
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.c_($$3) instanceof dml $$8) {
         crj $$9 = $$4.b($$5);
         Optional<cvl<cux>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fM() ? $$9.r() : $$9, $$10.get().b().d())) {
               $$4.a(auw.av);
               return boc.a;
            }

            return boc.b;
         }
      }

      return boc.d;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if ($$0.c(c) && $$3 instanceof bqo && !cwr.j((bqo)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dml) {
            bnw.a($$1, $$2, ((dml)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      cyy $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ekt.c;
      return this.n().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1 == ih.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(doz $$0) {
      return $$0.a(dca.ij);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aum.dI, aun.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(kl.W, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bpv $$0, cyy $$1, ib $$2, doz $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cyx)$$1, $$2, $$3.c(d), true);
         }
      }

      dmf $$5 = $$1.c_($$2);
      if ($$5 instanceof dml) {
         ((dml)$$5).d();
      }

      $$1.a($$0, dts.c, $$2);
   }

   @Override
   public boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      if (!$$2.c(dpp.C) && $$3.a() == ekt.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, aum.ka, aun.e, 1.0F, 1.0F);
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
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dpp.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cyx $$0, ib $$1, boolean $$2, boolean $$3) {
      axr $$4 = $$0.E_();
      ko $$5 = $$2 ? kl.as : kl.ar;
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
            kl.ac,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cyx $$0, ib $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ib $$3 = $$1.c($$2);
         doz $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = esq.c(g, $$4.b($$0, $$1, esf.a()), ese.i);
         if ($$5) {
            doz $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(doz $$0) {
      return $$0.b(c) && $$0.a(avc.aV) && $$0.c(c);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(e) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dml($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dmh.G, dml::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dmh.G, dml::a) : a($$2, dmh.G, dml::b);
      }
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   public static boolean h(doz $$0) {
      return $$0.a(avc.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
