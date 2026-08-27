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

public abstract class djf {
   public static final Codec<djf> a = jy.ad.q().dispatchStable(djf::a, Function.identity());
   protected final ctc b;
   private final Supplier<List<cti.b>> c;
   private final Function<ib<csy>, csz> d;

   public djf(ctc $$0) {
      this($$0, $$0x -> ((csy)$$0x.a()).d());
   }

   public djf(ctc $$0, Function<ib<csy>, csz> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> cti.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   protected abstract Codec<? extends djf> a();

   public djg a(id<dxn> $$0, dnf $$1, long $$2) {
      return djg.a($$1, $$2, this.b, $$0);
   }

   public Optional<agh<Codec<? extends djf>>> b() {
      return jy.ad.c(this.a());
   }

   public CompletableFuture<dje> a(Executor $$0, dnf $$1, dnt $$2, css $$3, dje $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.f());
   }

   public abstract void a(aml var1, long var2, dnf var4, cta var5, css var6, dje var7, dmn.a var8);

   @Nullable
   public Pair<ht, ib<dxh>> a(ame $$0, ig<dxh> $$1, ht $$2, int $$3, boolean $$4) {
      djg $$5 = $$0.k().h();
      Map<dye, Set<ib<dxh>>> $$6 = new Object2ObjectArrayMap();

      for (ib<dxh> $$7 : $$1) {
         for (dye $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<ht, ib<dxh>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         css $$11 = $$0.a();
         List<Entry<dye, Set<ib<dxh>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<dye, Set<ib<dxh>>> $$13 : $$6.entrySet()) {
            dye $$14 = $$13.getKey();
            if ($$14 instanceof dyb) {
               dyb $$15 = (dyb)$$14;
               Pair<ht, ib<dxh>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  ht $$17 = (ht)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof dyc) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = iu.a($$2.u());
            int $$20 = iu.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<dye, Set<ib<dxh>>> $$23 : $$12) {
                  dyc $$24 = (dyc)$$23.getKey();
                  Pair<ht, ib<dxh>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((iw)$$25.getFirst());
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
   private Pair<ht, ib<dxh>> a(Set<ib<dxh>> $$0, ame $$1, css $$2, ht $$3, boolean $$4, dyb $$5) {
      List<crh> $$6 = $$1.k().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<ht, ib<dxh>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         ht.a $$9 = new ht.a();

         for (crh $$10 : $$6) {
            $$9.d(iu.a($$10.e, 8), 32, iu.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<ht, ib<dxh>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<ht, ib<dxh>> a(Set<ib<dxh>> $$0, csd $$1, css $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dyc $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               crh $$16 = $$8.a($$7, $$14, $$15);
               Pair<ht, ib<dxh>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<ht, ib<dxh>> a(Set<ib<dxh>> $$0, csd $$1, css $$2, boolean $$3, dye $$4, crh $$5) {
      for (ib<dxh> $$6 : $$0) {
         dxj $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dxj.b) {
            if (!$$3 && $$7 == dxj.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dje $$8 = $$1.a($$5.e, $$5.f, djj.d);
            dxp $$9 = $$2.a(iu.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(css $$0, dxp $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(csu $$0, dje $$1, css $$2) {
      crh $$3 = $$1.f();
      if (!aa.a($$3)) {
         iu $$4 = iu.a($$3, $$0.am());
         ht $$5 = $$4.j();
         io<dxh> $$6 = $$0.H_().d(jz.aB);
         Map<Integer, List<dxh>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<cti.b> $$8 = this.c.get();
         dnq $$9 = new dnq(new dns(dng.a()));
         long $$10 = $$9.a($$0.B(), $$5.u(), $$5.w());
         Set<ib<csy>> $$11 = new ObjectArraySet();
         crh.a($$4.r(), 1).forEach($$2x -> {
            dje $$3x = $$0.a($$2x.e, $$2x.f);

            for (djq $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            io<dwl> $$13 = $$0.H_().d(jz.aA);
            int $$14 = Math.max(dmn.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (dxh $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (ib<csy> $$23 : $$11) {
                     List<ig<dwl>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        ig<dwl> $$25 = $$24.get($$15);
                        cti.b $$26 = $$8.get($$15);
                        $$25.a().map(ib::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  cti.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     dwl $$32 = $$29.a().get($$31);
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

   private static dwz a(dje $$0) {
      crh $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      csc $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.ak() - 1;
      return new dwz($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(aml var1, css var2, dnf var3, dje var4);

   public abstract void a(aml var1);

   public int a(csc $$0) {
      return 64;
   }

   public ctc c() {
      return this.b;
   }

   public abstract int d();

   public bhl<ctk.c> a(ib<csy> $$0, css $$1, blj $$2, ht $$3) {
      Map<dxh, LongSet> $$4 = $$1.b($$3);

      for (Entry<dxh, LongSet> $$5 : $$4.entrySet()) {
         dxh $$6 = $$5.getKey();
         dxo $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dxp> $$9 = $$7.a() == dxo.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(ip $$0, djg $$1, css $$2, dje $$3, ebi $$4) {
      crh $$5 = $$3.f();
      iu $$6 = iu.a($$3);
      dnf $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         dye $$9 = $$8.a().b();
         List<dxn.a> $$10 = $$8.a().a();

         for (dxn.a $$11 : $$10) {
            dxp $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<dxn.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dnq $$14 = new dnq(new dms(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (dxn.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (dxn.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  dxn.a $$20 = $$13.get($$18);
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

   private boolean a(dxn.a $$0, css $$1, ip $$2, dnf $$3, ebi $$4, long $$5, dje $$6, crh $$7, iu $$8) {
      dxh $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      ig<csy> $$11 = $$9.a();
      Predicate<ib<csy>> $$12 = $$11::a;
      dxp $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(css $$0, dje $$1, iu $$2, dxh $$3) {
      dxp $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(csu $$0, css $$1, dje $$2) {
      int $$3 = 8;
      crh $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      iu $$9 = iu.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = crh.c($$10, $$11);

            for (dxp $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     ack.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends io<dxh>> $$17 = $$0.H_().c(jz.aB);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> jy.U.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dje> a(Executor var1, dnt var2, dnf var3, css var4, dje var5);

   public abstract int e();

   public abstract int f();

   public abstract int a(int var1, int var2, dmr.a var3, csc var4, dnf var5);

   public abstract csm a(int var1, int var2, csc var3, dnf var4);

   public int b(int $$0, int $$1, dmr.a $$2, csc $$3, dnf $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dmr.a $$2, csc $$3, dnf $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dnf var2, ht var3);

   @Deprecated
   public csz a(ib<csy> $$0) {
      return this.d.apply($$0);
   }
}
