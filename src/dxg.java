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

public abstract class dxg {
   public static final Codec<dxg> a = ly.aa.q().dispatchStable(dxg::b, Function.identity());
   protected final dgg b;
   private final Supplier<List<dgm.b>> c;
   private final Function<jq<dgc>, dgd> d;

   public dxg(dgg $$0) {
      this($$0, $$0x -> ((dgc)$$0x.a()).d());
   }

   public dxg(dgg $$0, Function<jq<dgc>, dgd> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dgm.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dxg> b();

   public dxh a(js<emd> $$0, ebt $$1, long $$2) {
      return dxh.a($$1, $$2, this.b, $$0);
   }

   public Optional<alh<MapCodec<? extends dxg>>> c() {
      return ly.aa.d(this.b());
   }

   public CompletableFuture<dxf> a(ebt $$0, ech $$1, dfw $$2, dxf $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ae.g().a("init_biomes"));
   }

   public abstract void a(arv var1, long var2, ebt var4, dge var5, dfw var6, dxf var7);

   @Nullable
   public Pair<jh, jq<elx>> a(arn $$0, ju<elx> $$1, jh $$2, int $$3, boolean $$4) {
      dxh $$5 = $$0.l().h();
      Map<emu, Set<jq<elx>>> $$6 = new Object2ObjectArrayMap();

      for (jq<elx> $$7 : $$1) {
         for (emu $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jh, jq<elx>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dfw $$11 = $$0.a();
         List<Entry<emu, Set<jq<elx>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<emu, Set<jq<elx>>> $$13 : $$6.entrySet()) {
            emu $$14 = $$13.getKey();
            if ($$14 instanceof emr) {
               emr $$15 = (emr)$$14;
               Pair<jh, jq<elx>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jh $$17 = (jh)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof ems) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kj.a($$2.u());
            int $$20 = kj.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<emu, Set<jq<elx>>> $$23 : $$12) {
                  ems $$24 = (ems)$$23.getKey();
                  Pair<jh, jq<elx>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
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
   private Pair<jh, jq<elx>> a(Set<jq<elx>> $$0, arn $$1, dfw $$2, jh $$3, boolean $$4, emr $$5) {
      List<deh> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jh, jq<elx>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jh.a $$9 = new jh.a();

         for (deh $$10 : $$6) {
            $$9.d(kj.a($$10.g, 8), 32, kj.a($$10.h, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jh, jq<elx>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<jh, jq<elx>> a(Set<jq<elx>> $$0, dfe $$1, dfw $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, ems $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               deh $$16 = $$8.a($$7, $$14, $$15);
               Pair<jh, jq<elx>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jh, jq<elx>> a(Set<jq<elx>> $$0, dfe $$1, dfw $$2, boolean $$3, emu $$4, deh $$5) {
      for (jq<elx> $$6 : $$0) {
         elz $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != elz.b) {
            if (!$$3 && $$7 == elz.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dxf $$8 = $$1.a($$5.g, $$5.h, dyg.d);
            emf $$9 = $$2.a(kj.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dfw $$0, emf $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dfy $$0, dxf $$1, dfw $$2) {
      deh $$3 = $$1.f();
      if (!ab.a($$3)) {
         kj $$4 = kj.a($$3, $$0.an());
         jh $$5 = $$4.j();
         kd<elx> $$6 = $$0.H_().e(lz.aS);
         Map<Integer, List<elx>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dgm.b> $$8 = this.c.get();
         ece $$9 = new ece(new ecg(ebu.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<jq<dgc>> $$11 = new ObjectArraySet();
         deh.a($$4.r(), 1).forEach($$2x -> {
            dxf $$3x = $$0.a($$2x.g, $$2x.h);

            for (dxq $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            kd<elb> $$13 = $$0.H_().e(lz.aR);
            int $$14 = Math.max(ebb.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (elx $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (jq<dgc> $$23 : $$11) {
                     List<ju<elb>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        ju<elb> $$25 = $$24.get($$15);
                        dgm.b $$26 = $$8.get($$15);
                        $$25.a().map(jq::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dgm.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     elb $$32 = $$29.a().get($$31);
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

   private static elp a(dxf $$0) {
      deh $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dfd $$4 = $$0.y();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.al();
      return new elp($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(arv var1, dfw var2, ebt var3, dxf var4);

   public abstract void a(arv var1);

   public int a(dfd $$0) {
      return 64;
   }

   public dgg d() {
      return this.b;
   }

   public abstract int e();

   public bqp<dgo.c> a(jq<dgc> $$0, dfw $$1, bvd $$2, jh $$3) {
      Map<elx, LongSet> $$4 = $$1.b($$3);

      for (Entry<elx, LongSet> $$5 : $$4.entrySet()) {
         elx $$6 = $$5.getKey();
         eme $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<emf> $$9 = $$7.a() == eme.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(ke $$0, dxh $$1, dfw $$2, dxf $$3, eqa $$4) {
      deh $$5 = $$3.f();
      kj $$6 = kj.a($$3);
      ebt $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         emu $$9 = $$8.a().b();
         List<emd.a> $$10 = $$8.a().a();

         for (emd.a $$11 : $$10) {
            emf $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.g, $$5.h)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<emd.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               ece $$14 = new ece(new ebg(0L));
               $$14.c($$1.d(), $$5.g, $$5.h);
               int $$15 = 0;

               for (emd.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (emd.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  emd.a $$20 = $$13.get($$18);
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

   private boolean a(emd.a $$0, dfw $$1, ke $$2, ebt $$3, eqa $$4, long $$5, dxf $$6, deh $$7, kj $$8) {
      elx $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ju<dgc> $$11 = $$9.a();
      Predicate<jq<dgc>> $$12 = $$11::a;
      emf $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dfw $$0, dxf $$1, kj $$2, elx $$3) {
      emf $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dfy $$0, dfw $$1, dxf $$2) {
      int $$3 = 8;
      deh $$4 = $$2.f();
      int $$5 = $$4.g;
      int $$6 = $$4.h;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kj $$9 = kj.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = deh.c($$10, $$11);

            for (emf $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     ags.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends kd<elx>> $$17 = $$0.H_().a(lz.aS);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> ly.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new z($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dxf> a(ech var1, ebt var2, dfw var3, dxf var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, ebf.a var3, dfd var4, ebt var5);

   public abstract dfn a(int var1, int var2, dfd var3, ebt var4);

   public int b(int $$0, int $$1, ebf.a $$2, dfd $$3, ebt $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, ebf.a $$2, dfd $$3, ebt $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, ebt var2, jh var3);

   @Deprecated
   public dgd a(jq<dgc> $$0) {
      return this.d.apply($$0);
   }
}
