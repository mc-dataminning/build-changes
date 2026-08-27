import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public final class dyx extends duz {
   public static final Codec<dyx> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddd.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dyz.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dyx::new))
   );
   private static final dtc d = dfe.a.n();
   private final ja<dyz> e;
   private final Supplier<dyg.a> f;

   public dyx(ddd $$0, ja<dyz> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dyg.a a(dyz $$0) {
      dyg.b $$1 = new dyg.b(-54, dfe.am.n());
      int $$2 = $$0.l();
      dyg.b $$3 = new dyg.b($$2, $$0.h());
      dyg.b $$4 = new dyg.b(dwu.e * 2, dfe.a.n());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<duy> a(Executor $$0, dzi $$1, dzw $$2, dct $$3, duy $$4) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         this.a($$2, $$1, $$3, $$4);
         return $$4;
      }), ad.f());
   }

   private void a(dzw $$0, dzi $$1, dct $$2, duy $$3) {
      dyy $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      ddc $$5 = dyi.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dyy a(duy $$0, dct $$1, dzw $$2, dzi $$3) {
      return dyy.a($$0, $$3, dyh.a($$1, $$0.g()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected Codec<? extends duz> a() {
      return c;
   }

   public ja<dyz> g() {
      return this.e;
   }

   public boolean a(aks<dyz> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dyu.a $$2, dcc $$3, dzi $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.J_() + this.e.a().m());
   }

   @Override
   public dcm a(int $$0, int $$1, dcc $$2, dzi $$3) {
      MutableObject<dcm> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dcm)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dzi $$1, ir $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dza $$4 = $$1.a();
      dyn.e $$5 = new dyn.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dzb.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(dcc $$0, dzi $$1, int $$2, int $$3, @Nullable MutableObject<dcm> $$4, @Nullable Predicate<dtc> $$5) {
      dzc $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = aym.a($$8, $$7);
      int $$10 = aym.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dtc[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dtc[$$6.d()];
            $$4.setValue(new dcm($$8, $$11));
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
         dyy $$22 = new dyy(1, $$1, $$18, $$19, $$6, dyo.b.a, this.e.a(), this.f.get(), dzw.a());
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
               dtc $$27 = $$22.e();
               dtc $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(ara $$0, dct $$1, dzi $$2, duy $$3) {
      if (!ab.a($$3.g())) {
         dzr $$4 = new dzr(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.G_(), $$0.I_().d(li.az), dzw.a($$0));
      }
   }

   @VisibleForTesting
   public void a(duy $$0, dzr $$1, dzi $$2, dct $$3, ddb $$4, jn<dcz> $$5, dzw $$6) {
      dyy $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dyz $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.o(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(ara $$0, long $$1, dzi $$2, ddb $$3, dct $$4, duy $$5, dyq.a $$6) {
      ddb $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dzt $$8 = new dzt(new dyv(dzj.a()));
      int $$9 = 8;
      dbh $$10 = $$5.g();
      dyy $$11 = $$5.a($$3x -> this.a($$3x, $$4, dzw.a($$0), $$2));
      dyg $$12 = $$11.i();
      eau $$13 = new eau(this, $$0.I_(), $$5.A(), $$11, $$2, this.e.a().j());
      dux $$14 = ((dvs)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            dbh $$17 = new dbh($$10.e + $$15, $$10.f + $$16);
            duy $$18 = $$0.a_($$17.e, $$17.f);
            dda $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(jl.a($$17.d()), 0, jl.a($$17.e()), $$2.b())));
            Iterable<ja<eax<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (ja<eax<?>> $$22 : $$20) {
               eax<?> $$23 = $$22.a();
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
   public CompletableFuture<duy> a(Executor $$0, dzw $$1, dzi $$2, dct $$3, duy $$4) {
      dzc $$5 = this.e.a().f().a($$4.A());
      int $$6 = $$5.c();
      int $$7 = aym.a($$6, $$5.a());
      int $$8 = aym.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<dvj> $$11 = Sets.newHashSet();

         for (int $$12 = $$9; $$12 >= $$10; $$12--) {
            dvj $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ad.a("wgen_fill_noise", () -> this.a($$1, $$3, $$2, $$4, $$7, $$8)), ad.f()).whenCompleteAsync(($$1x, $$2x) -> {
            for (dvj $$3x : $$11) {
               $$3x.b();
            }
         }, $$0);
      }
   }

   private duy a(dzw $$0, dct $$1, dzi $$2, duy $$3, int $$4, int $$5) {
      dyy $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dyu $$7 = $$3.a(dyu.a.c);
      dyu $$8 = $$3.a(dyu.a.a);
      dbh $$9 = $$3.g();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dyg $$12 = $$6.i();
      $$6.f();
      ir.a $$13 = new ir.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.an() - 1;
            dvj $$21 = $$3.b($$20);

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
                        dtc $$36 = $$6.e();
                        if ($$36 == null) {
                           $$36 = this.e.a().g();
                        }

                        $$36 = this.a($$6, $$29, $$24, $$33, $$36);
                        if ($$36 != d && !ab.a($$3.g())) {
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

   private dtc a(dyy $$0, int $$1, int $$2, int $$3, dtc $$4) {
      return $$4;
   }

   @Override
   public int d() {
      return this.e.a().f().d();
   }

   @Override
   public int e() {
      return this.e.a().l();
   }

   @Override
   public int f() {
      return this.e.a().f().c();
   }

   @Override
   public void a(ara $$0) {
      if (!this.e.a().a()) {
         dbh $$1 = $$0.a();
         ja<dcz> $$2 = $$0.t($$1.l().h($$0.am() - 1));
         dzt $$3 = new dzt(new dyv(dzj.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         dcl.a($$0, $$2, $$1, $$3);
      }
   }
}
