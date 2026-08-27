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

public abstract class dqw {
   public static final Codec<dqw> a = kr.ac.q().dispatchStable(dqw::a, Function.identity());
   protected final daa b;
   private final Supplier<List<dag.b>> c;
   private final Function<il<czw>, czx> d;

   public dqw(daa $$0) {
      this($$0, $$0x -> ((czw)$$0x.a()).d());
   }

   public dqw(daa $$0, Function<il<czw>, czx> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dag.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dqw> a();

   public dqx a(in<efn> $$0, dvf $$1, long $$2) {
      return dqx.a($$1, $$2, this.b, $$0);
   }

   public Optional<ajs<Codec<? extends dqw>>> b() {
      return kr.ac.d(this.a());
   }

   public CompletableFuture<dqv> a(Executor $$0, dvf $$1, dvt $$2, czq $$3, dqv $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(apz var1, long var2, dvf var4, czy var5, czq var6, dqv var7, dun.a var8);

   @Nullable
   public Pair<ib, il<efh>> a(aps $$0, ip<efh> $$1, ib $$2, int $$3, boolean $$4) {
      dqx $$5 = $$0.l().h();
      Map<ege, Set<il<efh>>> $$6 = new Object2ObjectArrayMap();

      for (il<efh> $$7 : $$1) {
         for (ege $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<ib, il<efh>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         czq $$11 = $$0.a();
         List<Entry<ege, Set<il<efh>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<ege, Set<il<efh>>> $$13 : $$6.entrySet()) {
            ege $$14 = $$13.getKey();
            if ($$14 instanceof egb) {
               egb $$15 = (egb)$$14;
               Pair<ib, il<efh>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  ib $$17 = (ib)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof egc) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = je.a($$2.u());
            int $$20 = je.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<ege, Set<il<efh>>> $$23 : $$12) {
                  egc $$24 = (egc)$$23.getKey();
                  Pair<ib, il<efh>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((jg)$$25.getFirst());
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
   private Pair<ib, il<efh>> a(Set<il<efh>> $$0, aps $$1, czq $$2, ib $$3, boolean $$4, egb $$5) {
      List<cye> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<ib, il<efh>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         ib.a $$9 = new ib.a();

         for (cye $$10 : $$6) {
            $$9.d(je.a($$10.e, 8), 32, je.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<ib, il<efh>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<ib, il<efh>> a(Set<il<efh>> $$0, cza $$1, czq $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, egc $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cye $$16 = $$8.a($$7, $$14, $$15);
               Pair<ib, il<efh>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<ib, il<efh>> a(Set<il<efh>> $$0, cza $$1, czq $$2, boolean $$3, ege $$4, cye $$5) {
      for (il<efh> $$6 : $$0) {
         efj $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != efj.b) {
            if (!$$3 && $$7 == efj.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dqv $$8 = $$1.a($$5.e, $$5.f, dru.d);
            efp $$9 = $$2.a(je.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(czq $$0, efp $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(czs $$0, dqv $$1, czq $$2) {
      cye $$3 = $$1.f();
      if (!aa.a($$3)) {
         je $$4 = je.a($$3, $$0.an());
         ib $$5 = $$4.j();
         iy<efh> $$6 = $$0.H_().d(ks.aF);
         Map<Integer, List<efh>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dag.b> $$8 = this.c.get();
         dvq $$9 = new dvq(new dvs(dvg.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<il<czw>> $$11 = new ObjectArraySet();
         cye.a($$4.r(), 1).forEach($$2x -> {
            dqv $$3x = $$0.a($$2x.e, $$2x.f);

            for (drg $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            iy<eel> $$13 = $$0.H_().d(ks.aE);
            int $$14 = Math.max(dun.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (efh $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (il<czw> $$23 : $$11) {
                     List<ip<eel>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        ip<eel> $$25 = $$24.get($$15);
                        dag.b $$26 = $$8.get($$15);
                        $$25.a().map(il::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dag.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eel $$32 = $$29.a().get($$31);
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

   private static eez a(dqv $$0) {
      cye $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      cyz $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.al() - 1;
      return new eez($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(apz var1, czq var2, dvf var3, dqv var4);

   public abstract void a(apz var1);

   public int a(cyz $$0) {
      return 64;
   }

   public daa c() {
      return this.b;
   }

   public abstract int d();

   public bmo<dai.c> a(il<czw> $$0, czq $$1, bqr $$2, ib $$3) {
      Map<efh, LongSet> $$4 = $$1.b($$3);

      for (Entry<efh, LongSet> $$5 : $$4.entrySet()) {
         efh $$6 = $$5.getKey();
         efo $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<efp> $$9 = $$7.a() == efo.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(iz $$0, dqx $$1, czq $$2, dqv $$3, eji $$4) {
      cye $$5 = $$3.f();
      je $$6 = je.a($$3);
      dvf $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         ege $$9 = $$8.a().b();
         List<efn.a> $$10 = $$8.a().a();

         for (efn.a $$11 : $$10) {
            efp $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<efn.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dvq $$14 = new dvq(new dus(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (efn.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (efn.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  efn.a $$20 = $$13.get($$18);
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

   private boolean a(efn.a $$0, czq $$1, iz $$2, dvf $$3, eji $$4, long $$5, dqv $$6, cye $$7, je $$8) {
      efh $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ip<czw> $$11 = $$9.a();
      Predicate<il<czw>> $$12 = $$11::a;
      efp $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(czq $$0, dqv $$1, je $$2, efh $$3) {
      efp $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(czs $$0, czq $$1, dqv $$2) {
      int $$3 = 8;
      cye $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      je $$9 = je.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = cye.c($$10, $$11);

            for (efp $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     afi.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends iy<efh>> $$17 = $$0.H_().c(ks.aF);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> kr.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dqv> a(Executor var1, dvt var2, dvf var3, czq var4, dqv var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dur.a var3, cyz var4, dvf var5);

   public abstract czj a(int var1, int var2, cyz var3, dvf var4);

   public int b(int $$0, int $$1, dur.a $$2, cyz $$3, dvf $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dur.a $$2, cyz $$3, dvf $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dvf var2, ib var3);

   @Deprecated
   public czx a(il<czw> $$0) {
      return this.d.apply($$0);
   }
}
