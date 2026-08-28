import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
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

public class dvd {
   private static final Logger b = LogUtils.getLogger();
   public static final dvd a = new dvd(dbu.a);
   private static final String c = "Indices";
   private static final jg[] d = jg.values();
   private final EnumSet<jg> e = EnumSet.noneOf(jg.class);
   private final List<exv<dfh>> f = Lists.newArrayList();
   private final List<exv<eog>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dfh, dvd.a> i = new IdentityHashMap<>();
   static final Set<dvd.a> j = Sets.newHashSet();

   private dvd(dch $$0) {
      this.h = new int[$$0.an()][];
   }

   public dvd(tx $$0, dch $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         tx $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jg $$6 : jg.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lq.e.b(akk.a($$0x)).or(() -> Optional.of(dfj.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lq.c.b(akk.a($$0x)).or(() -> Optional.of(eoi.a)), this.g);
   }

   private static <T> void a(tx $$0, String $$1, Function<String, Optional<T>> $$2, List<exv<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (uu $$5 : $$0.c($$1, 10)) {
            exv.a((tx)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(duq $$0) {
      this.b($$0);

      for (jg $$1 : d) {
         a($$0, $$1);
      }

      dcf $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dfh $$2x = $$1x.a() == dfj.a ? $$2.a_($$1x.b()).b() : (dfh)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eog $$2x = $$1x.a() == eoi.a ? $$2.b_($$1x.b()).a() : (eog)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(duq $$0, jg $$1) {
      dcf $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<jf> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jf.f);
         boolean $$7 = $$3.contains(jf.e);
         boolean $$8 = $$3.contains(jf.d);
         boolean $$9 = $$3.contains(jf.c);
         boolean $$10 = $$3.size() == 1;
         dbm $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jf[] $$16 = jf.values();
         ja.a $$17 = new ja.a();

         for (ja $$18 : ja.b($$12, $$2.I_(), $$14, $$13, $$2.am() - 1, $$15)) {
            dsk $$19 = $$2.a_($$18);
            dsk $$20 = $$19;

            for (jf $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dfh.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dsk a(dsk $$0, jf $$1, dcg $$2, ja $$3, ja $$4) {
      return i.getOrDefault($$0.b(), dvd.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(duq $$0) {
      ja.a $$1 = new ja.a();
      ja.a $$2 = new ja.a();
      dbm $$3 = $$0.f();
      dcg $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dur $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jf[] $$8 = jf.values();
            duy<dsk> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = kc.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dsk $$16 = $$9.a($$12);
               dsk $$17 = $$16;

               for (jf $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kc.a($$1.u()) == $$3.e && kc.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dfh.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.g($$19), $$3.e, $$3.f});
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

   public tx b() {
      tx $$0 = new tx();
      tx $$1 = new tx();

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

      for (jg $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         ud $$6 = new ud();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lq.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ud $$7 = new ud();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lq.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dsk a(dsk var1, jf var2, dsk var3, dcg var4, ja var5, ja var6);

      default void a(dcg $$0) {
      }
   }

   static enum b implements dvd.a {
      a(
         dfj.kO,
         dfj.ed,
         dfj.lM,
         dfj.lN,
         dfj.lO,
         dfj.lP,
         dfj.lQ,
         dfj.lR,
         dfj.lS,
         dfj.lT,
         dfj.lU,
         dfj.lV,
         dfj.lW,
         dfj.lX,
         dfj.lY,
         dfj.lZ,
         dfj.ma,
         dfj.mb,
         dfj.gS,
         dfj.gT,
         dfj.gU,
         dfj.fA,
         dfj.L,
         dfj.I,
         dfj.K,
         dfj.cE,
         dfj.cF,
         dfj.cG,
         dfj.cH,
         dfj.cI,
         dfj.cJ,
         dfj.cK,
         dfj.cR,
         dfj.cS,
         dfj.cT,
         dfj.cU,
         dfj.cW,
         dfj.cX,
         dfj.da,
         dfj.db,
         dfj.dc,
         dfj.dd,
         dfj.df,
         dfj.dg,
         dfj.dl,
         dfj.dm,
         dfj.dn,
         dfj.do,
         dfj.dq,
         dfj.dr
      ) {
         @Override
         public dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dfj.cv, dfj.gV) {
         @Override
         public dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dgk.d) == dtc.a && $$2.c(dgk.d) == dtc.a) {
               jf $$6 = $$0.c(dgk.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dgk.c)) {
                  dtc $$7 = $$1 == $$6.h() ? dtc.b : dtc.c;
                  $$3.a($$5, $$2.a(dgk.d, $$7.a()), 18);
                  if ($$6 == jf.c || $$6 == jf.f) {
                     dpp $$8 = $$3.c_($$4);
                     dpp $$9 = $$3.c_($$5);
                     if ($$8 instanceof dpw && $$9 instanceof dpw) {
                        dpw.a((dpw)$$8, (dpw)$$9);
                     }
                  }

                  return $$0.a(dgk.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dfj.aI, dfj.aJ, dfj.aG, dfj.aK, dfj.aH, dfj.aE, dfj.aF) {
         private final ThreadLocal<List<ObjectSet<ja>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
            dsk $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dta.aC);
               List<ObjectSet<ja>> $$8 = this.g.get();
               if ($$8.isEmpty()) {
                  for (int $$9 = 0; $$9 < 7; $$9++) {
                     $$8.add(new ObjectOpenHashSet());
                  }
               }

               $$8.get($$7).add($$4.i());
            }

            return $$0;
         }

         @Override
         public void a(dcg $$0) {
            ja.a $$1 = new ja.a();
            List<ObjectSet<ja>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ja> $$5 = $$2.get($$4);
               ObjectSet<ja> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ja $$7 = (ja)var8.next();
                  dsk $$8 = $$0.a_($$7);
                  if ($$8.c(dta.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dta.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jf $$9 : f) {
                           $$1.a($$7, $$9);
                           dsk $$10 = $$0.a_($$1);
                           if ($$10.b(dta.aC) && $$8.c(dta.aC) > $$3) {
                              $$6.add($$1.i());
                           }
                        }
                     }
                  }
               }
            }

            $$2.clear();
         }
      },
      e(dfj.fe, dfj.fd) {
         @Override
         public dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
            if ($$0.c(dnd.c) == 7) {
               dfh $$6 = $$0.a(dfj.fd) ? dfj.eZ : dfj.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dfj.fd) ? dfj.fb : dfj.fc).o().a(djd.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jf[] f = jf.values();

      b(final dfh... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dfh... $$1) {
         for (dfh $$2 : $$1) {
            dvd.i.put($$2, this);
         }

         if ($$0) {
            dvd.j.add(this);
         }
      }
   }
}
