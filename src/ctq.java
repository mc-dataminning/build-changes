import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctq extends cso implements dab {
   public static final MapCodec<ctq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, ctq::new)
   );
   protected static final eia b = ctc.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dfu c = dft.r;
   public static final dfu d = dft.y;
   public static final dfu e = dft.C;
   public static final dfx f = dft.R;
   private static final eia g = ctc.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<ctq> a() {
      return a;
   }

   public ctq(boolean $$0, int $$1, dfc.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ha.c));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.c_($$2) instanceof ddf $$7) {
         cjl $$8 = $$3.b($$4);
         Optional<cmq<cmc>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fT().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(apq.av);
               return bhe.a;
            }

            return bhe.b;
         }
      }

      return bhe.d;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if ($$0.c(c) && $$3 instanceof bjm && !cnw.j((bjm)$$3)) {
         $$3.a($$1.ag().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof ddf) {
            bha.a($$1, $$2, ((ddf)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      cqc $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eah.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$1 == ha.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dfd $$0) {
      return $$0.a(cte.ij);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apg.db, aph.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(iv.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable biw $$0, cqc $$1, gw $$2, dfd $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cqb)$$1, $$2, $$3.c(d), true);
         }
      }

      dcz $$5 = $$1.c_($$2);
      if ($$5 instanceof ddf) {
         ((ddf)$$5).f();
      }

      $$1.a($$0, djn.c, $$2);
   }

   @Override
   public boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      if (!$$2.c(dft.C) && $$3.a() == eah.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, apg.iY, aph.e, 1.0F, 1.0F);
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
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      gw $$4 = $$2.a();
      if (!$$0.B && $$3.bM() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dft.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cqb $$0, gw $$1, boolean $$2, boolean $$3) {
      ash $$4 = $$0.D_();
      iy $$5 = $$2 ? iv.ao : iv.an;
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
            iv.Z,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cqb $$0, gw $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         gw $$3 = $$1.c($$2);
         dfd $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ehx.c(g, $$4.b($$0, $$1, ehm.a()), ehl.i);
         if ($$5) {
            dfd $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dfd $$0) {
      return $$0.b(c) && $$0.a(apv.aU) && $$0.c(c);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(e) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, ddb.G, ddf::c) : null;
      } else {
         return $$1.c(c) ? a($$2, ddb.G, ddf::a) : a($$2, ddb.G, ddf::b);
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   public static boolean h(dfd $$0) {
      return $$0.a(apv.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
