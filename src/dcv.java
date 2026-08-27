import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcv extends dbt implements djh {
   public static final MapCodec<dcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dcv::new)
   );
   protected static final etc b = dch.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dpz c = dpy.r;
   public static final dpz d = dpy.y;
   public static final dpz e = dpy.C;
   public static final dqc f = dpy.R;
   private static final etc g = dch.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   public dcv(boolean $$0, int $$1, dph.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ij.c));
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.c_($$3) instanceof dmu $$8) {
         crs $$9 = $$4.b($$5);
         Optional<cvu<cvg>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fM() ? $$9.r() : $$9, $$10.get().b().d())) {
               $$4.a(auz.av);
               return boh.a;
            }

            return boh.b;
         }
      }

      return boh.d;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if ($$0.c(c) && $$3 instanceof bqt && !cxa.j((bqt)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dmu) {
            bob.a($$1, $$2, ((dmu)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      czh $$1 = $$0.q();
      id $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == elc.c;
      return this.n().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1 == ij.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dpi $$0) {
      return $$0.a(dcj.ij);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auo.dI, aup.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(kn.W, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bqa $$0, czh $$1, id $$2, dpi $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((czg)$$1, $$2, $$3.c(d), true);
         }
      }

      dmo $$5 = $$1.c_($$2);
      if ($$5 instanceof dmu) {
         ((dmu)$$5).d();
      }

      $$1.a($$0, dub.c, $$2);
   }

   @Override
   public boolean a(czh $$0, id $$1, dpi $$2, elb $$3) {
      if (!$$2.c(dpy.C) && $$3.a() == elc.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, auo.ka, aup.e, 1.0F, 1.0F);
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
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      id $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dpy.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(czg $$0, id $$1, boolean $$2, boolean $$3) {
      axt $$4 = $$0.E_();
      kq $$5 = $$2 ? kn.as : kn.ar;
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
            kn.ac,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(czg $$0, id $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         id $$3 = $$1.c($$2);
         dpi $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = esz.c(g, $$4.b($$0, $$1, eso.a()), esn.i);
         if ($$5) {
            dpi $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dpi $$0) {
      return $$0.b(c) && $$0.a(ave.aV) && $$0.c(c);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(e) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dmq.G, dmu::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dmq.G, dmu::a) : a($$2, dmq.G, dmu::b);
      }
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   public static boolean h(dpi $$0) {
      return $$0.a(ave.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
