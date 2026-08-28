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

public abstract class ede {
   public static final Codec<ede> a = mh.aa.q().dispatchStable(ede::b, Function.identity());
   protected final dlg b;
   private final Supplier<List<dlm.b>> c;
   private final Function<jg<dlc>, dld> d;

   public ede(dlg $$0) {
      this($$0, $$0x -> ((dlc)$$0x.a()).d());
   }

   public ede(dlg $$0, Function<jg<dlc>, dld> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> dlm.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends ede> b();

   public edf a(ji<esj> $$0, eht $$1, long $$2) {
      return edf.a($$1, $$2, this.b, $$0);
   }

   public Optional<alj<MapCodec<? extends ede>>> c() {
      return mh.aa.d(this.b());
   }

   public CompletableFuture<edd> a(eht $$0, eih $$1, dkv $$2, edd $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ag.h().a("init_biomes"));
   }

   public abstract void a(asc var1, long var2, eht var4, dle var5, dkv var6, edd var7);

   @Nullable
   public Pair<iw, jg<esd>> a(aru $$0, jk<esd> $$1, iw $$2, int $$3, boolean $$4) {
      edf $$5 = $$0.m().h();
      Map<eta, Set<jg<esd>>> $$6 = new Object2ObjectArrayMap();

      for (jg<esd> $$7 : $$1) {
         for (eta $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<iw, jg<esd>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dkv $$11 = $$0.b();
         List<Entry<eta, Set<jg<esd>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<eta, Set<jg<esd>>> $$13 : $$6.entrySet()) {
            eta $$14 = $$13.getKey();
            if ($$14 instanceof esx) {
               esx $$15 = (esx)$$14;
               Pair<iw, jg<esd>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  iw $$17 = (iw)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof esy) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = jz.a($$2.u());
            int $$20 = jz.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<eta, Set<jg<esd>>> $$23 : $$12) {
                  esy $$24 = (esy)$$23.getKey();
                  Pair<iw, jg<esd>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kb)$$25.getFirst());
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
   private Pair<iw, jg<esd>> a(Set<jg<esd>> $$0, aru $$1, dkv $$2, iw $$3, boolean $$4, esx $$5) {
      List<dje> $$6 = $$1.m().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<iw, jg<esd>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         iw.a $$9 = new iw.a();

         for (dje $$10 : $$6) {
            $$9.d(jz.a($$10.h, 8), 32, jz.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<iw, jg<esd>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
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
   private static Pair<iw, jg<esd>> a(Set<jg<esd>> $$0, dkc $$1, dkv $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, esy $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dje $$16 = $$8.a($$7, $$14, $$15);
               Pair<iw, jg<esd>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<iw, jg<esd>> a(Set<jg<esd>> $$0, dkc $$1, dkv $$2, boolean $$3, eta $$4, dje $$5) {
      for (jg<esd> $$6 : $$0) {
         esf $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != esf.b) {
            if (!$$3 && $$7 == esf.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            edd $$8 = $$1.a($$5.h, $$5.i, eee.d);
            esl $$9 = $$2.a(jz.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dkv $$0, esl $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dky $$0, edd $$1, dkv $$2) {
      dje $$3 = $$1.f();
      if (!ac.a($$3)) {
         jz $$4 = jz.a($$3, $$0.aq());
         iw $$5 = $$4.j();
         jt<esd> $$6 = $$0.J_().f(mi.be);
         Map<Integer, List<esd>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<dlm.b> $$8 = this.c.get();
         eie $$9 = new eie(new eig(ehu.a()));
         long $$10 = $$9.a($$0.E(), $$5.u(), $$5.w());
         Set<jg<dlc>> $$11 = new ObjectArraySet();
         dje.a($$4.r(), 1).forEach($$2x -> {
            edd $$3x = $$0.a($$2x.h, $$2x.i);

            for (edo $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jt<erh> $$13 = $$0.J_().f(mi.bb);
            int $$14 = Math.max(ehb.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (esd $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> $$6.d($$18).map(Object::toString).orElseGet($$18::toString);

                     try {
                        $$0.a($$19);
                        $$2.a($$4, $$18).forEach($$5x -> $$5x.a($$0, $$2, this, $$9, a($$1), $$3));
                     } catch (Exception var29) {
                        p $$21 = p.a(var29, "Feature placement");
                        $$21.a("Feature").a("Description", $$19::get);
                        throw new aa($$21);
                     }

                     $$16++;
                  }
               }

               if ($$15 < $$12) {
                  IntSet $$22 = new IntArraySet();

                  for (jg<dlc> $$23 : $$11) {
                     List<jk<erh>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jk<erh> $$25 = $$24.get($$15);
                        dlm.b $$26 = $$8.get($$15);
                        $$25.a().map(jg::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  dlm.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     erh $$32 = $$29.a().get($$31);
                     Supplier<String> $$33 = () -> $$13.d($$32).map(Object::toString).orElseGet($$32::toString);
                     $$9.b($$10, $$31, $$15);

                     try {
                        $$0.a($$33);
                        $$32.b($$0, this, $$9, $$5);
                     } catch (Exception var30) {
                        p $$35 = p.a(var30, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new aa($$35);
                     }
                  }
               }
            }

            $$0.a(null);
         } catch (Exception var31) {
            p $$37 = p.a(var31, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.h).a("CenterZ", $$3.i).a("Decoration Seed", $$10);
            throw new aa($$37);
         }
      }
   }

   private static erv a(edd $$0) {
      dje $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dkb $$4 = $$0.B();
      int $$5 = $$4.K_() + 1;
      int $$6 = $$4.ao();
      return new erv($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(asc var1, dkv var2, eht var3, edd var4);

   public abstract void a(asc var1);

   public int a(dkb $$0) {
      return 64;
   }

   public dlg d() {
      return this.b;
   }

   public abstract int e();

   public btd<dlo.c> a(jg<dlc> $$0, dkv $$1, bxz $$2, iw $$3) {
      Map<esd, LongSet> $$4 = $$1.b($$3);

      for (Entry<esd, LongSet> $$5 : $$4.entrySet()) {
         esd $$6 = $$5.getKey();
         esk $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<esl> $$9 = $$7.a() == esk.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
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

   public void a(ju $$0, edf $$1, dkv $$2, edd $$3, ewg $$4, alj<djz> $$5) {
      dje $$6 = $$3.f();
      jz $$7 = jz.a($$3);
      eht $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         eta $$10 = $$9.a().b();
         List<esj.a> $$11 = $$9.a().a();

         for (esj.a $$12 : $$11) {
            esl $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<esj.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               eie $$15 = new eie(new ehg(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (esj.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (esj.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  esj.a $$21 = $$14.get($$19);
                  if (this.a($$21, $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5)) {
                     return;
                  }

                  $$14.remove($$19);
                  $$16 -= $$21.b();
               }
            }
         }
      });
   }

   private boolean a(esj.a $$0, dkv $$1, ju $$2, eht $$3, ewg $$4, long $$5, edd $$6, dje $$7, jz $$8, alj<djz> $$9) {
      esd $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      jk<dlc> $$12 = $$10.a();
      Predicate<jg<dlc>> $$13 = $$12::a;
      esl $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dkv $$0, edd $$1, jz $$2, esd $$3) {
      esl $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dky $$0, dkv $$1, edd $$2) {
      int $$3 = 8;
      dje $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      jz $$9 = jz.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dje.c($$10, $$11);

            for (esl $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     agq.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  p $$15 = p.a(var21, "Generating structure reference");
                  q $$16 = $$15.a("Structure");
                  Optional<? extends jt<esd>> $$17 = $$0.J_().a(mi.be);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> mh.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new aa($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<edd> a(eih var1, eht var2, dkv var3, edd var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, ehf.a var3, dkb var4, eht var5);

   public abstract dkl a(int var1, int var2, dkb var3, eht var4);

   public int b(int $$0, int $$1, ehf.a $$2, dkb $$3, eht $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, ehf.a $$2, dkb $$3, eht $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, eht var2, iw var3);

   @Deprecated
   public dld a(jg<dlc> $$0) {
      return this.d.apply($$0);
   }
}
