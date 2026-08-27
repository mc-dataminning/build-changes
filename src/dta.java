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
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class dta {
   public static final Codec<dta> a = le.ac.q().dispatchStable(dta::a, Function.identity());
   protected final dcc b;
   private final Supplier<List<dci.b>> c;
   private final Function<ix<dby>, dbz> d;

   public dta(dcc $$0) {
      this($$0, $$0x -> ((dby)$$0x.a()).d());
   }

   public dta(dcc $$0, Function<ix<dby>, dbz> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dci.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract MapCodec<? extends dta> a();

   public dtb a(iz<ehr> $$0, dxj $$1, long $$2) {
      return dtb.a($$1, $$2, this.b, $$0);
   }

   public Optional<akm<MapCodec<? extends dta>>> b() {
      return le.ac.d(this.a());
   }

   public CompletableFuture<dsz> a(Executor $$0, dxj $$1, dxx $$2, dbs $$3, dsz $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.g());
   }

   public abstract void a(aqu var1, long var2, dxj var4, dca var5, dbs var6, dsz var7, dwr.a var8);

   @Nullable
   public Pair<io, ix<ehl>> a(aqn $$0, jb<ehl> $$1, io $$2, int $$3, boolean $$4) {
      dtb $$5 = $$0.l().h();
      Map<eii, Set<ix<ehl>>> $$6 = new Object2ObjectArrayMap();

      for (ix<ehl> $$7 : $$1) {
         for (eii $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<io, ix<ehl>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dbs $$11 = $$0.a();
         List<Entry<eii, Set<ix<ehl>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<eii, Set<ix<ehl>>> $$13 : $$6.entrySet()) {
            eii $$14 = $$13.getKey();
            if ($$14 instanceof eif) {
               eif $$15 = (eif)$$14;
               Pair<io, ix<ehl>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  io $$17 = (io)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eig) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jq.a($$2.u());
            int $$20 = jq.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<eii, Set<ix<ehl>>> $$23 : $$12) {
                  eig $$24 = (eig)$$23.getKey();
                  Pair<io, ix<ehl>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((js)$$25.getFirst());
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
   private Pair<io, ix<ehl>> a(Set<ix<ehl>> $$0, aqn $$1, dbs $$2, io $$3, boolean $$4, eif $$5) {
      List<dag> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<io, ix<ehl>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         io.a $$9 = new io.a();

         for (dag $$10 : $$6) {
            $$9.d(jq.a($$10.e, 8), 32, jq.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<io, ix<ehl>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<io, ix<ehl>> a(Set<ix<ehl>> $$0, dbc $$1, dbs $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eig $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dag $$16 = $$8.a($$7, $$14, $$15);
               Pair<io, ix<ehl>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<io, ix<ehl>> a(Set<ix<ehl>> $$0, dbc $$1, dbs $$2, boolean $$3, eii $$4, dag $$5) {
      for (ix<ehl> $$6 : $$0) {
         ehn $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != ehn.b) {
            if (!$$3 && $$7 == ehn.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dsz $$8 = $$1.a($$5.e, $$5.f, dty.d);
            eht $$9 = $$2.a(jq.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dbs $$0, eht $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dbu $$0, dsz $$1, dbs $$2) {
      dag $$3 = $$1.f();
      if (!aa.a($$3)) {
         jq $$4 = jq.a($$3, $$0.an());
         io $$5 = $$4.j();
         jk<ehl> $$6 = $$0.H_().d(lf.aJ);
         Map<Integer, List<ehl>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dci.b> $$8 = this.c.get();
         dxu $$9 = new dxu(new dxw(dxk.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<ix<dby>> $$11 = new ObjectArraySet();
         dag.a($$4.r(), 1).forEach($$2x -> {
            dsz $$3x = $$0.a($$2x.e, $$2x.f);

            for (dtk $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jk<egp> $$13 = $$0.H_().d(lf.aI);
            int $$14 = Math.max(dwr.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (ehl $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (ix<dby> $$23 : $$11) {
                     List<jb<egp>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        jb<egp> $$25 = $$24.get($$15);
                        dci.b $$26 = $$8.get($$15);
                        $$25.a().map(ix::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dci.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     egp $$32 = $$29.a().get($$31);
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

   private static ehd a(dsz $$0) {
      dag $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dbb $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.al() - 1;
      return new ehd($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aqu var1, dbs var2, dxj var3, dsz var4);

   public abstract void a(aqu var1);

   public int a(dbb $$0) {
      return 64;
   }

   public dcc c() {
      return this.b;
   }

   public abstract int d();

   public bok<dck.c> a(ix<dby> $$0, dbs $$1, bst $$2, io $$3) {
      Map<ehl, LongSet> $$4 = $$1.b($$3);

      for (Entry<ehl, LongSet> $$5 : $$4.entrySet()) {
         ehl $$6 = $$5.getKey();
         ehs $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<eht> $$9 = $$7.a() == ehs.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jl $$0, dtb $$1, dbs $$2, dsz $$3, elm $$4) {
      dag $$5 = $$3.f();
      jq $$6 = jq.a($$3);
      dxj $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         eii $$9 = $$8.a().b();
         List<ehr.a> $$10 = $$8.a().a();

         for (ehr.a $$11 : $$10) {
            eht $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<ehr.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dxu $$14 = new dxu(new dww(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (ehr.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (ehr.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  ehr.a $$20 = $$13.get($$18);
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

   private boolean a(ehr.a $$0, dbs $$1, jl $$2, dxj $$3, elm $$4, long $$5, dsz $$6, dag $$7, jq $$8) {
      ehl $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      jb<dby> $$11 = $$9.a();
      Predicate<ix<dby>> $$12 = $$11::a;
      eht $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dbs $$0, dsz $$1, jq $$2, ehl $$3) {
      eht $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dbu $$0, dbs $$1, dsz $$2) {
      int $$3 = 8;
      dag $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jq $$9 = jq.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dag.c($$10, $$11);

            for (eht $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agb.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends jk<ehl>> $$17 = $$0.H_().c(lf.aJ);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> le.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dsz> a(Executor var1, dxx var2, dxj var3, dbs var4, dsz var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dwv.a var3, dbb var4, dxj var5);

   public abstract dbl a(int var1, int var2, dbb var3, dxj var4);

   public int b(int $$0, int $$1, dwv.a $$2, dbb $$3, dxj $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dwv.a $$2, dbb $$3, dxj $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dxj var2, io var3);

   @Deprecated
   public dbz a(ix<dby> $$0) {
      return this.d.apply($$0);
   }
}
