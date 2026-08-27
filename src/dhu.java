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

public class dhu {
   private static final Logger b = LogUtils.getLogger();
   public static final dhu a = new dhu(cpb.a);
   private static final String c = "Indices";
   private static final hb[] d = hb.values();
   private final EnumSet<hb> e = EnumSet.noneOf(hb.class);
   private final List<eip<csm>> f = Lists.newArrayList();
   private final List<eip<eac>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<csm, dhu.a> i = new IdentityHashMap<>();
   static final Set<dhu.a> j = Sets.newHashSet();

   private dhu(cpo $$0) {
      this.h = new int[$$0.ak()][];
   }

   public dhu(qr $$0, cpo $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         qr $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> jb.f.b(aer.a($$0x)).or(() -> Optional.of(csn.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> jb.d.b(aer.a($$0x)).or(() -> Optional.of(eae.a)), this.g);
   }

   private static <T> void a(qr $$0, String $$1, Function<String, Optional<T>> $$2, List<eip<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (rk $$5 : $$0.c($$1, 10)) {
            eip.a((qr)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dhh $$0) {
      this.b($$0);

      for (hb $$1 : d) {
         a($$0, $$1);
      }

      cpm $$2 = $$0.F();
      this.f.forEach($$1x -> {
         csm $$2x = $$1x.a() == csn.a ? $$2.a_($$1x.b()).b() : (csm)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eac $$2x = $$1x.a() == eae.a ? $$2.b_($$1x.b()).a() : (eac)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dhh $$0, hb $$1) {
      cpm $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ha> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ha.f);
         boolean $$7 = $$3.contains(ha.e);
         boolean $$8 = $$3.contains(ha.d);
         boolean $$9 = $$3.contains(ha.c);
         boolean $$10 = $$3.size() == 1;
         cot $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ha[] $$16 = ha.values();
         gu.a $$17 = new gu.a();

         for (gu $$18 : gu.b($$12, $$2.C_(), $$14, $$13, $$2.aj() - 1, $$15)) {
            dfa $$19 = $$2.a_($$18);
            dfa $$20 = $$19;

            for (ha $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            csm.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dfa a(dfa $$0, ha $$1, cpn $$2, gu $$3, gu $$4) {
      return i.getOrDefault($$0.b(), dhu.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dhh $$0) {
      gu.a $$1 = new gu.a();
      gu.a $$2 = new gu.a();
      cot $$3 = $$0.f();
      cpn $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dhi $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ha[] $$8 = ha.values();
            dhp<dfa> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = hx.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dfa $$16 = $$9.a($$12);
               dfa $$17 = $$16;

               for (ha $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (hx.a($$1.u()) == $$3.e && hx.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               csm.a($$16, $$17, $$4, $$1, 18);
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

   public qr b() {
      qr $$0 = new qr();
      qr $$1 = new qr();

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
         qx $$6 = new qx();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> jb.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         qx $$7 = new qx();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> jb.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dfa a(dfa var1, ha var2, dfa var3, cpn var4, gu var5, gu var6);

      default void a(cpn $$0) {
      }
   }

   static enum b implements dhu.a {
      a(
         csn.kO,
         csn.ee,
         csn.lM,
         csn.lN,
         csn.lO,
         csn.lP,
         csn.lQ,
         csn.lR,
         csn.lS,
         csn.lT,
         csn.lU,
         csn.lV,
         csn.lW,
         csn.lX,
         csn.lY,
         csn.lZ,
         csn.ma,
         csn.mb,
         csn.gS,
         csn.gT,
         csn.gU,
         csn.fA,
         csn.L,
         csn.I,
         csn.K,
         csn.cE,
         csn.cF,
         csn.cG,
         csn.cH,
         csn.cI,
         csn.cJ,
         csn.cK,
         csn.cR,
         csn.cS,
         csn.cT,
         csn.cU,
         csn.cW,
         csn.cX,
         csn.da,
         csn.db,
         csn.dc,
         csn.dd,
         csn.df,
         csn.dg,
         csn.dl,
         csn.dm,
         csn.dn,
         csn.do,
         csn.dq,
         csn.dr
      ) {
         @Override
         public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(csn.cv, csn.gV) {
         @Override
         public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cto.c) == dfs.a && $$2.c(cto.c) == dfs.a) {
               ha $$6 = $$0.c(cto.b);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(cto.b)) {
                  dfs $$7 = $$1 == $$6.h() ? dfs.b : dfs.c;
                  $$3.a($$5, $$2.a(cto.c, $$7.a()), 18);
                  if ($$6 == ha.c || $$6 == ha.f) {
                     dcm $$8 = $$3.c_($$4);
                     dcm $$9 = $$3.c_($$5);
                     if ($$8 instanceof dct && $$9 instanceof dct) {
                        dct.a((dct)$$8, (dct)$$9);
                     }
                  }

                  return $$0.a(cto.c, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, csn.aI, csn.aJ, csn.aG, csn.aK, csn.aH, csn.aE, csn.aF) {
         private final ThreadLocal<List<ObjectSet<gu>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
            dfa $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dfq.aC);
               List<ObjectSet<gu>> $$8 = this.g.get();
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
         public void a(cpn $$0) {
            gu.a $$1 = new gu.a();
            List<ObjectSet<gu>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<gu> $$5 = $$2.get($$4);
               ObjectSet<gu> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  gu $$7 = (gu)var8.next();
                  dfa $$8 = $$0.a_($$7);
                  if ($$8.c(dfq.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dfq.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ha $$9 : f) {
                           $$1.a($$7, $$9);
                           dfa $$10 = $$0.a_($$1);
                           if ($$10.b(dfq.aC) && $$8.c(dfq.aC) > $$3) {
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
      e(csn.fe, csn.fd) {
         @Override
         public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
            if ($$0.c(dai.b) == 7) {
               daj $$6 = ((dai)$$0.b()).a();
               if ($$2.a($$6)) {
                  return $$6.b().n().a(cwf.aC, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ha[] f = ha.values();

      b(csm... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, csm... $$1) {
         for (csm $$2 : $$1) {
            dhu.i.put($$2, this);
         }

         if ($$0) {
            dhu.j.add(this);
         }
      }
   }
}
