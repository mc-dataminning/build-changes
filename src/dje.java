import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dje extends dic implements dpr {
   public static final MapCodec<dje> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dje::new)
   );
   protected static final fas b = diq.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dwm c = dwl.r;
   public static final dwm d = dwl.y;
   public static final dwm e = dwl.C;
   public static final dws<jm> f = dwl.R;
   private static final fas g = diq.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(boolean $$0, int $$1, dvu.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jm.c));
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$2.c_($$3) instanceof dte $$8) {
         cwm $$9 = $$4.b($$5);
         Optional<dbc<dam>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.C && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(awx.av);
               return bsk.b;
            }

            return bsk.c;
         }
      }

      return bsk.f;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$0.c(c) && $$3 instanceof bvh) {
         $$3.a($$1.ai().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsy $$5 = $$1.c_($$2);
         if ($$5 instanceof dte) {
            bsg.a($$1, $$2, ((dte)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dfn $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == erw.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4 == jm.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dvv $$0) {
      return $$0.a(dis.ij);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.dJ, awo.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ls.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bul $$0, dfn $$1, jh $$2, dvv $$3) {
      if ($$1.A_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dfm)$$1, $$2, $$3.c(d), true);
         }
      }

      dsy $$5 = $$1.c_($$2);
      if ($$5 instanceof dte) {
         ((dte)$$5).d();
      }

      $$1.a($$0, ear.c, $$2);
   }

   @Override
   public boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      if (!$$2.c(dwl.C) && $$3.a() == erw.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.A_()) {
               $$0.a(null, $$1, awn.kg, awo.e, 1.0F, 1.0F);
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
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof arp $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dwl.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dfm $$0, jh $$1, boolean $$2, boolean $$3) {
      azu $$4 = $$0.G_();
      lw $$5 = $$2 ? ls.au : ls.at;
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
            ls.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dfm $$0, jh $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jh $$3 = $$1.c($$2);
         dvv $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fap.c(g, $$4.b($$0, $$1, fad.a()), fac.i);
         if ($$5) {
            dvv $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dvv $$0) {
      return $$0.b(c) && $$0.a(axc.aW) && $$0.c(c);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(e) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dte($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      if ($$0.C) {
         return $$1.c(c) ? a($$2, dta.G, dte::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dta.G, dte::a) : a($$2, dta.G, dte::b);
      }
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   public static boolean i(dvv $$0) {
      return $$0.a(axc.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
