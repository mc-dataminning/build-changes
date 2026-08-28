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

public class dyg {
   private static final Logger b = LogUtils.getLogger();
   public static final dyg a = new dyg(deu.a);
   private static final String c = "Indices";
   private static final jn[] d = jn.values();
   private final EnumSet<jn> e = EnumSet.noneOf(jn.class);
   private final List<fbi<dij>> f = Lists.newArrayList();
   private final List<fbi<ern>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dij, dyg.a> i = new IdentityHashMap<>();
   static final Set<dyg.a> j = Sets.newHashSet();

   private dyg(dfh $$0) {
      this.h = new int[$$0.am()][];
   }

   public dyg(un $$0, dfh $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         un $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jn $$6 : jn.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lz.e.b(all.c($$0x)).or(() -> Optional.of(dil.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lz.c.b(all.c($$0x)).or(() -> Optional.of(erp.a)), this.g);
   }

   private dyg(dyg $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(un $$0, String $$1, Function<String, Optional<T>> $$2, List<fbi<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vk $$5 : $$0.c($$1, 10)) {
            fbi.a((un)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dxt $$0) {
      this.b($$0);

      for (jn $$1 : d) {
         a($$0, $$1);
      }

      dff $$2 = $$0.E();
      this.f.forEach($$1x -> {
         dij $$2x = $$1x.a() == dil.a ? $$2.a_($$1x.b()).b() : (dij)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ern $$2x = $$1x.a() == erp.a ? $$2.b_($$1x.b()).a() : (ern)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dxt $$0, jn $$1) {
      dff $$2 = $$0.E();
      if ($$0.q().e.remove($$1)) {
         Set<jm> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jm.f);
         boolean $$7 = $$3.contains(jm.e);
         boolean $$8 = $$3.contains(jm.d);
         boolean $$9 = $$3.contains(jm.c);
         boolean $$10 = $$3.size() == 1;
         del $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jm[] $$16 = jm.values();
         jh.a $$17 = new jh.a();

         for (jh $$18 : jh.b($$12, $$2.I_(), $$14, $$13, $$2.al(), $$15)) {
            dvo $$19 = $$2.a_($$18);
            dvo $$20 = $$19;

            for (jm $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dij.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dvo a(dvo $$0, jm $$1, dfg $$2, jh $$3, jh $$4) {
      return i.getOrDefault($$0.b(), dyg.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dxt $$0) {
      jh.a $$1 = new jh.a();
      jh.a $$2 = new jh.a();
      del $$3 = $$0.f();
      dfg $$4 = $$0.E();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dxu $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jm[] $$8 = jm.values();
            dyb<dvo> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kj.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dvo $$16 = $$9.a($$12);
               dvo $$17 = $$16;

               for (jm $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kj.a($$1.u()) == $$3.g && kj.a($$1.w()) == $$3.h) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dij.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.g, $$3.h});
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

   public un b() {
      un $$0 = new un();
      un $$1 = new un();

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

      for (jn $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         ut $$6 = new ut();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lz.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ut $$7 = new ut();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lz.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public dyg c() {
      return this == a ? a : new dyg(this);
   }

   public interface a {
      dvo a(dvo var1, jm var2, dvo var3, dfg var4, jh var5, jh var6);

      default void a(dfg $$0) {
      }
   }

   static enum b implements dyg.a {
      a(
         dil.kO,
         dil.ed,
         dil.lM,
         dil.lN,
         dil.lO,
         dil.lP,
         dil.lQ,
         dil.lR,
         dil.lS,
         dil.lT,
         dil.lU,
         dil.lV,
         dil.lW,
         dil.lX,
         dil.lY,
         dil.lZ,
         dil.ma,
         dil.mb,
         dil.gS,
         dil.gT,
         dil.gU,
         dil.fA,
         dil.L,
         dil.I,
         dil.K,
         dil.cE,
         dil.cF,
         dil.cG,
         dil.cH,
         dil.cI,
         dil.cJ,
         dil.cK,
         dil.cR,
         dil.cS,
         dil.cT,
         dil.cU,
         dil.cW,
         dil.cX,
         dil.da,
         dil.db,
         dil.dc,
         dil.dd,
         dil.df,
         dil.dg,
         dil.dl,
         dil.dm,
         dil.dn,
         dil.do,
         dil.dq,
         dil.dr
      ) {
         @Override
         public dvo a(dvo $$0, jm $$1, dvo $$2, dfg $$3, jh $$4, jh $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dvo a(dvo $$0, jm $$1, dvo $$2, dfg $$3, jh $$4, jh $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.E_());
         }
      },
      c(dil.cv, dil.gV) {
         @Override
         public dvo a(dvo $$0, jm $$1, dvo $$2, dfg $$3, jh $$4, jh $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(djm.d) == dwg.a && $$2.c(djm.d) == dwg.a) {
               jm $$6 = $$0.c(djm.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(djm.c)) {
                  dwg $$7 = $$1 == $$6.h() ? dwg.b : dwg.c;
                  $$3.a($$5, $$2.b(djm.d, $$7.a()), 18);
                  if ($$6 == jm.c || $$6 == jm.f) {
                     dsr $$8 = $$3.c_($$4);
                     dsr $$9 = $$3.c_($$5);
                     if ($$8 instanceof dsy && $$9 instanceof dsy) {
                        dsy.a((dsy)$$8, (dsy)$$9);
                     }
                  }

                  return $$0.b(djm.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dil.aI, dil.aJ, dil.aG, dil.aK, dil.aH, dil.aE, dil.aF) {
         private final ThreadLocal<List<ObjectSet<jh>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dvo a(dvo $$0, jm $$1, dvo $$2, dfg $$3, jh $$4, jh $$5) {
            dvo $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.E_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dwe.aC);
               List<ObjectSet<jh>> $$8 = this.g.get();
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
         public void a(dfg $$0) {
            jh.a $$1 = new jh.a();
            List<ObjectSet<jh>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jh> $$5 = $$2.get($$4);
               ObjectSet<jh> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jh $$7 = (jh)var8.next();
                  dvo $$8 = $$0.a_($$7);
                  if ($$8.c(dwe.aC) >= $$4) {
                     $$0.a($$7, $$8.b(dwe.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jm $$9 : f) {
                           $$1.a($$7, $$9);
                           dvo $$10 = $$0.a_($$1);
                           if ($$10.b(dwe.aC) && $$8.c(dwe.aC) > $$3) {
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
      e(dil.fe, dil.fd) {
         @Override
         public dvo a(dvo $$0, jm $$1, dvo $$2, dfg $$3, jh $$4, jh $$5) {
            if ($$0.c(dqf.c) == 7) {
               dij $$6 = $$0.a(dil.fd) ? dil.eZ : dil.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dil.fd) ? dil.fb : dil.fc).m().b(dme.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jm[] f = jm.values();

      b(final dij... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dij... $$1) {
         for (dij $$2 : $$1) {
            dyg.i.put($$2, this);
         }

         if ($$0) {
            dyg.j.add(this);
         }
      }
   }
}
