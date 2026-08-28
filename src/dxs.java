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

public final class dxs extends dtu {
   public static final MapCodec<dxs> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcw.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dxu.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dxs::new))
   );
   private static final drx d = dew.a.n();
   private final ji<dxu> e;
   private final Supplier<dxb.a> f;

   public dxs(dcw $$0, ji<dxu> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dxb.a a(dxu $$0) {
      dxb.b $$1 = new dxb.b(-54, dew.H.n());
      int $$2 = $$0.l();
      dxb.b $$3 = new dxb.b($$2, $$0.h());
      dxb.b $$4 = new dxb.b(dvp.e * 2, dew.a.n());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dtt> a(Executor $$0, dyd $$1, dyr $$2, dcm $$3, dtt $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         this.a($$2, $$1, $$3, $$4);
         return $$4;
      }), ac.g());
   }

   private void a(dyr $$0, dyd $$1, dcm $$2, dtt $$3) {
      dxt $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dcv $$5 = dxd.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dxt a(dtt $$0, dcm $$1, dyr $$2, dyd $$3) {
      return dxt.a($$0, $$3, dxc.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends dtu> a() {
      return c;
   }

   public ji<dxu> g() {
      return this.e;
   }

   public boolean a(ala<dxu> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dxp.a $$2, dbv $$3, dyd $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.I_());
   }

   @Override
   public dcf a(int $$0, int $$1, dbv $$2, dyd $$3) {
      MutableObject<dcf> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dcf)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dyd $$1, iz $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dxv $$4 = $$1.a();
      dxi.e $$5 = new dxi.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dxw.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(dbv $$0, dyd $$1, int $$2, int $$3, @Nullable MutableObject<dcf> $$4, @Nullable Predicate<drx> $$5) {
      dxx $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = ayu.a($$8, $$7);
      int $$10 = ayu.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         drx[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new drx[$$6.d()];
            $$4.setValue(new dcf($$8, $$11));
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
         dxt $$22 = new dxt(1, $$1, $$18, $$19, $$6, dxj.b.a, this.e.a(), this.f.get(), dyr.a());
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
               drx $$27 = $$22.e();
               drx $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(ari $$0, dcm $$1, dyd $$2, dtt $$3) {
      if (!aa.a($$3.f())) {
         dym $$4 = new dym(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.F_(), $$0.H_().d(lq.az), dyr.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dtt $$0, dym $$1, dyd $$2, dcm $$3, dcu $$4, jv<dcs> $$5, dyr $$6) {
      dxt $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dxu $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(ari $$0, long $$1, dyd $$2, dcu $$3, dcm $$4, dtt $$5, dxl.a $$6) {
      dcu $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dyo $$8 = new dyo(new dxq(dye.a()));
      int $$9 = 8;
      dba $$10 = $$5.f();
      dxt $$11 = $$5.a($$3x -> this.a($$3x, $$4, dyr.a($$0), $$2));
      dxb $$12 = $$11.i();
      dzp $$13 = new dzp(this, $$0.H_(), $$5.z(), $$11, $$2, this.e.a().j());
      dts $$14 = ((dun)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            dba $$17 = new dba($$10.e + $$15, $$10.f + $$16);
            dtt $$18 = $$0.a($$17.e, $$17.f);
            dct $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(jt.a($$17.d()), 0, jt.a($$17.e()), $$2.b())));
            Iterable<ji<dzs<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (ji<dzs<?>> $$22 : $$20) {
               dzs<?> $$23 = $$22.a();
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
   public CompletableFuture<dtt> a(Executor $$0, dyr $$1, dyd $$2, dcm $$3, dtt $$4) {
      dxx $$5 = this.e.a().f().a($$4.z());
      int $$6 = $$5.c();
      int $$7 = ayu.a($$6, $$5.a());
      int $$8 = ayu.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<due> $$11 = Sets.newHashSet();

         for (int $$12 = $$9; $$12 >= $$10; $$12--) {
            due $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> this.a($$1, $$3, $$2, $$4, $$7, $$8)), ac.g()).whenCompleteAsync(($$1x, $$2x) -> {
            for (due $$3x : $$11) {
               $$3x.b();
            }
         }, $$0);
      }
   }

   private dtt a(dyr $$0, dcm $$1, dyd $$2, dtt $$3, int $$4, int $$5) {
      dxt $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dxp $$7 = $$3.a(dxp.a.c);
      dxp $$8 = $$3.a(dxp.a.a);
      dba $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dxb $$12 = $$6.i();
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
            due $$21 = $$3.b($$20);

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
                        drx $$36 = $$6.e();
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

   private drx a(dxt $$0, int $$1, int $$2, int $$3, drx $$4) {
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
   public void a(ari $$0) {
      if (!this.e.a().a()) {
         dba $$1 = $$0.a();
         ji<dcs> $$2 = $$0.t($$1.l().h($$0.am() - 1));
         dyo $$3 = new dyo(new dxq(dye.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         dce.a($$0, $$2, $$1, $$3);
      }
   }
}
