import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
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
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class dld {
   public static final Codec<dld> a = kd.ac.q().dispatchStable(dld::a, Function.identity());
   protected final cur b;
   private final Supplier<List<cux.b>> c;
   private final Function<ih<cun>, cuo> d;

   public dld(cur $$0) {
      this($$0, $$0x -> ((cun)$$0x.a()).d());
   }

   public dld(cur $$0, Function<ih<cun>, cuo> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> cux.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dld> a();

   public dle a(ij<dzl> $$0, dpd $$1, long $$2) {
      return dle.a($$1, $$2, this.b, $$0);
   }

   public Optional<ahf<Codec<? extends dld>>> b() {
      return kd.ac.c(this.a());
   }

   public CompletableFuture<dlc> a(Executor $$0, dpd $$1, dpr $$2, cuh $$3, dlc $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(ank var1, long var2, dpd var4, cup var5, cuh var6, dlc var7, dol.a var8);

   @Nullable
   public Pair<hx, ih<dzf>> a(and $$0, il<dzf> $$1, hx $$2, int $$3, boolean $$4) {
      dle $$5 = $$0.l().h();
      Map<eac, Set<ih<dzf>>> $$6 = new Object2ObjectArrayMap();

      for (ih<dzf> $$7 : $$1) {
         for (eac $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<hx, ih<dzf>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         cuh $$11 = $$0.a();
         List<Entry<eac, Set<ih<dzf>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<eac, Set<ih<dzf>>> $$13 : $$6.entrySet()) {
            eac $$14 = $$13.getKey();
            if ($$14 instanceof dzz) {
               dzz $$15 = (dzz)$$14;
               Pair<hx, ih<dzf>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  hx $$17 = (hx)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eaa) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = iz.a($$2.u());
            int $$20 = iz.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<eac, Set<ih<dzf>>> $$23 : $$12) {
                  eaa $$24 = (eaa)$$23.getKey();
                  Pair<hx, ih<dzf>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((jb)$$25.getFirst());
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
   private Pair<hx, ih<dzf>> a(Set<ih<dzf>> $$0, and $$1, cuh $$2, hx $$3, boolean $$4, dzz $$5) {
      List<csv> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<hx, ih<dzf>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         hx.a $$9 = new hx.a();

         for (csv $$10 : $$6) {
            $$9.d(iz.a($$10.e, 8), 32, iz.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<hx, ih<dzf>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<hx, ih<dzf>> a(Set<ih<dzf>> $$0, ctr $$1, cuh $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eaa $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               csv $$16 = $$8.a($$7, $$14, $$15);
               Pair<hx, ih<dzf>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<hx, ih<dzf>> a(Set<ih<dzf>> $$0, ctr $$1, cuh $$2, boolean $$3, eac $$4, csv $$5) {
      for (ih<dzf> $$6 : $$0) {
         dzh $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dzh.b) {
            if (!$$3 && $$7 == dzh.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dlc $$8 = $$1.a($$5.e, $$5.f, dlh.d);
            dzn $$9 = $$2.a(iz.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(cuh $$0, dzn $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(cuj $$0, dlc $$1, cuh $$2) {
      csv $$3 = $$1.f();
      if (!aa.a($$3)) {
         iz $$4 = iz.a($$3, $$0.an());
         hx $$5 = $$4.j();
         it<dzf> $$6 = $$0.I_().d(ke.aD);
         Map<Integer, List<dzf>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<cux.b> $$8 = this.c.get();
         dpo $$9 = new dpo(new dpq(dpe.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<ih<cun>> $$11 = new ObjectArraySet();
         csv.a($$4.r(), 1).forEach($$2x -> {
            dlc $$3x = $$0.a($$2x.e, $$2x.f);

            for (dlo $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            it<dyj> $$13 = $$0.I_().d(ke.aC);
            int $$14 = Math.max(dol.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dzf $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> $$6.c($$18).map(Object::toString).orElseGet($$18::toString);

                     try {
                        $$0.a($$19);
                        $$2.a($$4, $$18).forEach($$5x -> $$5x.a($$0, $$2, this, $$9, a($$1), $$3));
                     } catch (Exception var29) {
                        o $$21 = o.a(var29, "Feature placement");
                        $$21.a("Feature").a("Description", $$19::get);
                        throw new y($$21);
                     }

                     $$16++;
                  }
               }

               if ($$15 < $$12) {
                  IntSet $$22 = new IntArraySet();

                  for (ih<cun> $$23 : $$11) {
                     List<il<dyj>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        il<dyj> $$25 = $$24.get($$15);
                        cux.b $$26 = $$8.get($$15);
                        $$25.a().map(ih::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  cux.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dyj $$32 = $$29.a().get($$31);
                     Supplier<String> $$33 = () -> $$13.c($$32).map(Object::toString).orElseGet($$32::toString);
                     $$9.b($$10, $$31, $$15);

                     try {
                        $$0.a($$33);
                        $$32.b($$0, this, $$9, $$5);
                     } catch (Exception var30) {
                        o $$35 = o.a(var30, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new y($$35);
                     }
                  }
               }
            }

            $$0.a(null);
         } catch (Exception var31) {
            o $$37 = o.a(var31, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.e).a("CenterZ", $$3.f).a("Seed", $$10);
            throw new y($$37);
         }
      }
   }

   private static dyx a(dlc $$0) {
      csv $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      ctq $$4 = $$0.z();
      int $$5 = $$4.J_() + 1;
      int $$6 = $$4.al() - 1;
      return new dyx($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ank var1, cuh var2, dpd var3, dlc var4);

   public abstract void a(ank var1);

   public int a(ctq $$0) {
      return 64;
   }

   public cur c() {
      return this.b;
   }

   public abstract int d();

   public bio<cuz.c> a(ih<cun> $$0, cuh $$1, bmn $$2, hx $$3) {
      Map<dzf, LongSet> $$4 = $$1.b($$3);

      for (Entry<dzf, LongSet> $$5 : $$4.entrySet()) {
         dzf $$6 = $$5.getKey();
         dzm $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dzn> $$9 = $$7.a() == dzm.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(iu $$0, dle $$1, cuh $$2, dlc $$3, edg $$4) {
      csv $$5 = $$3.f();
      iz $$6 = iz.a($$3);
      dpd $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         eac $$9 = $$8.a().b();
         List<dzl.a> $$10 = $$8.a().a();

         for (dzl.a $$11 : $$10) {
            dzn $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dzl.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dpo $$14 = new dpo(new doq(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dzl.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dzl.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dzl.a $$20 = $$13.get($$18);
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

   private boolean a(dzl.a $$0, cuh $$1, iu $$2, dpd $$3, edg $$4, long $$5, dlc $$6, csv $$7, iz $$8) {
      dzf $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      il<cun> $$11 = $$9.a();
      Predicate<ih<cun>> $$12 = $$11::a;
      dzn $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(cuh $$0, dlc $$1, iz $$2, dzf $$3) {
      dzn $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(cuj $$0, cuh $$1, dlc $$2) {
      int $$3 = 8;
      csv $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      iz $$9 = iz.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = csv.c($$10, $$11);

            for (dzn $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     adi.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends it<dzf>> $$17 = $$0.I_().c(ke.aD);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> kd.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dlc> a(Executor var1, dpr var2, dpd var3, cuh var4, dlc var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dop.a var3, ctq var4, dpd var5);

   public abstract cua a(int var1, int var2, ctq var3, dpd var4);

   public int b(int $$0, int $$1, dop.a $$2, ctq $$3, dpd $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dop.a $$2, ctq $$3, dpd $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dpd var2, hx var3);

   @Deprecated
   public cuo a(ih<cun> $$0) {
      return this.d.apply($$0);
   }
}
