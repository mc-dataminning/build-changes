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

public abstract class dxa {
   public static final Codec<dxa> a = lx.aa.q().dispatchStable(dxa::b, Function.identity());
   protected final dga b;
   private final Supplier<List<dgg.b>> c;
   private final Function<jp<dfw>, dfx> d;

   public dxa(dga $$0) {
      this($$0, $$0x -> ((dfw)$$0x.a()).d());
   }

   public dxa(dga $$0, Function<jp<dfw>, dfx> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dgg.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dxa> b();

   public dxb a(jr<elx> $$0, ebn $$1, long $$2) {
      return dxb.a($$1, $$2, this.b, $$0);
   }

   public Optional<alg<MapCodec<? extends dxa>>> c() {
      return lx.aa.d(this.b());
   }

   public CompletableFuture<dwz> a(ebn $$0, ecb $$1, dfq $$2, dwz $$3) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }), ad.g());
   }

   public abstract void a(aru var1, long var2, ebn var4, dfy var5, dfq var6, dwz var7);

   @Nullable
   public Pair<jg, jp<elr>> a(arm $$0, jt<elr> $$1, jg $$2, int $$3, boolean $$4) {
      dxb $$5 = $$0.l().h();
      Map<emo, Set<jp<elr>>> $$6 = new Object2ObjectArrayMap();

      for (jp<elr> $$7 : $$1) {
         for (emo $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jg, jp<elr>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dfq $$11 = $$0.a();
         List<Entry<emo, Set<jp<elr>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<emo, Set<jp<elr>>> $$13 : $$6.entrySet()) {
            emo $$14 = $$13.getKey();
            if ($$14 instanceof eml) {
               eml $$15 = (eml)$$14;
               Pair<jg, jp<elr>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jg $$17 = (jg)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof emm) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = ki.a($$2.u());
            int $$20 = ki.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<emo, Set<jp<elr>>> $$23 : $$12) {
                  emm $$24 = (emm)$$23.getKey();
                  Pair<jg, jp<elr>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kk)$$25.getFirst());
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
   private Pair<jg, jp<elr>> a(Set<jp<elr>> $$0, arm $$1, dfq $$2, jg $$3, boolean $$4, eml $$5) {
      List<deb> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jg, jp<elr>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jg.a $$9 = new jg.a();

         for (deb $$10 : $$6) {
            $$9.d(ki.a($$10.e, 8), 32, ki.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jg, jp<elr>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jg, jp<elr>> a(Set<jp<elr>> $$0, dey $$1, dfq $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, emm $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               deb $$16 = $$8.a($$7, $$14, $$15);
               Pair<jg, jp<elr>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jg, jp<elr>> a(Set<jp<elr>> $$0, dey $$1, dfq $$2, boolean $$3, emo $$4, deb $$5) {
      for (jp<elr> $$6 : $$0) {
         elt $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != elt.b) {
            if (!$$3 && $$7 == elt.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dwz $$8 = $$1.a($$5.e, $$5.f, dya.d);
            elz $$9 = $$2.a(ki.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dfq $$0, elz $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dfs $$0, dwz $$1, dfq $$2) {
      deb $$3 = $$1.f();
      if (!ab.a($$3)) {
         ki $$4 = ki.a($$3, $$0.ap());
         jg $$5 = $$4.j();
         kc<elr> $$6 = $$0.H_().e(ly.aS);
         Map<Integer, List<elr>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dgg.b> $$8 = this.c.get();
         eby $$9 = new eby(new eca(ebo.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<jp<dfw>> $$11 = new ObjectArraySet();
         deb.a($$4.r(), 1).forEach($$2x -> {
            dwz $$3x = $$0.a($$2x.e, $$2x.f);

            for (dxk $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            kc<ekv> $$13 = $$0.H_().e(ly.aR);
            int $$14 = Math.max(eav.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (elr $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jp<dfw> $$23 : $$11) {
                     List<jt<ekv>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jt<ekv> $$25 = $$24.get($$15);
                        dgg.b $$26 = $$8.get($$15);
                        $$25.a().map(jp::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dgg.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     ekv $$32 = $$29.a().get($$31);
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
            $$37.a("Generation").a("CenterX", $$3.e).a("CenterZ", $$3.f).a("Decoration Seed", $$10);
            throw new z($$37);
         }
      }
   }

   private static elj a(dwz $$0) {
      deb $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dex $$4 = $$0.y();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.an();
      return new elj($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aru var1, dfq var2, ebn var3, dwz var4);

   public abstract void a(aru var1);

   public int a(dex $$0) {
      return 64;
   }

   public dga d() {
      return this.b;
   }

   public abstract int e();

   public bqk<dgi.c> a(jp<dfw> $$0, dfq $$1, buy $$2, jg $$3) {
      Map<elr, LongSet> $$4 = $$1.b($$3);

      for (Entry<elr, LongSet> $$5 : $$4.entrySet()) {
         elr $$6 = $$5.getKey();
         ely $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<elz> $$9 = $$7.a() == ely.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(kd $$0, dxb $$1, dfq $$2, dwz $$3, epu $$4) {
      deb $$5 = $$3.f();
      ki $$6 = ki.a($$3);
      ebn $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         emo $$9 = $$8.a().b();
         List<elx.a> $$10 = $$8.a().a();

         for (elx.a $$11 : $$10) {
            elz $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<elx.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               eby $$14 = new eby(new eba(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (elx.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (elx.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  elx.a $$20 = $$13.get($$18);
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

   private boolean a(elx.a $$0, dfq $$1, kd $$2, ebn $$3, epu $$4, long $$5, dwz $$6, deb $$7, ki $$8) {
      elr $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      jt<dfw> $$11 = $$9.a();
      Predicate<jp<dfw>> $$12 = $$11::a;
      elz $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dfq $$0, dwz $$1, ki $$2, elr $$3) {
      elz $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dfs $$0, dfq $$1, dwz $$2) {
      int $$3 = 8;
      deb $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      ki $$9 = ki.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = deb.c($$10, $$11);

            for (elz $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agr.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends kc<elr>> $$17 = $$0.H_().a(ly.aS);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lx.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dwz> a(ecb var1, ebn var2, dfq var3, dwz var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, eaz.a var3, dex var4, ebn var5);

   public abstract dfh a(int var1, int var2, dex var3, ebn var4);

   public int b(int $$0, int $$1, eaz.a $$2, dex $$3, ebn $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, eaz.a $$2, dex $$3, ebn $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, ebn var2, jg var3);

   @Deprecated
   public dfx a(jp<dfw> $$0) {
      return this.d.apply($$0);
   }
}
