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

public abstract class dzn {
   public static final Codec<dzn> a = mb.aa.q().dispatchStable(dzn::b, Function.identity());
   protected final dig b;
   private final Supplier<List<dim.b>> c;
   private final Function<jr<dic>, did> d;

   public dzn(dig $$0) {
      this($$0, $$0x -> ((dic)$$0x.a()).d());
   }

   public dzn(dig $$0, Function<jr<dic>, did> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dim.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dzn> b();

   public dzo a(jt<eop> $$0, eec $$1, long $$2) {
      return dzo.a($$1, $$2, this.b, $$0);
   }

   public Optional<akt<MapCodec<? extends dzn>>> c() {
      return mb.aa.d(this.b());
   }

   public CompletableFuture<dzm> a(eec $$0, eeq $$1, dhv $$2, dzm $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, af.h().a("init_biomes"));
   }

   public abstract void a(arl var1, long var2, eec var4, die var5, dhv var6, dzm var7);

   @Nullable
   public Pair<ji, jr<eoj>> a(ard $$0, jv<eoj> $$1, ji $$2, int $$3, boolean $$4) {
      dzo $$5 = $$0.m().h();
      Map<epg, Set<jr<eoj>>> $$6 = new Object2ObjectArrayMap();

      for (jr<eoj> $$7 : $$1) {
         for (epg $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<ji, jr<eoj>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dhv $$11 = $$0.b();
         List<Entry<epg, Set<jr<eoj>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<epg, Set<jr<eoj>>> $$13 : $$6.entrySet()) {
            epg $$14 = $$13.getKey();
            if ($$14 instanceof epd) {
               epd $$15 = (epd)$$14;
               Pair<ji, jr<eoj>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  ji $$17 = (ji)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof epe) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kk.a($$2.u());
            int $$20 = kk.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<epg, Set<jr<eoj>>> $$23 : $$12) {
                  epe $$24 = (epe)$$23.getKey();
                  Pair<ji, jr<eoj>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((km)$$25.getFirst());
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
   private Pair<ji, jr<eoj>> a(Set<jr<eoj>> $$0, ard $$1, dhv $$2, ji $$3, boolean $$4, epd $$5) {
      List<dgg> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<ji, jr<eoj>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         ji.a $$9 = new ji.a();

         for (dgg $$10 : $$6) {
            $$9.d(kk.a($$10.h, 8), 32, kk.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<ji, jr<eoj>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<ji, jr<eoj>> a(Set<jr<eoj>> $$0, dhc $$1, dhv $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, epe $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dgg $$16 = $$8.a($$7, $$14, $$15);
               Pair<ji, jr<eoj>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<ji, jr<eoj>> a(Set<jr<eoj>> $$0, dhc $$1, dhv $$2, boolean $$3, epg $$4, dgg $$5) {
      for (jr<eoj> $$6 : $$0) {
         eol $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eol.b) {
            if (!$$3 && $$7 == eol.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dzm $$8 = $$1.a($$5.h, $$5.i, ean.d);
            eor $$9 = $$2.a(kk.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dhv $$0, eor $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dhy $$0, dzm $$1, dhv $$2) {
      dgg $$3 = $$1.f();
      if (!ab.a($$3)) {
         kk $$4 = kk.a($$3, $$0.aq());
         ji $$5 = $$4.j();
         ke<eoj> $$6 = $$0.F_().e(mc.aW);
         Map<Integer, List<eoj>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dim.b> $$8 = this.c.get();
         een $$9 = new een(new eep(eed.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<jr<dic>> $$11 = new ObjectArraySet();
         dgg.a($$4.r(), 1).forEach($$2x -> {
            dzm $$3x = $$0.a($$2x.h, $$2x.i);

            for (dzx $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            ke<enn> $$13 = $$0.F_().e(mc.aV);
            int $$14 = Math.max(edk.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eoj $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jr<dic> $$23 : $$11) {
                     List<jv<enn>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jv<enn> $$25 = $$24.get($$15);
                        dim.b $$26 = $$8.get($$15);
                        $$25.a().map(jr::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dim.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     enn $$32 = $$29.a().get($$31);
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

   private static eob a(dzm $$0) {
      dgg $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dhb $$4 = $$0.B();
      int $$5 = $$4.G_() + 1;
      int $$6 = $$4.ao();
      return new eob($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(arl var1, dhv var2, eec var3, dzm var4);

   public abstract void a(arl var1);

   public int a(dhb $$0) {
      return 64;
   }

   public dig d() {
      return this.b;
   }

   public abstract int e();

   public brj<dio.c> a(jr<dic> $$0, dhv $$1, bwb $$2, ji $$3) {
      Map<eoj, LongSet> $$4 = $$1.b($$3);

      for (Entry<eoj, LongSet> $$5 : $$4.entrySet()) {
         eoj $$6 = $$5.getKey();
         eoq $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<eor> $$9 = $$7.a() == eoq.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(kf $$0, dzo $$1, dhv $$2, dzm $$3, esm $$4, akt<dgz> $$5) {
      dgg $$6 = $$3.f();
      kk $$7 = kk.a($$3);
      eec $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         epg $$10 = $$9.a().b();
         List<eop.a> $$11 = $$9.a().a();

         for (eop.a $$12 : $$11) {
            eor $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<eop.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               een $$15 = new een(new edp(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (eop.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (eop.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  eop.a $$21 = $$14.get($$19);
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

   private boolean a(eop.a $$0, dhv $$1, kf $$2, eec $$3, esm $$4, long $$5, dzm $$6, dgg $$7, kk $$8, akt<dgz> $$9) {
      eoj $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      jv<dic> $$12 = $$10.a();
      Predicate<jr<dic>> $$13 = $$12::a;
      eor $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dhv $$0, dzm $$1, kk $$2, eoj $$3) {
      eor $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dhy $$0, dhv $$1, dzm $$2) {
      int $$3 = 8;
      dgg $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kk $$9 = kk.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dgg.c($$10, $$11);

            for (eor $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agc.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends ke<eoj>> $$17 = $$0.F_().a(mc.aW);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> mb.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dzm> a(eeq var1, eec var2, dhv var3, dzm var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, edo.a var3, dhb var4, eec var5);

   public abstract dhl a(int var1, int var2, dhb var3, eec var4);

   public int b(int $$0, int $$1, edo.a $$2, dhb $$3, eec $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, edo.a $$2, dhb $$3, eec $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, eec var2, ji var3);

   @Deprecated
   public did a(jr<dic> $$0) {
      return this.d.apply($$0);
   }
}
