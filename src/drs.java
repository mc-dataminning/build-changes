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

public class drs {
   private static final Logger b = LogUtils.getLogger();
   public static final drs a = new drs(cym.a);
   private static final String c = "Indices";
   private static final ii[] d = ii.values();
   private final EnumSet<ii> e = EnumSet.noneOf(ii.class);
   private final List<etq<dby>> f = Lists.newArrayList();
   private final List<etq<ekr>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dby, drs.a> i = new IdentityHashMap<>();
   static final Set<drs.a> j = Sets.newHashSet();

   private drs(cyz $$0) {
      this.h = new int[$$0.am()][];
   }

   public drs(tm $$0, cyz $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         tm $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> kr.e.b(ajt.a($$0x)).or(() -> Optional.of(dca.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kr.c.b(ajt.a($$0x)).or(() -> Optional.of(ekt.a)), this.g);
   }

   private static <T> void a(tm $$0, String $$1, Function<String, Optional<T>> $$2, List<etq<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (uj $$5 : $$0.c($$1, 10)) {
            etq.a((tm)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(drf $$0) {
      this.b($$0);

      for (ii $$1 : d) {
         a($$0, $$1);
      }

      cyx $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dby $$2x = $$1x.a() == dca.a ? $$2.a_($$1x.b()).b() : (dby)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ekr $$2x = $$1x.a() == ekt.a ? $$2.b_($$1x.b()).a() : (ekr)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(drf $$0, ii $$1) {
      cyx $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ih> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ih.f);
         boolean $$7 = $$3.contains(ih.e);
         boolean $$8 = $$3.contains(ih.d);
         boolean $$9 = $$3.contains(ih.c);
         boolean $$10 = $$3.size() == 1;
         cye $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ih[] $$16 = ih.values();
         ib.a $$17 = new ib.a();

         for (ib $$18 : ib.b($$12, $$2.I_(), $$14, $$13, $$2.al() - 1, $$15)) {
            doz $$19 = $$2.a_($$18);
            doz $$20 = $$19;

            for (ih $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dby.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static doz a(doz $$0, ih $$1, cyy $$2, ib $$3, ib $$4) {
      return i.getOrDefault($$0.b(), drs.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(drf $$0) {
      ib.a $$1 = new ib.a();
      ib.a $$2 = new ib.a();
      cye $$3 = $$0.f();
      cyy $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         drg $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ih[] $$8 = ih.values();
            drn<doz> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = je.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               doz $$16 = $$9.a($$12);
               doz $$17 = $$16;

               for (ih $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (je.a($$1.u()) == $$3.e && je.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dby.a($$16, $$17, $$4, $$1, 18);
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

   public tm b() {
      tm $$0 = new tm();
      tm $$1 = new tm();

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
         ts $$6 = new ts();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> kr.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ts $$7 = new ts();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> kr.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      doz a(doz var1, ih var2, doz var3, cyy var4, ib var5, ib var6);

      default void a(cyy $$0) {
      }
   }

   static enum b implements drs.a {
      a(
         dca.kO,
         dca.ed,
         dca.lM,
         dca.lN,
         dca.lO,
         dca.lP,
         dca.lQ,
         dca.lR,
         dca.lS,
         dca.lT,
         dca.lU,
         dca.lV,
         dca.lW,
         dca.lX,
         dca.lY,
         dca.lZ,
         dca.ma,
         dca.mb,
         dca.gS,
         dca.gT,
         dca.gU,
         dca.fA,
         dca.L,
         dca.I,
         dca.K,
         dca.cE,
         dca.cF,
         dca.cG,
         dca.cH,
         dca.cI,
         dca.cJ,
         dca.cK,
         dca.cR,
         dca.cS,
         dca.cT,
         dca.cU,
         dca.cW,
         dca.cX,
         dca.da,
         dca.db,
         dca.dc,
         dca.dd,
         dca.df,
         dca.dg,
         dca.dl,
         dca.dm,
         dca.dn,
         dca.do,
         dca.dq,
         dca.dr
      ) {
         @Override
         public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dca.cv, dca.gV) {
         @Override
         public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(ddb.d) == dpr.a && $$2.c(ddb.d) == dpr.a) {
               ih $$6 = $$0.c(ddb.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(ddb.c)) {
                  dpr $$7 = $$1 == $$6.h() ? dpr.b : dpr.c;
                  $$3.a($$5, $$2.a(ddb.d, $$7.a()), 18);
                  if ($$6 == ih.c || $$6 == ih.f) {
                     dmf $$8 = $$3.c_($$4);
                     dmf $$9 = $$3.c_($$5);
                     if ($$8 instanceof dmm && $$9 instanceof dmm) {
                        dmm.a((dmm)$$8, (dmm)$$9);
                     }
                  }

                  return $$0.a(ddb.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dca.aI, dca.aJ, dca.aG, dca.aK, dca.aH, dca.aE, dca.aF) {
         private final ThreadLocal<List<ObjectSet<ib>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
            doz $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dpp.aC);
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
         public void a(cyy $$0) {
            ib.a $$1 = new ib.a();
            List<ObjectSet<ib>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ib> $$5 = $$2.get($$4);
               ObjectSet<ib> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ib $$7 = (ib)var8.next();
                  doz $$8 = $$0.a_($$7);
                  if ($$8.c(dpp.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dpp.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ih $$9 : f) {
                           $$1.a($$7, $$9);
                           doz $$10 = $$0.a_($$1);
                           if ($$10.b(dpp.aC) && $$8.c(dpp.aC) > $$3) {
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
      e(dca.fe, dca.fd) {
         @Override
         public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
            if ($$0.c(djt.c) == 7) {
               dby $$6 = $$0.a(dca.fd) ? dca.eZ : dca.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dca.fd) ? dca.fb : dca.fc).n().a(dft.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ih[] f = ih.values();

      b(dby... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, dby... $$1) {
         for (dby $$2 : $$1) {
            drs.i.put($$2, this);
         }

         if ($$0) {
            drs.j.add(this);
         }
      }
   }
}
