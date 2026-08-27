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

public final class dkx extends dhi {
   public static final Codec<dkx> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqz.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dkz.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dkx::new))
   );
   private static final dfl d = csy.a.n();
   private final hg<dkz> e;
   private final Supplier<dkg.a> f;

   public dkx(cqz $$0, hg<dkz> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dkg.a a(dkz $$0) {
      dkg.b $$1 = new dkg.b(-54, csy.H.n());
      int $$2 = $$0.l();
      dkg.b $$3 = new dkg.b($$2, $$0.h());
      dkg.b $$4 = new dkg.b(diu.e * 2, csy.a.n());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dhh> a(Executor $$0, dli $$1, dlw $$2, cqp $$3, dhh $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         this.a($$2, $$1, $$3, $$4);
         return $$4;
      }), ac.f());
   }

   private void a(dlw $$0, dli $$1, cqp $$2, dhh $$3) {
      dky $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      cqy $$5 = dki.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dky a(dhh $$0, cqp $$1, dlw $$2, dli $$3) {
      return dky.a($$0, $$3, dkh.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected Codec<? extends dhi> a() {
      return c;
   }

   public hg<dkz> g() {
      return this.e;
   }

   public boolean a(aex<dkz> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dku.a $$2, cpz $$3, dli $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.H_());
   }

   @Override
   public cqj a(int $$0, int $$1, cpz $$2, dli $$3) {
      MutableObject<cqj> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (cqj)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dli $$1, gw $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dla $$4 = $$1.a();
      dkn.e $$5 = new dkn.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dlb.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(cpz $$0, dli $$1, int $$2, int $$3, @Nullable MutableObject<cqj> $$4, @Nullable Predicate<dfl> $$5) {
      dlc $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = ary.a($$8, $$7);
      int $$10 = ary.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dfl[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dfl[$$6.d()];
            $$4.setValue(new cqj($$8, $$11));
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
         dky $$22 = new dky(1, $$1, $$18, $$19, $$6, dko.b.a, this.e.a(), this.f.get(), dlw.a());
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
               dfl $$27 = $$22.e();
               dfl $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(akz $$0, cqp $$1, dli $$2, dhh $$3) {
      if (!aa.a($$3.f())) {
         dlr $$4 = new dlr(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.E_(), $$0.G_().d(je.ap), dlw.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dhh $$0, dlr $$1, dli $$2, cqp $$3, cqx $$4, ht<cqv> $$5, dlw $$6) {
      dky $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dkz $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(akz $$0, long $$1, dli $$2, cqx $$3, cqp $$4, dhh $$5, dkq.a $$6) {
      cqx $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dlt $$8 = new dlt(new dkv(dlj.a()));
      int $$9 = 8;
      cpe $$10 = $$5.f();
      dky $$11 = $$5.a($$3x -> this.a($$3x, $$4, dlw.a($$0), $$2));
      dkg $$12 = $$11.i();
      dmu $$13 = new dmu(this, $$0.G_(), $$5.z(), $$11, $$2, this.e.a().j());
      dhg $$14 = ((dic)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            cpe $$17 = new cpe($$10.e + $$15, $$10.f + $$16);
            dhh $$18 = $$0.a($$17.e, $$17.f);
            cqw $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(hs.a($$17.d()), 0, hs.a($$17.e()), $$2.b())));
            Iterable<hg<dmx<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (hg<dmx<?>> $$22 : $$20) {
               dmx<?> $$23 = $$22.a();
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
   public CompletableFuture<dhh> a(Executor $$0, dlw $$1, dli $$2, cqp $$3, dhh $$4) {
      dlc $$5 = this.e.a().f().a($$4.z());
      int $$6 = $$5.c();
      int $$7 = ary.a($$6, $$5.a());
      int $$8 = ary.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<dht> $$11 = Sets.newHashSet();

         for (int $$12 = $$9; $$12 >= $$10; $$12--) {
            dht $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> this.a($$1, $$3, $$2, $$4, $$7, $$8)), ac.f()).whenCompleteAsync(($$1x, $$2x) -> {
            for (dht $$3x : $$11) {
               $$3x.b();
            }
         }, $$0);
      }
   }

   private dhh a(dlw $$0, cqp $$1, dli $$2, dhh $$3, int $$4, int $$5) {
      dky $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dku $$7 = $$3.a(dku.a.c);
      dku $$8 = $$3.a(dku.a.a);
      cpe $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dkg $$12 = $$6.i();
      $$6.f();
      gw.a $$13 = new gw.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.ak() - 1;
            dht $$21 = $$3.b($$20);

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
                        dfl $$36 = $$6.e();
                        if ($$36 == null) {
                           $$36 = this.e.a().g();
                        }

                        $$36 = this.a($$6, $$29, $$24, $$33, $$36);
                        if ($$36 != d && !aa.a($$3.f())) {
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

   private dfl a(dky $$0, int $$1, int $$2, int $$3, dfl $$4) {
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
   public void a(akz $$0) {
      if (!this.e.a().a()) {
         cpe $$1 = $$0.a();
         hg<cqv> $$2 = $$0.s($$1.l().h($$0.aj() - 1));
         dlt $$3 = new dlt(new dkv(dlj.a()));
         $$3.a($$0.A(), $$1.d(), $$1.e());
         cqi.a($$0, $$2, $$1, $$3);
      }
   }
}
