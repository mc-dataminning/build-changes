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

public abstract class dui {
   public static final Codec<dui> a = lq.aa.r().dispatchStable(dui::b, Function.identity());
   protected final ddk b;
   private final Supplier<List<ddq.b>> c;
   private final Function<jj<ddg>, ddh> d;

   public dui(ddk $$0) {
      this($$0, $$0x -> ((ddg)$$0x.a()).d());
   }

   public dui(ddk $$0, Function<jj<ddg>, ddh> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> ddq.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dui> b();

   public duj a(jl<ejd> $$0, dyu $$1, long $$2) {
      return duj.a($$1, $$2, this.b, $$0);
   }

   public Optional<akj<MapCodec<? extends dui>>> c() {
      return lq.aa.d(this.b());
   }

   public CompletableFuture<duh> a(dyu $$0, dzi $$1, dda $$2, duh $$3) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }), ac.g());
   }

   public abstract void a(aqt var1, long var2, dyu var4, ddi var5, dda var6, duh var7, dyc.a var8);

   @Nullable
   public Pair<ja, jj<eix>> a(aqm $$0, jn<eix> $$1, ja $$2, int $$3, boolean $$4) {
      duj $$5 = $$0.l().h();
      Map<eju, Set<jj<eix>>> $$6 = new Object2ObjectArrayMap();

      for (jj<eix> $$7 : $$1) {
         for (eju $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<ja, jj<eix>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dda $$11 = $$0.a();
         List<Entry<eju, Set<jj<eix>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<eju, Set<jj<eix>>> $$13 : $$6.entrySet()) {
            eju $$14 = $$13.getKey();
            if ($$14 instanceof ejr) {
               ejr $$15 = (ejr)$$14;
               Pair<ja, jj<eix>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  ja $$17 = (ja)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof ejs) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kc.a($$2.u());
            int $$20 = kc.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<eju, Set<jj<eix>>> $$23 : $$12) {
                  ejs $$24 = (ejs)$$23.getKey();
                  Pair<ja, jj<eix>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((ke)$$25.getFirst());
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
   private Pair<ja, jj<eix>> a(Set<jj<eix>> $$0, aqm $$1, dda $$2, ja $$3, boolean $$4, ejr $$5) {
      List<dbn> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<ja, jj<eix>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         ja.a $$9 = new ja.a();

         for (dbn $$10 : $$6) {
            $$9.d(kc.a($$10.e, 8), 32, kc.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<ja, jj<eix>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<ja, jj<eix>> a(Set<jj<eix>> $$0, dcj $$1, dda $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, ejs $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dbn $$16 = $$8.a($$7, $$14, $$15);
               Pair<ja, jj<eix>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<ja, jj<eix>> a(Set<jj<eix>> $$0, dcj $$1, dda $$2, boolean $$3, eju $$4, dbn $$5) {
      for (jj<eix> $$6 : $$0) {
         eiz $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eiz.b) {
            if (!$$3 && $$7 == eiz.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            duh $$8 = $$1.a($$5.e, $$5.f, dvi.d);
            ejf $$9 = $$2.a(kc.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dda $$0, ejf $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(ddc $$0, duh $$1, dda $$2) {
      dbn $$3 = $$1.f();
      if (!aa.a($$3)) {
         kc $$4 = kc.a($$3, $$0.ao());
         ja $$5 = $$4.j();
         jw<eix> $$6 = $$0.H_().d(lr.aQ);
         Map<Integer, List<eix>> $$7 = $$6.t().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<ddq.b> $$8 = this.c.get();
         dzf $$9 = new dzf(new dzh(dyv.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<jj<ddg>> $$11 = new ObjectArraySet();
         dbn.a($$4.r(), 1).forEach($$2x -> {
            duh $$3x = $$0.a($$2x.e, $$2x.f);

            for (dus $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jw<eib> $$13 = $$0.H_().d(lr.aP);
            int $$14 = Math.max(dyc.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eix $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jj<ddg> $$23 : $$11) {
                     List<jn<eib>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        jn<eib> $$25 = $$24.get($$15);
                        ddq.b $$26 = $$8.get($$15);
                        $$25.a().map(jj::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  ddq.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eib $$32 = $$29.a().get($$31);
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

   private static eip a(duh $$0) {
      dbn $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dci $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.am() - 1;
      return new eip($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aqt var1, dda var2, dyu var3, duh var4);

   public abstract void a(aqt var1);

   public int a(dci $$0) {
      return 64;
   }

   public ddk d() {
      return this.b;
   }

   public abstract int e();

   public bov<dds.c> a(jj<ddg> $$0, dda $$1, btf $$2, ja $$3) {
      Map<eix, LongSet> $$4 = $$1.b($$3);

      for (Entry<eix, LongSet> $$5 : $$4.entrySet()) {
         eix $$6 = $$5.getKey();
         eje $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<ejf> $$9 = $$7.a() == eje.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jx $$0, duj $$1, dda $$2, duh $$3, emz $$4) {
      dbn $$5 = $$3.f();
      kc $$6 = kc.a($$3);
      dyu $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         eju $$9 = $$8.a().b();
         List<ejd.a> $$10 = $$8.a().a();

         for (ejd.a $$11 : $$10) {
            ejf $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<ejd.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dzf $$14 = new dzf(new dyh(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (ejd.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (ejd.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  ejd.a $$20 = $$13.get($$18);
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

   private boolean a(ejd.a $$0, dda $$1, jx $$2, dyu $$3, emz $$4, long $$5, duh $$6, dbn $$7, kc $$8) {
      eix $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      jn<ddg> $$11 = $$9.a();
      Predicate<jj<ddg>> $$12 = $$11::a;
      ejf $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dda $$0, duh $$1, kc $$2, eix $$3) {
      ejf $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(ddc $$0, dda $$1, duh $$2) {
      int $$3 = 8;
      dbn $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kc $$9 = kc.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dbn.c($$10, $$11);

            for (ejf $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     afy.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends jw<eix>> $$17 = $$0.H_().c(lr.aQ);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lq.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<duh> a(dzi var1, dyu var2, dda var3, duh var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, dyg.a var3, dci var4, dyu var5);

   public abstract dcs a(int var1, int var2, dci var3, dyu var4);

   public int b(int $$0, int $$1, dyg.a $$2, dci $$3, dyu $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dyg.a $$2, dci $$3, dyu $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dyu var2, ja var3);

   @Deprecated
   public ddh a(jj<ddg> $$0) {
      return this.d.apply($$0);
   }
}
