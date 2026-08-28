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

public final class dyi extends duh {
   public static final MapCodec<dyi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddj.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dyk.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dyi::new))
   );
   private static final dsk d = dfj.a.o();
   private final jj<dyk> e;
   private final Supplier<dxr.a> f;

   public dyi(ddj $$0, jj<dyk> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dxr.a a(dyk $$0) {
      dxr.b $$1 = new dxr.b(-54, dfj.H.o());
      int $$2 = $$0.l();
      dxr.b $$3 = new dxr.b($$2, $$0.h());
      dxr.b $$4 = new dxr.b(dwf.e * 2, dfj.a.o());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dug> a(dyt $$0, dzh $$1, dcz $$2, dug $$3) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         this.b($$1, $$0, $$2, $$3);
         return $$3;
      }), ac.g());
   }

   private void b(dzh $$0, dyt $$1, dcz $$2, dug $$3) {
      dyj $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      ddi $$5 = dxt.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dyj a(dug $$0, dcz $$1, dzh $$2, dyt $$3) {
      return dyj.a($$0, $$3, dxs.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends duh> b() {
      return c;
   }

   public jj<dyk> h() {
      return this.e;
   }

   public boolean a(akj<dyk> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dyf.a $$2, dch $$3, dyt $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.I_());
   }

   @Override
   public dcr a(int $$0, int $$1, dch $$2, dyt $$3) {
      MutableObject<dcr> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dcr)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dyt $$1, ja $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dyl $$4 = $$1.a();
      dxy.e $$5 = new dxy.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)dym.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(dch $$0, dyt $$1, int $$2, int $$3, @Nullable MutableObject<dcr> $$4, @Nullable Predicate<dsk> $$5) {
      dyn $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = ayg.a($$8, $$7);
      int $$10 = ayg.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dsk[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dsk[$$6.d()];
            $$4.setValue(new dcr($$8, $$11));
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
         dyj $$22 = new dyj(1, $$1, $$18, $$19, $$6, dxz.b.a, this.e.a(), this.f.get(), dzh.a());
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
               dsk $$27 = $$22.e();
               dsk $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(aqt $$0, dcz $$1, dyt $$2, dug $$3) {
      if (!aa.a($$3.f())) {
         dzc $$4 = new dzc(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.F_(), $$0.H_().d(lr.aE), dzh.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dug $$0, dzc $$1, dyt $$2, dcz $$3, ddh $$4, jw<ddf> $$5, dzh $$6) {
      dyj $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dyk $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(aqt $$0, long $$1, dyt $$2, ddh $$3, dcz $$4, dug $$5, dyb.a $$6) {
      ddh $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dze $$8 = new dze(new dyg(dyu.a()));
      int $$9 = 8;
      dbm $$10 = $$5.f();
      dyj $$11 = $$5.a($$3x -> this.a($$3x, $$4, dzh.a($$0), $$2));
      dxr $$12 = $$11.i();
      eag $$13 = new eag(this, $$0.H_(), $$5.z(), $$11, $$2, this.e.a().j());
      duf $$14 = ((dva)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            dbm $$17 = new dbm($$10.e + $$15, $$10.f + $$16);
            dug $$18 = $$0.a($$17.e, $$17.f);
            ddg $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(ju.a($$17.d()), 0, ju.a($$17.e()), $$2.b())));
            Iterable<jj<eaj<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (jj<eaj<?>> $$22 : $$20) {
               eaj<?> $$23 = $$22.a();
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
   public CompletableFuture<dug> a(dzh $$0, dyt $$1, dcz $$2, dug $$3) {
      dyn $$4 = this.e.a().f().a($$3.z());
      int $$5 = $$4.c();
      int $$6 = ayg.a($$5, $$4.a());
      int $$7 = ayg.a($$4.d(), $$4.a());
      return $$7 <= 0 ? CompletableFuture.completedFuture($$3) : CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> {
         int $$8 = $$3.e($$7 * $$4.a() - 1 + $$5);
         int $$9 = $$3.e($$5);
         Set<dur> $$10 = Sets.newHashSet();

         for (int $$11 = $$8; $$11 >= $$9; $$11--) {
            dur $$12 = $$3.b($$11);
            $$12.a();
            $$10.add($$12);
         }

         dug var20;
         try {
            var20 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
         } finally {
            for (dur $$14 : $$10) {
               $$14.b();
            }
         }

         return var20;
      }), ac.g());
   }

   private dug a(dzh $$0, dcz $$1, dyt $$2, dug $$3, int $$4, int $$5) {
      dyj $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dyf $$7 = $$3.a(dyf.a.c);
      dyf $$8 = $$3.a(dyf.a.a);
      dbm $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dxr $$12 = $$6.i();
      $$6.f();
      ja.a $$13 = new ja.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.an() - 1;
            dur $$21 = $$3.b($$20);

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
                        dsk $$36 = $$6.e();
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

   private dsk a(dyj $$0, int $$1, int $$2, int $$3, dsk $$4) {
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
   public void a(aqt $$0) {
      if (!this.e.a().a()) {
         dbm $$1 = $$0.a();
         jj<ddf> $$2 = $$0.t($$1.l().h($$0.am() - 1));
         dze $$3 = new dze(new dyg(dyu.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         dcq.a($$0, $$2, $$1, $$3);
      }
   }
}
