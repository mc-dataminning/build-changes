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

public abstract class dzk {
   public static final Codec<dzk> a = ma.aa.q().dispatchStable(dzk::b, Function.identity());
   protected final dif b;
   private final Supplier<List<dil.b>> c;
   private final Function<jq<dib>, dic> d;

   public dzk(dif $$0) {
      this($$0, $$0x -> ((dib)$$0x.a()).d());
   }

   public dzk(dif $$0, Function<jq<dib>, dic> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dil.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dzk> b();

   public dzl a(js<eoj> $$0, edx $$1, long $$2) {
      return dzl.a($$1, $$2, this.b, $$0);
   }

   public Optional<alo<MapCodec<? extends dzk>>> c() {
      return ma.aa.d(this.b());
   }

   public CompletableFuture<dzj> a(edx $$0, eel $$1, dhv $$2, dzj $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ae.g().a("init_biomes"));
   }

   public abstract void a(asf var1, long var2, edx var4, did var5, dhv var6, dzj var7);

   @Nullable
   public Pair<jh, jq<eod>> a(arx $$0, ju<eod> $$1, jh $$2, int $$3, boolean $$4) {
      dzl $$5 = $$0.m().h();
      Map<epa, Set<jq<eod>>> $$6 = new Object2ObjectArrayMap();

      for (jq<eod> $$7 : $$1) {
         for (epa $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jh, jq<eod>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dhv $$11 = $$0.b();
         List<Entry<epa, Set<jq<eod>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<epa, Set<jq<eod>>> $$13 : $$6.entrySet()) {
            epa $$14 = $$13.getKey();
            if ($$14 instanceof eox) {
               eox $$15 = (eox)$$14;
               Pair<jh, jq<eod>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jh $$17 = (jh)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eoy) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kj.a($$2.u());
            int $$20 = kj.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<epa, Set<jq<eod>>> $$23 : $$12) {
                  eoy $$24 = (eoy)$$23.getKey();
                  Pair<jh, jq<eod>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kl)$$25.getFirst());
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
   private Pair<jh, jq<eod>> a(Set<jq<eod>> $$0, arx $$1, dhv $$2, jh $$3, boolean $$4, eox $$5) {
      List<dgf> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jh, jq<eod>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jh.a $$9 = new jh.a();

         for (dgf $$10 : $$6) {
            $$9.d(kj.a($$10.h, 8), 32, kj.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jh, jq<eod>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jh, jq<eod>> a(Set<jq<eod>> $$0, dhc $$1, dhv $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eoy $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dgf $$16 = $$8.a($$7, $$14, $$15);
               Pair<jh, jq<eod>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jh, jq<eod>> a(Set<jq<eod>> $$0, dhc $$1, dhv $$2, boolean $$3, epa $$4, dgf $$5) {
      for (jq<eod> $$6 : $$0) {
         eof $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eof.b) {
            if (!$$3 && $$7 == eof.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dzj $$8 = $$1.a($$5.h, $$5.i, eak.d);
            eol $$9 = $$2.a(kj.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dhv $$0, eol $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dhx $$0, dzj $$1, dhv $$2) {
      dgf $$3 = $$1.f();
      if (!ab.a($$3)) {
         kj $$4 = kj.a($$3, $$0.ap());
         jh $$5 = $$4.j();
         kd<eod> $$6 = $$0.K_().e(mb.aU);
         Map<Integer, List<eod>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dil.b> $$8 = this.c.get();
         eei $$9 = new eei(new eek(edy.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<jq<dib>> $$11 = new ObjectArraySet();
         dgf.a($$4.r(), 1).forEach($$2x -> {
            dzj $$3x = $$0.a($$2x.h, $$2x.i);

            for (dzu $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            kd<enh> $$13 = $$0.K_().e(mb.aT);
            int $$14 = Math.max(edf.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eod $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> $$6.d($$18).map(Object::toString).orElseGet($$18::toString);

                     try {
                        $$0.a($$19);
                        $$2.a($$4, $$18).forEach($$5x -> $$5x.a($$0, $$2, this, $$9, a($$1), $$3));
                     } catch (Exception var29) {
                        o $$21 = o.a(var29, "Feature placement");
                        $$21.a("Feature").a("Description", $$19::get);
                        throw new z($$21);
                     }

                     $$16++;
                  }
               }

               if ($$15 < $$12) {
                  IntSet $$22 = new IntArraySet();

                  for (jq<dib> $$23 : $$11) {
                     List<ju<enh>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        ju<enh> $$25 = $$24.get($$15);
                        dil.b $$26 = $$8.get($$15);
                        $$25.a().map(jq::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dil.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     enh $$32 = $$29.a().get($$31);
                     Supplier<String> $$33 = () -> $$13.d($$32).map(Object::toString).orElseGet($$32::toString);
                     $$9.b($$10, $$31, $$15);

                     try {
                        $$0.a($$33);
                        $$32.b($$0, this, $$9, $$5);
                     } catch (Exception var30) {
                        o $$35 = o.a(var30, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new z($$35);
                     }
                  }
               }
            }

            $$0.a(null);
         } catch (Exception var31) {
            o $$37 = o.a(var31, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.h).a("CenterZ", $$3.i).a("Decoration Seed", $$10);
            throw new z($$37);
         }
      }
   }

   private static env a(dzj $$0) {
      dgf $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dhb $$4 = $$0.B();
      int $$5 = $$4.L_() + 1;
      int $$6 = $$4.an();
      return new env($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(asf var1, dhv var2, edx var3, dzj var4);

   public abstract void a(asf var1);

   public int a(dhb $$0) {
      return 64;
   }

   public dif d() {
      return this.b;
   }

   public abstract int e();

   public brm<din.c> a(jq<dib> $$0, dhv $$1, bwa $$2, jh $$3) {
      Map<eod, LongSet> $$4 = $$1.b($$3);

      for (Entry<eod, LongSet> $$5 : $$4.entrySet()) {
         eod $$6 = $$5.getKey();
         eok $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<eol> $$9 = $$7.a() == eok.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(ke $$0, dzl $$1, dhv $$2, dzj $$3, esg $$4, alo<dgz> $$5) {
      dgf $$6 = $$3.f();
      kj $$7 = kj.a($$3);
      edx $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         epa $$10 = $$9.a().b();
         List<eoj.a> $$11 = $$9.a().a();

         for (eoj.a $$12 : $$11) {
            eol $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<eoj.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               eei $$15 = new eei(new edk(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (eoj.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (eoj.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  eoj.a $$21 = $$14.get($$19);
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

   private boolean a(eoj.a $$0, dhv $$1, ke $$2, edx $$3, esg $$4, long $$5, dzj $$6, dgf $$7, kj $$8, alo<dgz> $$9) {
      eod $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      ju<dib> $$12 = $$10.a();
      Predicate<jq<dib>> $$13 = $$12::a;
      eol $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dhv $$0, dzj $$1, kj $$2, eod $$3) {
      eol $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dhx $$0, dhv $$1, dzj $$2) {
      int $$3 = 8;
      dgf $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kj $$9 = kj.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dgf.c($$10, $$11);

            for (eol $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agy.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends kd<eod>> $$17 = $$0.K_().a(mb.aU);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> ma.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dzj> a(eel var1, edx var2, dhv var3, dzj var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, edj.a var3, dhb var4, edx var5);

   public abstract dhl a(int var1, int var2, dhb var3, edx var4);

   public int b(int $$0, int $$1, edj.a $$2, dhb $$3, edx $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, edj.a $$2, dhb $$3, edx $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, edx var2, jh var3);

   @Deprecated
   public dic a(jq<dib> $$0) {
      return this.d.apply($$0);
   }
}
