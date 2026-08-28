import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfi extends deg implements dlv {
   public static final MapCodec<dfi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dfi::new)
   );
   protected static final ewf b = deu.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dso c = dsn.r;
   public static final dso d = dsn.y;
   public static final dso e = dsn.C;
   public static final dsr f = dsn.R;
   private static final ewf g = deu.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public dfi(boolean $$0, int $$1, drw.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, je.c));
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.c_($$3) instanceof dpi $$8) {
         cuk $$9 = $$4.b($$5);
         Optional<cys<cye>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(awg.av);
               return bqr.a;
            }

            return bqr.b;
         }
      }

      return bqr.d;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if ($$0.c(c) && $$3 instanceof btk && !czw.j((btk)$$3)) {
         $$3.a($$1.aj().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof dpi) {
            bql.a($$1, $$2, ((dpi)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      dbu $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == enr.c;
      return this.n().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1 == je.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(drx $$0) {
      return $$0.a(dew.ij);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avw.dI, avx.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lj.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bsp $$0, dbu $$1, iz $$2, drx $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dbt)$$1, $$2, $$3.c(d), true);
         }
      }

      dpc $$5 = $$1.c_($$2);
      if ($$5 instanceof dpi) {
         ((dpi)$$5).d();
      }

      $$1.a($$0, dwq.c, $$2);
   }

   @Override
   public boolean a(dbu $$0, iz $$1, drx $$2, enq $$3) {
      if (!$$2.c(dsn.C) && $$3.a() == enr.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avw.kf, avx.e, 1.0F, 1.0F);
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
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dsn.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dbt $$0, iz $$1, boolean $$2, boolean $$3) {
      azc $$4 = $$0.E_();
      lm $$5 = $$2 ? lj.au : lj.at;
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
            lj.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dbt $$0, iz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iz $$3 = $$1.c($$2);
         drx $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewc.c(g, $$4.b($$0, $$1, evr.a()), evq.i);
         if ($$5) {
            drx $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(drx $$0) {
      return $$0.b(c) && $$0.a(awl.aV) && $$0.c(c);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(e) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dpe.G, dpi::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dpe.G, dpi::a) : a($$2, dpe.G, dpi::b);
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   public static boolean h(drx $$0) {
      return $$0.a(awl.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
