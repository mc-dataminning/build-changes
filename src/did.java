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

public class did {
   private static final Logger b = LogUtils.getLogger();
   public static final did a = new did(cpk.a);
   private static final String c = "Indices";
   private static final hb[] d = hb.values();
   private final EnumSet<hb> e = EnumSet.noneOf(hb.class);
   private final List<eiy<csv>> f = Lists.newArrayList();
   private final List<eiy<eal>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<csv, did.a> i = new IdentityHashMap<>();
   static final Set<did.a> j = Sets.newHashSet();

   private did(cpx $$0) {
      this.h = new int[$$0.ak()][];
   }

   public did(qw $$0, cpx $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         qw $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (hb $$6 : hb.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> jb.f.b(aew.a($$0x)).or(() -> Optional.of(csw.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> jb.d.b(aew.a($$0x)).or(() -> Optional.of(ean.a)), this.g);
   }

   private static <T> void a(qw $$0, String $$1, Function<String, Optional<T>> $$2, List<eiy<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (rq $$5 : $$0.c($$1, 10)) {
            eiy.a((qw)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dhq $$0) {
      this.b($$0);

      for (hb $$1 : d) {
         a($$0, $$1);
      }

      cpv $$2 = $$0.F();
      this.f.forEach($$1x -> {
         csv $$2x = $$1x.a() == csw.a ? $$2.a_($$1x.b()).b() : (csv)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eal $$2x = $$1x.a() == ean.a ? $$2.b_($$1x.b()).a() : (eal)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dhq $$0, hb $$1) {
      cpv $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ha> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ha.f);
         boolean $$7 = $$3.contains(ha.e);
         boolean $$8 = $$3.contains(ha.d);
         boolean $$9 = $$3.contains(ha.c);
         boolean $$10 = $$3.size() == 1;
         cpc $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ha[] $$16 = ha.values();
         gw.a $$17 = new gw.a();

         for (gw $$18 : gw.b($$12, $$2.H_(), $$14, $$13, $$2.aj() - 1, $$15)) {
            dfj $$19 = $$2.a_($$18);
            dfj $$20 = $$19;

            for (ha $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            csv.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dfj a(dfj $$0, ha $$1, cpw $$2, gw $$3, gw $$4) {
      return i.getOrDefault($$0.b(), did.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dhq $$0) {
      gw.a $$1 = new gw.a();
      gw.a $$2 = new gw.a();
      cpc $$3 = $$0.f();
      cpw $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dhr $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ha[] $$8 = ha.values();
            dhy<dfj> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = hw.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dfj $$16 = $$9.a($$12);
               dfj $$17 = $$16;

               for (ha $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (hw.a($$1.u()) == $$3.e && hw.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               csv.a($$16, $$17, $$4, $$1, 18);
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

   public qw b() {
      qw $$0 = new qw();
      qw $$1 = new qw();

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

      for (hb $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         rc $$6 = new rc();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> jb.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         rc $$7 = new rc();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> jb.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dfj a(dfj var1, ha var2, dfj var3, cpw var4, gw var5, gw var6);

      default void a(cpw $$0) {
      }
   }

   static enum b implements did.a {
      a(
         csw.kO,
         csw.ee,
         csw.lM,
         csw.lN,
         csw.lO,
         csw.lP,
         csw.lQ,
         csw.lR,
         csw.lS,
         csw.lT,
         csw.lU,
         csw.lV,
         csw.lW,
         csw.lX,
         csw.lY,
         csw.lZ,
         csw.ma,
         csw.mb,
         csw.gS,
         csw.gT,
         csw.gU,
         csw.fA,
         csw.L,
         csw.I,
         csw.K,
         csw.cE,
         csw.cF,
         csw.cG,
         csw.cH,
         csw.cI,
         csw.cJ,
         csw.cK,
         csw.cR,
         csw.cS,
         csw.cT,
         csw.cU,
         csw.cW,
         csw.cX,
         csw.da,
         csw.db,
         csw.dc,
         csw.dd,
         csw.df,
         csw.dg,
         csw.dl,
         csw.dm,
         csw.dn,
         csw.do,
         csw.dq,
         csw.dr
      ) {
         @Override
         public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(csw.cv, csw.gV) {
         @Override
         public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(ctx.c) == dgb.a && $$2.c(ctx.c) == dgb.a) {
               ha $$6 = $$0.c(ctx.b);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(ctx.b)) {
                  dgb $$7 = $$1 == $$6.h() ? dgb.b : dgb.c;
                  $$3.a($$5, $$2.a(ctx.c, $$7.a()), 18);
                  if ($$6 == ha.c || $$6 == ha.f) {
                     dcv $$8 = $$3.c_($$4);
                     dcv $$9 = $$3.c_($$5);
                     if ($$8 instanceof ddc && $$9 instanceof ddc) {
                        ddc.a((ddc)$$8, (ddc)$$9);
                     }
                  }

                  return $$0.a(ctx.c, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, csw.aI, csw.aJ, csw.aG, csw.aK, csw.aH, csw.aE, csw.aF) {
         private final ThreadLocal<List<ObjectSet<gw>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
            dfj $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dfz.aC);
               List<ObjectSet<gw>> $$8 = this.g.get();
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
         public void a(cpw $$0) {
            gw.a $$1 = new gw.a();
            List<ObjectSet<gw>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<gw> $$5 = $$2.get($$4);
               ObjectSet<gw> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  gw $$7 = (gw)var8.next();
                  dfj $$8 = $$0.a_($$7);
                  if ($$8.c(dfz.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dfz.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ha $$9 : f) {
                           $$1.a($$7, $$9);
                           dfj $$10 = $$0.a_($$1);
                           if ($$10.b(dfz.aC) && $$8.c(dfz.aC) > $$3) {
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
      e(csw.fe, csw.fd) {
         @Override
         public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
            if ($$0.c(dar.b) == 7) {
               das $$6 = ((dar)$$0.b()).a();
               if ($$2.a($$6)) {
                  return $$6.b().n().a(cwo.aC, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ha[] f = ha.values();

      b(csv... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, csv... $$1) {
         for (csv $$2 : $$1) {
            did.i.put($$2, this);
         }

         if ($$0) {
            did.j.add(this);
         }
      }
   }
}
