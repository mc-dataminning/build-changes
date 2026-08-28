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

public abstract class dxk {
   public static final Codec<dxk> a = lz.aa.q().dispatchStable(dxk::b, Function.identity());
   protected final dgl b;
   private final Supplier<List<dgr.b>> c;
   private final Function<jq<dgh>, dgi> d;

   public dxk(dgl $$0) {
      this($$0, $$0x -> ((dgh)$$0x.a()).d());
   }

   public dxk(dgl $$0, Function<jq<dgh>, dgi> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dgr.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dxk> b();

   public dxl a(js<emh> $$0, ebx $$1, long $$2) {
      return dxl.a($$1, $$2, this.b, $$0);
   }

   public Optional<alk<MapCodec<? extends dxk>>> c() {
      return lz.aa.d(this.b());
   }

   public CompletableFuture<dxj> a(ebx $$0, ecl $$1, dgb $$2, dxj $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ae.g().a("init_biomes"));
   }

   public abstract void a(ary var1, long var2, ebx var4, dgj var5, dgb var6, dxj var7);

   @Nullable
   public Pair<jh, jq<emb>> a(arq $$0, ju<emb> $$1, jh $$2, int $$3, boolean $$4) {
      dxl $$5 = $$0.l().h();
      Map<emy, Set<jq<emb>>> $$6 = new Object2ObjectArrayMap();

      for (jq<emb> $$7 : $$1) {
         for (emy $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jh, jq<emb>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dgb $$11 = $$0.a();
         List<Entry<emy, Set<jq<emb>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<emy, Set<jq<emb>>> $$13 : $$6.entrySet()) {
            emy $$14 = $$13.getKey();
            if ($$14 instanceof emv) {
               emv $$15 = (emv)$$14;
               Pair<jh, jq<emb>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jh $$17 = (jh)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof emw) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kj.a($$2.u());
            int $$20 = kj.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<emy, Set<jq<emb>>> $$23 : $$12) {
                  emw $$24 = (emw)$$23.getKey();
                  Pair<jh, jq<emb>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kl)$$25.getFirst());
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
   private Pair<jh, jq<emb>> a(Set<jq<emb>> $$0, arq $$1, dgb $$2, jh $$3, boolean $$4, emv $$5) {
      List<del> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jh, jq<emb>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jh.a $$9 = new jh.a();

         for (del $$10 : $$6) {
            $$9.d(kj.a($$10.g, 8), 32, kj.a($$10.h, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jh, jq<emb>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jh, jq<emb>> a(Set<jq<emb>> $$0, dfi $$1, dgb $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, emw $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               del $$16 = $$8.a($$7, $$14, $$15);
               Pair<jh, jq<emb>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jh, jq<emb>> a(Set<jq<emb>> $$0, dfi $$1, dgb $$2, boolean $$3, emy $$4, del $$5) {
      for (jq<emb> $$6 : $$0) {
         emd $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != emd.b) {
            if (!$$3 && $$7 == emd.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dxj $$8 = $$1.a($$5.g, $$5.h, dyk.d);
            emj $$9 = $$2.a(kj.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dgb $$0, emj $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dgd $$0, dxj $$1, dgb $$2) {
      del $$3 = $$1.f();
      if (!ab.a($$3)) {
         kj $$4 = kj.a($$3, $$0.an());
         jh $$5 = $$4.j();
         kd<emb> $$6 = $$0.H_().e(ma.aS);
         Map<Integer, List<emb>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dgr.b> $$8 = this.c.get();
         eci $$9 = new eci(new eck(eby.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<jq<dgh>> $$11 = new ObjectArraySet();
         del.a($$4.r(), 1).forEach($$2x -> {
            dxj $$3x = $$0.a($$2x.g, $$2x.h);

            for (dxu $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            kd<elf> $$13 = $$0.H_().e(ma.aR);
            int $$14 = Math.max(ebf.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (emb $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jq<dgh> $$23 : $$11) {
                     List<ju<elf>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        ju<elf> $$25 = $$24.get($$15);
                        dgr.b $$26 = $$8.get($$15);
                        $$25.a().map(jq::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dgr.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     elf $$32 = $$29.a().get($$31);
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
            $$37.a("Generation").a("CenterX", $$3.g).a("CenterZ", $$3.h).a("Decoration Seed", $$10);
            throw new z($$37);
         }
      }
   }

   private static elt a(dxj $$0) {
      del $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dfh $$4 = $$0.y();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.al();
      return new elt($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(ary var1, dgb var2, ebx var3, dxj var4);

   public abstract void a(ary var1);

   public int a(dfh $$0) {
      return 64;
   }

   public dgl d() {
      return this.b;
   }

   public abstract int e();

   public bqt<dgt.c> a(jq<dgh> $$0, dgb $$1, bvh $$2, jh $$3) {
      Map<emb, LongSet> $$4 = $$1.b($$3);

      for (Entry<emb, LongSet> $$5 : $$4.entrySet()) {
         emb $$6 = $$5.getKey();
         emi $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<emj> $$9 = $$7.a() == emi.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(ke $$0, dxl $$1, dgb $$2, dxj $$3, eqe $$4) {
      del $$5 = $$3.f();
      kj $$6 = kj.a($$3);
      ebx $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         emy $$9 = $$8.a().b();
         List<emh.a> $$10 = $$8.a().a();

         for (emh.a $$11 : $$10) {
            emj $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.g, $$5.h)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<emh.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               eci $$14 = new eci(new ebk(0L));
               $$14.c($$1.d(), $$5.g, $$5.h);
               int $$15 = 0;

               for (emh.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (emh.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  emh.a $$20 = $$13.get($$18);
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

   private boolean a(emh.a $$0, dgb $$1, ke $$2, ebx $$3, eqe $$4, long $$5, dxj $$6, del $$7, kj $$8) {
      emb $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ju<dgh> $$11 = $$9.a();
      Predicate<jq<dgh>> $$12 = $$11::a;
      emj $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dgb $$0, dxj $$1, kj $$2, emb $$3) {
      emj $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dgd $$0, dgb $$1, dxj $$2) {
      int $$3 = 8;
      del $$4 = $$2.f();
      int $$5 = $$4.g;
      int $$6 = $$4.h;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kj $$9 = kj.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = del.c($$10, $$11);

            for (emj $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agv.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends kd<emb>> $$17 = $$0.H_().a(ma.aS);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lz.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dxj> a(ecl var1, ebx var2, dgb var3, dxj var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, ebj.a var3, dfh var4, ebx var5);

   public abstract dfr a(int var1, int var2, dfh var3, ebx var4);

   public int b(int $$0, int $$1, ebj.a $$2, dfh $$3, ebx $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, ebj.a $$2, dfh $$3, ebx $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, ebx var2, jh var3);

   @Deprecated
   public dgi a(jq<dgh> $$0) {
      return this.d.apply($$0);
   }
}
