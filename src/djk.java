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

public abstract class djk {
   public static final Codec<djk> a = kc.ad.q().dispatchStable(djk::a, Function.identity());
   protected final cth b;
   private final Supplier<List<ctn.b>> c;
   private final Function<ig<ctd>, cte> d;

   public djk(cth $$0) {
      this($$0, $$0x -> ((ctd)$$0x.a()).d());
   }

   public djk(cth $$0, Function<ig<ctd>, cte> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> ctn.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends djk> a();

   public djl a(ii<dxs> $$0, dnk $$1, long $$2) {
      return djl.a($$1, $$2, this.b, $$0);
   }

   public Optional<agl<Codec<? extends djk>>> b() {
      return kc.ad.c(this.a());
   }

   public CompletableFuture<djj> a(Executor $$0, dnk $$1, dny $$2, csx $$3, djj $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(amp var1, long var2, dnk var4, ctf var5, csx var6, djj var7, dms.a var8);

   @Nullable
   public Pair<hx, ig<dxm>> a(ami $$0, ik<dxm> $$1, hx $$2, int $$3, boolean $$4) {
      djl $$5 = $$0.k().h();
      Map<dyj, Set<ig<dxm>>> $$6 = new Object2ObjectArrayMap();

      for (ig<dxm> $$7 : $$1) {
         for (dyj $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<hx, ig<dxm>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         csx $$11 = $$0.a();
         List<Entry<dyj, Set<ig<dxm>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<dyj, Set<ig<dxm>>> $$13 : $$6.entrySet()) {
            dyj $$14 = $$13.getKey();
            if ($$14 instanceof dyg) {
               dyg $$15 = (dyg)$$14;
               Pair<hx, ig<dxm>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  hx $$17 = (hx)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof dyh) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = iy.a($$2.u());
            int $$20 = iy.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<dyj, Set<ig<dxm>>> $$23 : $$12) {
                  dyh $$24 = (dyh)$$23.getKey();
                  Pair<hx, ig<dxm>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((ja)$$25.getFirst());
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
   private Pair<hx, ig<dxm>> a(Set<ig<dxm>> $$0, ami $$1, csx $$2, hx $$3, boolean $$4, dyg $$5) {
      List<crm> $$6 = $$1.k().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<hx, ig<dxm>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         hx.a $$9 = new hx.a();

         for (crm $$10 : $$6) {
            $$9.d(iy.a($$10.e, 8), 32, iy.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<hx, ig<dxm>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<hx, ig<dxm>> a(Set<ig<dxm>> $$0, csi $$1, csx $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dyh $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               crm $$16 = $$8.a($$7, $$14, $$15);
               Pair<hx, ig<dxm>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<hx, ig<dxm>> a(Set<ig<dxm>> $$0, csi $$1, csx $$2, boolean $$3, dyj $$4, crm $$5) {
      for (ig<dxm> $$6 : $$0) {
         dxo $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dxo.b) {
            if (!$$3 && $$7 == dxo.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            djj $$8 = $$1.a($$5.e, $$5.f, djo.d);
            dxu $$9 = $$2.a(iy.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(csx $$0, dxu $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(csz $$0, djj $$1, csx $$2) {
      crm $$3 = $$1.f();
      if (!aa.a($$3)) {
         iy $$4 = iy.a($$3, $$0.am());
         hx $$5 = $$4.j();
         is<dxm> $$6 = $$0.I_().d(kd.aB);
         Map<Integer, List<dxm>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<ctn.b> $$8 = this.c.get();
         dnv $$9 = new dnv(new dnx(dnl.a()));
         long $$10 = $$9.a($$0.B(), $$5.u(), $$5.w());
         Set<ig<ctd>> $$11 = new ObjectArraySet();
         crm.a($$4.r(), 1).forEach($$2x -> {
            djj $$3x = $$0.a($$2x.e, $$2x.f);

            for (djv $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            is<dwq> $$13 = $$0.I_().d(kd.aA);
            int $$14 = Math.max(dms.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dxm $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> $$6.c($$18).map(Object::toString).orElseGet($$18::toString);

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

                  for (ig<ctd> $$23 : $$11) {
                     List<ik<dwq>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        ik<dwq> $$25 = $$24.get($$15);
                        ctn.b $$26 = $$8.get($$15);
                        $$25.a().map(ig::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  ctn.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dwq $$32 = $$29.a().get($$31);
                     Supplier<String> $$33 = () -> $$13.c($$32).map(Object::toString).orElseGet($$32::toString);
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
            $$37.a("Generation").a("CenterX", $$3.e).a("CenterZ", $$3.f).a("Seed", $$10);
            throw new y($$37);
         }
      }
   }

   private static dxe a(djj $$0) {
      crm $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      csh $$4 = $$0.z();
      int $$5 = $$4.J_() + 1;
      int $$6 = $$4.ak() - 1;
      return new dxe($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(amp var1, csx var2, dnk var3, djj var4);

   public abstract void a(amp var1);

   public int a(csh $$0) {
      return 64;
   }

   public cth c() {
      return this.b;
   }

   public abstract int d();

   public bhp<ctp.c> a(ig<ctd> $$0, csx $$1, blo $$2, hx $$3) {
      Map<dxm, LongSet> $$4 = $$1.b($$3);

      for (Entry<dxm, LongSet> $$5 : $$4.entrySet()) {
         dxm $$6 = $$5.getKey();
         dxt $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dxu> $$9 = $$7.a() == dxt.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(it $$0, djl $$1, csx $$2, djj $$3, ebn $$4) {
      crm $$5 = $$3.f();
      iy $$6 = iy.a($$3);
      dnk $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         dyj $$9 = $$8.a().b();
         List<dxs.a> $$10 = $$8.a().a();

         for (dxs.a $$11 : $$10) {
            dxu $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dxs.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dnv $$14 = new dnv(new dmx(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dxs.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dxs.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dxs.a $$20 = $$13.get($$18);
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

   private boolean a(dxs.a $$0, csx $$1, it $$2, dnk $$3, ebn $$4, long $$5, djj $$6, crm $$7, iy $$8) {
      dxm $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ik<ctd> $$11 = $$9.a();
      Predicate<ig<ctd>> $$12 = $$11::a;
      dxu $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(csx $$0, djj $$1, iy $$2, dxm $$3) {
      dxu $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(csz $$0, csx $$1, djj $$2) {
      int $$3 = 8;
      crm $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      iy $$9 = iy.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = crm.c($$10, $$11);

            for (dxu $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     aco.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends is<dxm>> $$17 = $$0.I_().c(kd.aB);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> kc.U.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<djj> a(Executor var1, dny var2, dnk var3, csx var4, djj var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dmw.a var3, csh var4, dnk var5);

   public abstract csr a(int var1, int var2, csh var3, dnk var4);

   public int b(int $$0, int $$1, dmw.a $$2, csh $$3, dnk $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dmw.a $$2, csh $$3, dnk $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dnk var2, hx var3);

   @Deprecated
   public cte a(ig<ctd> $$0) {
      return this.d.apply($$0);
   }
}
