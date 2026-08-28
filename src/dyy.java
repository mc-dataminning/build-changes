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

public final class dyy extends dux {
   public static final MapCodec<dyy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddy.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dza.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dyy::new))
   );
   private static final dta d = dfy.a.o();
   private final jm<dza> e;
   private final Supplier<dyh.a> f;

   public dyy(ddy $$0, jm<dza> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dyh.a a(dza $$0) {
      dyh.b $$1 = new dyh.b(-54, dfy.H.o());
      int $$2 = $$0.l();
      dyh.b $$3 = new dyh.b($$2, $$0.h());
      dyh.b $$4 = new dyh.b(dwv.e * 2, dfy.a.o());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<duw> a(dzj $$0, dzx $$1, ddo $$2, duw $$3) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         this.b($$1, $$0, $$2, $$3);
         return $$3;
      }), ad.g());
   }

   private void b(dzx $$0, dzj $$1, ddo $$2, duw $$3) {
      dyz $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      ddx $$5 = dyj.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dyz a(duw $$0, ddo $$1, dzx $$2, dzj $$3) {
      return dyz.a($$0, $$3, dyi.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends dux> b() {
      return c;
   }

   public jm<dza> h() {
      return this.e;
   }

   public boolean a(akp<dza> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dyv.a $$2, dcw $$3, dzj $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.I_());
   }

   @Override
   public ddg a(int $$0, int $$1, dcw $$2, dzj $$3) {
      MutableObject<ddg> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (ddg)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dzj $$1, jd $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dzb $$4 = $$1.a();
      dyo.e $$5 = new dyo.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dzc.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(dcw $$0, dzj $$1, int $$2, int $$3, @Nullable MutableObject<ddg> $$4, @Nullable Predicate<dta> $$5) {
      dzd $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = ayn.a($$8, $$7);
      int $$10 = ayn.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dta[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dta[$$6.d()];
            $$4.setValue(new ddg($$8, $$11));
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
         dyz $$22 = new dyz(1, $$1, $$18, $$19, $$6, dyp.b.a, this.e.a(), this.f.get(), dzx.a());
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
               dta $$27 = $$22.e();
               dta $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(ara $$0, ddo $$1, dzj $$2, duw $$3) {
      if (!ab.a($$3.f())) {
         dzs $$4 = new dzs(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.F_(), $$0.H_().d(lu.aF), dzx.a($$0));
      }
   }

   @VisibleForTesting
   public void a(duw $$0, dzs $$1, dzj $$2, ddo $$3, ddw $$4, jz<ddu> $$5, dzx $$6) {
      dyz $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dza $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(ara $$0, long $$1, dzj $$2, ddw $$3, ddo $$4, duw $$5, dyr.a $$6) {
      ddw $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dzu $$8 = new dzu(new dyw(dzk.a()));
      int $$9 = 8;
      dcb $$10 = $$5.f();
      dyz $$11 = $$5.a($$3x -> this.a($$3x, $$4, dzx.a($$0), $$2));
      dyh $$12 = $$11.i();
      eaw $$13 = new eaw(this, $$0.H_(), $$5.z(), $$11, $$2, this.e.a().j());
      duv $$14 = ((dvq)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            dcb $$17 = new dcb($$10.e + $$15, $$10.f + $$16);
            duw $$18 = $$0.a($$17.e, $$17.f);
            ddv $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(jx.a($$17.d()), 0, jx.a($$17.e()), $$2.b())));
            Iterable<jm<eaz<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (jm<eaz<?>> $$22 : $$20) {
               eaz<?> $$23 = $$22.a();
               $$8.c($$1 + (long)$$21, $$17.e, $$17.f);
               if ($$23.a($$8)) {
                  $$23.a($$13, $$5, $$7::a, $$8, $$12, $$17, $$14);
               }

               $$21++;
            }
         }
      }
   }

   @Override
   public CompletableFuture<duw> a(dzx $$0, dzj $$1, ddo $$2, duw $$3) {
      dzd $$4 = this.e.a().f().a($$3.z());
      int $$5 = $$4.c();
      int $$6 = ayn.a($$5, $$4.a());
      int $$7 = ayn.a($$4.d(), $$4.a());
      return $$7 <= 0 ? CompletableFuture.completedFuture($$3) : CompletableFuture.supplyAsync(ad.a("wgen_fill_noise", () -> {
         int $$8 = $$3.e($$7 * $$4.a() - 1 + $$5);
         int $$9 = $$3.e($$5);
         Set<dvh> $$10 = Sets.newHashSet();

         for (int $$11 = $$8; $$11 >= $$9; $$11--) {
            dvh $$12 = $$3.b($$11);
            $$12.a();
            $$10.add($$12);
         }

         duw var20;
         try {
            var20 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
         } finally {
            for (dvh $$14 : $$10) {
               $$14.b();
            }
         }

         return var20;
      }), ad.g());
   }

   private duw a(dzx $$0, ddo $$1, dzj $$2, duw $$3, int $$4, int $$5) {
      dyz $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dyv $$7 = $$3.a(dyv.a.c);
      dyv $$8 = $$3.a(dyv.a.a);
      dcb $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dyh $$12 = $$6.i();
      $$6.f();
      jd.a $$13 = new jd.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.an() - 1;
            dvh $$21 = $$3.b($$20);

            for (int $$22 = $$5 - 1; $$22 >= 0; $$22--) {
               $$6.b($$22, $$19);

               for (int $$23 = $$15 - 1; $$23 >= 0; $$23--) {
                  int $$24 = ($$4 + $$22) * $$15 + $$23;
                  int $$25 = $$24 & 15;
                  int $$26 = $$3.e($$24);
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
                        dta $$36 = $$6.e();
                        if ($$36 == null) {
                           $$36 = this.e.a().g();
                        }

                        $$36 = this.a($$6, $$29, $$24, $$33, $$36);
                        if ($$36 != d && !ab.a($$3.f())) {
                           $$21.a($$30, $$25, $$34, $$36, false);
                           $$7.a($$30, $$24, $$34, $$36);
                           $$8.a($$30, $$24, $$34, $$36);
                           if ($$12.a() && !$$36.u().c()) {
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

   private dta a(dyz $$0, int $$1, int $$2, int $$3, dta $$4) {
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
   public void a(ara $$0) {
      if (!this.e.a().a()) {
         dcb $$1 = $$0.a();
         jm<ddu> $$2 = $$0.t($$1.l().h($$0.am() - 1));
         dzu $$3 = new dzu(new dyw(dzk.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         ddf.a($$0, $$2, $$1, $$3);
      }
   }
}
