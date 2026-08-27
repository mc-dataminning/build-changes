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

public abstract class dlm {
   public static final Codec<dlm> a = kd.ac.q().dispatchStable(dlm::a, Function.identity());
   protected final cva b;
   private final Supplier<List<cvg.b>> c;
   private final Function<ih<cuw>, cux> d;

   public dlm(cva $$0) {
      this($$0, $$0x -> ((cuw)$$0x.a()).d());
   }

   public dlm(cva $$0, Function<ih<cuw>, cux> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> cvg.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dlm> a();

   public dln a(ij<dzu> $$0, dpm $$1, long $$2) {
      return dln.a($$1, $$2, this.b, $$0);
   }

   public Optional<ahg<Codec<? extends dlm>>> b() {
      return kd.ac.c(this.a());
   }

   public CompletableFuture<dll> a(Executor $$0, dpm $$1, dqa $$2, cuq $$3, dll $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(anl var1, long var2, dpm var4, cuy var5, cuq var6, dll var7, dou.a var8);

   @Nullable
   public Pair<hx, ih<dzo>> a(ane $$0, il<dzo> $$1, hx $$2, int $$3, boolean $$4) {
      dln $$5 = $$0.l().h();
      Map<eal, Set<ih<dzo>>> $$6 = new Object2ObjectArrayMap();

      for (ih<dzo> $$7 : $$1) {
         for (eal $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<hx, ih<dzo>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         cuq $$11 = $$0.a();
         List<Entry<eal, Set<ih<dzo>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<eal, Set<ih<dzo>>> $$13 : $$6.entrySet()) {
            eal $$14 = $$13.getKey();
            if ($$14 instanceof eai) {
               eai $$15 = (eai)$$14;
               Pair<hx, ih<dzo>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  hx $$17 = (hx)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eaj) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = iz.a($$2.u());
            int $$20 = iz.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<eal, Set<ih<dzo>>> $$23 : $$12) {
                  eaj $$24 = (eaj)$$23.getKey();
                  Pair<hx, ih<dzo>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
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
   private Pair<hx, ih<dzo>> a(Set<ih<dzo>> $$0, ane $$1, cuq $$2, hx $$3, boolean $$4, eai $$5) {
      List<cte> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<hx, ih<dzo>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         hx.a $$9 = new hx.a();

         for (cte $$10 : $$6) {
            $$9.d(iz.a($$10.e, 8), 32, iz.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<hx, ih<dzo>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<hx, ih<dzo>> a(Set<ih<dzo>> $$0, cua $$1, cuq $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eaj $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cte $$16 = $$8.a($$7, $$14, $$15);
               Pair<hx, ih<dzo>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<hx, ih<dzo>> a(Set<ih<dzo>> $$0, cua $$1, cuq $$2, boolean $$3, eal $$4, cte $$5) {
      for (ih<dzo> $$6 : $$0) {
         dzq $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dzq.b) {
            if (!$$3 && $$7 == dzq.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dll $$8 = $$1.a($$5.e, $$5.f, dlq.d);
            dzw $$9 = $$2.a(iz.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(cuq $$0, dzw $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(cus $$0, dll $$1, cuq $$2) {
      cte $$3 = $$1.f();
      if (!aa.a($$3)) {
         iz $$4 = iz.a($$3, $$0.an());
         hx $$5 = $$4.j();
         it<dzo> $$6 = $$0.I_().d(ke.aD);
         Map<Integer, List<dzo>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<cvg.b> $$8 = this.c.get();
         dpx $$9 = new dpx(new dpz(dpn.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<ih<cuw>> $$11 = new ObjectArraySet();
         cte.a($$4.r(), 1).forEach($$2x -> {
            dll $$3x = $$0.a($$2x.e, $$2x.f);

            for (dlx $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            it<dys> $$13 = $$0.I_().d(ke.aC);
            int $$14 = Math.max(dou.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dzo $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (ih<cuw> $$23 : $$11) {
                     List<il<dys>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        il<dys> $$25 = $$24.get($$15);
                        cvg.b $$26 = $$8.get($$15);
                        $$25.a().map(ih::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  cvg.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dys $$32 = $$29.a().get($$31);
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

   private static dzg a(dll $$0) {
      cte $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      ctz $$4 = $$0.z();
      int $$5 = $$4.J_() + 1;
      int $$6 = $$4.al() - 1;
      return new dzg($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(anl var1, cuq var2, dpm var3, dll var4);

   public abstract void a(anl var1);

   public int a(ctz $$0) {
      return 64;
   }

   public cva c() {
      return this.b;
   }

   public abstract int d();

   public biq<cvi.c> a(ih<cuw> $$0, cuq $$1, bmr $$2, hx $$3) {
      Map<dzo, LongSet> $$4 = $$1.b($$3);

      for (Entry<dzo, LongSet> $$5 : $$4.entrySet()) {
         dzo $$6 = $$5.getKey();
         dzv $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dzw> $$9 = $$7.a() == dzv.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(iu $$0, dln $$1, cuq $$2, dll $$3, edp $$4) {
      cte $$5 = $$3.f();
      iz $$6 = iz.a($$3);
      dpm $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         eal $$9 = $$8.a().b();
         List<dzu.a> $$10 = $$8.a().a();

         for (dzu.a $$11 : $$10) {
            dzw $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dzu.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dpx $$14 = new dpx(new doz(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dzu.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dzu.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dzu.a $$20 = $$13.get($$18);
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

   private boolean a(dzu.a $$0, cuq $$1, iu $$2, dpm $$3, edp $$4, long $$5, dll $$6, cte $$7, iz $$8) {
      dzo $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      il<cuw> $$11 = $$9.a();
      Predicate<ih<cuw>> $$12 = $$11::a;
      dzw $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(cuq $$0, dll $$1, iz $$2, dzo $$3) {
      dzw $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(cus $$0, cuq $$1, dll $$2) {
      int $$3 = 8;
      cte $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      iz $$9 = iz.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = cte.c($$10, $$11);

            for (dzw $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     adj.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends it<dzo>> $$17 = $$0.I_().c(ke.aD);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> kd.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dll> a(Executor var1, dqa var2, dpm var3, cuq var4, dll var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, doy.a var3, ctz var4, dpm var5);

   public abstract cuj a(int var1, int var2, ctz var3, dpm var4);

   public int b(int $$0, int $$1, doy.a $$2, ctz $$3, dpm $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, doy.a $$2, ctz $$3, dpm $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dpm var2, hx var3);

   @Deprecated
   public cux a(ih<cuw> $$0) {
      return this.d.apply($$0);
   }
}
