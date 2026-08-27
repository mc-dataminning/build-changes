import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class daq extends czo implements dhc {
   public static final MapCodec<daq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, daq::new)
   );
   protected static final eqm b = dac.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dns c = dnr.r;
   public static final dns d = dnr.y;
   public static final dns e = dnr.C;
   public static final dnv f = dnr.R;
   private static final eqm g = dac.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public daq(boolean $$0, int $$1, dna.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ih.c));
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.c_($$3) instanceof dko $$8) {
         cqm $$9 = $$4.b($$5);
         Optional<ctr<ctd>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fM() ? $$9.q() : $$9, $$10.get().b().d())) {
               $$4.a(aui.av);
               return bnf.a;
            }

            return bnf.b;
         }
      }

      return bnf.d;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if ($$0.c(c) && $$3 instanceof bpp && !cux.j((bpp)$$3)) {
         $$3.a($$1.ah().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dko) {
            bmz.a($$1, $$2, ((dko)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      cxc $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eiq.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1 == ih.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dnb $$0) {
      return $$0.a(dae.ij);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.dH, atz.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(kc.W, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable box $$0, cxc $$1, ib $$2, dnb $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cxb)$$1, $$2, $$3.c(d), true);
         }
      }

      dki $$5 = $$1.c_($$2);
      if ($$5 instanceof dko) {
         ((dko)$$5).d();
      }

      $$1.a($$0, drp.c, $$2);
   }

   @Override
   public boolean a(cxc $$0, ib $$1, dnb $$2, eip $$3) {
      if (!$$2.c(dnr.C) && $$3.a() == eiq.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, aty.jY, atz.e, 1.0F, 1.0F);
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
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dnr.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cxb $$0, ib $$1, boolean $$2, boolean $$3) {
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

   public static boolean a(cxb $$0, ib $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ib $$3 = $$1.c($$2);
         dnb $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eqj.c(g, $$4.b($$0, $$1, epy.a()), epx.i);
         if ($$5) {
            dnb $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dnb $$0) {
      return $$0.b(c) && $$0.a(aun.aV) && $$0.c(c);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(e) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dko($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dkk.G, dko::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dkk.G, dko::a) : a($$2, dkk.G, dko::b);
      }
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   public static boolean h(dnb $$0) {
      return $$0.a(aun.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
