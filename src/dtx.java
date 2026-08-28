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

public abstract class dtx {
   public static final Codec<dtx> a = lp.ac.q().dispatchStable(dtx::b, Function.identity());
   protected final dcz b;
   private final Supplier<List<ddf.b>> c;
   private final Function<ji<dcv>, dcw> d;

   public dtx(dcz $$0) {
      this($$0, $$0x -> ((dcv)$$0x.a()).d());
   }

   public dtx(dcz $$0, Function<ji<dcv>, dcw> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> ddf.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).b(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends dtx> b();

   public dty a(jk<eio> $$0, dyg $$1, long $$2) {
      return dty.a($$1, $$2, this.b, $$0);
   }

   public Optional<ald<MapCodec<? extends dtx>>> c() {
      return lp.ac.d(this.b());
   }

   public CompletableFuture<dtw> a(Executor $$0, dyg $$1, dyu $$2, dcp $$3, dtw $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         $$4.a(this.b, $$1.b());
         return $$4;
      }), ac.g());
   }

   public abstract void a(arl var1, long var2, dyg var4, dcx var5, dcp var6, dtw var7, dxo.a var8);

   @Nullable
   public Pair<iz, ji<eii>> a(are $$0, jm<eii> $$1, iz $$2, int $$3, boolean $$4) {
      dty $$5 = $$0.l().h();
      Map<ejf, Set<ji<eii>>> $$6 = new Object2ObjectArrayMap();

      for (ji<eii> $$7 : $$1) {
         for (ejf $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<iz, ji<eii>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dcp $$11 = $$0.a();
         List<Entry<ejf, Set<ji<eii>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<ejf, Set<ji<eii>>> $$13 : $$6.entrySet()) {
            ejf $$14 = $$13.getKey();
            if ($$14 instanceof ejc) {
               ejc $$15 = (ejc)$$14;
               Pair<iz, ji<eii>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  iz $$17 = (iz)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof ejd) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = kb.a($$2.u());
            int $$20 = kb.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<ejf, Set<ji<eii>>> $$23 : $$12) {
                  ejd $$24 = (ejd)$$23.getKey();
                  Pair<iz, ji<eii>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
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
   private Pair<iz, ji<eii>> a(Set<ji<eii>> $$0, are $$1, dcp $$2, iz $$3, boolean $$4, ejc $$5) {
      List<dbd> $$6 = $$1.l().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<iz, ji<eii>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         iz.a $$9 = new iz.a();

         for (dbd $$10 : $$6) {
            $$9.d(kb.a($$10.e, 8), 32, kb.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<iz, ji<eii>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<iz, ji<eii>> a(Set<ji<eii>> $$0, dbz $$1, dcp $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, ejd $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dbd $$16 = $$8.a($$7, $$14, $$15);
               Pair<iz, ji<eii>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<iz, ji<eii>> a(Set<ji<eii>> $$0, dbz $$1, dcp $$2, boolean $$3, ejf $$4, dbd $$5) {
      for (ji<eii> $$6 : $$0) {
         eik $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eik.b) {
            if (!$$3 && $$7 == eik.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            dtw $$8 = $$1.a($$5.e, $$5.f, duv.d);
            eiq $$9 = $$2.a(kb.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dcp $$0, eiq $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dcr $$0, dtw $$1, dcp $$2) {
      dbd $$3 = $$1.f();
      if (!aa.a($$3)) {
         kb $$4 = kb.a($$3, $$0.ao());
         iz $$5 = $$4.j();
         jv<eii> $$6 = $$0.H_().d(lq.aJ);
         Map<Integer, List<eii>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<ddf.b> $$8 = this.c.get();
         dyr $$9 = new dyr(new dyt(dyh.a()));
         long $$10 = $$9.a($$0.C(), $$5.u(), $$5.w());
         Set<ji<dcv>> $$11 = new ObjectArraySet();
         dbd.a($$4.r(), 1).forEach($$2x -> {
            dtw $$3x = $$0.a($$2x.e, $$2x.f);

            for (duh $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jv<ehm> $$13 = $$0.H_().d(lq.aI);
            int $$14 = Math.max(dxo.b.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (eii $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
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

                  for (ji<dcv> $$23 : $$11) {
                     List<jm<ehm>> $$24 = this.d.apply($$23).b();
                     if ($$15 < $$24.size()) {
                        jm<ehm> $$25 = $$24.get($$15);
                        ddf.b $$26 = $$8.get($$15);
                        $$25.a().map(ji::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  ddf.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     ehm $$32 = $$29.a().get($$31);
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

   private static eia a(dtw $$0) {
      dbd $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dby $$4 = $$0.z();
      int $$5 = $$4.I_() + 1;
      int $$6 = $$4.am() - 1;
      return new eia($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(arl var1, dcp var2, dyg var3, dtw var4);

   public abstract void a(arl var1);

   public int a(dby $$0) {
      return 64;
   }

   public dcz d() {
      return this.b;
   }

   public abstract int e();

   public bpg<ddh.c> a(ji<dcv> $$0, dcp $$1, btq $$2, iz $$3) {
      Map<eii, LongSet> $$4 = $$1.b($$3);

      for (Entry<eii, LongSet> $$5 : $$4.entrySet()) {
         eii $$6 = $$5.getKey();
         eip $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<eiq> $$9 = $$7.a() == eip.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(jw $$0, dty $$1, dcp $$2, dtw $$3, emj $$4) {
      dbd $$5 = $$3.f();
      kb $$6 = kb.a($$3);
      dyg $$7 = $$1.c();
      $$1.a().forEach($$8 -> {
         ejf $$9 = $$8.a().b();
         List<eio.a> $$10 = $$8.a().a();

         for (eio.a $$11 : $$10) {
            eiq $$12 = $$2.a($$6, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b($$1, $$5.e, $$5.f)) {
            if ($$10.size() == 1) {
               this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
            } else {
               ArrayList<eio.a> $$13 = new ArrayList<>($$10.size());
               $$13.addAll($$10);
               dyr $$14 = new dyr(new dxt(0L));
               $$14.c($$1.d(), $$5.e, $$5.f);
               int $$15 = 0;

               for (eio.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while (!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for (eio.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     $$18++;
                  }

                  eio.a $$20 = $$13.get($$18);
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

   private boolean a(eio.a $$0, dcp $$1, jw $$2, dyg $$3, emj $$4, long $$5, dtw $$6, dbd $$7, kb $$8) {
      eii $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      jm<dcv> $$11 = $$9.a();
      Predicate<ji<dcv>> $$12 = $$11::a;
      eiq $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dcp $$0, dtw $$1, kb $$2, eii $$3) {
      eiq $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dcr $$0, dcp $$1, dtw $$2) {
      int $$3 = 8;
      dbd $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      kb $$9 = kb.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dbd.c($$10, $$11);

            for (eiq $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     ags.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  o $$15 = o.a(var21, "Generating structure reference");
                  p $$16 = $$15.a("Structure");
                  Optional<? extends jv<eii>> $$17 = $$0.H_().c(lq.aJ);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> lp.T.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new y($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<dtw> a(Executor var1, dyu var2, dyg var3, dcp var4, dtw var5);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, dxs.a var3, dby var4, dyg var5);

   public abstract dci a(int var1, int var2, dby var3, dyg var4);

   public int b(int $$0, int $$1, dxs.a $$2, dby $$3, dyg $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dxs.a $$2, dby $$3, dyg $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, dyg var2, iz var3);

   @Deprecated
   public dcw a(ji<dcv> $$0) {
      return this.d.apply($$0);
   }
}
