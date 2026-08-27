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

public abstract class dgx {
   public static final Codec<dgx> a = jb.ad.q().dispatchStable(dgx::a, Function.identity());
   protected final cqo b;
   private final Supplier<List<cqu.b>> c;
   private final Function<he<cqk>, cql> d;

   public dgx(cqo $$0) {
      this($$0, $$0x -> ((cqk)$$0x.a()).d());
   }

   public dgx(cqo $$0, Function<he<cqk>, cql> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> cqu.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dgx> a();

   public dgy a(hg<dvf> $$0, dkx $$1, long $$2) {
      return dgy.a($$1, $$2, this.b, $$0);
   }

   public Optional<aeq<Codec<? extends dgx>>> b() {
      return jb.ad.c(this.a());
   }

   public CompletableFuture<dgw> a(Executor $$0, dkx $$1, dll $$2, cqe $$3, dgw $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(akr var1, long var2, dkx var4, cqm var5, cqe var6, dgw var7, dkf.a var8);

   @Nullable
   public Pair<gu, he<duz>> a(akk $$0, hi<duz> $$1, gu $$2, int $$3, boolean $$4) {
      dgy $$5 = $$0.k().h();
      Map<dvw, Set<he<duz>>> $$6 = new Object2ObjectArrayMap();

      for (he<duz> $$7 : $$1) {
         for (dvw $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<gu, he<duz>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         cqe $$11 = $$0.a();
         List<Entry<dvw, Set<he<duz>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<dvw, Set<he<duz>>> $$13 : $$6.entrySet()) {
            dvw $$14 = $$13.getKey();
            if ($$14 instanceof dvt) {
               dvt $$15 = (dvt)$$14;
               Pair<gu, he<duz>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  gu $$17 = (gu)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof dvu) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = hx.a($$2.u());
            int $$20 = hx.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<dvw, Set<he<duz>>> $$23 : $$12) {
                  dvu $$24 = (dvu)$$23.getKey();
                  Pair<gu, he<duz>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((hz)$$25.getFirst());
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
   private Pair<gu, he<duz>> a(Set<he<duz>> $$0, akk $$1, cqe $$2, gu $$3, boolean $$4, dvt $$5) {
      List<cot> $$6 = $$1.k().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<gu, he<duz>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         gu.a $$9 = new gu.a();

         for (cot $$10 : $$6) {
            $$9.d(hx.a($$10.e, 8), 32, hx.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<gu, he<duz>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<gu, he<duz>> a(Set<he<duz>> $$0, cpp $$1, cqe $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dvu $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cot $$16 = $$8.a($$7, $$14, $$15);
               Pair<gu, he<duz>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<gu, he<duz>> a(Set<he<duz>> $$0, cpp $$1, cqe $$2, boolean $$3, dvw $$4, cot $$5) {
      for (he<duz> $$6 : $$0) {
         dvb $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dvb.b) {
            if (!$$3 && $$7 == dvb.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dgw $$8 = $$1.a($$5.e, $$5.f, dhb.d);
            dvh $$9 = $$2.a(hx.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(cqe $$0, dvh $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(cqg $$0, dgw $$1, cqe $$2) {
      cot $$3 = $$1.f();
      if (!aa.a($$3)) {
         hx $$4 = hx.a($$3, $$0.al());
         gu $$5 = $$4.j();
         hr<duz> $$6 = $$0.B_().d(jc.az);
         Map<Integer, List<duz>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<cqu.b> $$8 = this.c.get();
         dli $$9 = new dli(new dlk(dky.a()));
         long $$10 = $$9.a($$0.A(), $$5.u(), $$5.w());
         Set<he<cqk>> $$11 = new ObjectArraySet();
         cot.a($$4.r(), 1).forEach($$2x -> {
            dgw $$3x = $$0.a($$2x.e, $$2x.f);

            for (dhi $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            hr<dud> $$13 = $$0.B_().d(jc.ay);
            int $$14 = Math.max(dkf.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (duz $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (he<cqk> $$23 : $$11) {
                     List<hi<dud>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        hi<dud> $$25 = $$24.get($$15);
                        cqu.b $$26 = $$8.get($$15);
                        $$25.a().map(he::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  cqu.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dud $$32 = $$29.a().get($$31);
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

   private static dur a(dgw $$0) {
      cot $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      cpo $$4 = $$0.z();
      int $$5 = $$4.C_() + 1;
      int $$6 = $$4.aj() - 1;
      return new dur($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(akr var1, cqe var2, dkx var3, dgw var4);

   public abstract void a(akr var1);

   public int a(cpo $$0) {
      return 64;
   }

   public cqo c() {
      return this.b;
   }

   public abstract int d();

   public bfe<cqw.c> a(he<cqk> $$0, cqe $$1, bjb $$2, gu $$3) {
      Map<duz, LongSet> $$4 = $$1.b($$3);

      for (Entry<duz, LongSet> $$5 : $$4.entrySet()) {
         duz $$6 = $$5.getKey();
         dvg $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dvh> $$9 = $$7.a() == dvg.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(hs $$0, dgy $$1, cqe $$2, dgw $$3, dyt $$4) {
      cot $$5 = $$3.f();
      hx $$6 = hx.a($$3);
      dkx $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         dvw $$9 = $$8.a().b();
         List<dvf.a> $$10 = $$8.a().a();

         for (dvf.a $$11 : $$10) {
            dvh $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dvf.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dli $$14 = new dli(new dkk(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dvf.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dvf.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dvf.a $$20 = $$13.get($$18);
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

   private boolean a(dvf.a $$0, cqe $$1, hs $$2, dkx $$3, dyt $$4, long $$5, dgw $$6, cot $$7, hx $$8) {
      duz $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      hi<cqk> $$11 = $$9.a();
      Predicate<he<cqk>> $$12 = $$11::a;
      dvh $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(cqe $$0, dgw $$1, hx $$2, duz $$3) {
      dvh $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(cqg $$0, cqe $$1, dgw $$2) {
      int $$3 = 8;
      cot $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      hx $$9 = hx.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = cot.c($$10, $$11);

            for (dvh $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     aav.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends hr<duz>> $$17 = $$0.B_().c(jc.az);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> jb.U.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dgw> a(Executor var1, dll var2, dkx var3, cqe var4, dgw var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dkj.a var3, cpo var4, dkx var5);

   public abstract cpy a(int var1, int var2, cpo var3, dkx var4);

   public int b(int $$0, int $$1, dkj.a $$2, cpo $$3, dkx $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dkj.a $$2, cpo $$3, dkx $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dkx var2, gu var3);

   @Deprecated
   public cql a(he<cqk> $$0) {
      return this.d.apply($$0);
   }
}
