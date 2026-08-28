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

public final class eds extends dzq {
   public static final MapCodec<eds> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(din.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), edu.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(eds::new))
   );
   private static final dxu d = dkn.a.m();
   private final jq<edu> e;
   private final Supplier<edb.a> f;

   public eds(din $$0, jq<edu> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static edb.a a(edu $$0) {
      edb.b $$1 = new edb.b(-54, dkn.K.m());
      int $$2 = $$0.l();
      edb.b $$3 = new edb.b($$2, $$0.h());
      edb.b $$4 = new edb.b(ebp.e * 2, dkn.a.m());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dzp> a(eed $$0, eer $$1, did $$2, dzp $$3) {
      return CompletableFuture.supplyAsync(() -> {
         this.b($$1, $$0, $$2, $$3);
         return $$3;
      }, ae.g().a("init_biomes"));
   }

   private void b(eer $$0, eed $$1, did $$2, dzp $$3) {
      edt $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dim $$5 = edd.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private edt a(dzp $$0, did $$1, eer $$2, eed $$3) {
      return edt.a($$0, $$3, edc.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends dzq> b() {
      return c;
   }

   public jq<edu> h() {
      return this.e;
   }

   public boolean a(aly<edu> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, edp.a $$2, dhj $$3, eed $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.L_());
   }

   @Override
   public dht a(int $$0, int $$1, dhj $$2, eed $$3) {
      MutableObject<dht> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dht)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, eed $$1, jh $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      edv $$4 = $$1.a();
      edi.e $$5 = new edi.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)edw.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(dhj $$0, eed $$1, int $$2, int $$3, @Nullable MutableObject<dht> $$4, @Nullable Predicate<dxu> $$5) {
      edx $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = bae.a($$8, $$7);
      int $$10 = bae.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dxu[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dxu[$$6.d()];
            $$4.setValue(new dht($$8, $$11));
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
         edt $$22 = new edt(1, $$1, $$18, $$19, $$6, edj.b.a, this.e.a(), this.f.get(), eer.a());
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
               dxu $$27 = $$22.e();
               dxu $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(asp $$0, did $$1, eed $$2, dzp $$3) {
      if (!ab.a($$3.f())) {
         eem $$4 = new eem(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.I_(), $$0.K_().e(mb.aI), eer.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dzp $$0, eem $$1, eed $$2, did $$3, dil $$4, kd<dij> $$5, eer $$6) {
      edt $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      edu $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(asp $$0, long $$1, eed $$2, dil $$3, did $$4, dzp $$5) {
      dil $$6 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      eeo $$7 = new eeo(new edq(eee.a()));
      int $$8 = 8;
      dgn $$9 = $$5.f();
      edt $$10 = $$5.a($$3x -> this.a($$3x, $$4, eer.a($$0), $$2));
      edb $$11 = $$10.i();
      efq $$12 = new efq(this, $$0.K_(), $$5.y(), $$10, $$2, this.e.a().j());
      dzo $$13 = ((eaj)$$5).C();

      for (int $$14 = -8; $$14 <= 8; $$14++) {
         for (int $$15 = -8; $$15 <= 8; $$15++) {
            dgn $$16 = new dgn($$9.g + $$14, $$9.h + $$15);
            dzp $$17 = $$0.a($$16.g, $$16.h);
            dik $$18 = $$17.a(() -> this.a(this.b.getNoiseBiome(kb.a($$16.d()), 0, kb.a($$16.e()), $$2.b())));
            Iterable<jq<eft<?>>> $$19 = $$18.a();
            int $$20 = 0;

            for (jq<eft<?>> $$21 : $$19) {
               eft<?> $$22 = $$21.a();
               $$7.c($$1 + (long)$$20, $$16.g, $$16.h);
               if ($$22.a($$7)) {
                  $$22.a($$12, $$5, $$6::a, $$7, $$11, $$16, $$13);
               }

               $$20++;
            }
         }
      }
   }

   @Override
   public CompletableFuture<dzp> a(eer $$0, eed $$1, did $$2, dzp $$3) {
      edx $$4 = this.e.a().f().a($$3.y());
      int $$5 = $$4.c();
      int $$6 = bae.a($$5, $$4.a());
      int $$7 = bae.a($$4.d(), $$4.a());
      return $$7 <= 0 ? CompletableFuture.completedFuture($$3) : CompletableFuture.supplyAsync(() -> {
         int $$8 = $$3.f($$7 * $$4.a() - 1 + $$5);
         int $$9 = $$3.f($$5);
         Set<eaa> $$10 = Sets.newHashSet();

         for (int $$11 = $$8; $$11 >= $$9; $$11--) {
            eaa $$12 = $$3.b($$11);
            $$12.a();
            $$10.add($$12);
         }

         dzp var20;
         try {
            var20 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
         } finally {
            for (eaa $$14 : $$10) {
               $$14.b();
            }
         }

         return var20;
      }, ae.g().a("wgen_fill_noise"));
   }

   private dzp a(eer $$0, did $$1, eed $$2, dzp $$3, int $$4, int $$5) {
      edt $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      edp $$7 = $$3.a(edp.a.c);
      edp $$8 = $$3.a(edp.a.a);
      dgn $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      edb $$12 = $$6.i();
      $$6.f();
      jh.a $$13 = new jh.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.an() - 1;
            eaa $$21 = $$3.b($$20);

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
                        dxu $$36 = $$6.e();
                        if ($$36 == null) {
                           $$36 = this.e.a().g();
                        }

                        $$36 = this.a($$6, $$29, $$24, $$33, $$36);
                        if ($$36 != d && !ab.a($$3.f())) {
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

   private dxu a(edt $$0, int $$1, int $$2, int $$3, dxu $$4) {
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
   public void a(asp $$0) {
      if (!this.e.a().a()) {
         dgn $$1 = $$0.b();
         jq<dij> $$2 = $$0.t($$1.l().h($$0.am()));
         eeo $$3 = new eeo(new edq(eee.a()));
         $$3.a($$0.D(), $$1.d(), $$1.e());
         dhs.a($$0, $$2, $$1, $$3);
      }
   }
}
