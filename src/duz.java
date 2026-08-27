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

public abstract class duz {
   public static final Codec<duz> a = lh.ac.q().dispatchStable(duz::a, Function.identity());
   protected final ddd b;
   private final Supplier<List<ddj.b>> c;
   private final Function<ja<dcz>, dda> d;

   public duz(ddd $$0) {
      this($$0, $$0x -> ((dcz)$$0x.a()).d());
   }

   public duz(ddd $$0, Function<ja<dcz>, dda> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> ddj.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends duz> a();

   public dva a(jc<ejz> $$0, dzi $$1, long $$2) {
      return dva.a($$1, $$2, this.b, $$0);
   }

   public Optional<aks<Codec<? extends duz>>> b() {
      return lh.ac.d(this.a());
   }

   public CompletableFuture<duy> a(Executor $$0, dzi $$1, dzw $$2, dct $$3, duy $$4) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ad.f());
   }

   public abstract void a(ara var1, long var2, dzi var4, ddb var5, dct var6, duy var7, dyq.a var8);

   @Nullable
   public Pair<ir, ja<ejt>> a(aqt $$0, je<ejt> $$1, ir $$2, int $$3, boolean $$4) {
      dva $$5 = $$0.l().h();
      Map<ekq, Set<ja<ejt>>> $$6 = new Object2ObjectArrayMap();

      for (ja<ejt> $$7 : $$1) {
         for (ekq $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<ir, ja<ejt>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dct $$11 = $$0.a();
         List<Entry<ekq, Set<ja<ejt>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<ekq, Set<ja<ejt>>> $$13 : $$6.entrySet()) {
            ekq $$14 = $$13.getKey();
            if ($$14 instanceof ekn) {
               ekn $$15 = (ekn)$$14;
               Pair<ir, ja<ejt>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  ir $$17 = (ir)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eko) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jt.a($$2.u());
            int $$20 = jt.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<ekq, Set<ja<ejt>>> $$23 : $$12) {
                  eko $$24 = (eko)$$23.getKey();
                  Pair<ir, ja<ejt>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((jv)$$25.getFirst());
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
   private Pair<ir, ja<ejt>> a(Set<ja<ejt>> $$0, aqt $$1, dct $$2, ir $$3, boolean $$4, ekn $$5) {
      List<dbh> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<ir, ja<ejt>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         ir.a $$9 = new ir.a();

         for (dbh $$10 : $$6) {
            $$9.d(jt.a($$10.e, 8), 32, jt.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<ir, ja<ejt>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<ir, ja<ejt>> a(Set<ja<ejt>> $$0, dcd $$1, dct $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eko $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dbh $$16 = $$8.a($$7, $$14, $$15);
               Pair<ir, ja<ejt>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<ir, ja<ejt>> a(Set<ja<ejt>> $$0, dcd $$1, dct $$2, boolean $$3, ekq $$4, dbh $$5) {
      for (ja<ejt> $$6 : $$0) {
         ejv $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != ejv.b) {
            if (!$$3 && $$7 == ejv.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            duy $$8 = $$1.a($$5.e, $$5.f, dvx.d);
            ekb $$9 = $$2.a(jt.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dct $$0, ekb $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dcv $$0, duy $$1, dct $$2) {
      dbh $$3 = $$1.g();
      if (!ab.a($$3)) {
         jt $$4 = jt.a($$3, $$0.ao());
         ir $$5 = $$4.j();
         jn<ejt> $$6 = $$0.I_().d(li.aJ);
         Map<Integer, List<ejt>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.d().ordinal()));
         List<ddj.b> $$8 = this.c.get();
         dzt $$9 = new dzt(new dzv(dzj.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<ja<dcz>> $$11 = new ObjectArraySet();
         dbh.a($$4.r(), 1).forEach($$2x -> {
            duy $$3x = $$0.a_($$2x.e, $$2x.f);

            for (dvj $$4x : $$3x.e()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jn<eix> $$13 = $$0.I_().d(li.aI);
            int $$14 = Math.max(dyq.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (ejt $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (ja<dcz> $$23 : $$11) {
                     List<je<eix>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        je<eix> $$25 = $$24.get($$15);
                        ddj.b $$26 = $$8.get($$15);
                        $$25.a().map(ja::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  ddj.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eix $$32 = $$29.a().get($$31);
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

   private static ejl a(duy $$0) {
      dbh $$1 = $$0.g();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dcc $$4 = $$0.A();
      int $$5 = $$4.J_() + 1;
      int $$6 = $$4.am() - 1;
      return new ejl($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ara var1, dct var2, dzi var3, duy var4);

   public abstract void a(ara var1);

   public int a(dcc $$0) {
      return 64;
   }

   public ddd c() {
      return this.b;
   }

   public abstract int d();

   public boo<ddl.c> a(ja<dcz> $$0, dct $$1, bsr $$2, ir $$3) {
      Map<ejt, LongSet> $$4 = $$1.b($$3);

      for (Entry<ejt, LongSet> $$5 : $$4.entrySet()) {
         ejt $$6 = $$5.getKey();
         eka $$7 = $$6.c().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<ekb> $$9 = $$7.a() == eka.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jo $$0, dva $$1, dct $$2, duy $$3, enu $$4) {
      dbh $$5 = $$3.g();
      jt $$6 = jt.a($$3);
      dzi $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         ekq $$9 = $$8.a().b();
         List<ejz.a> $$10 = $$8.a().a();

         for (ejz.a $$11 : $$10) {
            ekb $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<ejz.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dzt $$14 = new dzt(new dyv(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (ejz.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (ejz.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  ejz.a $$20 = $$13.get($$18);
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

   private boolean a(ejz.a $$0, dct $$1, jo $$2, dzi $$3, enu $$4, long $$5, duy $$6, dbh $$7, jt $$8) {
      ejt $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      je<dcz> $$11 = $$9.a();
      Predicate<ja<dcz>> $$12 = $$11::a;
      ekb $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12, $$9.b());
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dct $$0, duy $$1, jt $$2, ejt $$3) {
      ekb $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dcv $$0, dct $$1, duy $$2) {
      int $$3 = 8;
      dbh $$4 = $$2.g();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jt $$9 = jt.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dbh.c($$10, $$11);

            for (ekb $$13 : $$0.a_($$10, $$11).h().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agi.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends jn<ejt>> $$17 = $$0.I_().c(li.aJ);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lh.T.b($$13.h().f()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<duy> a(Executor var1, dzw var2, dzi var3, dct var4, duy var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dyu.a var3, dcc var4, dzi var5);

   public abstract dcm a(int var1, int var2, dcc var3, dzi var4);

   public int b(int $$0, int $$1, dyu.a $$2, dcc $$3, dzi $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dyu.a $$2, dcc $$3, dzi $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dzi var2, ir var3);

   @Deprecated
   public dda a(ja<dcz> $$0) {
      return this.d.apply($$0);
   }
}
