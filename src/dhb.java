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

public abstract class dhb {
   public static final Codec<dhb> a = jd.ad.q().dispatchStable(dhb::a, Function.identity());
   protected final cqs b;
   private final Supplier<List<cqy.b>> c;
   private final Function<hg<cqo>, cqp> d;

   public dhb(cqs $$0) {
      this($$0, $$0x -> ((cqo)$$0x.a()).d());
   }

   public dhb(cqs $$0, Function<hg<cqo>, cqp> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> cqy.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends dhb> a();

   public dhc a(hi<dvj> $$0, dlb $$1, long $$2) {
      return dhc.a($$1, $$2, this.b, $$0);
   }

   public Optional<aet<Codec<? extends dhb>>> b() {
      return jd.ad.c(this.a());
   }

   public CompletableFuture<dha> a(Executor $$0, dlb $$1, dlp $$2, cqi $$3, dha $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(aku var1, long var2, dlb var4, cqq var5, cqi var6, dha var7, dkj.a var8);

   @Nullable
   public Pair<gw, hg<dvd>> a(akn $$0, hk<dvd> $$1, gw $$2, int $$3, boolean $$4) {
      dhc $$5 = $$0.k().h();
      Map<dwa, Set<hg<dvd>>> $$6 = new Object2ObjectArrayMap();

      for (hg<dvd> $$7 : $$1) {
         for (dwa $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<gw, hg<dvd>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         cqi $$11 = $$0.a();
         List<Entry<dwa, Set<hg<dvd>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<dwa, Set<hg<dvd>>> $$13 : $$6.entrySet()) {
            dwa $$14 = $$13.getKey();
            if ($$14 instanceof dvx) {
               dvx $$15 = (dvx)$$14;
               Pair<gw, hg<dvd>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  gw $$17 = (gw)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof dvy) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = hz.a($$2.u());
            int $$20 = hz.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<dwa, Set<hg<dvd>>> $$23 : $$12) {
                  dvy $$24 = (dvy)$$23.getKey();
                  Pair<gw, hg<dvd>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
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
   private Pair<gw, hg<dvd>> a(Set<hg<dvd>> $$0, akn $$1, cqi $$2, gw $$3, boolean $$4, dvx $$5) {
      List<cox> $$6 = $$1.k().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<gw, hg<dvd>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         gw.a $$9 = new gw.a();

         for (cox $$10 : $$6) {
            $$9.d(hz.a($$10.e, 8), 32, hz.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<gw, hg<dvd>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<gw, hg<dvd>> a(Set<hg<dvd>> $$0, cpt $$1, cqi $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dvy $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cox $$16 = $$8.a($$7, $$14, $$15);
               Pair<gw, hg<dvd>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<gw, hg<dvd>> a(Set<hg<dvd>> $$0, cpt $$1, cqi $$2, boolean $$3, dwa $$4, cox $$5) {
      for (hg<dvd> $$6 : $$0) {
         dvf $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dvf.b) {
            if (!$$3 && $$7 == dvf.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dha $$8 = $$1.a($$5.e, $$5.f, dhf.d);
            dvl $$9 = $$2.a(hz.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(cqi $$0, dvl $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(cqk $$0, dha $$1, cqi $$2) {
      cox $$3 = $$1.f();
      if (!aa.a($$3)) {
         hz $$4 = hz.a($$3, $$0.al());
         gw $$5 = $$4.j();
         ht<dvd> $$6 = $$0.B_().d(je.az);
         Map<Integer, List<dvd>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<cqy.b> $$8 = this.c.get();
         dlm $$9 = new dlm(new dlo(dlc.a()));
         long $$10 = $$9.a($$0.A(), $$5.u(), $$5.w());
         Set<hg<cqo>> $$11 = new ObjectArraySet();
         cox.a($$4.r(), 1).forEach($$2x -> {
            dha $$3x = $$0.a($$2x.e, $$2x.f);

            for (dhm $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            ht<duh> $$13 = $$0.B_().d(je.ay);
            int $$14 = Math.max(dkj.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dvd $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (hg<cqo> $$23 : $$11) {
                     List<hk<duh>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        hk<duh> $$25 = $$24.get($$15);
                        cqy.b $$26 = $$8.get($$15);
                        $$25.a().map(hg::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  cqy.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     duh $$32 = $$29.a().get($$31);
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

   private static duv a(dha $$0) {
      cox $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      cps $$4 = $$0.z();
      int $$5 = $$4.C_() + 1;
      int $$6 = $$4.aj() - 1;
      return new duv($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aku var1, cqi var2, dlb var3, dha var4);

   public abstract void a(aku var1);

   public int a(cps $$0) {
      return 64;
   }

   public cqs c() {
      return this.b;
   }

   public abstract int d();

   public bfh<cra.c> a(hg<cqo> $$0, cqi $$1, bje $$2, gw $$3) {
      Map<dvd, LongSet> $$4 = $$1.b($$3);

      for (Entry<dvd, LongSet> $$5 : $$4.entrySet()) {
         dvd $$6 = $$5.getKey();
         dvk $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dvl> $$9 = $$7.a() == dvk.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(hu $$0, dhc $$1, cqi $$2, dha $$3, dyx $$4) {
      cox $$5 = $$3.f();
      hz $$6 = hz.a($$3);
      dlb $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         dwa $$9 = $$8.a().b();
         List<dvj.a> $$10 = $$8.a().a();

         for (dvj.a $$11 : $$10) {
            dvl $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dvj.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dlm $$14 = new dlm(new dko(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dvj.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dvj.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dvj.a $$20 = $$13.get($$18);
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

   private boolean a(dvj.a $$0, cqi $$1, hu $$2, dlb $$3, dyx $$4, long $$5, dha $$6, cox $$7, hz $$8) {
      dvd $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      hk<cqo> $$11 = $$9.a();
      Predicate<hg<cqo>> $$12 = $$11::a;
      dvl $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(cqi $$0, dha $$1, hz $$2, dvd $$3) {
      dvl $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(cqk $$0, cqi $$1, dha $$2) {
      int $$3 = 8;
      cox $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      hz $$9 = hz.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = cox.c($$10, $$11);

            for (dvl $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     aay.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends ht<dvd>> $$17 = $$0.B_().c(je.az);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> jd.U.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dha> a(Executor var1, dlp var2, dlb var3, cqi var4, dha var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dkn.a var3, cps var4, dlb var5);

   public abstract cqc a(int var1, int var2, cps var3, dlb var4);

   public int b(int $$0, int $$1, dkn.a $$2, cps $$3, dlb $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dkn.a $$2, cps $$3, dlb $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dlb var2, gw var3);

   @Deprecated
   public cqp a(hg<cqo> $$0) {
      return this.d.apply($$0);
   }
}
