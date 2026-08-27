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

public abstract class dkm {
   public static final Codec<dkm> a = kb.ac.q().dispatchStable(dkm::a, Function.identity());
   protected final cub b;
   private final Supplier<List<cuh.b>> c;
   private final Function<ie<ctx>, cty> d;

   public dkm(cub $$0) {
      this($$0, $$0x -> ((ctx)$$0x.a()).d());
   }

   public dkm(cub $$0, Function<ie<ctx>, cty> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> cuh.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dkm> a();

   public dkn a(ih<dyu> $$0, dom $$1, long $$2) {
      return dkn.a($$1, $$2, this.b, $$0);
   }

   public Optional<ags<Codec<? extends dkm>>> b() {
      return kb.ac.c(this.a());
   }

   public CompletableFuture<dkl> a(Executor $$0, dom $$1, dpa $$2, ctr $$3, dkl $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(amw var1, long var2, dom var4, ctz var5, ctr var6, dkl var7, dnu.a var8);

   @Nullable
   public Pair<hv, ie<dyo>> a(amp $$0, ij<dyo> $$1, hv $$2, int $$3, boolean $$4) {
      dkn $$5 = $$0.k().h();
      Map<dzl, Set<ie<dyo>>> $$6 = new Object2ObjectArrayMap();

      for (ie<dyo> $$7 : $$1) {
         for (dzl $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<hv, ie<dyo>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         ctr $$11 = $$0.a();
         List<Entry<dzl, Set<ie<dyo>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<dzl, Set<ie<dyo>>> $$13 : $$6.entrySet()) {
            dzl $$14 = $$13.getKey();
            if ($$14 instanceof dzi) {
               dzi $$15 = (dzi)$$14;
               Pair<hv, ie<dyo>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  hv $$17 = (hv)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof dzj) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = ix.a($$2.u());
            int $$20 = ix.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<dzl, Set<ie<dyo>>> $$23 : $$12) {
                  dzj $$24 = (dzj)$$23.getKey();
                  Pair<hv, ie<dyo>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((iz)$$25.getFirst());
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
   private Pair<hv, ie<dyo>> a(Set<ie<dyo>> $$0, amp $$1, ctr $$2, hv $$3, boolean $$4, dzi $$5) {
      List<csf> $$6 = $$1.k().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<hv, ie<dyo>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         hv.a $$9 = new hv.a();

         for (csf $$10 : $$6) {
            $$9.d(ix.a($$10.e, 8), 32, ix.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<hv, ie<dyo>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<hv, ie<dyo>> a(Set<ie<dyo>> $$0, ctb $$1, ctr $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dzj $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               csf $$16 = $$8.a($$7, $$14, $$15);
               Pair<hv, ie<dyo>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<hv, ie<dyo>> a(Set<ie<dyo>> $$0, ctb $$1, ctr $$2, boolean $$3, dzl $$4, csf $$5) {
      for (ie<dyo> $$6 : $$0) {
         dyq $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dyq.b) {
            if (!$$3 && $$7 == dyq.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dkl $$8 = $$1.a($$5.e, $$5.f, dkq.d);
            dyw $$9 = $$2.a(ix.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(ctr $$0, dyw $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(ctt $$0, dkl $$1, ctr $$2) {
      csf $$3 = $$1.f();
      if (!aa.a($$3)) {
         ix $$4 = ix.a($$3, $$0.am());
         hv $$5 = $$4.j();
         ir<dyo> $$6 = $$0.I_().d(kc.aC);
         Map<Integer, List<dyo>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<cuh.b> $$8 = this.c.get();
         dox $$9 = new dox(new doz(don.a()));
         long $$10 = $$9.a($$0.B(), $$5.u(), $$5.w());
         Set<ie<ctx>> $$11 = new ObjectArraySet();
         csf.a($$4.r(), 1).forEach($$2x -> {
            dkl $$3x = $$0.a($$2x.e, $$2x.f);

            for (dkx $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            ir<dxs> $$13 = $$0.I_().d(kc.aB);
            int $$14 = Math.max(dnu.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dyo $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (ie<ctx> $$23 : $$11) {
                     List<ij<dxs>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        ij<dxs> $$25 = $$24.get($$15);
                        cuh.b $$26 = $$8.get($$15);
                        $$25.a().map(ie::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  cuh.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dxs $$32 = $$29.a().get($$31);
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

   private static dyg a(dkl $$0) {
      csf $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      cta $$4 = $$0.z();
      int $$5 = $$4.J_() + 1;
      int $$6 = $$4.ak() - 1;
      return new dyg($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(amw var1, ctr var2, dom var3, dkl var4);

   public abstract void a(amw var1);

   public int a(cta $$0) {
      return 64;
   }

   public cub c() {
      return this.b;
   }

   public abstract int d();

   public bhz<cuj.c> a(ie<ctx> $$0, ctr $$1, bly $$2, hv $$3) {
      Map<dyo, LongSet> $$4 = $$1.b($$3);

      for (Entry<dyo, LongSet> $$5 : $$4.entrySet()) {
         dyo $$6 = $$5.getKey();
         dyv $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dyw> $$9 = $$7.a() == dyv.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(is $$0, dkn $$1, ctr $$2, dkl $$3, ecp $$4) {
      csf $$5 = $$3.f();
      ix $$6 = ix.a($$3);
      dom $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         dzl $$9 = $$8.a().b();
         List<dyu.a> $$10 = $$8.a().a();

         for (dyu.a $$11 : $$10) {
            dyw $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dyu.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dox $$14 = new dox(new dnz(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dyu.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dyu.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dyu.a $$20 = $$13.get($$18);
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

   private boolean a(dyu.a $$0, ctr $$1, is $$2, dom $$3, ecp $$4, long $$5, dkl $$6, csf $$7, ix $$8) {
      dyo $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ij<ctx> $$11 = $$9.a();
      Predicate<ie<ctx>> $$12 = $$11::a;
      dyw $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(ctr $$0, dkl $$1, ix $$2, dyo $$3) {
      dyw $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(ctt $$0, ctr $$1, dkl $$2) {
      int $$3 = 8;
      csf $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      ix $$9 = ix.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = csf.c($$10, $$11);

            for (dyw $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     acv.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends ir<dyo>> $$17 = $$0.I_().c(kc.aC);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> kb.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dkl> a(Executor var1, dpa var2, dom var3, ctr var4, dkl var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dny.a var3, cta var4, dom var5);

   public abstract ctk a(int var1, int var2, cta var3, dom var4);

   public int b(int $$0, int $$1, dny.a $$2, cta $$3, dom $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dny.a $$2, cta $$3, dom $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dom var2, hv var3);

   @Deprecated
   public cty a(ie<ctx> $$0) {
      return this.d.apply($$0);
   }
}
