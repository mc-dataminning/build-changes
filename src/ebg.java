import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class ebg {
   private static final Logger b = LogUtils.getLogger();
   public static final ebg a = new ebg(dhf.a);
   private static final String c = "Indices";
   private static final jp[] d = jp.values();
   private final EnumSet<jp> e = EnumSet.noneOf(jp.class);
   private final List<fel<dku>> f = Lists.newArrayList();
   private final List<fel<eus>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dku, ebg.a> i = new IdentityHashMap<>();
   static final Set<ebg.a> j = Sets.newHashSet();

   private ebg(dhr $$0) {
      this.h = new int[$$0.ap()][];
   }

   public ebg(tw $$0, dhr $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         tw $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jp $$6 : jp.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> md.e.b(ald.c($$0x)).or(() -> Optional.of(dkw.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> md.c.b(ald.c($$0x)).or(() -> Optional.of(euu.a)), this.g);
   }

   private ebg(ebg $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(tw $$0, String $$1, Function<String, Optional<T>> $$2, List<fel<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (ut $$5 : $$0.c($$1, 10)) {
            fel.a((tw)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(eat $$0) {
      this.b($$0);

      for (jp $$1 : d) {
         a($$0, $$1);
      }

      dhp $$2 = $$0.H();
      this.f.forEach($$1x -> {
         dku $$2x = $$1x.a() == dkw.a ? $$2.a_($$1x.b()).b() : (dku)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eus $$2x = $$1x.a() == euu.a ? $$2.b_($$1x.b()).a() : (eus)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(eat $$0, jp $$1) {
      dhp $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<jo> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jo.f);
         boolean $$7 = $$3.contains(jo.e);
         boolean $$8 = $$3.contains(jo.d);
         boolean $$9 = $$3.contains(jo.c);
         boolean $$10 = $$3.size() == 1;
         dgw $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jo[] $$16 = jo.values();
         jj.a $$17 = new jj.a();

         for (jj $$18 : jj.b($$12, $$2.G_(), $$14, $$13, $$2.ao(), $$15)) {
            dym $$19 = $$2.a_($$18);
            dym $$20 = $$19;

            for (jo $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dku.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dym a(dym $$0, jo $$1, dhq $$2, jj $$3, jj $$4) {
      return i.getOrDefault($$0.b(), ebg.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(eat $$0) {
      jj.a $$1 = new jj.a();
      jj.a $$2 = new jj.a();
      dgw $$3 = $$0.f();
      dhq $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         eau $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jo[] $$8 = jo.values();
            ebb<dym> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kl.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dym $$16 = $$9.a($$12);
               dym $$17 = $$16;

               for (jo $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kl.a($$1.u()) == $$3.h && kl.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dku.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.h, $$3.i});
         }

         this.h[$$19] = null;
      }
   }

   public boolean a() {
      for (int[] $$0 : this.h) {
         if ($$0 != null) {
            return false;
         }
      }

      return this.e.isEmpty();
   }

   public tw b() {
      tw $$0 = new tw();
      tw $$1 = new tw();

      for (int $$2 = 0; $$2 < this.h.length; $$2++) {
         String $$3 = String.valueOf($$2);
         if (this.h[$$2] != null && this.h[$$2].length != 0) {
            $$1.a($$3, this.h[$$2]);
         }
      }

      if (!$$1.g()) {
         $$0.a("Indices", $$1);
      }

      int $$4 = 0;

      for (jp $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         uc $$6 = new uc();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> md.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         uc $$7 = new uc();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> md.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public ebg c() {
      return this == a ? a : new ebg(this);
   }

   public interface a {
      dym a(dym var1, jo var2, dym var3, dhq var4, jj var5, jj var6);

      default void a(dhq $$0) {
      }
   }

   static enum b implements ebg.a {
      a(
         dkw.lq,
         dkw.eq,
         dkw.mo,
         dkw.mp,
         dkw.mq,
         dkw.mr,
         dkw.ms,
         dkw.mt,
         dkw.mu,
         dkw.mv,
         dkw.mw,
         dkw.mx,
         dkw.my,
         dkw.mz,
         dkw.mA,
         dkw.mB,
         dkw.mC,
         dkw.mD,
         dkw.hp,
         dkw.hq,
         dkw.hr,
         dkw.fV,
         dkw.O,
         dkw.L,
         dkw.N,
         dkw.cM,
         dkw.cN,
         dkw.cO,
         dkw.cP,
         dkw.cQ,
         dkw.cR,
         dkw.cS,
         dkw.cT,
         dkw.da,
         dkw.db,
         dkw.dc,
         dkw.dd,
         dkw.df,
         dkw.dg,
         dkw.dh,
         dkw.dk,
         dkw.dl,
         dkw.dm,
         dkw.dn,
         dkw.dp,
         dkw.dq,
         dkw.dr,
         dkw.dw,
         dkw.dx,
         dkw.dy,
         dkw.dz,
         dkw.dB,
         dkw.dC,
         dkw.dD
      ) {
         @Override
         public dym a(dym $$0, jo $$1, dym $$2, dhq $$3, jj $$4, jj $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dym a(dym $$0, jo $$1, dym $$2, dhq $$3, jj $$4, jj $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
         }
      },
      c(dkw.cD, dkw.hs) {
         @Override
         public dym a(dym $$0, jo $$1, dym $$2, dhq $$3, jj $$4, jj $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dlx.d) == dze.a && $$2.c(dlx.d) == dze.a) {
               jo $$6 = $$0.c(dlx.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dlx.c)) {
                  dze $$7 = $$1 == $$6.h() ? dze.b : dze.c;
                  $$3.a($$5, $$2.b(dlx.d, $$7.a()), 18);
                  if ($$6 == jo.c || $$6 == jo.f) {
                     dvl $$8 = $$3.c_($$4);
                     dvl $$9 = $$3.c_($$5);
                     if ($$8 instanceof dvt && $$9 instanceof dvt) {
                        dvt.a((dvt)$$8, (dvt)$$9);
                     }
                  }

                  return $$0.b(dlx.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dkw.aO, dkw.aP, dkw.aM, dkw.aR, dkw.aQ, dkw.aN, dkw.aK, dkw.aL) {
         private final ThreadLocal<List<ObjectSet<jj>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dym a(dym $$0, jo $$1, dym $$2, dhq $$3, jj $$4, jj $$5) {
            dym $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dzc.aF);
               List<ObjectSet<jj>> $$8 = this.g.get();
               if ($$8.isEmpty()) {
                  for (int $$9 = 0; $$9 < 7; $$9++) {
                     $$8.add(new ObjectOpenHashSet());
                  }
               }

               $$8.get($$7).add($$4.j());
            }

            return $$0;
         }

         @Override
         public void a(dhq $$0) {
            jj.a $$1 = new jj.a();
            List<ObjectSet<jj>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jj> $$5 = $$2.get($$4);
               ObjectSet<jj> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jj $$7 = (jj)var8.next();
                  dym $$8 = $$0.a_($$7);
                  if ($$8.c(dzc.aF) >= $$4) {
                     $$0.a($$7, $$8.b(dzc.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jo $$9 : f) {
                           $$1.a($$7, $$9);
                           dym $$10 = $$0.a_($$1);
                           if ($$10.b(dzc.aF) && $$8.c(dzc.aF) > $$3) {
                              $$6.add($$1.j());
                           }
                        }
                     }
                  }
               }
            }

            $$2.clear();
         }
      },
      e(dkw.fs, dkw.fr) {
         @Override
         public dym a(dym $$0, jo $$1, dym $$2, dhq $$3, jj $$4, jj $$5) {
            if ($$0.c(dsw.c) == 7) {
               dku $$6 = $$0.a(dkw.fr) ? dkw.fn : dkw.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(dkw.fr) ? dkw.fp : dkw.fq).m().b(dot.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jo[] f = jo.values();

      b(final dku... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dku... $$1) {
         for (dku $$2 : $$1) {
            ebg.i.put($$2, this);
         }

         if ($$0) {
            ebg.j.add(this);
         }
      }
   }
}
