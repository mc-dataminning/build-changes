import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public final class ean extends dwl {
   public static final MapCodec<ean> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfl.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), eap.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(ean::new))
   );
   private static final duo d = dhl.a.o();
   private final jn<eap> e;
   private final Supplier<dzw.a> f;

   public ean(dfl $$0, jn<eap> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dzw.a a(eap $$0) {
      dzw.b $$1 = new dzw.b(-54, dhl.H.o());
      int $$2 = $$0.l();
      dzw.b $$3 = new dzw.b($$2, $$0.h());
      dzw.b $$4 = new dzw.b(dyk.e * 2, dhl.a.o());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dwk> a(eay $$0, ebm $$1, dfb $$2, dwk $$3) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         this.b($$1, $$0, $$2, $$3);
         return $$3;
      }), ad.g());
   }

   private void b(ebm $$0, eay $$1, dfb $$2, dwk $$3) {
      eao $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dfk $$5 = dzy.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private eao a(dwk $$0, dfb $$1, ebm $$2, eay $$3) {
      return eao.a($$0, $$3, dzx.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends dwl> b() {
      return c;
   }

   public jn<eap> h() {
      return this.e;
   }

   public boolean a(alb<eap> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, eak.a $$2, dei $$3, eay $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.G_());
   }

   @Override
   public des a(int $$0, int $$1, dei $$2, eay $$3) {
      MutableObject<des> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (des)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, eay $$1, je $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      eaq $$4 = $$1.a();
      ead.e $$5 = new ead.e($$2.u(), $$2.v(), $$2.w());
      double $$6 = $$4.j().a($$5);
      $$0.add(
         "NoiseRouter T: "
            + $$3.format($$4.e().a($$5))
            + " V: "
            + $$3.format($$4.f().a($$5))
            + " C: "
            + $$3.format($$4.g().a($$5))
            + " E: "
            + $$3.format($$4.h().a($$5))
            + " D: "
            + $$3.format($$4.i().a($$5))
            + " W: "
            + $$3.format($$6)
            + " PV: "
            + $$3.format((double)ear.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(dei $$0, eay $$1, int $$2, int $$3, @Nullable MutableObject<des> $$4, @Nullable Predicate<duo> $$5) {
      eas $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = azd.a($$8, $$7);
      int $$10 = azd.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         duo[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new duo[$$6.d()];
            $$4.setValue(new des($$8, $$11));
         }

         int $$13 = $$6.b();
         int $$14 = Math.floorDiv($$2, $$13);
         int $$15 = Math.floorDiv($$3, $$13);
         int $$16 = Math.floorMod($$2, $$13);
         int $$17 = Math.floorMod($$3, $$13);
         int $$18 = $$14 * $$13;
         int $$19 = $$15 * $$13;
         double $$20 = (double)$$16 / (double)$$13;
         double $$21 = (double)$$17 / (double)$$13;
         eao $$22 = new eao(1, $$1, $$18, $$19, $$6, eae.b.a, this.e.a(), this.f.get(), ebm.a());
         $$22.f();
         $$22.b(0);

         for (int $$23 = $$10 - 1; $$23 >= 0; $$23--) {
            $$22.b($$23, 0);

            for (int $$24 = $$7 - 1; $$24 >= 0; $$24--) {
               int $$25 = ($$9 + $$23) * $$7 + $$24;
               double $$26 = (double)$$24 / (double)$$7;
               $$22.a($$25, $$26);
               $$22.b($$2, $$20);
               $$22.c($$3, $$21);
               duo $$27 = $$22.e();
               duo $$28 = $$27 == null ? this.e.a().g() : $$27;
               if ($$11 != null) {
                  int $$29 = $$23 * $$7 + $$24;
                  $$11[$$29] = $$28;
               }

               if ($$5 != null && $$5.test($$28)) {
                  $$22.g();
                  return OptionalInt.of($$25 + 1);
               }
            }
         }

         $$22.g();
         return OptionalInt.empty();
      }
   }

   @Override
   public void a(aro $$0, dfb $$1, eay $$2, dwk $$3) {
      if (!ab.a($$3.f())) {
         ebh $$4 = new ebh(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.D_(), $$0.F_().d(lv.aG), ebm.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dwk $$0, ebh $$1, eay $$2, dfb $$3, dfj $$4, ka<dfh> $$5, ebm $$6) {
      eao $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      eap $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(aro $$0, long $$1, eay $$2, dfj $$3, dfb $$4, dwk $$5) {
      dfj $$6 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      ebj $$7 = new ebj(new eal(eaz.a()));
      int $$8 = 8;
      ddm $$9 = $$5.f();
      eao $$10 = $$5.a($$3x -> this.a($$3x, $$4, ebm.a($$0), $$2));
      dzw $$11 = $$10.i();
      ecl $$12 = new ecl(this, $$0.F_(), $$5.y(), $$10, $$2, this.e.a().j());
      dwj $$13 = ((dxe)$$5).C();

      for (int $$14 = -8; $$14 <= 8; $$14++) {
         for (int $$15 = -8; $$15 <= 8; $$15++) {
            ddm $$16 = new ddm($$9.e + $$14, $$9.f + $$15);
            dwk $$17 = $$0.a($$16.e, $$16.f);
            dfi $$18 = $$17.a(() -> this.a(this.b.getNoiseBiome(jy.a($$16.d()), 0, jy.a($$16.e()), $$2.b())));
            Iterable<jn<eco<?>>> $$19 = $$18.a();
            int $$20 = 0;

            for (jn<eco<?>> $$21 : $$19) {
               eco<?> $$22 = $$21.a();
               $$7.c($$1 + (long)$$20, $$16.e, $$16.f);
               if ($$22.a($$7)) {
                  $$22.a($$12, $$5, $$6::a, $$7, $$11, $$16, $$13);
               }

               $$20++;
            }
         }
      }
   }

   @Override
   public CompletableFuture<dwk> a(ebm $$0, eay $$1, dfb $$2, dwk $$3) {
      eas $$4 = this.e.a().f().a($$3.y());
      int $$5 = $$4.c();
      int $$6 = azd.a($$5, $$4.a());
      int $$7 = azd.a($$4.d(), $$4.a());
      return $$7 <= 0 ? CompletableFuture.completedFuture($$3) : CompletableFuture.supplyAsync(ad.a("wgen_fill_noise", () -> {
         int $$8 = $$3.f($$7 * $$4.a() - 1 + $$5);
         int $$9 = $$3.f($$5);
         Set<dwv> $$10 = Sets.newHashSet();

         for (int $$11 = $$8; $$11 >= $$9; $$11--) {
            dwv $$12 = $$3.b($$11);
            $$12.a();
            $$10.add($$12);
         }

         dwk var20;
         try {
            var20 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
         } finally {
            for (dwv $$14 : $$10) {
               $$14.b();
            }
         }

         return var20;
      }), ad.g());
   }

   private dwk a(ebm $$0, dfb $$1, eay $$2, dwk $$3, int $$4, int $$5) {
      eao $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      eak $$7 = $$3.a(eak.a.c);
      eak $$8 = $$3.a(eak.a.a);
      ddm $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dzw $$12 = $$6.i();
      $$6.f();
      je.a $$13 = new je.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.ao() - 1;
            dwv $$21 = $$3.b($$20);

            for (int $$22 = $$5 - 1; $$22 >= 0; $$22--) {
               $$6.b($$22, $$19);

               for (int $$23 = $$15 - 1; $$23 >= 0; $$23--) {
                  int $$24 = ($$4 + $$22) * $$15 + $$23;
                  int $$25 = $$24 & 15;
                  int $$26 = $$3.f($$24);
                  if ($$20 != $$26) {
                     $$20 = $$26;
                     $$21 = $$3.b($$26);
                  }

                  double $$27 = (double)$$23 / (double)$$15;
                  $$6.a($$24, $$27);

                  for (int $$28 = 0; $$28 < $$14; $$28++) {
                     int $$29 = $$10 + $$18 * $$14 + $$28;
                     int $$30 = $$29 & 15;
                     double $$31 = (double)$$28 / (double)$$14;
                     $$6.b($$29, $$31);

                     for (int $$32 = 0; $$32 < $$14; $$32++) {
                        int $$33 = $$11 + $$19 * $$14 + $$32;
                        int $$34 = $$33 & 15;
                        double $$35 = (double)$$32 / (double)$$14;
                        $$6.c($$33, $$35);
                        duo $$36 = $$6.e();
                        if ($$36 == null) {
                           $$36 = this.e.a().g();
                        }

                        $$36 = this.a($$6, $$29, $$24, $$33, $$36);
                        if ($$36 != d && !ab.a($$3.f())) {
                           $$21.a($$30, $$25, $$34, $$36, false);
                           $$7.a($$30, $$24, $$34, $$36);
                           $$8.a($$30, $$24, $$34, $$36);
                           if ($$12.a() && !$$36.y().c()) {
                              $$13.d($$29, $$24, $$33);
                              $$3.e($$13);
                           }
                        }
                     }
                  }
               }
            }
         }

         $$6.h();
      }

      $$6.g();
      return $$3;
   }

   private duo a(eao $$0, int $$1, int $$2, int $$3, duo $$4) {
      return $$4;
   }

   @Override
   public int e() {
      return this.e.a().f().d();
   }

   @Override
   public int f() {
      return this.e.a().l();
   }

   @Override
   public int g() {
      return this.e.a().f().c();
   }

   @Override
   public void a(aro $$0) {
      if (!this.e.a().a()) {
         ddm $$1 = $$0.a();
         jn<dfh> $$2 = $$0.t($$1.l().h($$0.an()));
         ebj $$3 = new ebj(new eal(eaz.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         der.a($$0, $$2, $$1, $$3);
      }
   }
}
