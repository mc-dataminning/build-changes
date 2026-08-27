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

public abstract class dhg {
   public static final Codec<dhg> a = jd.ad.q().dispatchStable(dhg::a, Function.identity());
   protected final cqx b;
   private final Supplier<List<crd.b>> c;
   private final Function<hg<cqt>, cqu> d;

   public dhg(cqx $$0) {
      this($$0, $$0x -> ((cqt)$$0x.a()).d());
   }

   public dhg(cqx $$0, Function<hg<cqt>, cqu> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> crd.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dhg> a();

   public dhh a(hi<dvo> $$0, dlg $$1, long $$2) {
      return dhh.a($$1, $$2, this.b, $$0);
   }

   public Optional<aew<Codec<? extends dhg>>> b() {
      return jd.ad.c(this.a());
   }

   public CompletableFuture<dhf> a(Executor $$0, dlg $$1, dlu $$2, cqn $$3, dhf $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(aky var1, long var2, dlg var4, cqv var5, cqn var6, dhf var7, dko.a var8);

   @Nullable
   public Pair<gw, hg<dvi>> a(akr $$0, hk<dvi> $$1, gw $$2, int $$3, boolean $$4) {
      dhh $$5 = $$0.k().h();
      Map<dwf, Set<hg<dvi>>> $$6 = new Object2ObjectArrayMap();

      for (hg<dvi> $$7 : $$1) {
         for (dwf $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<gw, hg<dvi>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         cqn $$11 = $$0.a();
         List<Entry<dwf, Set<hg<dvi>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<dwf, Set<hg<dvi>>> $$13 : $$6.entrySet()) {
            dwf $$14 = $$13.getKey();
            if ($$14 instanceof dwc) {
               dwc $$15 = (dwc)$$14;
               Pair<gw, hg<dvi>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  gw $$17 = (gw)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof dwd) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = hz.a($$2.u());
            int $$20 = hz.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<dwf, Set<hg<dvi>>> $$23 : $$12) {
                  dwd $$24 = (dwd)$$23.getKey();
                  Pair<gw, hg<dvi>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((ib)$$25.getFirst());
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
   private Pair<gw, hg<dvi>> a(Set<hg<dvi>> $$0, akr $$1, cqn $$2, gw $$3, boolean $$4, dwc $$5) {
      List<cpc> $$6 = $$1.k().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<gw, hg<dvi>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         gw.a $$9 = new gw.a();

         for (cpc $$10 : $$6) {
            $$9.d(hz.a($$10.e, 8), 32, hz.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<gw, hg<dvi>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<gw, hg<dvi>> a(Set<hg<dvi>> $$0, cpy $$1, cqn $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dwd $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cpc $$16 = $$8.a($$7, $$14, $$15);
               Pair<gw, hg<dvi>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<gw, hg<dvi>> a(Set<hg<dvi>> $$0, cpy $$1, cqn $$2, boolean $$3, dwf $$4, cpc $$5) {
      for (hg<dvi> $$6 : $$0) {
         dvk $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dvk.b) {
            if (!$$3 && $$7 == dvk.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dhf $$8 = $$1.a($$5.e, $$5.f, dhk.d);
            dvq $$9 = $$2.a(hz.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(cqn $$0, dvq $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(cqp $$0, dhf $$1, cqn $$2) {
      cpc $$3 = $$1.f();
      if (!aa.a($$3)) {
         hz $$4 = hz.a($$3, $$0.al());
         gw $$5 = $$4.j();
         ht<dvi> $$6 = $$0.G_().d(je.az);
         Map<Integer, List<dvi>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<crd.b> $$8 = this.c.get();
         dlr $$9 = new dlr(new dlt(dlh.a()));
         long $$10 = $$9.a($$0.A(), $$5.u(), $$5.w());
         Set<hg<cqt>> $$11 = new ObjectArraySet();
         cpc.a($$4.r(), 1).forEach($$2x -> {
            dhf $$3x = $$0.a($$2x.e, $$2x.f);

            for (dhr $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            ht<dum> $$13 = $$0.G_().d(je.ay);
            int $$14 = Math.max(dko.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dvi $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (hg<cqt> $$23 : $$11) {
                     List<hk<dum>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        hk<dum> $$25 = $$24.get($$15);
                        crd.b $$26 = $$8.get($$15);
                        $$25.a().map(hg::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  crd.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dum $$32 = $$29.a().get($$31);
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

   private static dva a(dhf $$0) {
      cpc $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      cpx $$4 = $$0.z();
      int $$5 = $$4.H_() + 1;
      int $$6 = $$4.aj() - 1;
      return new dva($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aky var1, cqn var2, dlg var3, dhf var4);

   public abstract void a(aky var1);

   public int a(cpx $$0) {
      return 64;
   }

   public cqx c() {
      return this.b;
   }

   public abstract int d();

   public bfm<crf.c> a(hg<cqt> $$0, cqn $$1, bjj $$2, gw $$3) {
      Map<dvi, LongSet> $$4 = $$1.b($$3);

      for (Entry<dvi, LongSet> $$5 : $$4.entrySet()) {
         dvi $$6 = $$5.getKey();
         dvp $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dvq> $$9 = $$7.a() == dvp.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(hu $$0, dhh $$1, cqn $$2, dhf $$3, dzc $$4) {
      cpc $$5 = $$3.f();
      hz $$6 = hz.a($$3);
      dlg $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         dwf $$9 = $$8.a().b();
         List<dvo.a> $$10 = $$8.a().a();

         for (dvo.a $$11 : $$10) {
            dvq $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dvo.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dlr $$14 = new dlr(new dkt(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dvo.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dvo.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dvo.a $$20 = $$13.get($$18);
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

   private boolean a(dvo.a $$0, cqn $$1, hu $$2, dlg $$3, dzc $$4, long $$5, dhf $$6, cpc $$7, hz $$8) {
      dvi $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      hk<cqt> $$11 = $$9.a();
      Predicate<hg<cqt>> $$12 = $$11::a;
      dvq $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(cqn $$0, dhf $$1, hz $$2, dvi $$3) {
      dvq $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(cqp $$0, cqn $$1, dhf $$2) {
      int $$3 = 8;
      cpc $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      hz $$9 = hz.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = cpc.c($$10, $$11);

            for (dvq $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     abc.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends ht<dvi>> $$17 = $$0.G_().c(je.az);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> jd.U.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dhf> a(Executor var1, dlu var2, dlg var3, cqn var4, dhf var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dks.a var3, cpx var4, dlg var5);

   public abstract cqh a(int var1, int var2, cpx var3, dlg var4);

   public int b(int $$0, int $$1, dks.a $$2, cpx $$3, dlg $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dks.a $$2, cpx $$3, dlg $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dlg var2, gw var3);

   @Deprecated
   public cqu a(hg<cqt> $$0) {
      return this.d.apply($$0);
   }
}
