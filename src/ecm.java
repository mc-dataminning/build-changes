import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class ecm {
   public static final Codec<ecm> a = mg.aa.q().dispatchStable(ecm::b, Function.identity());
   protected final dko b;
   private final Supplier<List<dku.b>> c;
   private final Function<jf<dkk>, dkl> d;

   public ecm(dko $$0) {
      this($$0, $$0x -> ((dkk)$$0x.a()).d());
   }

   public ecm(dko $$0, Function<jf<dkk>, dkl> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dku.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends ecm> b();

   public ecn a(jh<ero> $$0, ehb $$1, long $$2) {
      return ecn.a($$1, $$2, this.b, $$0);
   }

   public Optional<alf<MapCodec<? extends ecm>>> c() {
      return mg.aa.d(this.b());
   }

   public CompletableFuture<ecl> a(ehb $$0, ehp $$1, dkd $$2, ecl $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ag.h().a("init_biomes"));
   }

   public abstract void a(ary var1, long var2, ehb var4, dkm var5, dkd var6, ecl var7);

   @Nullable
   public Pair<iv, jf<eri>> a(arq $$0, jj<eri> $$1, iv $$2, int $$3, boolean $$4) {
      ecn $$5 = $$0.m().h();
      Map<esf, Set<jf<eri>>> $$6 = new Object2ObjectArrayMap();

      for (jf<eri> $$7 : $$1) {
         for (esf $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<iv, jf<eri>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dkd $$11 = $$0.b();
         List<Entry<esf, Set<jf<eri>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<esf, Set<jf<eri>>> $$13 : $$6.entrySet()) {
            esf $$14 = $$13.getKey();
            if ($$14 instanceof esc) {
               esc $$15 = (esc)$$14;
               Pair<iv, jf<eri>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  iv $$17 = (iv)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof esd) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jy.a($$2.u());
            int $$20 = jy.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<esf, Set<jf<eri>>> $$23 : $$12) {
                  esd $$24 = (esd)$$23.getKey();
                  Pair<iv, jf<eri>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((ka)$$25.getFirst());
                     if ($$26 < $$10) {
                        $$10 = $$26;
                        $$9 = $$25;
                     }
                  }
               }

               if ($$22) {
                  return $$9;
               }
            }
         }

         return $$9;
      }
   }

   @Nullable
   private Pair<iv, jf<eri>> a(Set<jf<eri>> $$0, arq $$1, dkd $$2, iv $$3, boolean $$4, esc $$5) {
      List<dio> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<iv, jf<eri>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         iv.a $$9 = new iv.a();

         for (dio $$10 : $$6) {
            $$9.d(jy.a($$10.h, 8), 32, jy.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<iv, jf<eri>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
               if ($$13 != null) {
                  $$7 = $$13;
                  $$8 = $$11;
               }
            }
         }

         return $$7;
      }
   }

   @Nullable
   private static Pair<iv, jf<eri>> a(Set<jf<eri>> $$0, djk $$1, dkd $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, esd $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dio $$16 = $$8.a($$7, $$14, $$15);
               Pair<iv, jf<eri>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<iv, jf<eri>> a(Set<jf<eri>> $$0, djk $$1, dkd $$2, boolean $$3, esf $$4, dio $$5) {
      for (jf<eri> $$6 : $$0) {
         erk $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != erk.b) {
            if (!$$3 && $$7 == erk.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            ecl $$8 = $$1.a($$5.h, $$5.i, edm.d);
            erq $$9 = $$2.a(jy.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dkd $$0, erq $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dkg $$0, ecl $$1, dkd $$2) {
      dio $$3 = $$1.f();
      if (!ac.a($$3)) {
         jy $$4 = jy.a($$3, $$0.aq());
         iv $$5 = $$4.j();
         js<eri> $$6 = $$0.F_().f(mh.be);
         Map<Integer, List<eri>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dku.b> $$8 = this.c.get();
         ehm $$9 = new ehm(new eho(ehc.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<jf<dkk>> $$11 = new ObjectArraySet();
         dio.a($$4.r(), 1).forEach($$2x -> {
            ecl $$3x = $$0.a($$2x.h, $$2x.i);

            for (ecw $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            js<eqm> $$13 = $$0.F_().f(mh.bb);
            int $$14 = Math.max(egj.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eri $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> $$6.d($$18).map(Object::toString).orElseGet($$18::toString);

                     try {
                        $$0.a($$19);
                        $$2.a($$4, $$18).forEach($$5x -> $$5x.a($$0, $$2, this, $$9, a($$1), $$3));
                     } catch (Exception var29) {
                        p $$21 = p.a(var29, "Feature placement");
                        $$21.a("Feature").a("Description", $$19::get);
                        throw new aa($$21);
                     }

                     $$16++;
                  }
               }

               if ($$15 < $$12) {
                  IntSet $$22 = new IntArraySet();

                  for (jf<dkk> $$23 : $$11) {
                     List<jj<eqm>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jj<eqm> $$25 = $$24.get($$15);
                        dku.b $$26 = $$8.get($$15);
                        $$25.a().map(jf::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dku.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eqm $$32 = $$29.a().get($$31);
                     Supplier<String> $$33 = () -> $$13.d($$32).map(Object::toString).orElseGet($$32::toString);
                     $$9.b($$10, $$31, $$15);

                     try {
                        $$0.a($$33);
                        $$32.b($$0, this, $$9, $$5);
                     } catch (Exception var30) {
                        p $$35 = p.a(var30, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new aa($$35);
                     }
                  }
               }
            }

            $$0.a(null);
         } catch (Exception var31) {
            p $$37 = p.a(var31, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.h).a("CenterZ", $$3.i).a("Decoration Seed", $$10);
            throw new aa($$37);
         }
      }
   }

   private static era a(ecl $$0) {
      dio $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      djj $$4 = $$0.B();
      int $$5 = $$4.G_() + 1;
      int $$6 = $$4.ao();
      return new era($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ary var1, dkd var2, ehb var3, ecl var4);

   public abstract void a(ary var1);

   public int a(djj $$0) {
      return 64;
   }

   public dko d() {
      return this.b;
   }

   public abstract int e();

   public bsq<dkw.c> a(jf<dkk> $$0, dkd $$1, bxm $$2, iv $$3) {
      Map<eri, LongSet> $$4 = $$1.b($$3);

      for (Entry<eri, LongSet> $$5 : $$4.entrySet()) {
         eri $$6 = $$5.getKey();
         erp $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<erq> $$9 = $$7.a() == erp.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
            $$1.a($$6, $$5.getValue(), $$2x -> {
               if ($$8.isFalse() && $$9.test($$2x)) {
                  $$8.setTrue();
               }
            });
            if ($$8.isTrue()) {
               return $$7.b();
            }
         }
      }

      return $$0.a().b().a($$2);
   }

   public void a(jt $$0, ecn $$1, dkd $$2, ecl $$3, evl $$4, alf<djh> $$5) {
      dio $$6 = $$3.f();
      jy $$7 = jy.a($$3);
      ehb $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         esf $$10 = $$9.a().b();
         List<ero.a> $$11 = $$9.a().a();

         for (ero.a $$12 : $$11) {
            erq $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<ero.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               ehm $$15 = new ehm(new ego(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (ero.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (ero.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  ero.a $$21 = $$14.get($$19);
                  if (this.a($$21, $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5)) {
                     return;
                  }

                  $$14.remove($$19);
                  $$16 -= $$21.b();
               }
            }
         }
      });
   }

   private boolean a(ero.a $$0, dkd $$1, jt $$2, ehb $$3, evl $$4, long $$5, ecl $$6, dio $$7, jy $$8, alf<djh> $$9) {
      eri $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      jj<dkk> $$12 = $$10.a();
      Predicate<jf<dkk>> $$13 = $$12::a;
      erq $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dkd $$0, ecl $$1, jy $$2, eri $$3) {
      erq $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dkg $$0, dkd $$1, ecl $$2) {
      int $$3 = 8;
      dio $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jy $$9 = jy.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dio.c($$10, $$11);

            for (erq $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agm.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  p $$15 = p.a(var21, "Generating structure reference");
                  q $$16 = $$15.a("Structure");
                  Optional<? extends js<eri>> $$17 = $$0.F_().a(mh.be);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> mg.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new aa($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<ecl> a(ehp var1, ehb var2, dkd var3, ecl var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, egn.a var3, djj var4, ehb var5);

   public abstract djt a(int var1, int var2, djj var3, ehb var4);

   public int b(int $$0, int $$1, egn.a $$2, djj $$3, ehb $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, egn.a $$2, djj $$3, ehb $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, ehb var2, iv var3);

   @Deprecated
   public dkl a(jf<dkk> $$0) {
      return this.d.apply($$0);
   }
}
