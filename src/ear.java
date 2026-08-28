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

public final class ear extends dwp {
   public static final MapCodec<ear> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfo.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), eat.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(ear::new))
   );
   private static final dus d = dho.a.n();
   private final jo<eat> e;
   private final Supplier<eaa.a> f;

   public ear(dfo $$0, jo<eat> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static eaa.a a(eat $$0) {
      eaa.b $$1 = new eaa.b(-54, dho.H.n());
      int $$2 = $$0.l();
      eaa.b $$3 = new eaa.b($$2, $$0.h());
      eaa.b $$4 = new eaa.b(dyo.e * 2, dho.a.n());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dwo> a(ebc $$0, ebq $$1, dfe $$2, dwo $$3) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         this.b($$1, $$0, $$2, $$3);
         return $$3;
      }), ad.g());
   }

   private void b(ebq $$0, ebc $$1, dfe $$2, dwo $$3) {
      eas $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dfn $$5 = eac.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private eas a(dwo $$0, dfe $$1, ebq $$2, ebc $$3) {
      return eas.a($$0, $$3, eab.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends dwp> b() {
      return c;
   }

   public jo<eat> h() {
      return this.e;
   }

   public boolean a(ald<eat> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, eao.a $$2, del $$3, ebc $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.H_());
   }

   @Override
   public dev a(int $$0, int $$1, del $$2, ebc $$3) {
      MutableObject<dev> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dev)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, ebc $$1, jf $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      eau $$4 = $$1.a();
      eah.e $$5 = new eah.e($$2.u(), $$2.v(), $$2.w());
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
            + $$3.format((double)eav.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(del $$0, ebc $$1, int $$2, int $$3, @Nullable MutableObject<dev> $$4, @Nullable Predicate<dus> $$5) {
      eaw $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = azf.a($$8, $$7);
      int $$10 = azf.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         dus[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new dus[$$6.d()];
            $$4.setValue(new dev($$8, $$11));
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
         eas $$22 = new eas(1, $$1, $$18, $$19, $$6, eai.b.a, this.e.a(), this.f.get(), ebq.a());
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
               dus $$27 = $$22.e();
               dus $$28 = $$27 == null ? this.e.a().g() : $$27;
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
   public void a(arq $$0, dfe $$1, ebc $$2, dwo $$3) {
      if (!ab.a($$3.f())) {
         ebl $$4 = new ebl(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.E_(), $$0.G_().e(lw.aH), ebq.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dwo $$0, ebl $$1, ebc $$2, dfe $$3, dfm $$4, kb<dfk> $$5, ebq $$6) {
      eas $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      eat $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(arq $$0, long $$1, ebc $$2, dfm $$3, dfe $$4, dwo $$5) {
      dfm $$6 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      ebn $$7 = new ebn(new eap(ebd.a()));
      int $$8 = 8;
      ddp $$9 = $$5.f();
      eas $$10 = $$5.a($$3x -> this.a($$3x, $$4, ebq.a($$0), $$2));
      eaa $$11 = $$10.i();
      ecp $$12 = new ecp(this, $$0.G_(), $$5.y(), $$10, $$2, this.e.a().j());
      dwn $$13 = ((dxi)$$5).C();

      for (int $$14 = -8; $$14 <= 8; $$14++) {
         for (int $$15 = -8; $$15 <= 8; $$15++) {
            ddp $$16 = new ddp($$9.e + $$14, $$9.f + $$15);
            dwo $$17 = $$0.a($$16.e, $$16.f);
            dfl $$18 = $$17.a(() -> this.a(this.b.getNoiseBiome(jz.a($$16.d()), 0, jz.a($$16.e()), $$2.b())));
            Iterable<jo<ecs<?>>> $$19 = $$18.a();
            int $$20 = 0;

            for (jo<ecs<?>> $$21 : $$19) {
               ecs<?> $$22 = $$21.a();
               $$7.c($$1 + (long)$$20, $$16.e, $$16.f);
               if ($$22.a($$7)) {
                  $$22.a($$12, $$5, $$6::a, $$7, $$11, $$16, $$13);
               }

               $$20++;
            }
         }
      }
   }

   @Override
   public CompletableFuture<dwo> a(ebq $$0, ebc $$1, dfe $$2, dwo $$3) {
      eaw $$4 = this.e.a().f().a($$3.y());
      int $$5 = $$4.c();
      int $$6 = azf.a($$5, $$4.a());
      int $$7 = azf.a($$4.d(), $$4.a());
      return $$7 <= 0 ? CompletableFuture.completedFuture($$3) : CompletableFuture.supplyAsync(ad.a("wgen_fill_noise", () -> {
         int $$8 = $$3.f($$7 * $$4.a() - 1 + $$5);
         int $$9 = $$3.f($$5);
         Set<dwz> $$10 = Sets.newHashSet();

         for (int $$11 = $$8; $$11 >= $$9; $$11--) {
            dwz $$12 = $$3.b($$11);
            $$12.a();
            $$10.add($$12);
         }

         dwo var20;
         try {
            var20 = this.a($$0, $$2, $$1, $$3, $$6, $$7);
         } finally {
            for (dwz $$14 : $$10) {
               $$14.b();
            }
         }

         return var20;
      }), ad.g());
   }

   private dwo a(ebq $$0, dfe $$1, ebc $$2, dwo $$3, int $$4, int $$5) {
      eas $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      eao $$7 = $$3.a(eao.a.c);
      eao $$8 = $$3.a(eao.a.a);
      ddp $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      eaa $$12 = $$6.i();
      $$6.f();
      jf.a $$13 = new jf.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.ao() - 1;
            dwz $$21 = $$3.b($$20);

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
                        dus $$36 = $$6.e();
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

   private dus a(eas $$0, int $$1, int $$2, int $$3, dus $$4) {
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
   public void a(arq $$0) {
      if (!this.e.a().a()) {
         ddp $$1 = $$0.a();
         jo<dfk> $$2 = $$0.t($$1.l().h($$0.an()));
         ebn $$3 = new ebn(new eap(ebd.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         deu.a($$0, $$2, $$1, $$3);
      }
   }
}
