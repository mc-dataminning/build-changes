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

public abstract class dtu {
   public static final Codec<dtu> a = lp.ac.q().dispatchStable(dtu::a, Function.identity());
   protected final dcw b;
   private final Supplier<List<ddc.b>> c;
   private final Function<ji<dcs>, dct> d;

   public dtu(dcw $$0) {
      this($$0, $$0x -> ((dcs)$$0x.a()).d());
   }

   public dtu(dcw $$0, Function<ji<dcs>, dct> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> ddc.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract MapCodec<? extends dtu> a();

   public dtv a(jk<eil> $$0, dyd $$1, long $$2) {
      return dtv.a($$1, $$2, this.b, $$0);
   }

   public Optional<ala<MapCodec<? extends dtu>>> b() {
      return lp.ac.d(this.a());
   }

   public CompletableFuture<dtt> a(Executor $$0, dyd $$1, dyr $$2, dcm $$3, dtt $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.g());
   }

   public abstract void a(ari var1, long var2, dyd var4, dcu var5, dcm var6, dtt var7, dxl.a var8);

   @Nullable
   public Pair<iz, ji<eif>> a(arb $$0, jm<eif> $$1, iz $$2, int $$3, boolean $$4) {
      dtv $$5 = $$0.l().h();
      Map<ejc, Set<ji<eif>>> $$6 = new Object2ObjectArrayMap();

      for (ji<eif> $$7 : $$1) {
         for (ejc $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<iz, ji<eif>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dcm $$11 = $$0.a();
         List<Entry<ejc, Set<ji<eif>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<ejc, Set<ji<eif>>> $$13 : $$6.entrySet()) {
            ejc $$14 = $$13.getKey();
            if ($$14 instanceof eiz) {
               eiz $$15 = (eiz)$$14;
               Pair<iz, ji<eif>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  iz $$17 = (iz)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof eja) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kb.a($$2.u());
            int $$20 = kb.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<ejc, Set<ji<eif>>> $$23 : $$12) {
                  eja $$24 = (eja)$$23.getKey();
                  Pair<iz, ji<eif>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kd)$$25.getFirst());
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
   private Pair<iz, ji<eif>> a(Set<ji<eif>> $$0, arb $$1, dcm $$2, iz $$3, boolean $$4, eiz $$5) {
      List<dba> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<iz, ji<eif>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         iz.a $$9 = new iz.a();

         for (dba $$10 : $$6) {
            $$9.d(kb.a($$10.e, 8), 32, kb.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<iz, ji<eif>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<iz, ji<eif>> a(Set<ji<eif>> $$0, dbw $$1, dcm $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, eja $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dba $$16 = $$8.a($$7, $$14, $$15);
               Pair<iz, ji<eif>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<iz, ji<eif>> a(Set<ji<eif>> $$0, dbw $$1, dcm $$2, boolean $$3, ejc $$4, dba $$5) {
      for (ji<eif> $$6 : $$0) {
         eih $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eih.b) {
            if (!$$3 && $$7 == eih.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dtt $$8 = $$1.a($$5.e, $$5.f, dus.d);
            ein $$9 = $$2.a(kb.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dcm $$0, ein $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dco $$0, dtt $$1, dcm $$2) {
      dba $$3 = $$1.f();
      if (!aa.a($$3)) {
         kb $$4 = kb.a($$3, $$0.ao());
         iz $$5 = $$4.j();
         jv<eif> $$6 = $$0.H_().d(lq.aJ);
         Map<Integer, List<eif>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<ddc.b> $$8 = this.c.get();
         dyo $$9 = new dyo(new dyq(dye.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<ji<dcs>> $$11 = new ObjectArraySet();
         dba.a($$4.r(), 1).forEach($$2x -> {
            dtt $$3x = $$0.a($$2x.e, $$2x.f);

            for (due $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jv<ehj> $$13 = $$0.H_().d(lq.aI);
            int $$14 = Math.max(dxl.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eif $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (ji<dcs> $$23 : $$11) {
                     List<jm<ehj>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        jm<ehj> $$25 = $$24.get($$15);
                        ddc.b $$26 = $$8.get($$15);
                        $$25.a().map(ji::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  ddc.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     ehj $$32 = $$29.a().get($$31);
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

   private static ehx a(dtt $$0) {
      dba $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dbv $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.am() - 1;
      return new ehx($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ari var1, dcm var2, dyd var3, dtt var4);

   public abstract void a(ari var1);

   public int a(dbv $$0) {
      return 64;
   }

   public dcw c() {
      return this.b;
   }

   public abstract int d();

   public bpd<dde.c> a(ji<dcs> $$0, dcm $$1, btn $$2, iz $$3) {
      Map<eif, LongSet> $$4 = $$1.b($$3);

      for (Entry<eif, LongSet> $$5 : $$4.entrySet()) {
         eif $$6 = $$5.getKey();
         eim $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<ein> $$9 = $$7.a() == eim.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jw $$0, dtv $$1, dcm $$2, dtt $$3, emg $$4) {
      dba $$5 = $$3.f();
      kb $$6 = kb.a($$3);
      dyd $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         ejc $$9 = $$8.a().b();
         List<eil.a> $$10 = $$8.a().a();

         for (eil.a $$11 : $$10) {
            ein $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<eil.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dyo $$14 = new dyo(new dxq(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (eil.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (eil.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  eil.a $$20 = $$13.get($$18);
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

   private boolean a(eil.a $$0, dcm $$1, jw $$2, dyd $$3, emg $$4, long $$5, dtt $$6, dba $$7, kb $$8) {
      eif $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      jm<dcs> $$11 = $$9.a();
      Predicate<ji<dcs>> $$12 = $$11::a;
      ein $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dcm $$0, dtt $$1, kb $$2, eif $$3) {
      ein $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dco $$0, dcm $$1, dtt $$2) {
      int $$3 = 8;
      dba $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kb $$9 = kb.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dba.c($$10, $$11);

            for (ein $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agp.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends jv<eif>> $$17 = $$0.H_().c(lq.aJ);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lp.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dtt> a(Executor var1, dyr var2, dyd var3, dcm var4, dtt var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dxp.a var3, dbv var4, dyd var5);

   public abstract dcf a(int var1, int var2, dbv var3, dyd var4);

   public int b(int $$0, int $$1, dxp.a $$2, dbv $$3, dyd $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dxp.a $$2, dbv $$3, dyd $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dyd var2, iz var3);

   @Deprecated
   public dct a(ji<dcs> $$0) {
      return this.d.apply($$0);
   }
}
