import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dim extends dhk implements doz {
   public static final MapCodec<dim> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dim::new)
   );
   protected static final fab b = dhy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dvu c = dvt.r;
   public static final dvu d = dvt.y;
   public static final dvu e = dvt.C;
   public static final dvx f = dvt.R;
   private static final fab g = dhy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(boolean $$0, int $$1, dvc.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jl.c));
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$2.c_($$3) instanceof dsm $$8) {
         cvx $$9 = $$4.b($$5);
         Optional<dal<czv>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.C && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(awu.av);
               return bry.b;
            }

            return bry.c;
         }
      }

      return bry.f;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$0.c(c) && $$3 instanceof buv) {
         $$3.a($$1.ak().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsg $$5 = $$1.c_($$2);
         if ($$5 instanceof dsm) {
            bru.a($$1, $$2, ((dsm)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dew $$1 = $$0.q();
      jg $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == erf.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1 == jl.a ? $$0.b(d, Boolean.valueOf(this.o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean o(dvd $$0) {
      return $$0.a(dia.ij);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.dJ, awl.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lq.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable btz $$0, dew $$1, jg $$2, dvd $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dev)$$1, $$2, $$3.c(d), true);
         }
      }

      dsg $$5 = $$1.c_($$2);
      if ($$5 instanceof dsm) {
         ((dsm)$$5).d();
      }

      $$1.a($$0, eaa.c, $$2);
   }

   @Override
   public boolean a(dew $$0, jg $$1, dvd $$2, ere $$3) {
      if (!$$2.c(dvt.C) && $$3.a() == erf.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, awk.kg, awl.e, 1.0F, 1.0F);
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
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      jg $$4 = $$2.b();
      if (!$$0.C && $$3.bZ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dvt.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dev $$0, jg $$1, boolean $$2, boolean $$3) {
      azr $$4 = $$0.E_();
      lu $$5 = $$2 ? lq.au : lq.at;
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
            lq.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dev $$0, jg $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jg $$3 = $$1.c($$2);
         dvd $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = ezy.c(g, $$4.b($$0, $$1, ezm.a()), ezl.i);
         if ($$5) {
            dvd $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dvd $$0) {
      return $$0.b(c) && $$0.a(awz.aW) && $$0.c(c);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(e) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      if ($$0.C) {
         return $$1.c(c) ? a($$2, dsi.G, dsm::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dsi.G, dsm::a) : a($$2, dsi.G, dsm::b);
      }
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   public static boolean i(dvd $$0) {
      return $$0.a(awz.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
