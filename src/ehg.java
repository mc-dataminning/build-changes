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

public final class ehg extends edc {
   public static final MapCodec<ehg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dle.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), ehi.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(ehg::new))
   );
   private static final ebe d = dne.a.m();
   private final jf<ehi> e;
   private final Supplier<egp.a> f;

   public ehg(dle $$0, jf<ehi> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static egp.a a(ehi $$0) {
      egp.b $$1 = new egp.b(-54, dne.K.m());
      int $$2 = $$0.l();
      egp.b $$3 = new egp.b($$2, $$0.h());
      egp.b $$4 = new egp.b(efb.e * 2, dne.a.m());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<edb> a(ehr $$0, eif $$1, dkt $$2, edb $$3) {
      return CompletableFuture.supplyAsync(() -> {
         this.b($$1, $$0, $$2, $$3);
         return $$3;
      }, ag.h().a("init_biomes"));
   }

   private void b(eif $$0, ehr $$1, dkt $$2, edb $$3) {
      ehh $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dld $$5 = egr.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private ehh a(edb $$0, dkt $$1, eif $$2, ehr $$3) {
      return ehh.a($$0, $$3, egq.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends edc> b() {
      return c;
   }

   public jf<ehi> h() {
      return this.e;
   }

   public boolean a(alh<ehi> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, ehd.a $$2, djz $$3, ehr $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.K_());
   }

   @Override
   public dkj a(int $$0, int $$1, djz $$2, ehr $$3) {
      MutableObject<dkj> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dkj)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, ehr $$1, iv $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      ehj $$4 = $$1.a();
      egw.e $$5 = new egw.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)ehk.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(djz $$0, ehr $$1, int $$2, int $$3, @Nullable MutableObject<dkj> $$4, @Nullable Predicate<ebe> $$5) {
      ehl $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = azo.a($$8, $$7);
      int $$10 = azo.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         ebe[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new ebe[$$6.d()];
            $$4.setValue(new dkj($$8, $$11));
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
         ehh $$22 = new ehh(1, $$1, $$18, $$19, $$6, egx.b.a, this.e.a(), this.f.get(), eif.a());
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
               ebe $$27 = $$22.e();
               ebe $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(asa $$0, dkt $$1, ehr $$2, edb $$3) {
      if (!ac.a($$3.f())) {
         eia $$4 = new eia(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.H_(), $$0.J_().f(mh.aG), eif.a($$0));
      }
   }

   @VisibleForTesting
   public void a(edb $$0, eia $$1, ehr $$2, dkt $$3, dlc $$4, js<dla> $$5, eif $$6) {
      ehh $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      ehi $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(asa $$0, long $$1, ehr $$2, dlc $$3, dkt $$4, edb $$5) {
      dlc $$6 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      eic $$7 = new eic(new ehe(ehs.a()));
      int $$8 = 8;
      djc $$9 = $$5.f();
      ehh $$10 = $$5.a($$3x -> this.a($$3x, $$4, eif.a($$0), $$2));
      egp $$11 = $$10.i();
      eje $$12 = new eje(this, $$0.J_(), $$5.B(), $$10, $$2, this.e.a().j());
      eda $$13 = ((edv)$$5).F();

      for (int $$14 = -8; $$14 <= 8; $$14++) {
         for (int $$15 = -8; $$15 <= 8; $$15++) {
            djc $$16 = new djc($$9.h + $$14, $$9.i + $$15);
            edb $$17 = $$0.a($$16.h, $$16.i);
            dlb $$18 = $$17.a(() -> this.a(this.b.getNoiseBiome(jq.a($$16.d()), 0, jq.a($$16.e()), $$2.b())));
            Iterable<jf<ejh<?>>> $$19 = $$18.a();
            int $$20 = 0;

            for (jf<ejh<?>> $$21 : $$19) {
               ejh<?> $$22 = $$21.a();
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
   public CompletableFuture<edb> a(eif $$0, ehr $$1, dkt $$2, edb $$3) {
      ehl $$4 = this.e.a().f().a($$3.B());
      int $$5 = $$4.c();
      int $$6 = azo.a($$5, $$4.a());
      int $$7 = azo.a($$4.d(), $$4.a());
      return $$7 <= 0 ? CompletableFuture.completedFuture($$3) : CompletableFuture.supplyAsync(() -> {
         int $$8 = $$3.f($$7 * $$4.a() - 1 + $$5);
         int $$9 = $$3.f($$5);
         Set<edm> $$10 = Sets.newHashSet();

         for (int $$11 = $$8; $$11 >= $$9; $$11--) {
            edm $$12 = $$3.b($$11);
            $$12.a();
            $$10.add($$12);
         }

         edb var20;
         try {
            var20 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
         } finally {
            for (edm $$14 : $$10) {
               $$14.b();
            }
         }

         return var20;
      }, ag.h().a("wgen_fill_noise"));
   }

   private edb a(eif $$0, dkt $$1, ehr $$2, edb $$3, int $$4, int $$5) {
      ehh $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      ehd $$7 = $$3.a(ehd.a.c);
      ehd $$8 = $$3.a(ehd.a.a);
      djc $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      egp $$12 = $$6.i();
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
            edm $$21 = $$3.b($$20);

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
                        ebe $$36 = $$6.e();
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

   private ebe a(ehh $$0, int $$1, int $$2, int $$3, ebe $$4) {
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
   public void a(asa $$0) {
      if (!this.e.a().a()) {
         djc $$1 = $$0.b();
         jf<dla> $$2 = $$0.u($$1.l().h($$0.ao()));
         eic $$3 = new eic(new ehe(ehs.a()));
         $$3.a($$0.E(), $$1.d(), $$1.e());
         dki.a($$0, $$2, $$1, $$3);
      }
   }
}
