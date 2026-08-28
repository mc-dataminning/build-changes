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
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public final class dxx extends dtz {
   public static final MapCodec<dxx> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddb.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dxz.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dxx::new))
   );
   private static final dsc d = dfb.a.o();
   private final ji<dxz> e;
   private final Supplier<dxg.a> f;

   public dxx(ddb $$0, ji<dxz> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dxg.a a(dxz $$0) {
      dxg.b $$1 = new dxg.b(-54, dfb.H.o());
      int $$2 = $$0.l();
      dxg.b $$3 = new dxg.b($$2, $$0.h());
      dxg.b $$4 = new dxg.b(dvu.e * 2, dfb.a.o());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dty> a(Executor $$0, dyi $$1, dyw $$2, dcr $$3, dty $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         this.a($$2, $$1, $$3, $$4);
         return $$4;
      }), ac.g());
   }

   private void a(dyw $$0, dyi $$1, dcr $$2, dty $$3) {
      dxy $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dda $$5 = dxi.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dxy a(dty $$0, dcr $$1, dyw $$2, dyi $$3) {
      return dxy.a($$0, $$3, dxh.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends dtz> b() {
      return c;
   }

   public ji<dxz> h() {
      return this.e;
   }

   public boolean a(ale<dxz> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dxu.a $$2, dca $$3, dyi $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.I_());
   }

   @Override
   public dck a(int $$0, int $$1, dca $$2, dyi $$3) {
      MutableObject<dck> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dck)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dyi $$1, iz $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dya $$4 = $$1.a();
      dxn.e $$5 = new dxn.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dyb.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(dca $$0, dyi $$1, int $$2, int $$3, @Nullable MutableObject<dck> $$4, @Nullable Predicate<dsc> $$5) {
      dyc $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = ayz.a($$8, $$7);
      int $$10 = ayz.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dsc[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dsc[$$6.d()];
            $$4.setValue(new dck($$8, $$11));
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
         dxy $$22 = new dxy(1, $$1, $$18, $$19, $$6, dxo.b.a, this.e.a(), this.f.get(), dyw.a());
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
               dsc $$27 = $$22.e();
               dsc $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(arm $$0, dcr $$1, dyi $$2, dty $$3) {
      if (!aa.a($$3.f())) {
         dyr $$4 = new dyr(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.F_(), $$0.H_().d(lq.az), dyw.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dty $$0, dyr $$1, dyi $$2, dcr $$3, dcz $$4, jv<dcx> $$5, dyw $$6) {
      dxy $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dxz $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(arm $$0, long $$1, dyi $$2, dcz $$3, dcr $$4, dty $$5, dxq.a $$6) {
      dcz $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dyt $$8 = new dyt(new dxv(dyj.a()));
      int $$9 = 8;
      dbf $$10 = $$5.f();
      dxy $$11 = $$5.a($$3x -> this.a($$3x, $$4, dyw.a($$0), $$2));
      dxg $$12 = $$11.i();
      dzu $$13 = new dzu(this, $$0.H_(), $$5.z(), $$11, $$2, this.e.a().j());
      dtx $$14 = ((dus)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            dbf $$17 = new dbf($$10.e + $$15, $$10.f + $$16);
            dty $$18 = $$0.a($$17.e, $$17.f);
            dcy $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(jt.a($$17.d()), 0, jt.a($$17.e()), $$2.b())));
            Iterable<ji<dzx<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (ji<dzx<?>> $$22 : $$20) {
               dzx<?> $$23 = $$22.a();
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
   public CompletableFuture<dty> a(Executor $$0, dyw $$1, dyi $$2, dcr $$3, dty $$4) {
      dyc $$5 = this.e.a().f().a($$4.z());
      int $$6 = $$5.c();
      int $$7 = ayz.a($$6, $$5.a());
      int $$8 = ayz.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<duj> $$11 = Sets.newHashSet();

         for (int $$12 = $$9; $$12 >= $$10; $$12--) {
            duj $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> this.a($$1, $$3, $$2, $$4, $$7, $$8)), ac.g()).whenCompleteAsync(($$1x, $$2x) -> {
            for (duj $$3x : $$11) {
               $$3x.b();
            }
         }, $$0);
      }
   }

   private dty a(dyw $$0, dcr $$1, dyi $$2, dty $$3, int $$4, int $$5) {
      dxy $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dxu $$7 = $$3.a(dxu.a.c);
      dxu $$8 = $$3.a(dxu.a.a);
      dbf $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dxg $$12 = $$6.i();
      $$6.f();
      iz.a $$13 = new iz.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.an() - 1;
            duj $$21 = $$3.b($$20);

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
                        dsc $$36 = $$6.e();
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

   private dsc a(dxy $$0, int $$1, int $$2, int $$3, dsc $$4) {
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
   public void a(arm $$0) {
      if (!this.e.a().a()) {
         dbf $$1 = $$0.a();
         ji<dcx> $$2 = $$0.t($$1.l().h($$0.am() - 1));
         dyt $$3 = new dyt(new dxv(dyj.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         dcj.a($$0, $$2, $$1, $$3);
      }
   }
}
