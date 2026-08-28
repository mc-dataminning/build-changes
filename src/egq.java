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

public final class egq extends ecm {
   public static final MapCodec<egq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dko.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), egs.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(egq::new))
   );
   private static final eao d = dmo.a.m();
   private final jf<egs> e;
   private final Supplier<efz.a> f;

   public egq(dko $$0, jf<egs> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static efz.a a(egs $$0) {
      efz.b $$1 = new efz.b(-54, dmo.K.m());
      int $$2 = $$0.l();
      efz.b $$3 = new efz.b($$2, $$0.h());
      efz.b $$4 = new efz.b(eel.e * 2, dmo.a.m());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<ecl> a(ehb $$0, ehp $$1, dkd $$2, ecl $$3) {
      return CompletableFuture.supplyAsync(() -> {
         this.b($$1, $$0, $$2, $$3);
         return $$3;
      }, ag.h().a("init_biomes"));
   }

   private void b(ehp $$0, ehb $$1, dkd $$2, ecl $$3) {
      egr $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dkn $$5 = egb.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private egr a(ecl $$0, dkd $$1, ehp $$2, ehb $$3) {
      return egr.a($$0, $$3, ega.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends ecm> b() {
      return c;
   }

   public jf<egs> h() {
      return this.e;
   }

   public boolean a(alf<egs> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, egn.a $$2, djj $$3, ehb $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.G_());
   }

   @Override
   public djt a(int $$0, int $$1, djj $$2, ehb $$3) {
      MutableObject<djt> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (djt)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, ehb $$1, iv $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      egt $$4 = $$1.a();
      egg.e $$5 = new egg.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)egu.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(djj $$0, ehb $$1, int $$2, int $$3, @Nullable MutableObject<djt> $$4, @Nullable Predicate<eao> $$5) {
      egv $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = azm.a($$8, $$7);
      int $$10 = azm.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         eao[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new eao[$$6.d()];
            $$4.setValue(new djt($$8, $$11));
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
         egr $$22 = new egr(1, $$1, $$18, $$19, $$6, egh.b.a, this.e.a(), this.f.get(), ehp.a());
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
               eao $$27 = $$22.e();
               eao $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(ary $$0, dkd $$1, ehb $$2, ecl $$3) {
      if (!ac.a($$3.f())) {
         ehk $$4 = new ehk(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.D_(), $$0.F_().f(mh.aG), ehp.a($$0));
      }
   }

   @VisibleForTesting
   public void a(ecl $$0, ehk $$1, ehb $$2, dkd $$3, dkm $$4, js<dkk> $$5, ehp $$6) {
      egr $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      egs $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(ary $$0, long $$1, ehb $$2, dkm $$3, dkd $$4, ecl $$5) {
      dkm $$6 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      ehm $$7 = new ehm(new ego(ehc.a()));
      int $$8 = 8;
      dio $$9 = $$5.f();
      egr $$10 = $$5.a($$3x -> this.a($$3x, $$4, ehp.a($$0), $$2));
      efz $$11 = $$10.i();
      eio $$12 = new eio(this, $$0.F_(), $$5.B(), $$10, $$2, this.e.a().j());
      eck $$13 = ((edf)$$5).F();

      for (int $$14 = -8; $$14 <= 8; $$14++) {
         for (int $$15 = -8; $$15 <= 8; $$15++) {
            dio $$16 = new dio($$9.h + $$14, $$9.i + $$15);
            ecl $$17 = $$0.a($$16.h, $$16.i);
            dkl $$18 = $$17.a(() -> this.a(this.b.getNoiseBiome(jq.a($$16.d()), 0, jq.a($$16.e()), $$2.b())));
            Iterable<jf<eir<?>>> $$19 = $$18.a();
            int $$20 = 0;

            for (jf<eir<?>> $$21 : $$19) {
               eir<?> $$22 = $$21.a();
               $$7.c($$1 + (long)$$20, $$16.h, $$16.i);
               if ($$22.a($$7)) {
                  $$22.a($$12, $$5, $$6::a, $$7, $$11, $$16, $$13);
               }

               $$20++;
            }
         }
      }
   }

   @Override
   public CompletableFuture<ecl> a(ehp $$0, ehb $$1, dkd $$2, ecl $$3) {
      egv $$4 = this.e.a().f().a($$3.B());
      int $$5 = $$4.c();
      int $$6 = azm.a($$5, $$4.a());
      int $$7 = azm.a($$4.d(), $$4.a());
      return $$7 <= 0 ? CompletableFuture.completedFuture($$3) : CompletableFuture.supplyAsync(() -> {
         int $$8 = $$3.f($$7 * $$4.a() - 1 + $$5);
         int $$9 = $$3.f($$5);
         Set<ecw> $$10 = Sets.newHashSet();

         for (int $$11 = $$8; $$11 >= $$9; $$11--) {
            ecw $$12 = $$3.b($$11);
            $$12.a();
            $$10.add($$12);
         }

         ecl var20;
         try {
            var20 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
         } finally {
            for (ecw $$14 : $$10) {
               $$14.b();
            }
         }

         return var20;
      }, ag.h().a("wgen_fill_noise"));
   }

   private ecl a(ehp $$0, dkd $$1, ehb $$2, ecl $$3, int $$4, int $$5) {
      egr $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      egn $$7 = $$3.a(egn.a.c);
      egn $$8 = $$3.a(egn.a.a);
      dio $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      efz $$12 = $$6.i();
      $$6.f();
      iv.a $$13 = new iv.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.ap() - 1;
            ecw $$21 = $$3.b($$20);

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
                        eao $$36 = $$6.e();
                        if ($$36 == null) {
                           $$36 = this.e.a().g();
                        }

                        $$36 = this.a($$6, $$29, $$24, $$33, $$36);
                        if ($$36 != d && !ac.a($$3.f())) {
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

   private eao a(egr $$0, int $$1, int $$2, int $$3, eao $$4) {
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
   public void a(ary $$0) {
      if (!this.e.a().a()) {
         dio $$1 = $$0.b();
         jf<dkk> $$2 = $$0.u($$1.l().h($$0.ao()));
         ehm $$3 = new ehm(new ego(ehc.a()));
         $$3.a($$0.E(), $$1.d(), $$1.e());
         djs.a($$0, $$2, $$1, $$3);
      }
   }
}
