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

public final class dkp extends dha {
   public static final Codec<dkp> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(crd.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dkr.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dkp::new))
   );
   private static final dfd d = cte.a.o();
   private final he<dkr> e;
   private final Supplier<djy.a> f;

   public dkp(crd $$0, he<dkr> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static djy.a a(dkr $$0) {
      djy.b $$1 = new djy.b(-54, cte.H.o());
      int $$2 = $$0.l();
      djy.b $$3 = new djy.b($$2, $$0.h());
      djy.b $$4 = new djy.b(dim.e * 2, cte.a.o());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dgz> a(Executor $$0, dla $$1, dlo $$2, cqt $$3, dgz $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         this.a($$2, $$1, $$3, $$4);
         return $$4;
      }), ac.f());
   }

   private void a(dlo $$0, dla $$1, cqt $$2, dgz $$3) {
      dkq $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      crc $$5 = dka.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dkq a(dgz $$0, cqt $$1, dlo $$2, dla $$3) {
      return dkq.a($$0, $$3, djz.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected Codec<? extends dha> a() {
      return c;
   }

   public he<dkr> g() {
      return this.e;
   }

   public boolean a(aey<dkr> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dkm.a $$2, cqd $$3, dla $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.H_());
   }

   @Override
   public cqn a(int $$0, int $$1, cqd $$2, dla $$3) {
      MutableObject<cqn> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (cqn)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dla $$1, gw $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dks $$4 = $$1.a();
      dkf.e $$5 = new dkf.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dkt.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(cqd $$0, dla $$1, int $$2, int $$3, @Nullable MutableObject<cqn> $$4, @Nullable Predicate<dfd> $$5) {
      dku $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = asb.a($$8, $$7);
      int $$10 = asb.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dfd[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dfd[$$6.d()];
            $$4.setValue(new cqn($$8, $$11));
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
         dkq $$22 = new dkq(1, $$1, $$18, $$19, $$6, dkg.b.a, this.e.a(), this.f.get(), dlo.a());
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
               dfd $$27 = $$22.e();
               dfd $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(ala $$0, cqt $$1, dla $$2, dgz $$3) {
      if (!aa.a($$3.f())) {
         dlj $$4 = new dlj(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.E_(), $$0.G_().d(jc.aq), dlo.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dgz $$0, dlj $$1, dla $$2, cqt $$3, crb $$4, hq<cqz> $$5, dlo $$6) {
      dkq $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dkr $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(ala $$0, long $$1, dla $$2, crb $$3, cqt $$4, dgz $$5, dki.a $$6) {
      crb $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dll $$8 = new dll(new dkn(dlb.a()));
      int $$9 = 8;
      cpi $$10 = $$5.f();
      dkq $$11 = $$5.a($$3x -> this.a($$3x, $$4, dlo.a($$0), $$2));
      djy $$12 = $$11.i();
      dmm $$13 = new dmm(this, $$0.G_(), $$5.z(), $$11, $$2, this.e.a().j());
      dgy $$14 = ((dhu)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            cpi $$17 = new cpi($$10.e + $$15, $$10.f + $$16);
            dgz $$18 = $$0.a($$17.e, $$17.f);
            cra $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(hp.a($$17.d()), 0, hp.a($$17.e()), $$2.b())));
            Iterable<he<dmp<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (he<dmp<?>> $$22 : $$20) {
               dmp<?> $$23 = $$22.a();
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
   public CompletableFuture<dgz> a(Executor $$0, dlo $$1, dla $$2, cqt $$3, dgz $$4) {
      dku $$5 = this.e.a().f().a($$4.z());
      int $$6 = $$5.c();
      int $$7 = asb.a($$6, $$5.a());
      int $$8 = asb.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<dhl> $$11 = Sets.newHashSet();

         for (int $$12 = $$9; $$12 >= $$10; $$12--) {
            dhl $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> this.a($$1, $$3, $$2, $$4, $$7, $$8)), ac.f()).whenCompleteAsync(($$1x, $$2x) -> {
            for (dhl $$3x : $$11) {
               $$3x.b();
            }
         }, $$0);
      }
   }

   private dgz a(dlo $$0, cqt $$1, dla $$2, dgz $$3, int $$4, int $$5) {
      dkq $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dkm $$7 = $$3.a(dkm.a.c);
      dkm $$8 = $$3.a(dkm.a.a);
      cpi $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      djy $$12 = $$6.i();
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
            dhl $$21 = $$3.b($$20);

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
                        dfd $$36 = $$6.e();
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

   private dfd a(dkq $$0, int $$1, int $$2, int $$3, dfd $$4) {
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
   public void a(ala $$0) {
      if (!this.e.a().a()) {
         cpi $$1 = $$0.a();
         he<cqz> $$2 = $$0.s($$1.l().h($$0.aj() - 1));
         dll $$3 = new dll(new dkn(dlb.a()));
         $$3.a($$0.A(), $$1.d(), $$1.e());
         cqm.a($$0, $$2, $$1, $$3);
      }
   }
}
