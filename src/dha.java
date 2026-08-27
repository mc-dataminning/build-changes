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

public abstract class dha {
   public static final Codec<dha> a = jb.ad.q().dispatchStable(dha::a, Function.identity());
   protected final crd b;
   private final Supplier<List<crj.b>> c;
   private final Function<he<cqz>, cra> d;

   public dha(crd $$0) {
      this($$0, $$0x -> ((cqz)$$0x.a()).d());
   }

   public dha(crd $$0, Function<he<cqz>, cra> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> crj.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dha> a();

   public dhb a(hg<dvi> $$0, dla $$1, long $$2) {
      return dhb.a($$1, $$2, this.b, $$0);
   }

   public Optional<aey<Codec<? extends dha>>> b() {
      return jb.ad.c(this.a());
   }

   public CompletableFuture<dgz> a(Executor $$0, dla $$1, dlo $$2, cqt $$3, dgz $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(ala var1, long var2, dla var4, crb var5, cqt var6, dgz var7, dki.a var8);

   @Nullable
   public Pair<gw, he<dvc>> a(akt $$0, hi<dvc> $$1, gw $$2, int $$3, boolean $$4) {
      dhb $$5 = $$0.k().h();
      Map<dvz, Set<he<dvc>>> $$6 = new Object2ObjectArrayMap();

      for (he<dvc> $$7 : $$1) {
         for (dvz $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<gw, he<dvc>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         cqt $$11 = $$0.a();
         List<Entry<dvz, Set<he<dvc>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<dvz, Set<he<dvc>>> $$13 : $$6.entrySet()) {
            dvz $$14 = $$13.getKey();
            if ($$14 instanceof dvw) {
               dvw $$15 = (dvw)$$14;
               Pair<gw, he<dvc>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  gw $$17 = (gw)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof dvx) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = hw.a($$2.u());
            int $$20 = hw.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<dvz, Set<he<dvc>>> $$23 : $$12) {
                  dvx $$24 = (dvx)$$23.getKey();
                  Pair<gw, he<dvc>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((hy)$$25.getFirst());
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
   private Pair<gw, he<dvc>> a(Set<he<dvc>> $$0, akt $$1, cqt $$2, gw $$3, boolean $$4, dvw $$5) {
      List<cpi> $$6 = $$1.k().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<gw, he<dvc>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         gw.a $$9 = new gw.a();

         for (cpi $$10 : $$6) {
            $$9.d(hw.a($$10.e, 8), 32, hw.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<gw, he<dvc>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<gw, he<dvc>> a(Set<he<dvc>> $$0, cqe $$1, cqt $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dvx $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cpi $$16 = $$8.a($$7, $$14, $$15);
               Pair<gw, he<dvc>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<gw, he<dvc>> a(Set<he<dvc>> $$0, cqe $$1, cqt $$2, boolean $$3, dvz $$4, cpi $$5) {
      for (he<dvc> $$6 : $$0) {
         dve $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dve.b) {
            if (!$$3 && $$7 == dve.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dgz $$8 = $$1.a($$5.e, $$5.f, dhe.d);
            dvk $$9 = $$2.a(hw.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(cqt $$0, dvk $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(cqv $$0, dgz $$1, cqt $$2) {
      cpi $$3 = $$1.f();
      if (!aa.a($$3)) {
         hw $$4 = hw.a($$3, $$0.al());
         gw $$5 = $$4.j();
         hq<dvc> $$6 = $$0.G_().d(jc.aA);
         Map<Integer, List<dvc>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<crj.b> $$8 = this.c.get();
         dll $$9 = new dll(new dln(dlb.a()));
         long $$10 = $$9.a($$0.A(), $$5.u(), $$5.w());
         Set<he<cqz>> $$11 = new ObjectArraySet();
         cpi.a($$4.r(), 1).forEach($$2x -> {
            dgz $$3x = $$0.a($$2x.e, $$2x.f);

            for (dhl $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            hq<dug> $$13 = $$0.G_().d(jc.az);
            int $$14 = Math.max(dki.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dvc $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (he<cqz> $$23 : $$11) {
                     List<hi<dug>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        hi<dug> $$25 = $$24.get($$15);
                        crj.b $$26 = $$8.get($$15);
                        $$25.a().map(he::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  crj.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dug $$32 = $$29.a().get($$31);
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

   private static duu a(dgz $$0) {
      cpi $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      cqd $$4 = $$0.z();
      int $$5 = $$4.H_() + 1;
      int $$6 = $$4.aj() - 1;
      return new duu($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ala var1, cqt var2, dla var3, dgz var4);

   public abstract void a(ala var1);

   public int a(cqd $$0) {
      return 64;
   }

   public crd c() {
      return this.b;
   }

   public abstract int d();

   public bfs<crl.c> a(he<cqz> $$0, cqt $$1, bjp $$2, gw $$3) {
      Map<dvc, LongSet> $$4 = $$1.b($$3);

      for (Entry<dvc, LongSet> $$5 : $$4.entrySet()) {
         dvc $$6 = $$5.getKey();
         dvj $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dvk> $$9 = $$7.a() == dvj.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(hr $$0, dhb $$1, cqt $$2, dgz $$3, dyw $$4) {
      cpi $$5 = $$3.f();
      hw $$6 = hw.a($$3);
      dla $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         dvz $$9 = $$8.a().b();
         List<dvi.a> $$10 = $$8.a().a();

         for (dvi.a $$11 : $$10) {
            dvk $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dvi.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dll $$14 = new dll(new dkn(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dvi.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dvi.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dvi.a $$20 = $$13.get($$18);
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

   private boolean a(dvi.a $$0, cqt $$1, hr $$2, dla $$3, dyw $$4, long $$5, dgz $$6, cpi $$7, hw $$8) {
      dvc $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      hi<cqz> $$11 = $$9.a();
      Predicate<he<cqz>> $$12 = $$11::a;
      dvk $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(cqt $$0, dgz $$1, hw $$2, dvc $$3) {
      dvk $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(cqv $$0, cqt $$1, dgz $$2) {
      int $$3 = 8;
      cpi $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      hw $$9 = hw.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = cpi.c($$10, $$11);

            for (dvk $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     abc.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends hq<dvc>> $$17 = $$0.G_().c(jc.aA);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> jb.U.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dgz> a(Executor var1, dlo var2, dla var3, cqt var4, dgz var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dkm.a var3, cqd var4, dla var5);

   public abstract cqn a(int var1, int var2, cqd var3, dla var4);

   public int b(int $$0, int $$1, dkm.a $$2, cqd $$3, dla $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dkm.a $$2, cqd $$3, dla $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dla var2, gw var3);

   @Deprecated
   public cra a(he<cqz> $$0) {
      return this.d.apply($$0);
   }
}
