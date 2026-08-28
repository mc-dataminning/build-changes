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

public abstract class eak {
   public static final Codec<eak> a = md.aa.q().dispatchStable(eak::b, Function.identity());
   protected final diw b;
   private final Supplier<List<djc.b>> c;
   private final Function<js<dis>, dit> d;

   public eak(diw $$0) {
      this($$0, $$0x -> ((dis)$$0x.a()).d());
   }

   public eak(diw $$0, Function<js<dis>, dit> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> djc.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends eak> b();

   public eal a(ju<epm> $$0, eez $$1, long $$2) {
      return eal.a($$1, $$2, this.b, $$0);
   }

   public Optional<alc<MapCodec<? extends eak>>> c() {
      return md.aa.d(this.b());
   }

   public CompletableFuture<eaj> a(eez $$0, efn $$1, dil $$2, eaj $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, af.h().a("init_biomes"));
   }

   public abstract void a(arv var1, long var2, eez var4, diu var5, dil var6, eaj var7);

   @Nullable
   public Pair<jj, js<epg>> a(arn $$0, jw<epg> $$1, jj $$2, int $$3, boolean $$4) {
      eal $$5 = $$0.m().h();
      Map<eqd, Set<js<epg>>> $$6 = new Object2ObjectArrayMap();

      for (js<epg> $$7 : $$1) {
         for (eqd $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jj, js<epg>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dil $$11 = $$0.b();
         List<Entry<eqd, Set<js<epg>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<eqd, Set<js<epg>>> $$13 : $$6.entrySet()) {
            eqd $$14 = $$13.getKey();
            if ($$14 instanceof eqa) {
               eqa $$15 = (eqa)$$14;
               Pair<jj, js<epg>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jj $$17 = (jj)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eqb) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kl.a($$2.u());
            int $$20 = kl.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<eqd, Set<js<epg>>> $$23 : $$12) {
                  eqb $$24 = (eqb)$$23.getKey();
                  Pair<jj, js<epg>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kn)$$25.getFirst());
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
   private Pair<jj, js<epg>> a(Set<js<epg>> $$0, arn $$1, dil $$2, jj $$3, boolean $$4, eqa $$5) {
      List<dgw> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jj, js<epg>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jj.a $$9 = new jj.a();

         for (dgw $$10 : $$6) {
            $$9.d(kl.a($$10.h, 8), 32, kl.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jj, js<epg>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jj, js<epg>> a(Set<js<epg>> $$0, dhs $$1, dil $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eqb $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dgw $$16 = $$8.a($$7, $$14, $$15);
               Pair<jj, js<epg>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jj, js<epg>> a(Set<js<epg>> $$0, dhs $$1, dil $$2, boolean $$3, eqd $$4, dgw $$5) {
      for (js<epg> $$6 : $$0) {
         epi $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != epi.b) {
            if (!$$3 && $$7 == epi.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            eaj $$8 = $$1.a($$5.h, $$5.i, ebk.d);
            epo $$9 = $$2.a(kl.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dil $$0, epo $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dio $$0, eaj $$1, dil $$2) {
      dgw $$3 = $$1.f();
      if (!ab.a($$3)) {
         kl $$4 = kl.a($$3, $$0.aq());
         jj $$5 = $$4.j();
         kf<epg> $$6 = $$0.F_().f(me.aZ);
         Map<Integer, List<epg>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<djc.b> $$8 = this.c.get();
         efk $$9 = new efk(new efm(efa.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<js<dis>> $$11 = new ObjectArraySet();
         dgw.a($$4.r(), 1).forEach($$2x -> {
            eaj $$3x = $$0.a($$2x.h, $$2x.i);

            for (eau $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            kf<eok> $$13 = $$0.F_().f(me.aY);
            int $$14 = Math.max(eeh.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (epg $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (js<dis> $$23 : $$11) {
                     List<jw<eok>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jw<eok> $$25 = $$24.get($$15);
                        djc.b $$26 = $$8.get($$15);
                        $$25.a().map(js::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  djc.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eok $$32 = $$29.a().get($$31);
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

   private static eoy a(eaj $$0) {
      dgw $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dhr $$4 = $$0.B();
      int $$5 = $$4.G_() + 1;
      int $$6 = $$4.ao();
      return new eoy($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(arv var1, dil var2, eez var3, eaj var4);

   public abstract void a(arv var1);

   public int a(dhr $$0) {
      return 64;
   }

   public diw d() {
      return this.b;
   }

   public abstract int e();

   public bsb<dje.c> a(js<dis> $$0, dil $$1, bwu $$2, jj $$3) {
      Map<epg, LongSet> $$4 = $$1.b($$3);

      for (Entry<epg, LongSet> $$5 : $$4.entrySet()) {
         epg $$6 = $$5.getKey();
         epn $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<epo> $$9 = $$7.a() == epn.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(kg $$0, eal $$1, dil $$2, eaj $$3, etj $$4, alc<dhp> $$5) {
      dgw $$6 = $$3.f();
      kl $$7 = kl.a($$3);
      eez $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         eqd $$10 = $$9.a().b();
         List<epm.a> $$11 = $$9.a().a();

         for (epm.a $$12 : $$11) {
            epo $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<epm.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               efk $$15 = new efk(new eem(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (epm.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (epm.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  epm.a $$21 = $$14.get($$19);
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

   private boolean a(epm.a $$0, dil $$1, kg $$2, eez $$3, etj $$4, long $$5, eaj $$6, dgw $$7, kl $$8, alc<dhp> $$9) {
      epg $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      jw<dis> $$12 = $$10.a();
      Predicate<js<dis>> $$13 = $$12::a;
      epo $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dil $$0, eaj $$1, kl $$2, epg $$3) {
      epo $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dio $$0, dil $$1, eaj $$2) {
      int $$3 = 8;
      dgw $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kl $$9 = kl.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dgw.c($$10, $$11);

            for (epo $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agj.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends kf<epg>> $$17 = $$0.F_().a(me.aZ);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> md.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<eaj> a(efn var1, eez var2, dil var3, eaj var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, eel.a var3, dhr var4, eez var5);

   public abstract dib a(int var1, int var2, dhr var3, eez var4);

   public int b(int $$0, int $$1, eel.a $$2, dhr $$3, eez $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, eel.a $$2, dhr $$3, eez $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, eez var2, jj var3);

   @Deprecated
   public dit a(js<dis> $$0) {
      return this.d.apply($$0);
   }
}
