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

public abstract class ebm {
   public static final Codec<ebm> a = mf.aa.q().dispatchStable(ebm::b, Function.identity());
   protected final djw b;
   private final Supplier<List<dkc.b>> c;
   private final Function<je<djs>, djt> d;

   public ebm(djw $$0) {
      this($$0, $$0x -> ((djs)$$0x.a()).d());
   }

   public ebm(djw $$0, Function<je<djs>, djt> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dkc.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends ebm> b();

   public ebn a(jg<eqo> $$0, egb $$1, long $$2) {
      return ebn.a($$1, $$2, this.b, $$0);
   }

   public Optional<ald<MapCodec<? extends ebm>>> c() {
      return mf.aa.d(this.b());
   }

   public CompletableFuture<ebl> a(egb $$0, egp $$1, djl $$2, ebl $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, af.h().a("init_biomes"));
   }

   public abstract void a(arw var1, long var2, egb var4, dju var5, djl var6, ebl var7);

   @Nullable
   public Pair<iu, je<eqi>> a(aro $$0, ji<eqi> $$1, iu $$2, int $$3, boolean $$4) {
      ebn $$5 = $$0.m().h();
      Map<erf, Set<je<eqi>>> $$6 = new Object2ObjectArrayMap();

      for (je<eqi> $$7 : $$1) {
         for (erf $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<iu, je<eqi>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         djl $$11 = $$0.b();
         List<Entry<erf, Set<je<eqi>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<erf, Set<je<eqi>>> $$13 : $$6.entrySet()) {
            erf $$14 = $$13.getKey();
            if ($$14 instanceof erc) {
               erc $$15 = (erc)$$14;
               Pair<iu, je<eqi>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  iu $$17 = (iu)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof erd) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jx.a($$2.u());
            int $$20 = jx.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<erf, Set<je<eqi>>> $$23 : $$12) {
                  erd $$24 = (erd)$$23.getKey();
                  Pair<iu, je<eqi>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((jz)$$25.getFirst());
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
   private Pair<iu, je<eqi>> a(Set<je<eqi>> $$0, aro $$1, djl $$2, iu $$3, boolean $$4, erc $$5) {
      List<dhw> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<iu, je<eqi>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         iu.a $$9 = new iu.a();

         for (dhw $$10 : $$6) {
            $$9.d(jx.a($$10.h, 8), 32, jx.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<iu, je<eqi>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<iu, je<eqi>> a(Set<je<eqi>> $$0, dis $$1, djl $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, erd $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dhw $$16 = $$8.a($$7, $$14, $$15);
               Pair<iu, je<eqi>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<iu, je<eqi>> a(Set<je<eqi>> $$0, dis $$1, djl $$2, boolean $$3, erf $$4, dhw $$5) {
      for (je<eqi> $$6 : $$0) {
         eqk $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eqk.b) {
            if (!$$3 && $$7 == eqk.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            ebl $$8 = $$1.a($$5.h, $$5.i, ecm.d);
            eqq $$9 = $$2.a(jx.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(djl $$0, eqq $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(djo $$0, ebl $$1, djl $$2) {
      dhw $$3 = $$1.f();
      if (!ab.a($$3)) {
         jx $$4 = jx.a($$3, $$0.aq());
         iu $$5 = $$4.j();
         jr<eqi> $$6 = $$0.F_().f(mg.bc);
         Map<Integer, List<eqi>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dkc.b> $$8 = this.c.get();
         egm $$9 = new egm(new ego(egc.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<je<djs>> $$11 = new ObjectArraySet();
         dhw.a($$4.r(), 1).forEach($$2x -> {
            ebl $$3x = $$0.a($$2x.h, $$2x.i);

            for (ebw $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jr<epm> $$13 = $$0.F_().f(mg.aZ);
            int $$14 = Math.max(efj.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eqi $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (je<djs> $$23 : $$11) {
                     List<ji<epm>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        ji<epm> $$25 = $$24.get($$15);
                        dkc.b $$26 = $$8.get($$15);
                        $$25.a().map(je::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dkc.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     epm $$32 = $$29.a().get($$31);
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

   private static eqa a(ebl $$0) {
      dhw $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dir $$4 = $$0.B();
      int $$5 = $$4.G_() + 1;
      int $$6 = $$4.ao();
      return new eqa($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(arw var1, djl var2, egb var3, ebl var4);

   public abstract void a(arw var1);

   public int a(dir $$0) {
      return 64;
   }

   public djw d() {
      return this.b;
   }

   public abstract int e();

   public bsj<dke.c> a(je<djs> $$0, djl $$1, bxc $$2, iu $$3) {
      Map<eqi, LongSet> $$4 = $$1.b($$3);

      for (Entry<eqi, LongSet> $$5 : $$4.entrySet()) {
         eqi $$6 = $$5.getKey();
         eqp $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<eqq> $$9 = $$7.a() == eqp.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(js $$0, ebn $$1, djl $$2, ebl $$3, eul $$4, ald<dip> $$5) {
      dhw $$6 = $$3.f();
      jx $$7 = jx.a($$3);
      egb $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         erf $$10 = $$9.a().b();
         List<eqo.a> $$11 = $$9.a().a();

         for (eqo.a $$12 : $$11) {
            eqq $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<eqo.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               egm $$15 = new egm(new efo(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (eqo.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (eqo.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  eqo.a $$21 = $$14.get($$19);
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

   private boolean a(eqo.a $$0, djl $$1, js $$2, egb $$3, eul $$4, long $$5, ebl $$6, dhw $$7, jx $$8, ald<dip> $$9) {
      eqi $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      ji<djs> $$12 = $$10.a();
      Predicate<je<djs>> $$13 = $$12::a;
      eqq $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(djl $$0, ebl $$1, jx $$2, eqi $$3) {
      eqq $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(djo $$0, djl $$1, ebl $$2) {
      int $$3 = 8;
      dhw $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jx $$9 = jx.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dhw.c($$10, $$11);

            for (eqq $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agk.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends jr<eqi>> $$17 = $$0.F_().a(mg.bc);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> mf.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<ebl> a(egp var1, egb var2, djl var3, ebl var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, efn.a var3, dir var4, egb var5);

   public abstract djb a(int var1, int var2, dir var3, egb var4);

   public int b(int $$0, int $$1, efn.a $$2, dir $$3, egb $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, efn.a $$2, dir $$3, egb $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, egb var2, iu var3);

   @Deprecated
   public djt a(je<djs> $$0) {
      return this.d.apply($$0);
   }
}
