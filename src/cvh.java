import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvh extends cuf implements dbt {
   public static final MapCodec<cvh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, cvh::new)
   );
   protected static final ekb b = cut.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dhn c = dhm.r;
   public static final dhn d = dhm.y;
   public static final dhn e = dhm.C;
   public static final dhq f = dhm.R;
   private static final ekb g = cut.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cvh> a() {
      return a;
   }

   public cvh(boolean $$0, int $$1, dgv.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, hx.c));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.c_($$2) instanceof dex $$7) {
         clb $$8 = $$3.b($$4);
         Optional<coh<cns>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fT().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(aqx.av);
               return biq.a;
            }

            return biq.b;
         }
      }

      return biq.d;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if ($$0.c(c) && $$3 instanceof bky && !cpo.j((bky)$$3)) {
         $$3.a($$1.ag().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         der $$5 = $$1.c_($$2);
         if ($$5 instanceof dex) {
            bim.a($$1, $$2, ((dex)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      crt $$1 = $$0.q();
      ht $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ech.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1 == hx.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dgw $$0) {
      return $$0.a(cuv.ij);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqn.db, aqo.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(js.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bki $$0, crt $$1, ht $$2, dgw $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((crs)$$1, $$2, $$3.c(d), true);
         }
      }

      der $$5 = $$1.c_($$2);
      if ($$5 instanceof dex) {
         ((dex)$$5).f();
      }

      $$1.a($$0, dlg.c, $$2);
   }

   @Override
   public boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      if (!$$2.c(dhm.C) && $$3.a() == ech.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, aqn.jc, aqo.e, 1.0F, 1.0F);
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
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.bM() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dhm.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(crs $$0, ht $$1, boolean $$2, boolean $$3) {
      ato $$4 = $$0.E_();
      jv $$5 = $$2 ? js.ap : js.ao;
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
            js.Z,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(crs $$0, ht $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ht $$3 = $$1.c($$2);
         dgw $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ejy.c(g, $$4.b($$0, $$1, ejn.a()), ejm.i);
         if ($$5) {
            dgw $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dgw $$0) {
      return $$0.b(c) && $$0.a(arc.aU) && $$0.c(c);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(e) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dex($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, det.G, dex::c) : null;
      } else {
         return $$1.c(c) ? a($$2, det.G, dex::a) : a($$2, det.G, dex::b);
      }
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   public static boolean h(dgw $$0) {
      return $$0.a(arc.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
