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

public abstract class drv {
   public static final Codec<drv> a = lc.ac.q().dispatchStable(drv::a, Function.identity());
   protected final dax b;
   private final Supplier<List<dbd.b>> c;
   private final Function<iv<dat>, dau> d;

   public drv(dax $$0) {
      this($$0, $$0x -> ((dat)$$0x.a()).d());
   }

   public drv(dax $$0, Function<iv<dat>, dau> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dbd.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends drv> a();

   public drw a(ix<egm> $$0, dwe $$1, long $$2) {
      return drw.a($$1, $$2, this.b, $$0);
   }

   public Optional<ake<Codec<? extends drv>>> b() {
      return lc.ac.d(this.a());
   }

   public CompletableFuture<dru> a(Executor $$0, dwe $$1, dws $$2, dan $$3, dru $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(aql var1, long var2, dwe var4, dav var5, dan var6, dru var7, dvm.a var8);

   @Nullable
   public Pair<im, iv<egg>> a(aqe $$0, iz<egg> $$1, im $$2, int $$3, boolean $$4) {
      drw $$5 = $$0.l().h();
      Map<ehd, Set<iv<egg>>> $$6 = new Object2ObjectArrayMap();

      for (iv<egg> $$7 : $$1) {
         for (ehd $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<im, iv<egg>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dan $$11 = $$0.a();
         List<Entry<ehd, Set<iv<egg>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<ehd, Set<iv<egg>>> $$13 : $$6.entrySet()) {
            ehd $$14 = $$13.getKey();
            if ($$14 instanceof eha) {
               eha $$15 = (eha)$$14;
               Pair<im, iv<egg>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  im $$17 = (im)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof ehb) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jo.a($$2.u());
            int $$20 = jo.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<ehd, Set<iv<egg>>> $$23 : $$12) {
                  ehb $$24 = (ehb)$$23.getKey();
                  Pair<im, iv<egg>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((jq)$$25.getFirst());
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
   private Pair<im, iv<egg>> a(Set<iv<egg>> $$0, aqe $$1, dan $$2, im $$3, boolean $$4, eha $$5) {
      List<czb> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<im, iv<egg>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         im.a $$9 = new im.a();

         for (czb $$10 : $$6) {
            $$9.d(jo.a($$10.e, 8), 32, jo.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<im, iv<egg>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<im, iv<egg>> a(Set<iv<egg>> $$0, czx $$1, dan $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, ehb $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               czb $$16 = $$8.a($$7, $$14, $$15);
               Pair<im, iv<egg>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<im, iv<egg>> a(Set<iv<egg>> $$0, czx $$1, dan $$2, boolean $$3, ehd $$4, czb $$5) {
      for (iv<egg> $$6 : $$0) {
         egi $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != egi.b) {
            if (!$$3 && $$7 == egi.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dru $$8 = $$1.a($$5.e, $$5.f, dst.d);
            ego $$9 = $$2.a(jo.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dan $$0, ego $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dap $$0, dru $$1, dan $$2) {
      czb $$3 = $$1.f();
      if (!aa.a($$3)) {
         jo $$4 = jo.a($$3, $$0.an());
         im $$5 = $$4.j();
         ji<egg> $$6 = $$0.H_().d(ld.aI);
         Map<Integer, List<egg>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dbd.b> $$8 = this.c.get();
         dwp $$9 = new dwp(new dwr(dwf.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<iv<dat>> $$11 = new ObjectArraySet();
         czb.a($$4.r(), 1).forEach($$2x -> {
            dru $$3x = $$0.a($$2x.e, $$2x.f);

            for (dsf $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            ji<efk> $$13 = $$0.H_().d(ld.aH);
            int $$14 = Math.max(dvm.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (egg $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> $$6.d($$18).map(Object::toString).orElseGet($$18::toString);

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

                  for (iv<dat> $$23 : $$11) {
                     List<iz<efk>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        iz<efk> $$25 = $$24.get($$15);
                        dbd.b $$26 = $$8.get($$15);
                        $$25.a().map(iv::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dbd.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     efk $$32 = $$29.a().get($$31);
                     Supplier<String> $$33 = () -> $$13.d($$32).map(Object::toString).orElseGet($$32::toString);
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
            $$37.a("Generation").a("CenterX", $$3.e).a("CenterZ", $$3.f).a("Decoration Seed", $$10);
            throw new y($$37);
         }
      }
   }

   private static efy a(dru $$0) {
      czb $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      czw $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.al() - 1;
      return new efy($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aql var1, dan var2, dwe var3, dru var4);

   public abstract void a(aql var1);

   public int a(czw $$0) {
      return 64;
   }

   public dax c() {
      return this.b;
   }

   public abstract int d();

   public bne<dbf.c> a(iv<dat> $$0, dan $$1, brh $$2, im $$3) {
      Map<egg, LongSet> $$4 = $$1.b($$3);

      for (Entry<egg, LongSet> $$5 : $$4.entrySet()) {
         egg $$6 = $$5.getKey();
         egn $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<ego> $$9 = $$7.a() == egn.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jj $$0, drw $$1, dan $$2, dru $$3, ekh $$4) {
      czb $$5 = $$3.f();
      jo $$6 = jo.a($$3);
      dwe $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         ehd $$9 = $$8.a().b();
         List<egm.a> $$10 = $$8.a().a();

         for (egm.a $$11 : $$10) {
            ego $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<egm.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dwp $$14 = new dwp(new dvr(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (egm.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (egm.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  egm.a $$20 = $$13.get($$18);
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

   private boolean a(egm.a $$0, dan $$1, jj $$2, dwe $$3, ekh $$4, long $$5, dru $$6, czb $$7, jo $$8) {
      egg $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      iz<dat> $$11 = $$9.a();
      Predicate<iv<dat>> $$12 = $$11::a;
      ego $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dan $$0, dru $$1, jo $$2, egg $$3) {
      ego $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dap $$0, dan $$1, dru $$2) {
      int $$3 = 8;
      czb $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jo $$9 = jo.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = czb.c($$10, $$11);

            for (ego $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     afu.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends ji<egg>> $$17 = $$0.H_().c(ld.aI);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lc.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dru> a(Executor var1, dws var2, dwe var3, dan var4, dru var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dvq.a var3, czw var4, dwe var5);

   public abstract dag a(int var1, int var2, czw var3, dwe var4);

   public int b(int $$0, int $$1, dvq.a $$2, czw $$3, dwe $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dvq.a $$2, czw $$3, dwe $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dwe var2, im var3);

   @Deprecated
   public dau a(iv<dat> $$0) {
      return this.d.apply($$0);
   }
}
