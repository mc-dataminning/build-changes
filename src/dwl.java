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

public abstract class dwl {
   public static final Codec<dwl> a = lu.aa.q().dispatchStable(dwl::b, Function.identity());
   protected final dfl b;
   private final Supplier<List<dfr.b>> c;
   private final Function<jn<dfh>, dfi> d;

   public dwl(dfl $$0) {
      this($$0, $$0x -> ((dfh)$$0x.a()).d());
   }

   public dwl(dfl $$0, Function<jn<dfh>, dfi> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dfr.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dwl> b();

   public dwm a(jp<eli> $$0, eay $$1, long $$2) {
      return dwm.a($$1, $$2, this.b, $$0);
   }

   public Optional<alb<MapCodec<? extends dwl>>> c() {
      return lu.aa.d(this.b());
   }

   public CompletableFuture<dwk> a(eay $$0, ebm $$1, dfb $$2, dwk $$3) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }), ad.g());
   }

   public abstract void a(aro var1, long var2, eay var4, dfj var5, dfb var6, dwk var7);

   @Nullable
   public Pair<je, jn<elc>> a(arh $$0, jr<elc> $$1, je $$2, int $$3, boolean $$4) {
      dwm $$5 = $$0.l().h();
      Map<elz, Set<jn<elc>>> $$6 = new Object2ObjectArrayMap();

      for (jn<elc> $$7 : $$1) {
         for (elz $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<je, jn<elc>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dfb $$11 = $$0.a();
         List<Entry<elz, Set<jn<elc>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<elz, Set<jn<elc>>> $$13 : $$6.entrySet()) {
            elz $$14 = $$13.getKey();
            if ($$14 instanceof elw) {
               elw $$15 = (elw)$$14;
               Pair<je, jn<elc>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  je $$17 = (je)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof elx) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kg.a($$2.u());
            int $$20 = kg.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<elz, Set<jn<elc>>> $$23 : $$12) {
                  elx $$24 = (elx)$$23.getKey();
                  Pair<je, jn<elc>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((ki)$$25.getFirst());
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
   private Pair<je, jn<elc>> a(Set<jn<elc>> $$0, arh $$1, dfb $$2, je $$3, boolean $$4, elw $$5) {
      List<ddm> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<je, jn<elc>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         je.a $$9 = new je.a();

         for (ddm $$10 : $$6) {
            $$9.d(kg.a($$10.e, 8), 32, kg.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<je, jn<elc>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<je, jn<elc>> a(Set<jn<elc>> $$0, dej $$1, dfb $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, elx $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               ddm $$16 = $$8.a($$7, $$14, $$15);
               Pair<je, jn<elc>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<je, jn<elc>> a(Set<jn<elc>> $$0, dej $$1, dfb $$2, boolean $$3, elz $$4, ddm $$5) {
      for (jn<elc> $$6 : $$0) {
         ele $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != ele.b) {
            if (!$$3 && $$7 == ele.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dwk $$8 = $$1.a($$5.e, $$5.f, dxl.d);
            elk $$9 = $$2.a(kg.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dfb $$0, elk $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dfd $$0, dwk $$1, dfb $$2) {
      ddm $$3 = $$1.f();
      if (!ab.a($$3)) {
         kg $$4 = kg.a($$3, $$0.ap());
         je $$5 = $$4.j();
         ka<elc> $$6 = $$0.F_().d(lv.aS);
         Map<Integer, List<elc>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dfr.b> $$8 = this.c.get();
         ebj $$9 = new ebj(new ebl(eaz.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<jn<dfh>> $$11 = new ObjectArraySet();
         ddm.a($$4.r(), 1).forEach($$2x -> {
            dwk $$3x = $$0.a($$2x.e, $$2x.f);

            for (dwv $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            ka<ekg> $$13 = $$0.F_().d(lv.aR);
            int $$14 = Math.max(eag.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (elc $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jn<dfh> $$23 : $$11) {
                     List<jr<ekg>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jr<ekg> $$25 = $$24.get($$15);
                        dfr.b $$26 = $$8.get($$15);
                        $$25.a().map(jn::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dfr.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     ekg $$32 = $$29.a().get($$31);
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

   private static eku a(dwk $$0) {
      ddm $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dei $$4 = $$0.y();
      int $$5 = $$4.G_() + 1;
      int $$6 = $$4.an();
      return new eku($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aro var1, dfb var2, eay var3, dwk var4);

   public abstract void a(aro var1);

   public int a(dei $$0) {
      return 64;
   }

   public dfl d() {
      return this.b;
   }

   public abstract int e();

   public bqd<dft.c> a(jn<dfh> $$0, dfb $$1, bun $$2, je $$3) {
      Map<elc, LongSet> $$4 = $$1.b($$3);

      for (Entry<elc, LongSet> $$5 : $$4.entrySet()) {
         elc $$6 = $$5.getKey();
         elj $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<elk> $$9 = $$7.a() == elj.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(kb $$0, dwm $$1, dfb $$2, dwk $$3, epf $$4) {
      ddm $$5 = $$3.f();
      kg $$6 = kg.a($$3);
      eay $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         elz $$9 = $$8.a().b();
         List<eli.a> $$10 = $$8.a().a();

         for (eli.a $$11 : $$10) {
            elk $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<eli.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               ebj $$14 = new ebj(new eal(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (eli.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (eli.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  eli.a $$20 = $$13.get($$18);
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

   private boolean a(eli.a $$0, dfb $$1, kb $$2, eay $$3, epf $$4, long $$5, dwk $$6, ddm $$7, kg $$8) {
      elc $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      jr<dfh> $$11 = $$9.a();
      Predicate<jn<dfh>> $$12 = $$11::a;
      elk $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dfb $$0, dwk $$1, kg $$2, elc $$3) {
      elk $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dfd $$0, dfb $$1, dwk $$2) {
      int $$3 = 8;
      ddm $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kg $$9 = kg.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = ddm.c($$10, $$11);

            for (elk $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agn.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends ka<elc>> $$17 = $$0.F_().c(lv.aS);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lu.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dwk> a(ebm var1, eay var2, dfb var3, dwk var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, eak.a var3, dei var4, eay var5);

   public abstract des a(int var1, int var2, dei var3, eay var4);

   public int b(int $$0, int $$1, eak.a $$2, dei $$3, eay $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, eak.a $$2, dei $$3, eay $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, eay var2, je var3);

   @Deprecated
   public dfi a(jn<dfh> $$0) {
      return this.d.apply($$0);
   }
}
