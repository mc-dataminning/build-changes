import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dem extends ddk implements dkz {
   public static final MapCodec<dem> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dem::new)
   );
   protected static final evd b = ddy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final drs c = drr.r;
   public static final drs d = drr.y;
   public static final drs e = drr.C;
   public static final drv f = drr.R;
   private static final evd g = ddy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public dem(boolean $$0, int $$1, dra.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, it.c));
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.c_($$3) instanceof dom $$8) {
         cto $$9 = $$4.b($$5);
         Optional<cxw<cxi>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(avr.av);
               return bpw.a;
            }

            return bpw.b;
         }
      }

      return bpw.d;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if ($$0.c(c) && $$3 instanceof bso && !cza.j((bso)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof dom) {
            bpq.a($$1, $$2, ((dom)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      day $$1 = $$0.q();
      io $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == emv.c;
      return this.n().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$1 == it.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(drb $$0) {
      return $$0.a(dea.ij);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.dI, avi.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ky.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bru $$0, day $$1, io $$2, drb $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dax)$$1, $$2, $$3.c(d), true);
         }
      }

      dog $$5 = $$1.c_($$2);
      if ($$5 instanceof dom) {
         ((dom)$$5).d();
      }

      $$1.a($$0, dvu.c, $$2);
   }

   @Override
   public boolean a(day $$0, io $$1, drb $$2, emu $$3) {
      if (!$$2.c(drr.C) && $$3.a() == emv.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avh.kf, avi.e, 1.0F, 1.0F);
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
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      io $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(drr.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dax $$0, io $$1, boolean $$2, boolean $$3) {
      ayk $$4 = $$0.E_();
      lb $$5 = $$2 ? ky.au : ky.at;
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
            ky.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dax $$0, io $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         io $$3 = $$1.c($$2);
         drb $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eva.c(g, $$4.b($$0, $$1, eup.a()), euo.i);
         if ($$5) {
            drb $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(drb $$0) {
      return $$0.b(c) && $$0.a(avw.aV) && $$0.c(c);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(e) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dom($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, doi.G, dom::c) : null;
      } else {
         return $$1.c(c) ? a($$2, doi.G, dom::a) : a($$2, doi.G, dom::b);
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   public static boolean h(drb $$0) {
      return $$0.a(avw.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
