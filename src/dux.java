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

public abstract class dux {
   public static final Codec<dux> a = lt.aa.r().dispatchStable(dux::b, Function.identity());
   protected final ddy b;
   private final Supplier<List<dee.b>> c;
   private final Function<jm<ddu>, ddv> d;

   public dux(ddy $$0) {
      this($$0, $$0x -> ((ddu)$$0x.a()).d());
   }

   public dux(ddy $$0, Function<jm<ddu>, ddv> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dee.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dux> b();

   public duy a(jo<ejs> $$0, dzj $$1, long $$2) {
      return duy.a($$1, $$2, this.b, $$0);
   }

   public Optional<akp<MapCodec<? extends dux>>> c() {
      return lt.aa.d(this.b());
   }

   public CompletableFuture<duw> a(dzj $$0, dzx $$1, ddo $$2, duw $$3) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }), ad.g());
   }

   public abstract void a(ara var1, long var2, dzj var4, ddw var5, ddo var6, duw var7, dyr.a var8);

   @Nullable
   public Pair<jd, jm<ejm>> a(aqt $$0, jq<ejm> $$1, jd $$2, int $$3, boolean $$4) {
      duy $$5 = $$0.l().h();
      Map<ekj, Set<jm<ejm>>> $$6 = new Object2ObjectArrayMap();

      for (jm<ejm> $$7 : $$1) {
         for (ekj $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jd, jm<ejm>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         ddo $$11 = $$0.a();
         List<Entry<ekj, Set<jm<ejm>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<ekj, Set<jm<ejm>>> $$13 : $$6.entrySet()) {
            ekj $$14 = $$13.getKey();
            if ($$14 instanceof ekg) {
               ekg $$15 = (ekg)$$14;
               Pair<jd, jm<ejm>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jd $$17 = (jd)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof ekh) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kf.a($$2.u());
            int $$20 = kf.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<ekj, Set<jm<ejm>>> $$23 : $$12) {
                  ekh $$24 = (ekh)$$23.getKey();
                  Pair<jd, jm<ejm>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kh)$$25.getFirst());
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
   private Pair<jd, jm<ejm>> a(Set<jm<ejm>> $$0, aqt $$1, ddo $$2, jd $$3, boolean $$4, ekg $$5) {
      List<dcb> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jd, jm<ejm>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jd.a $$9 = new jd.a();

         for (dcb $$10 : $$6) {
            $$9.d(kf.a($$10.e, 8), 32, kf.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jd, jm<ejm>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jd, jm<ejm>> a(Set<jm<ejm>> $$0, dcx $$1, ddo $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, ekh $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dcb $$16 = $$8.a($$7, $$14, $$15);
               Pair<jd, jm<ejm>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jd, jm<ejm>> a(Set<jm<ejm>> $$0, dcx $$1, ddo $$2, boolean $$3, ekj $$4, dcb $$5) {
      for (jm<ejm> $$6 : $$0) {
         ejo $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != ejo.b) {
            if (!$$3 && $$7 == ejo.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            duw $$8 = $$1.a($$5.e, $$5.f, dvx.d);
            eju $$9 = $$2.a(kf.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(ddo $$0, eju $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(ddq $$0, duw $$1, ddo $$2) {
      dcb $$3 = $$1.f();
      if (!ab.a($$3)) {
         kf $$4 = kf.a($$3, $$0.ao());
         jd $$5 = $$4.j();
         jz<ejm> $$6 = $$0.H_().d(lu.aR);
         Map<Integer, List<ejm>> $$7 = $$6.t().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dee.b> $$8 = this.c.get();
         dzu $$9 = new dzu(new dzw(dzk.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<jm<ddu>> $$11 = new ObjectArraySet();
         dcb.a($$4.r(), 1).forEach($$2x -> {
            duw $$3x = $$0.a($$2x.e, $$2x.f);

            for (dvh $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jz<eiq> $$13 = $$0.H_().d(lu.aQ);
            int $$14 = Math.max(dyr.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (ejm $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jm<ddu> $$23 : $$11) {
                     List<jq<eiq>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        jq<eiq> $$25 = $$24.get($$15);
                        dee.b $$26 = $$8.get($$15);
                        $$25.a().map(jm::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dee.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eiq $$32 = $$29.a().get($$31);
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

   private static eje a(duw $$0) {
      dcb $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dcw $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.am() - 1;
      return new eje($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ara var1, ddo var2, dzj var3, duw var4);

   public abstract void a(ara var1);

   public int a(dcw $$0) {
      return 64;
   }

   public ddy d() {
      return this.b;
   }

   public abstract int e();

   public bpe<deg.c> a(jm<ddu> $$0, ddo $$1, bto $$2, jd $$3) {
      Map<ejm, LongSet> $$4 = $$1.b($$3);

      for (Entry<ejm, LongSet> $$5 : $$4.entrySet()) {
         ejm $$6 = $$5.getKey();
         ejt $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<eju> $$9 = $$7.a() == ejt.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(ka $$0, duy $$1, ddo $$2, duw $$3, eno $$4) {
      dcb $$5 = $$3.f();
      kf $$6 = kf.a($$3);
      dzj $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         ekj $$9 = $$8.a().b();
         List<ejs.a> $$10 = $$8.a().a();

         for (ejs.a $$11 : $$10) {
            eju $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<ejs.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dzu $$14 = new dzu(new dyw(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (ejs.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (ejs.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  ejs.a $$20 = $$13.get($$18);
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

   private boolean a(ejs.a $$0, ddo $$1, ka $$2, dzj $$3, eno $$4, long $$5, duw $$6, dcb $$7, kf $$8) {
      ejm $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      jq<ddu> $$11 = $$9.a();
      Predicate<jm<ddu>> $$12 = $$11::a;
      eju $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(ddo $$0, duw $$1, kf $$2, ejm $$3) {
      eju $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(ddq $$0, ddo $$1, duw $$2) {
      int $$3 = 8;
      dcb $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kf $$9 = kf.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dcb.c($$10, $$11);

            for (eju $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     age.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends jz<ejm>> $$17 = $$0.H_().c(lu.aR);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lt.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<duw> a(dzx var1, dzj var2, ddo var3, duw var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, dyv.a var3, dcw var4, dzj var5);

   public abstract ddg a(int var1, int var2, dcw var3, dzj var4);

   public int b(int $$0, int $$1, dyv.a $$2, dcw $$3, dzj $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dyv.a $$2, dcw $$3, dzj $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dzj var2, jd var3);

   @Deprecated
   public ddv a(jm<ddu> $$0) {
      return this.d.apply($$0);
   }
}
