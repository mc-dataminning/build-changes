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

public abstract class edc {
   public static final Codec<edc> a = mg.aa.q().dispatchStable(edc::b, Function.identity());
   protected final dle b;
   private final Supplier<List<dlk.b>> c;
   private final Function<jf<dla>, dlb> d;

   public edc(dle $$0) {
      this($$0, $$0x -> ((dla)$$0x.a()).d());
   }

   public edc(dle $$0, Function<jf<dla>, dlb> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dlk.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends edc> b();

   public edd a(jh<esh> $$0, ehr $$1, long $$2) {
      return edd.a($$1, $$2, this.b, $$0);
   }

   public Optional<alh<MapCodec<? extends edc>>> c() {
      return mg.aa.d(this.b());
   }

   public CompletableFuture<edb> a(ehr $$0, eif $$1, dkt $$2, edb $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ag.h().a("init_biomes"));
   }

   public abstract void a(asa var1, long var2, ehr var4, dlc var5, dkt var6, edb var7);

   @Nullable
   public Pair<iv, jf<esb>> a(ars $$0, jj<esb> $$1, iv $$2, int $$3, boolean $$4) {
      edd $$5 = $$0.m().h();
      Map<esy, Set<jf<esb>>> $$6 = new Object2ObjectArrayMap();

      for (jf<esb> $$7 : $$1) {
         for (esy $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<iv, jf<esb>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dkt $$11 = $$0.b();
         List<Entry<esy, Set<jf<esb>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<esy, Set<jf<esb>>> $$13 : $$6.entrySet()) {
            esy $$14 = $$13.getKey();
            if ($$14 instanceof esv) {
               esv $$15 = (esv)$$14;
               Pair<iv, jf<esb>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  iv $$17 = (iv)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof esw) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jy.a($$2.u());
            int $$20 = jy.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<esy, Set<jf<esb>>> $$23 : $$12) {
                  esw $$24 = (esw)$$23.getKey();
                  Pair<iv, jf<esb>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
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
   private Pair<iv, jf<esb>> a(Set<jf<esb>> $$0, ars $$1, dkt $$2, iv $$3, boolean $$4, esv $$5) {
      List<djc> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<iv, jf<esb>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         iv.a $$9 = new iv.a();

         for (djc $$10 : $$6) {
            $$9.d(jy.a($$10.h, 8), 32, jy.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<iv, jf<esb>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<iv, jf<esb>> a(Set<jf<esb>> $$0, dka $$1, dkt $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, esw $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               djc $$16 = $$8.a($$7, $$14, $$15);
               Pair<iv, jf<esb>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<iv, jf<esb>> a(Set<jf<esb>> $$0, dka $$1, dkt $$2, boolean $$3, esy $$4, djc $$5) {
      for (jf<esb> $$6 : $$0) {
         esd $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != esd.b) {
            if (!$$3 && $$7 == esd.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            edb $$8 = $$1.a($$5.h, $$5.i, eec.d);
            esj $$9 = $$2.a(jy.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dkt $$0, esj $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dkw $$0, edb $$1, dkt $$2) {
      djc $$3 = $$1.f();
      if (!ac.a($$3)) {
         jy $$4 = jy.a($$3, $$0.aq());
         iv $$5 = $$4.j();
         js<esb> $$6 = $$0.J_().f(mh.be);
         Map<Integer, List<esb>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dlk.b> $$8 = this.c.get();
         eic $$9 = new eic(new eie(ehs.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<jf<dla>> $$11 = new ObjectArraySet();
         djc.a($$4.r(), 1).forEach($$2x -> {
            edb $$3x = $$0.a($$2x.h, $$2x.i);

            for (edm $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            js<erf> $$13 = $$0.J_().f(mh.bb);
            int $$14 = Math.max(egz.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (esb $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jf<dla> $$23 : $$11) {
                     List<jj<erf>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jj<erf> $$25 = $$24.get($$15);
                        dlk.b $$26 = $$8.get($$15);
                        $$25.a().map(jf::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dlk.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     erf $$32 = $$29.a().get($$31);
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

   private static ert a(edb $$0) {
      djc $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      djz $$4 = $$0.B();
      int $$5 = $$4.K_() + 1;
      int $$6 = $$4.ao();
      return new ert($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(asa var1, dkt var2, ehr var3, edb var4);

   public abstract void a(asa var1);

   public int a(djz $$0) {
      return 64;
   }

   public dle d() {
      return this.b;
   }

   public abstract int e();

   public btb<dlm.c> a(jf<dla> $$0, dkt $$1, bxx $$2, iv $$3) {
      Map<esb, LongSet> $$4 = $$1.b($$3);

      for (Entry<esb, LongSet> $$5 : $$4.entrySet()) {
         esb $$6 = $$5.getKey();
         esi $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<esj> $$9 = $$7.a() == esi.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jt $$0, edd $$1, dkt $$2, edb $$3, ewe $$4, alh<djx> $$5) {
      djc $$6 = $$3.f();
      jy $$7 = jy.a($$3);
      ehr $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         esy $$10 = $$9.a().b();
         List<esh.a> $$11 = $$9.a().a();

         for (esh.a $$12 : $$11) {
            esj $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<esh.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               eic $$15 = new eic(new ehe(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (esh.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (esh.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  esh.a $$21 = $$14.get($$19);
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

   private boolean a(esh.a $$0, dkt $$1, jt $$2, ehr $$3, ewe $$4, long $$5, edb $$6, djc $$7, jy $$8, alh<djx> $$9) {
      esb $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      jj<dla> $$12 = $$10.a();
      Predicate<jf<dla>> $$13 = $$12::a;
      esj $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dkt $$0, edb $$1, jy $$2, esb $$3) {
      esj $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dkw $$0, dkt $$1, edb $$2) {
      int $$3 = 8;
      djc $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jy $$9 = jy.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = djc.c($$10, $$11);

            for (esj $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     ago.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  p $$15 = p.a(var21, "Generating structure reference");
                  q $$16 = $$15.a("Structure");
                  Optional<? extends js<esb>> $$17 = $$0.J_().a(mh.be);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> mg.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new aa($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<edb> a(eif var1, ehr var2, dkt var3, edb var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, ehd.a var3, djz var4, ehr var5);

   public abstract dkj a(int var1, int var2, djz var3, ehr var4);

   public int b(int $$0, int $$1, ehd.a $$2, djz $$3, ehr $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, ehd.a $$2, djz $$3, ehr $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, ehr var2, iv var3);

   @Deprecated
   public dlb a(jf<dla> $$0) {
      return this.d.apply($$0);
   }
}
