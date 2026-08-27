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

public abstract class drf {
   public static final Codec<drf> a = kt.ac.q().dispatchStable(drf::a, Function.identity());
   protected final daj b;
   private final Supplier<List<dap.b>> c;
   private final Function<in<daf>, dag> d;

   public drf(daj $$0) {
      this($$0, $$0x -> ((daf)$$0x.a()).d());
   }

   public drf(daj $$0, Function<in<daf>, dag> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dap.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends drf> a();

   public drg a(ip<efw> $$0, dvo $$1, long $$2) {
      return drg.a($$1, $$2, this.b, $$0);
   }

   public Optional<aju<Codec<? extends drf>>> b() {
      return kt.ac.d(this.a());
   }

   public CompletableFuture<dre> a(Executor $$0, dvo $$1, dwc $$2, czz $$3, dre $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(aqb var1, long var2, dvo var4, dah var5, czz var6, dre var7, duw.a var8);

   @Nullable
   public Pair<id, in<efq>> a(apu $$0, ir<efq> $$1, id $$2, int $$3, boolean $$4) {
      drg $$5 = $$0.l().h();
      Map<egn, Set<in<efq>>> $$6 = new Object2ObjectArrayMap();

      for (in<efq> $$7 : $$1) {
         for (egn $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<id, in<efq>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         czz $$11 = $$0.a();
         List<Entry<egn, Set<in<efq>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<egn, Set<in<efq>>> $$13 : $$6.entrySet()) {
            egn $$14 = $$13.getKey();
            if ($$14 instanceof egk) {
               egk $$15 = (egk)$$14;
               Pair<id, in<efq>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  id $$17 = (id)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof egl) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jg.a($$2.u());
            int $$20 = jg.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<egn, Set<in<efq>>> $$23 : $$12) {
                  egl $$24 = (egl)$$23.getKey();
                  Pair<id, in<efq>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((ji)$$25.getFirst());
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
   private Pair<id, in<efq>> a(Set<in<efq>> $$0, apu $$1, czz $$2, id $$3, boolean $$4, egk $$5) {
      List<cyn> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<id, in<efq>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         id.a $$9 = new id.a();

         for (cyn $$10 : $$6) {
            $$9.d(jg.a($$10.e, 8), 32, jg.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<id, in<efq>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<id, in<efq>> a(Set<in<efq>> $$0, czj $$1, czz $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, egl $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cyn $$16 = $$8.a($$7, $$14, $$15);
               Pair<id, in<efq>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<id, in<efq>> a(Set<in<efq>> $$0, czj $$1, czz $$2, boolean $$3, egn $$4, cyn $$5) {
      for (in<efq> $$6 : $$0) {
         efs $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != efs.b) {
            if (!$$3 && $$7 == efs.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dre $$8 = $$1.a($$5.e, $$5.f, dsd.d);
            efy $$9 = $$2.a(jg.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(czz $$0, efy $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dab $$0, dre $$1, czz $$2) {
      cyn $$3 = $$1.f();
      if (!aa.a($$3)) {
         jg $$4 = jg.a($$3, $$0.an());
         id $$5 = $$4.j();
         ja<efq> $$6 = $$0.H_().d(ku.aG);
         Map<Integer, List<efq>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dap.b> $$8 = this.c.get();
         dvz $$9 = new dvz(new dwb(dvp.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<in<daf>> $$11 = new ObjectArraySet();
         cyn.a($$4.r(), 1).forEach($$2x -> {
            dre $$3x = $$0.a($$2x.e, $$2x.f);

            for (drp $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            ja<eeu> $$13 = $$0.H_().d(ku.aF);
            int $$14 = Math.max(duw.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (efq $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (in<daf> $$23 : $$11) {
                     List<ir<eeu>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        ir<eeu> $$25 = $$24.get($$15);
                        dap.b $$26 = $$8.get($$15);
                        $$25.a().map(in::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dap.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     eeu $$32 = $$29.a().get($$31);
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

   private static efi a(dre $$0) {
      cyn $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      czi $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.al() - 1;
      return new efi($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aqb var1, czz var2, dvo var3, dre var4);

   public abstract void a(aqb var1);

   public int a(czi $$0) {
      return 64;
   }

   public daj c() {
      return this.b;
   }

   public abstract int d();

   public bmt<dar.c> a(in<daf> $$0, czz $$1, bqw $$2, id $$3) {
      Map<efq, LongSet> $$4 = $$1.b($$3);

      for (Entry<efq, LongSet> $$5 : $$4.entrySet()) {
         efq $$6 = $$5.getKey();
         efx $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<efy> $$9 = $$7.a() == efx.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jb $$0, drg $$1, czz $$2, dre $$3, ejr $$4) {
      cyn $$5 = $$3.f();
      jg $$6 = jg.a($$3);
      dvo $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         egn $$9 = $$8.a().b();
         List<efw.a> $$10 = $$8.a().a();

         for (efw.a $$11 : $$10) {
            efy $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<efw.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dvz $$14 = new dvz(new dvb(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (efw.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (efw.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  efw.a $$20 = $$13.get($$18);
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

   private boolean a(efw.a $$0, czz $$1, jb $$2, dvo $$3, ejr $$4, long $$5, dre $$6, cyn $$7, jg $$8) {
      efq $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ir<daf> $$11 = $$9.a();
      Predicate<in<daf>> $$12 = $$11::a;
      efy $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(czz $$0, dre $$1, jg $$2, efq $$3) {
      efy $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dab $$0, czz $$1, dre $$2) {
      int $$3 = 8;
      cyn $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jg $$9 = jg.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = cyn.c($$10, $$11);

            for (efy $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     afk.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends ja<efq>> $$17 = $$0.H_().c(ku.aG);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> kt.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dre> a(Executor var1, dwc var2, dvo var3, czz var4, dre var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dva.a var3, czi var4, dvo var5);

   public abstract czs a(int var1, int var2, czi var3, dvo var4);

   public int b(int $$0, int $$1, dva.a $$2, czi $$3, dvo $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dva.a $$2, czi $$3, dvo $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dvo var2, id var3);

   @Deprecated
   public dag a(in<daf> $$0) {
      return this.d.apply($$0);
   }
}
