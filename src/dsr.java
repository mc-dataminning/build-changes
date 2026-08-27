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

public final class dsr extends doy {
   public static final Codec<dsr> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(cye.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dst.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dsr::new))
   );
   private static final dnb d = dae.a.o();
   private final il<dst> e;
   private final Supplier<dsa.a> f;

   public dsr(cye $$0, il<dst> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dsa.a a(dst $$0) {
      dsa.b $$1 = new dsa.b(-54, dae.H.o());
      int $$2 = $$0.l();
      dsa.b $$3 = new dsa.b($$2, $$0.h());
      dsa.b $$4 = new dsa.b(dqo.e * 2, dae.a.o());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dox> a(Executor $$0, dtc $$1, dtq $$2, cxu $$3, dox $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         this.a($$2, $$1, $$3, $$4);
         return $$4;
      }), ac.f());
   }

   private void a(dtq $$0, dtc $$1, cxu $$2, dox $$3) {
      dss $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      cyd $$5 = dsc.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dss a(dox $$0, cxu $$1, dtq $$2, dtc $$3) {
      return dss.a($$0, $$3, dsb.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected Codec<? extends doy> a() {
      return c;
   }

   public il<dst> g() {
      return this.e;
   }

   public boolean a(ajg<dst> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dso.a $$2, cxd $$3, dtc $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.I_());
   }

   @Override
   public cxn a(int $$0, int $$1, cxd $$2, dtc $$3) {
      MutableObject<cxn> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (cxn)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dtc $$1, ib $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dsu $$4 = $$1.a();
      dsh.e $$5 = new dsh.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dsv.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(cxd $$0, dtc $$1, int $$2, int $$3, @Nullable MutableObject<cxn> $$4, @Nullable Predicate<dnb> $$5) {
      dsw $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = aww.a($$8, $$7);
      int $$10 = aww.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dnb[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dnb[$$6.d()];
            $$4.setValue(new cxn($$8, $$11));
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
         dss $$22 = new dss(1, $$1, $$18, $$19, $$6, dsi.b.a, this.e.a(), this.f.get(), dtq.a());
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
               dnb $$27 = $$22.e();
               dnb $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(apm $$0, cxu $$1, dtc $$2, dox $$3) {
      if (!aa.a($$3.f())) {
         dtl $$4 = new dtl(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.F_(), $$0.H_().d(kj.au), dtq.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dox $$0, dtl $$1, dtc $$2, cxu $$3, cyc $$4, iy<cya> $$5, dtq $$6) {
      dss $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dst $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(apm $$0, long $$1, dtc $$2, cyc $$3, cxu $$4, dox $$5, dsk.a $$6) {
      cyc $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dtn $$8 = new dtn(new dsp(dtd.a()));
      int $$9 = 8;
      cwi $$10 = $$5.f();
      dss $$11 = $$5.a($$3x -> this.a($$3x, $$4, dtq.a($$0), $$2));
      dsa $$12 = $$11.i();
      duo $$13 = new duo(this, $$0.H_(), $$5.z(), $$11, $$2, this.e.a().j());
      dow $$14 = ((dps)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            cwi $$17 = new cwi($$10.e + $$15, $$10.f + $$16);
            dox $$18 = $$0.a($$17.e, $$17.f);
            cyb $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(iw.a($$17.d()), 0, iw.a($$17.e()), $$2.b())));
            Iterable<il<dur<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (il<dur<?>> $$22 : $$20) {
               dur<?> $$23 = $$22.a();
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
   public CompletableFuture<dox> a(Executor $$0, dtq $$1, dtc $$2, cxu $$3, dox $$4) {
      dsw $$5 = this.e.a().f().a($$4.z());
      int $$6 = $$5.c();
      int $$7 = aww.a($$6, $$5.a());
      int $$8 = aww.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<dpj> $$11 = Sets.newHashSet();

         for (int $$12 = $$9; $$12 >= $$10; $$12--) {
            dpj $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> this.a($$1, $$3, $$2, $$4, $$7, $$8)), ac.f()).whenCompleteAsync(($$1x, $$2x) -> {
            for (dpj $$3x : $$11) {
               $$3x.b();
            }
         }, $$0);
      }
   }

   private dox a(dtq $$0, cxu $$1, dtc $$2, dox $$3, int $$4, int $$5) {
      dss $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dso $$7 = $$3.a(dso.a.c);
      dso $$8 = $$3.a(dso.a.a);
      cwi $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dsa $$12 = $$6.i();
      $$6.f();
      ib.a $$13 = new ib.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.al() - 1;
            dpj $$21 = $$3.b($$20);

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
                        dnb $$36 = $$6.e();
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

   private dnb a(dss $$0, int $$1, int $$2, int $$3, dnb $$4) {
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
   public void a(apm $$0) {
      if (!this.e.a().a()) {
         cwi $$1 = $$0.a();
         il<cya> $$2 = $$0.t($$1.l().h($$0.ak() - 1));
         dtn $$3 = new dtn(new dsp(dtd.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         cxm.a($$0, $$2, $$1, $$3);
      }
   }
}
