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

public abstract class ecr {
   public static final Codec<ecr> a = mg.aa.q().dispatchStable(ecr::b, Function.identity());
   protected final dkt b;
   private final Supplier<List<dkz.b>> c;
   private final Function<jf<dkp>, dkq> d;

   public ecr(dkt $$0) {
      this($$0, $$0x -> ((dkp)$$0x.a()).d());
   }

   public ecr(dkt $$0, Function<jf<dkp>, dkq> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dkz.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends ecr> b();

   public ecs a(jh<ert> $$0, ehg $$1, long $$2) {
      return ecs.a($$1, $$2, this.b, $$0);
   }

   public Optional<alf<MapCodec<? extends ecr>>> c() {
      return mg.aa.d(this.b());
   }

   public CompletableFuture<ecq> a(ehg $$0, ehu $$1, dki $$2, ecq $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ag.h().a("init_biomes"));
   }

   public abstract void a(ary var1, long var2, ehg var4, dkr var5, dki var6, ecq var7);

   @Nullable
   public Pair<iv, jf<ern>> a(arq $$0, jj<ern> $$1, iv $$2, int $$3, boolean $$4) {
      ecs $$5 = $$0.m().h();
      Map<esk, Set<jf<ern>>> $$6 = new Object2ObjectArrayMap();

      for (jf<ern> $$7 : $$1) {
         for (esk $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<iv, jf<ern>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dki $$11 = $$0.b();
         List<Entry<esk, Set<jf<ern>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<esk, Set<jf<ern>>> $$13 : $$6.entrySet()) {
            esk $$14 = $$13.getKey();
            if ($$14 instanceof esh) {
               esh $$15 = (esh)$$14;
               Pair<iv, jf<ern>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  iv $$17 = (iv)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof esi) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jy.a($$2.u());
            int $$20 = jy.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<esk, Set<jf<ern>>> $$23 : $$12) {
                  esi $$24 = (esi)$$23.getKey();
                  Pair<iv, jf<ern>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
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
   private Pair<iv, jf<ern>> a(Set<jf<ern>> $$0, arq $$1, dki $$2, iv $$3, boolean $$4, esh $$5) {
      List<dir> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<iv, jf<ern>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         iv.a $$9 = new iv.a();

         for (dir $$10 : $$6) {
            $$9.d(jy.a($$10.h, 8), 32, jy.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<iv, jf<ern>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<iv, jf<ern>> a(Set<jf<ern>> $$0, djp $$1, dki $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, esi $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dir $$16 = $$8.a($$7, $$14, $$15);
               Pair<iv, jf<ern>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<iv, jf<ern>> a(Set<jf<ern>> $$0, djp $$1, dki $$2, boolean $$3, esk $$4, dir $$5) {
      for (jf<ern> $$6 : $$0) {
         erp $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != erp.b) {
            if (!$$3 && $$7 == erp.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            ecq $$8 = $$1.a($$5.h, $$5.i, edr.d);
            erv $$9 = $$2.a(jy.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dki $$0, erv $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dkl $$0, ecq $$1, dki $$2) {
      dir $$3 = $$1.f();
      if (!ac.a($$3)) {
         jy $$4 = jy.a($$3, $$0.aq());
         iv $$5 = $$4.j();
         js<ern> $$6 = $$0.F_().f(mh.be);
         Map<Integer, List<ern>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dkz.b> $$8 = this.c.get();
         ehr $$9 = new ehr(new eht(ehh.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<jf<dkp>> $$11 = new ObjectArraySet();
         dir.a($$4.r(), 1).forEach($$2x -> {
            ecq $$3x = $$0.a($$2x.h, $$2x.i);

            for (edb $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            js<eqr> $$13 = $$0.F_().f(mh.bb);
            int $$14 = Math.max(ego.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (ern $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jf<dkp> $$23 : $$11) {
                     List<jj<eqr>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jj<eqr> $$25 = $$24.get($$15);
                        dkz.b $$26 = $$8.get($$15);
                        $$25.a().map(jf::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dkz.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eqr $$32 = $$29.a().get($$31);
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

   private static erf a(ecq $$0) {
      dir $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      djo $$4 = $$0.B();
      int $$5 = $$4.G_() + 1;
      int $$6 = $$4.ao();
      return new erf($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ary var1, dki var2, ehg var3, ecq var4);

   public abstract void a(ary var1);

   public int a(djo $$0) {
      return 64;
   }

   public dkt d() {
      return this.b;
   }

   public abstract int e();

   public bsq<dlb.c> a(jf<dkp> $$0, dki $$1, bxm $$2, iv $$3) {
      Map<ern, LongSet> $$4 = $$1.b($$3);

      for (Entry<ern, LongSet> $$5 : $$4.entrySet()) {
         ern $$6 = $$5.getKey();
         eru $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<erv> $$9 = $$7.a() == eru.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jt $$0, ecs $$1, dki $$2, ecq $$3, evq $$4, alf<djm> $$5) {
      dir $$6 = $$3.f();
      jy $$7 = jy.a($$3);
      ehg $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         esk $$10 = $$9.a().b();
         List<ert.a> $$11 = $$9.a().a();

         for (ert.a $$12 : $$11) {
            erv $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<ert.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               ehr $$15 = new ehr(new egt(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (ert.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (ert.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  ert.a $$21 = $$14.get($$19);
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

   private boolean a(ert.a $$0, dki $$1, jt $$2, ehg $$3, evq $$4, long $$5, ecq $$6, dir $$7, jy $$8, alf<djm> $$9) {
      ern $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      jj<dkp> $$12 = $$10.a();
      Predicate<jf<dkp>> $$13 = $$12::a;
      erv $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dki $$0, ecq $$1, jy $$2, ern $$3) {
      erv $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dkl $$0, dki $$1, ecq $$2) {
      int $$3 = 8;
      dir $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jy $$9 = jy.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dir.c($$10, $$11);

            for (erv $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agm.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  p $$15 = p.a(var21, "Generating structure reference");
                  q $$16 = $$15.a("Structure");
                  Optional<? extends js<ern>> $$17 = $$0.F_().a(mh.be);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> mg.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new aa($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<ecq> a(ehu var1, ehg var2, dki var3, ecq var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, egs.a var3, djo var4, ehg var5);

   public abstract djy a(int var1, int var2, djo var3, ehg var4);

   public int b(int $$0, int $$1, egs.a $$2, djo $$3, ehg $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, egs.a $$2, djo $$3, ehg $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, ehg var2, iv var3);

   @Deprecated
   public dkq a(jf<dkp> $$0) {
      return this.d.apply($$0);
   }
}
