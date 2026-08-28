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

public abstract class dwp {
   public static final Codec<dwp> a = lv.aa.q().dispatchStable(dwp::b, Function.identity());
   protected final dfo b;
   private final Supplier<List<dfu.b>> c;
   private final Function<jo<dfk>, dfl> d;

   public dwp(dfo $$0) {
      this($$0, $$0x -> ((dfk)$$0x.a()).d());
   }

   public dwp(dfo $$0, Function<jo<dfk>, dfl> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dfu.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dwp> b();

   public dwq a(jq<elm> $$0, ebc $$1, long $$2) {
      return dwq.a($$1, $$2, this.b, $$0);
   }

   public Optional<ald<MapCodec<? extends dwp>>> c() {
      return lv.aa.d(this.b());
   }

   public CompletableFuture<dwo> a(ebc $$0, ebq $$1, dfe $$2, dwo $$3) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", () -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }), ad.g());
   }

   public abstract void a(arq var1, long var2, ebc var4, dfm var5, dfe var6, dwo var7);

   @Nullable
   public Pair<jf, jo<elg>> a(arj $$0, js<elg> $$1, jf $$2, int $$3, boolean $$4) {
      dwq $$5 = $$0.l().h();
      Map<emd, Set<jo<elg>>> $$6 = new Object2ObjectArrayMap();

      for (jo<elg> $$7 : $$1) {
         for (emd $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jf, jo<elg>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dfe $$11 = $$0.a();
         List<Entry<emd, Set<jo<elg>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<emd, Set<jo<elg>>> $$13 : $$6.entrySet()) {
            emd $$14 = $$13.getKey();
            if ($$14 instanceof ema) {
               ema $$15 = (ema)$$14;
               Pair<jf, jo<elg>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jf $$17 = (jf)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof emb) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kh.a($$2.u());
            int $$20 = kh.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<emd, Set<jo<elg>>> $$23 : $$12) {
                  emb $$24 = (emb)$$23.getKey();
                  Pair<jf, jo<elg>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kj)$$25.getFirst());
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
   private Pair<jf, jo<elg>> a(Set<jo<elg>> $$0, arj $$1, dfe $$2, jf $$3, boolean $$4, ema $$5) {
      List<ddp> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jf, jo<elg>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jf.a $$9 = new jf.a();

         for (ddp $$10 : $$6) {
            $$9.d(kh.a($$10.e, 8), 32, kh.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jf, jo<elg>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jf, jo<elg>> a(Set<jo<elg>> $$0, dem $$1, dfe $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, emb $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               ddp $$16 = $$8.a($$7, $$14, $$15);
               Pair<jf, jo<elg>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jf, jo<elg>> a(Set<jo<elg>> $$0, dem $$1, dfe $$2, boolean $$3, emd $$4, ddp $$5) {
      for (jo<elg> $$6 : $$0) {
         eli $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eli.b) {
            if (!$$3 && $$7 == eli.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dwo $$8 = $$1.a($$5.e, $$5.f, dxp.d);
            elo $$9 = $$2.a(kh.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dfe $$0, elo $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dfg $$0, dwo $$1, dfe $$2) {
      ddp $$3 = $$1.f();
      if (!ab.a($$3)) {
         kh $$4 = kh.a($$3, $$0.ap());
         jf $$5 = $$4.j();
         kb<elg> $$6 = $$0.G_().e(lw.aT);
         Map<Integer, List<elg>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dfu.b> $$8 = this.c.get();
         ebn $$9 = new ebn(new ebp(ebd.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<jo<dfk>> $$11 = new ObjectArraySet();
         ddp.a($$4.r(), 1).forEach($$2x -> {
            dwo $$3x = $$0.a($$2x.e, $$2x.f);

            for (dwz $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            kb<ekk> $$13 = $$0.G_().e(lw.aS);
            int $$14 = Math.max(eak.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (elg $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jo<dfk> $$23 : $$11) {
                     List<js<ekk>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        js<ekk> $$25 = $$24.get($$15);
                        dfu.b $$26 = $$8.get($$15);
                        $$25.a().map(jo::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dfu.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     ekk $$32 = $$29.a().get($$31);
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

   private static eky a(dwo $$0) {
      ddp $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      del $$4 = $$0.y();
      int $$5 = $$4.H_() + 1;
      int $$6 = $$4.an();
      return new eky($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(arq var1, dfe var2, ebc var3, dwo var4);

   public abstract void a(arq var1);

   public int a(del $$0) {
      return 64;
   }

   public dfo d() {
      return this.b;
   }

   public abstract int e();

   public bqg<dfw.c> a(jo<dfk> $$0, dfe $$1, buq $$2, jf $$3) {
      Map<elg, LongSet> $$4 = $$1.b($$3);

      for (Entry<elg, LongSet> $$5 : $$4.entrySet()) {
         elg $$6 = $$5.getKey();
         eln $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<elo> $$9 = $$7.a() == eln.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(kc $$0, dwq $$1, dfe $$2, dwo $$3, epj $$4) {
      ddp $$5 = $$3.f();
      kh $$6 = kh.a($$3);
      ebc $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         emd $$9 = $$8.a().b();
         List<elm.a> $$10 = $$8.a().a();

         for (elm.a $$11 : $$10) {
            elo $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<elm.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               ebn $$14 = new ebn(new eap(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (elm.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (elm.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  elm.a $$20 = $$13.get($$18);
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

   private boolean a(elm.a $$0, dfe $$1, kc $$2, ebc $$3, epj $$4, long $$5, dwo $$6, ddp $$7, kh $$8) {
      elg $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      js<dfk> $$11 = $$9.a();
      Predicate<jo<dfk>> $$12 = $$11::a;
      elo $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dfe $$0, dwo $$1, kh $$2, elg $$3) {
      elo $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dfg $$0, dfe $$1, dwo $$2) {
      int $$3 = 8;
      ddp $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kh $$9 = kh.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = ddp.c($$10, $$11);

            for (elo $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     ago.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends kb<elg>> $$17 = $$0.G_().a(lw.aT);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lv.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dwo> a(ebq var1, ebc var2, dfe var3, dwo var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, eao.a var3, del var4, ebc var5);

   public abstract dev a(int var1, int var2, del var3, ebc var4);

   public int b(int $$0, int $$1, eao.a $$2, del $$3, ebc $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, eao.a $$2, del $$3, ebc $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, ebc var2, jf var3);

   @Deprecated
   public dfl a(jo<dfk> $$0) {
      return this.d.apply($$0);
   }
}
