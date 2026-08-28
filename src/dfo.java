import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfo extends dem implements dmb {
   public static final MapCodec<dfo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfo::new)
   );
   protected static final ewl b = dfa.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dsu c = dst.r;
   public static final dsu d = dst.y;
   public static final dsu e = dst.C;
   public static final dsx f = dst.R;
   private static final ewl g = dfa.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   public dfo(boolean $$0, int $$1, dsc.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, je.c));
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.c_($$3) instanceof dpo $$8) {
         cuq $$9 = $$4.b($$5);
         Optional<cyy<cyk>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(awk.av);
               return bqx.a;
            }

            return bqx.b;
         }
      }

      return bqx.d;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if ($$0.c(c) && $$3 instanceof btq && !dac.j((btq)$$3)) {
         $$3.a($$1.aj().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dpo) {
            bqr.a($$1, $$2, ((dpo)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == enx.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$1 == je.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dsd $$0) {
      return $$0.a(dfc.ij);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.dI, awb.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(li.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bsv $$0, dca $$1, iz $$2, dsd $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dbz)$$1, $$2, $$3.c(d), true);
         }
      }

      dpi $$5 = $$1.c_($$2);
      if ($$5 instanceof dpo) {
         ((dpo)$$5).d();
      }

      $$1.a($$0, dww.c, $$2);
   }

   @Override
   public boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      if (!$$2.c(dst.C) && $$3.a() == enx.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, awa.kf, awb.e, 1.0F, 1.0F);
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
   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dst.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dbz $$0, iz $$1, boolean $$2, boolean $$3) {
      azh $$4 = $$0.E_();
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

   public static boolean a(dbz $$0, iz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iz $$3 = $$1.c($$2);
         dsd $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewi.c(g, $$4.b($$0, $$1, evx.a()), evw.i);
         if ($$5) {
            dsd $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dsd $$0) {
      return $$0.b(c) && $$0.a(awp.aV) && $$0.c(c);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(e) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dpk.G, dpo::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dpk.G, dpo::a) : a($$2, dpk.G, dpo::b);
      }
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   public static boolean h(dsd $$0) {
      return $$0.a(awp.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
