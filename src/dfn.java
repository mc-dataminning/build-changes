import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfn extends del implements dma {
   public static final MapCodec<dfn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfn::new)
   );
   protected static final ewk b = dez.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dst c = dss.r;
   public static final dst d = dss.y;
   public static final dst e = dss.C;
   public static final dsw f = dss.R;
   private static final ewk g = dez.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(boolean $$0, int $$1, dsb.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, je.c));
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.c_($$3) instanceof dpn $$8) {
         cup $$9 = $$4.b($$5);
         Optional<cyx<cyj>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(awk.av);
               return bqw.a;
            }

            return bqw.b;
         }
      }

      return bqw.d;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if ($$0.c(c) && $$3 instanceof btp && !dab.j((btp)$$3)) {
         $$3.a($$1.aj().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dph $$5 = $$1.c_($$2);
         if ($$5 instanceof dpn) {
            bqq.a($$1, $$2, ((dpn)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == enw.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1 == je.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dsc $$0) {
      return $$0.a(dfb.ij);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
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

   public static void a(@Nullable bsu $$0, dbz $$1, iz $$2, dsc $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dby)$$1, $$2, $$3.c(d), true);
         }
      }

      dph $$5 = $$1.c_($$2);
      if ($$5 instanceof dpn) {
         ((dpn)$$5).d();
      }

      $$1.a($$0, dwv.c, $$2);
   }

   @Override
   public boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      if (!$$2.c(dss.C) && $$3.a() == enw.c) {
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
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dss.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dby $$0, iz $$1, boolean $$2, boolean $$3) {
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

   public static boolean a(dby $$0, iz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iz $$3 = $$1.c($$2);
         dsc $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewh.c(g, $$4.b($$0, $$1, evw.a()), evv.i);
         if ($$5) {
            dsc $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dsc $$0) {
      return $$0.b(c) && $$0.a(awp.aV) && $$0.c(c);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(e) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dpj.G, dpn::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dpj.G, dpn::a) : a($$2, dpj.G, dpn::b);
      }
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   public static boolean h(dsc $$0) {
      return $$0.a(awp.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
