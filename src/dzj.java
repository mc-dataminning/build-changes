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

public abstract class dzj {
   public static final Codec<dzj> a = ma.aa.q().dispatchStable(dzj::b, Function.identity());
   protected final dig b;
   private final Supplier<List<dim.b>> c;
   private final Function<jq<dic>, did> d;

   public dzj(dig $$0) {
      this($$0, $$0x -> ((dic)$$0x.a()).d());
   }

   public dzj(dig $$0, Function<jq<dic>, did> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dim.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dzj> b();

   public dzk a(js<eoi> $$0, edw $$1, long $$2) {
      return dzk.a($$1, $$2, this.b, $$0);
   }

   public Optional<aly<MapCodec<? extends dzj>>> c() {
      return ma.aa.d(this.b());
   }

   public CompletableFuture<dzi> a(edw $$0, eek $$1, dhw $$2, dzi $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ae.g().a("init_biomes"));
   }

   public abstract void a(asp var1, long var2, edw var4, die var5, dhw var6, dzi var7);

   @Nullable
   public Pair<jh, jq<eoc>> a(ash $$0, ju<eoc> $$1, jh $$2, int $$3, boolean $$4) {
      dzk $$5 = $$0.m().h();
      Map<eoz, Set<jq<eoc>>> $$6 = new Object2ObjectArrayMap();

      for (jq<eoc> $$7 : $$1) {
         for (eoz $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jh, jq<eoc>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dhw $$11 = $$0.b();
         List<Entry<eoz, Set<jq<eoc>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<eoz, Set<jq<eoc>>> $$13 : $$6.entrySet()) {
            eoz $$14 = $$13.getKey();
            if ($$14 instanceof eow) {
               eow $$15 = (eow)$$14;
               Pair<jh, jq<eoc>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jh $$17 = (jh)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eox) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kj.a($$2.u());
            int $$20 = kj.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<eoz, Set<jq<eoc>>> $$23 : $$12) {
                  eox $$24 = (eox)$$23.getKey();
                  Pair<jh, jq<eoc>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
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
   private Pair<jh, jq<eoc>> a(Set<jq<eoc>> $$0, ash $$1, dhw $$2, jh $$3, boolean $$4, eow $$5) {
      List<dgg> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jh, jq<eoc>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jh.a $$9 = new jh.a();

         for (dgg $$10 : $$6) {
            $$9.d(kj.a($$10.g, 8), 32, kj.a($$10.h, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jh, jq<eoc>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jh, jq<eoc>> a(Set<jq<eoc>> $$0, dhd $$1, dhw $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eox $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dgg $$16 = $$8.a($$7, $$14, $$15);
               Pair<jh, jq<eoc>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jh, jq<eoc>> a(Set<jq<eoc>> $$0, dhd $$1, dhw $$2, boolean $$3, eoz $$4, dgg $$5) {
      for (jq<eoc> $$6 : $$0) {
         eoe $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eoe.b) {
            if (!$$3 && $$7 == eoe.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dzi $$8 = $$1.a($$5.g, $$5.h, eaj.d);
            eok $$9 = $$2.a(kj.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dhw $$0, eok $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dhy $$0, dzi $$1, dhw $$2) {
      dgg $$3 = $$1.f();
      if (!ab.a($$3)) {
         kj $$4 = kj.a($$3, $$0.ao());
         jh $$5 = $$4.j();
         kd<eoc> $$6 = $$0.K_().e(mb.aT);
         Map<Integer, List<eoc>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dim.b> $$8 = this.c.get();
         eeh $$9 = new eeh(new eej(edx.a()));
         long $$10 = $$9.a($$0.D(), $$5.u(), $$5.w());
         Set<jq<dic>> $$11 = new ObjectArraySet();
         dgg.a($$4.r(), 1).forEach($$2x -> {
            dzi $$3x = $$0.a($$2x.g, $$2x.h);

            for (dzt $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            kd<eng> $$13 = $$0.K_().e(mb.aS);
            int $$14 = Math.max(ede.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eoc $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jq<dic> $$23 : $$11) {
                     List<ju<eng>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        ju<eng> $$25 = $$24.get($$15);
                        dim.b $$26 = $$8.get($$15);
                        $$25.a().map(jq::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dim.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eng $$32 = $$29.a().get($$31);
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
            $$37.a("Generation").a("CenterX", $$3.g).a("CenterZ", $$3.h).a("Decoration Seed", $$10);
            throw new z($$37);
         }
      }
   }

   private static enu a(dzi $$0) {
      dgg $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dhc $$4 = $$0.y();
      int $$5 = $$4.L_() + 1;
      int $$6 = $$4.am();
      return new enu($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(asp var1, dhw var2, edw var3, dzi var4);

   public abstract void a(asp var1);

   public int a(dhc $$0) {
      return 64;
   }

   public dig d() {
      return this.b;
   }

   public abstract int e();

   public brq<dio.c> a(jq<dic> $$0, dhw $$1, bwe $$2, jh $$3) {
      Map<eoc, LongSet> $$4 = $$1.b($$3);

      for (Entry<eoc, LongSet> $$5 : $$4.entrySet()) {
         eoc $$6 = $$5.getKey();
         eoj $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<eok> $$9 = $$7.a() == eoj.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(ke $$0, dzk $$1, dhw $$2, dzi $$3, esf $$4) {
      dgg $$5 = $$3.f();
      kj $$6 = kj.a($$3);
      edw $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         eoz $$9 = $$8.a().b();
         List<eoi.a> $$10 = $$8.a().a();

         for (eoi.a $$11 : $$10) {
            eok $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.g, $$5.h)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<eoi.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               eeh $$14 = new eeh(new edj(0L));
               $$14.c($$1.d(), $$5.g, $$5.h);
               int $$15 = 0;

               for (eoi.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (eoi.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  eoi.a $$20 = $$13.get($$18);
                  if (this.a($$20, $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6)) {
                     return;
                  }

                  $$13.remove($$18);
                  $$15 -= $$20.b();
               }
            }
         }
      });
   }

   private boolean a(eoi.a $$0, dhw $$1, ke $$2, edw $$3, esf $$4, long $$5, dzi $$6, dgg $$7, kj $$8) {
      eoc $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ju<dic> $$11 = $$9.a();
      Predicate<jq<dic>> $$12 = $$11::a;
      eok $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dhw $$0, dzi $$1, kj $$2, eoc $$3) {
      eok $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dhy $$0, dhw $$1, dzi $$2) {
      int $$3 = 8;
      dgg $$4 = $$2.f();
      int $$5 = $$4.g;
      int $$6 = $$4.h;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kj $$9 = kj.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dgg.c($$10, $$11);

            for (eok $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     ahj.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends kd<eoc>> $$17 = $$0.K_().a(mb.aT);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> ma.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dzi> a(eek var1, edw var2, dhw var3, dzi var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, edi.a var3, dhc var4, edw var5);

   public abstract dhm a(int var1, int var2, dhc var3, edw var4);

   public int b(int $$0, int $$1, edi.a $$2, dhc $$3, edw $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, edi.a $$2, dhc $$3, edw $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, edw var2, jh var3);

   @Deprecated
   public did a(jq<dic> $$0) {
      return this.d.apply($$0);
   }
}
