import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfm extends dek implements dlz {
   public static final MapCodec<dfm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfm::new)
   );
   protected static final ewj b = dey.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dss c = dsr.r;
   public static final dss d = dsr.y;
   public static final dss e = dsr.C;
   public static final dsv f = dsr.R;
   private static final ewj g = dey.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(boolean $$0, int $$1, dsa.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, je.c));
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$2.c_($$3) instanceof dpm $$8) {
         cuo $$9 = $$4.b($$5);
         Optional<cyw<cyi>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(awj.av);
               return bqv.a;
            }

            return bqv.b;
         }
      }

      return bqv.d;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if ($$0.c(c) && $$3 instanceof bto && !daa.j((bto)$$3)) {
         $$3.a($$1.aj().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof dpm) {
            bqp.a($$1, $$2, ((dpm)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == env.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return $$1 == je.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dsb $$0) {
      return $$0.a(dfa.ij);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.dI, awa.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(li.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bst $$0, dby $$1, iz $$2, dsb $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dbx)$$1, $$2, $$3.c(d), true);
         }
      }

      dpg $$5 = $$1.c_($$2);
      if ($$5 instanceof dpm) {
         ((dpm)$$5).d();
      }

      $$1.a($$0, dwu.c, $$2);
   }

   @Override
   public boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      if (!$$2.c(dsr.C) && $$3.a() == env.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avz.kf, awa.e, 1.0F, 1.0F);
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
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dsr.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dbx $$0, iz $$1, boolean $$2, boolean $$3) {
      azg $$4 = $$0.E_();
      lm $$5 = $$2 ? li.au : li.at;
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
            li.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dbx $$0, iz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iz $$3 = $$1.c($$2);
         dsb $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewg.c(g, $$4.b($$0, $$1, evv.a()), evu.i);
         if ($$5) {
            dsb $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dsb $$0) {
      return $$0.b(c) && $$0.a(awo.aV) && $$0.c(c);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(e) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dpi.G, dpm::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dpi.G, dpm::a) : a($$2, dpi.G, dpm::b);
      }
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   public static boolean h(dsb $$0) {
      return $$0.a(awo.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
