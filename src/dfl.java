import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfl extends dej implements dly {
   public static final MapCodec<dfl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfl::new)
   );
   protected static final ewi b = dex.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dsr c = dsq.r;
   public static final dsr d = dsq.y;
   public static final dsr e = dsq.C;
   public static final dsu f = dsq.R;
   private static final ewi g = dex.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(boolean $$0, int $$1, drz.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, je.c));
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$2.c_($$3) instanceof dpl $$8) {
         cun $$9 = $$4.b($$5);
         Optional<cyv<cyh>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(awj.av);
               return bqu.a;
            }

            return bqu.b;
         }
      }

      return bqu.d;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if ($$0.c(c) && $$3 instanceof btn && !czz.j((btn)$$3)) {
         $$3.a($$1.aj().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof dpl) {
            bqo.a($$1, $$2, ((dpl)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == enu.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return $$1 == je.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dsa $$0) {
      return $$0.a(dez.ij);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
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

   public static void a(@Nullable bss $$0, dbx $$1, iz $$2, dsa $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dbw)$$1, $$2, $$3.c(d), true);
         }
      }

      dpf $$5 = $$1.c_($$2);
      if ($$5 instanceof dpl) {
         ((dpl)$$5).d();
      }

      $$1.a($$0, dwt.c, $$2);
   }

   @Override
   public boolean a(dbx $$0, iz $$1, dsa $$2, ent $$3) {
      if (!$$2.c(dsq.C) && $$3.a() == enu.c) {
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
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dsq.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dbw $$0, iz $$1, boolean $$2, boolean $$3) {
      azf $$4 = $$0.E_();
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

   public static boolean a(dbw $$0, iz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iz $$3 = $$1.c($$2);
         dsa $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewf.c(g, $$4.b($$0, $$1, evu.a()), evt.i);
         if ($$5) {
            dsa $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dsa $$0) {
      return $$0.b(c) && $$0.a(awo.aV) && $$0.c(c);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(e) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dph.G, dpl::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dph.G, dpl::a) : a($$2, dph.G, dpl::b);
      }
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   public static boolean h(dsa $$0) {
      return $$0.a(awo.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
