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

public class doy {
   private static final Logger b = LogUtils.getLogger();
   public static final doy a = new doy(cvt.a);
   private static final String c = "Indices";
   private static final ii[] d = ii.values();
   private final EnumSet<ii> e = EnumSet.noneOf(ii.class);
   private final List<eql<czf>> f = Lists.newArrayList();
   private final List<eql<ehq>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<czf, doy.a> i = new IdentityHashMap<>();
   static final Set<doy.a> j = Sets.newHashSet();

   private doy(cwg $$0) {
      this.h = new int[$$0.al()][];
   }

   public doy(sy $$0, cwg $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         sy $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (ii $$6 : ii.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> kh.e.b(ajc.a($$0x)).or(() -> Optional.of(czh.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kh.c.b(ajc.a($$0x)).or(() -> Optional.of(ehs.a)), this.g);
   }

   private static <T> void a(sy $$0, String $$1, Function<String, Optional<T>> $$2, List<eql<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (tv $$5 : $$0.c($$1, 10)) {
            eql.a((sy)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dol $$0) {
      this.b($$0);

      for (ii $$1 : d) {
         a($$0, $$1);
      }

      cwe $$2 = $$0.F();
      this.f.forEach($$1x -> {
         czf $$2x = $$1x.a() == czh.a ? $$2.a_($$1x.b()).b() : (czf)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ehq $$2x = $$1x.a() == ehs.a ? $$2.b_($$1x.b()).a() : (ehq)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dol $$0, ii $$1) {
      cwe $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ih> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ih.f);
         boolean $$7 = $$3.contains(ih.e);
         boolean $$8 = $$3.contains(ih.d);
         boolean $$9 = $$3.contains(ih.c);
         boolean $$10 = $$3.size() == 1;
         cvl $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ih[] $$16 = ih.values();
         ib.a $$17 = new ib.a();

         for (ib $$18 : ib.b($$12, $$2.J_(), $$14, $$13, $$2.ak() - 1, $$15)) {
            dme $$19 = $$2.a_($$18);
            dme $$20 = $$19;

            for (ih $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            czf.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dme a(dme $$0, ih $$1, cwf $$2, ib $$3, ib $$4) {
      return i.getOrDefault($$0.b(), doy.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dol $$0) {
      ib.a $$1 = new ib.a();
      ib.a $$2 = new ib.a();
      cvl $$3 = $$0.f();
      cwf $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dom $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ih[] $$8 = ih.values();
            dot<dme> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jd.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dme $$16 = $$9.a($$12);
               dme $$17 = $$16;

               for (ih $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jd.a($$1.u()) == $$3.e && jd.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               czf.a($$16, $$17, $$4, $$1, 18);
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

   public sy b() {
      sy $$0 = new sy();
      sy $$1 = new sy();

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

      for (ii $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         te $$6 = new te();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> kh.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         te $$7 = new te();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> kh.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dme a(dme var1, ih var2, dme var3, cwf var4, ib var5, ib var6);

      default void a(cwf $$0) {
      }
   }

   static enum b implements doy.a {
      a(
         czh.kO,
         czh.ed,
         czh.lM,
         czh.lN,
         czh.lO,
         czh.lP,
         czh.lQ,
         czh.lR,
         czh.lS,
         czh.lT,
         czh.lU,
         czh.lV,
         czh.lW,
         czh.lX,
         czh.lY,
         czh.lZ,
         czh.ma,
         czh.mb,
         czh.gS,
         czh.gT,
         czh.gU,
         czh.fA,
         czh.L,
         czh.I,
         czh.K,
         czh.cE,
         czh.cF,
         czh.cG,
         czh.cH,
         czh.cI,
         czh.cJ,
         czh.cK,
         czh.cR,
         czh.cS,
         czh.cT,
         czh.cU,
         czh.cW,
         czh.cX,
         czh.da,
         czh.db,
         czh.dc,
         czh.dd,
         czh.df,
         czh.dg,
         czh.dl,
         czh.dm,
         czh.dn,
         czh.do,
         czh.dq,
         czh.dr
      ) {
         @Override
         public dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(czh.cv, czh.gV) {
         @Override
         public dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dai.d) == dmw.a && $$2.c(dai.d) == dmw.a) {
               ih $$6 = $$0.c(dai.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dai.c)) {
                  dmw $$7 = $$1 == $$6.h() ? dmw.b : dmw.c;
                  $$3.a($$5, $$2.a(dai.d, $$7.a()), 18);
                  if ($$6 == ih.c || $$6 == ih.f) {
                     djl $$8 = $$3.c_($$4);
                     djl $$9 = $$3.c_($$5);
                     if ($$8 instanceof djs && $$9 instanceof djs) {
                        djs.a((djs)$$8, (djs)$$9);
                     }
                  }

                  return $$0.a(dai.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, czh.aI, czh.aJ, czh.aG, czh.aK, czh.aH, czh.aE, czh.aF) {
         private final ThreadLocal<List<ObjectSet<ib>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
            dme $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dmu.aC);
               List<ObjectSet<ib>> $$8 = this.g.get();
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
         public void a(cwf $$0) {
            ib.a $$1 = new ib.a();
            List<ObjectSet<ib>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ib> $$5 = $$2.get($$4);
               ObjectSet<ib> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ib $$7 = (ib)var8.next();
                  dme $$8 = $$0.a_($$7);
                  if ($$8.c(dmu.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dmu.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ih $$9 : f) {
                           $$1.a($$7, $$9);
                           dme $$10 = $$0.a_($$1);
                           if ($$10.b(dmu.aC) && $$8.c(dmu.aC) > $$3) {
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
      e(czh.fe, czh.fd) {
         @Override
         public dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
            if ($$0.c(dha.c) == 7) {
               czf $$6 = $$0.a(czh.fd) ? czh.eZ : czh.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(czh.fd) ? czh.fb : czh.fc).o().a(dda.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ih[] f = ih.values();

      b(czf... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, czf... $$1) {
         for (czf $$2 : $$1) {
            doy.i.put($$2, this);
         }

         if ($$0) {
            doy.j.add(this);
         }
      }
   }
}
