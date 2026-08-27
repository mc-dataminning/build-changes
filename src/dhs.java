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

public class dhs {
   private static final Logger b = LogUtils.getLogger();
   public static final dhs a = new dhs(coz.a);
   private static final String c = "Indices";
   private static final hc[] d = hc.values();
   private final EnumSet<hc> e = EnumSet.noneOf(hc.class);
   private final List<eiq<csk>> f = Lists.newArrayList();
   private final List<eiq<eaa>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<csk, dhs.a> i = new IdentityHashMap<>();
   static final Set<dhs.a> j = Sets.newHashSet();

   private dhs(cpm $$0) {
      this.h = new int[$$0.ak()][];
   }

   public dhs(qs $$0, cpm $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         qs $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (hc $$6 : hc.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> jc.f.b(aep.a($$0x)).or(() -> Optional.of(csl.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> jc.d.b(aep.a($$0x)).or(() -> Optional.of(eac.a)), this.g);
   }

   private static <T> void a(qs $$0, String $$1, Function<String, Optional<T>> $$2, List<eiq<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (rl $$5 : $$0.c($$1, 10)) {
            eiq.a((qs)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dhf $$0) {
      this.b($$0);

      for (hc $$1 : d) {
         a($$0, $$1);
      }

      cpk $$2 = $$0.F();
      this.f.forEach($$1x -> {
         csk $$2x = $$1x.a() == csl.a ? $$2.a_($$1x.b()).b() : (csk)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eaa $$2x = $$1x.a() == eac.a ? $$2.b_($$1x.b()).a() : (eaa)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dhf $$0, hc $$1) {
      cpk $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<hb> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(hb.f);
         boolean $$7 = $$3.contains(hb.e);
         boolean $$8 = $$3.contains(hb.d);
         boolean $$9 = $$3.contains(hb.c);
         boolean $$10 = $$3.size() == 1;
         cor $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         hb[] $$16 = hb.values();
         gv.a $$17 = new gv.a();

         for (gv $$18 : gv.b($$12, $$2.C_(), $$14, $$13, $$2.aj() - 1, $$15)) {
            dey $$19 = $$2.a_($$18);
            dey $$20 = $$19;

            for (hb $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            csk.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dey a(dey $$0, hb $$1, cpl $$2, gv $$3, gv $$4) {
      return i.getOrDefault($$0.b(), dhs.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dhf $$0) {
      gv.a $$1 = new gv.a();
      gv.a $$2 = new gv.a();
      cor $$3 = $$0.f();
      cpl $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dhg $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            hb[] $$8 = hb.values();
            dhn<dey> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = hy.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dey $$16 = $$9.a($$12);
               dey $$17 = $$16;

               for (hb $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (hy.a($$1.u()) == $$3.e && hy.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               csk.a($$16, $$17, $$4, $$1, 18);
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

   public qs b() {
      qs $$0 = new qs();
      qs $$1 = new qs();

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

      for (hc $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         qy $$6 = new qy();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> jc.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         qy $$7 = new qy();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> jc.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dey a(dey var1, hb var2, dey var3, cpl var4, gv var5, gv var6);

      default void a(cpl $$0) {
      }
   }

   static enum b implements dhs.a {
      a(
         csl.kO,
         csl.ee,
         csl.lM,
         csl.lN,
         csl.lO,
         csl.lP,
         csl.lQ,
         csl.lR,
         csl.lS,
         csl.lT,
         csl.lU,
         csl.lV,
         csl.lW,
         csl.lX,
         csl.lY,
         csl.lZ,
         csl.ma,
         csl.mb,
         csl.gS,
         csl.gT,
         csl.gU,
         csl.fA,
         csl.L,
         csl.I,
         csl.K,
         csl.cE,
         csl.cF,
         csl.cG,
         csl.cH,
         csl.cI,
         csl.cJ,
         csl.cK,
         csl.cR,
         csl.cS,
         csl.cT,
         csl.cU,
         csl.cW,
         csl.cX,
         csl.da,
         csl.db,
         csl.dc,
         csl.dd,
         csl.df,
         csl.dg,
         csl.dl,
         csl.dm,
         csl.dn,
         csl.do,
         csl.dq,
         csl.dr
      ) {
         @Override
         public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(csl.cv, csl.gV) {
         @Override
         public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(ctm.c) == dfq.a && $$2.c(ctm.c) == dfq.a) {
               hb $$6 = $$0.c(ctm.b);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(ctm.b)) {
                  dfq $$7 = $$1 == $$6.h() ? dfq.b : dfq.c;
                  $$3.a($$5, $$2.a(ctm.c, $$7.a()), 18);
                  if ($$6 == hb.c || $$6 == hb.f) {
                     dck $$8 = $$3.c_($$4);
                     dck $$9 = $$3.c_($$5);
                     if ($$8 instanceof dcr && $$9 instanceof dcr) {
                        dcr.a((dcr)$$8, (dcr)$$9);
                     }
                  }

                  return $$0.a(ctm.c, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, csl.aI, csl.aJ, csl.aG, csl.aK, csl.aH, csl.aE, csl.aF) {
         private final ThreadLocal<List<ObjectSet<gv>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
            dey $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dfo.aC);
               List<ObjectSet<gv>> $$8 = this.g.get();
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
         public void a(cpl $$0) {
            gv.a $$1 = new gv.a();
            List<ObjectSet<gv>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<gv> $$5 = $$2.get($$4);
               ObjectSet<gv> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  gv $$7 = (gv)var8.next();
                  dey $$8 = $$0.a_($$7);
                  if ($$8.c(dfo.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dfo.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (hb $$9 : f) {
                           $$1.a($$7, $$9);
                           dey $$10 = $$0.a_($$1);
                           if ($$10.b(dfo.aC) && $$8.c(dfo.aC) > $$3) {
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
      e(csl.fe, csl.fd) {
         @Override
         public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
            if ($$0.c(dag.b) == 7) {
               dah $$6 = ((dag)$$0.b()).a();
               if ($$2.a($$6)) {
                  return $$6.b().n().a(cwd.aC, $$1);
               }
            }

            return $$0;
         }
      };

      public static final hb[] f = hb.values();

      b(csk... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, csk... $$1) {
         for (csk $$2 : $$1) {
            dhs.i.put($$2, this);
         }

         if ($$0) {
            dhs.j.add(this);
         }
      }
   }
}
