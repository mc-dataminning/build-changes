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

public class dyn {
   private static final Logger b = LogUtils.getLogger();
   public static final dyn a = new dyn(dfb.a);
   private static final String c = "Indices";
   private static final jn[] d = jn.values();
   private final EnumSet<jn> e = EnumSet.noneOf(jn.class);
   private final List<fbp<diq>> f = Lists.newArrayList();
   private final List<fbp<eru>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<diq, dyn.a> i = new IdentityHashMap<>();
   static final Set<dyn.a> j = Sets.newHashSet();

   private dyn(dfo $$0) {
      this.h = new int[$$0.am()][];
   }

   public dyn(ul $$0, dfo $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ul $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> lz.e.b(alj.c($$0x)).or(() -> Optional.of(dis.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lz.c.b(alj.c($$0x)).or(() -> Optional.of(erw.a)), this.g);
   }

   private dyn(dyn $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(ul $$0, String $$1, Function<String, Optional<T>> $$2, List<fbp<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vi $$5 : $$0.c($$1, 10)) {
            fbp.a((ul)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dya $$0) {
      this.b($$0);

      for (jn $$1 : d) {
         a($$0, $$1);
      }

      dfm $$2 = $$0.E();
      this.f.forEach($$1x -> {
         diq $$2x = $$1x.a() == dis.a ? $$2.a_($$1x.b()).b() : (diq)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eru $$2x = $$1x.a() == erw.a ? $$2.b_($$1x.b()).a() : (eru)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dya $$0, jn $$1) {
      dfm $$2 = $$0.E();
      if ($$0.q().e.remove($$1)) {
         Set<jm> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jm.f);
         boolean $$7 = $$3.contains(jm.e);
         boolean $$8 = $$3.contains(jm.d);
         boolean $$9 = $$3.contains(jm.c);
         boolean $$10 = $$3.size() == 1;
         des $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jm[] $$16 = jm.values();
         jh.a $$17 = new jh.a();

         for (jh $$18 : jh.b($$12, $$2.K_(), $$14, $$13, $$2.al(), $$15)) {
            dvv $$19 = $$2.a_($$18);
            dvv $$20 = $$19;

            for (jm $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            diq.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dvv a(dvv $$0, jm $$1, dfn $$2, jh $$3, jh $$4) {
      return i.getOrDefault($$0.b(), dyn.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dya $$0) {
      jh.a $$1 = new jh.a();
      jh.a $$2 = new jh.a();
      des $$3 = $$0.f();
      dfn $$4 = $$0.E();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dyb $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jm[] $$8 = jm.values();
            dyi<dvv> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kj.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dvv $$16 = $$9.a($$12);
               dvv $$17 = $$16;

               for (jm $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kj.a($$1.u()) == $$3.g && kj.a($$1.w()) == $$3.h) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               diq.a($$16, $$17, $$4, $$1, 18);
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

   public ul b() {
      ul $$0 = new ul();
      ul $$1 = new ul();

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
         ur $$6 = new ur();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lz.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ur $$7 = new ur();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lz.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public dyn c() {
      return this == a ? a : new dyn(this);
   }

   public interface a {
      dvv a(dvv var1, jm var2, dvv var3, dfn var4, jh var5, jh var6);

      default void a(dfn $$0) {
      }
   }

   static enum b implements dyn.a {
      a(
         dis.kO,
         dis.ed,
         dis.lM,
         dis.lN,
         dis.lO,
         dis.lP,
         dis.lQ,
         dis.lR,
         dis.lS,
         dis.lT,
         dis.lU,
         dis.lV,
         dis.lW,
         dis.lX,
         dis.lY,
         dis.lZ,
         dis.ma,
         dis.mb,
         dis.gS,
         dis.gT,
         dis.gU,
         dis.fA,
         dis.L,
         dis.I,
         dis.K,
         dis.cE,
         dis.cF,
         dis.cG,
         dis.cH,
         dis.cI,
         dis.cJ,
         dis.cK,
         dis.cR,
         dis.cS,
         dis.cT,
         dis.cU,
         dis.cW,
         dis.cX,
         dis.da,
         dis.db,
         dis.dc,
         dis.dd,
         dis.df,
         dis.dg,
         dis.dl,
         dis.dm,
         dis.dn,
         dis.do,
         dis.dq,
         dis.dr
      ) {
         @Override
         public dvv a(dvv $$0, jm $$1, dvv $$2, dfn $$3, jh $$4, jh $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dvv a(dvv $$0, jm $$1, dvv $$2, dfn $$3, jh $$4, jh $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
         }
      },
      c(dis.cv, dis.gV) {
         @Override
         public dvv a(dvv $$0, jm $$1, dvv $$2, dfn $$3, jh $$4, jh $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(djt.d) == dwn.a && $$2.c(djt.d) == dwn.a) {
               jm $$6 = $$0.c(djt.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(djt.c)) {
                  dwn $$7 = $$1 == $$6.h() ? dwn.b : dwn.c;
                  $$3.a($$5, $$2.b(djt.d, $$7.a()), 18);
                  if ($$6 == jm.c || $$6 == jm.f) {
                     dsy $$8 = $$3.c_($$4);
                     dsy $$9 = $$3.c_($$5);
                     if ($$8 instanceof dtf && $$9 instanceof dtf) {
                        dtf.a((dtf)$$8, (dtf)$$9);
                     }
                  }

                  return $$0.b(djt.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dis.aI, dis.aJ, dis.aG, dis.aK, dis.aH, dis.aE, dis.aF) {
         private final ThreadLocal<List<ObjectSet<jh>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dvv a(dvv $$0, jm $$1, dvv $$2, dfn $$3, jh $$4, jh $$5) {
            dvv $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dwl.aC);
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
         public void a(dfn $$0) {
            jh.a $$1 = new jh.a();
            List<ObjectSet<jh>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jh> $$5 = $$2.get($$4);
               ObjectSet<jh> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jh $$7 = (jh)var8.next();
                  dvv $$8 = $$0.a_($$7);
                  if ($$8.c(dwl.aC) >= $$4) {
                     $$0.a($$7, $$8.b(dwl.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jm $$9 : f) {
                           $$1.a($$7, $$9);
                           dvv $$10 = $$0.a_($$1);
                           if ($$10.b(dwl.aC) && $$8.c(dwl.aC) > $$3) {
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
      e(dis.fe, dis.fd) {
         @Override
         public dvv a(dvv $$0, jm $$1, dvv $$2, dfn $$3, jh $$4, jh $$5) {
            if ($$0.c(dqm.c) == 7) {
               diq $$6 = $$0.a(dis.fd) ? dis.eZ : dis.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dis.fd) ? dis.fb : dis.fc).m().b(dml.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jm[] f = jm.values();

      b(final diq... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final diq... $$1) {
         for (diq $$2 : $$1) {
            dyn.i.put($$2, this);
         }

         if ($$0) {
            dyn.j.add(this);
         }
      }
   }
}
