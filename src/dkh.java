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

public class dkh {
   private static final Logger b = LogUtils.getLogger();
   public static final dkh a = new dkh(cru.a);
   private static final String c = "Indices";
   private static final ic[] d = ic.values();
   private final EnumSet<ic> e = EnumSet.noneOf(ic.class);
   private final List<elk<cvf>> f = Lists.newArrayList();
   private final List<elk<ecw>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cvf, dkh.a> i = new IdentityHashMap<>();
   static final Set<dkh.a> j = Sets.newHashSet();

   private dkh(csh $$0) {
      this.h = new int[$$0.al()][];
   }

   public dkh(sd $$0, csh $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         sd $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (ic $$6 : ic.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> kc.f.b(agm.a($$0x)).or(() -> Optional.of(cvh.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kc.d.b(agm.a($$0x)).or(() -> Optional.of(ecy.a)), this.g);
   }

   private static <T> void a(sd $$0, String $$1, Function<String, Optional<T>> $$2, List<elk<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (ta $$5 : $$0.c($$1, 10)) {
            elk.a((sd)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dju $$0) {
      this.b($$0);

      for (ic $$1 : d) {
         a($$0, $$1);
      }

      csf $$2 = $$0.F();
      this.f.forEach($$1x -> {
         cvf $$2x = $$1x.a() == cvh.a ? $$2.a_($$1x.b()).b() : (cvf)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ecw $$2x = $$1x.a() == ecy.a ? $$2.b_($$1x.b()).a() : (ecw)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dju $$0, ic $$1) {
      csf $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ib> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ib.f);
         boolean $$7 = $$3.contains(ib.e);
         boolean $$8 = $$3.contains(ib.d);
         boolean $$9 = $$3.contains(ib.c);
         boolean $$10 = $$3.size() == 1;
         crm $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ib[] $$16 = ib.values();
         hx.a $$17 = new hx.a();

         for (hx $$18 : hx.b($$12, $$2.J_(), $$14, $$13, $$2.ak() - 1, $$15)) {
            dhn $$19 = $$2.a_($$18);
            dhn $$20 = $$19;

            for (ib $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cvf.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dhn a(dhn $$0, ib $$1, csg $$2, hx $$3, hx $$4) {
      return i.getOrDefault($$0.b(), dkh.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dju $$0) {
      hx.a $$1 = new hx.a();
      hx.a $$2 = new hx.a();
      crm $$3 = $$0.f();
      csg $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         djv $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ib[] $$8 = ib.values();
            dkc<dhn> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = iy.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dhn $$16 = $$9.a($$12);
               dhn $$17 = $$16;

               for (ib $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (iy.a($$1.u()) == $$3.e && iy.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               cvf.a($$16, $$17, $$4, $$1, 18);
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

   public sd b() {
      sd $$0 = new sd();
      sd $$1 = new sd();

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

      for (ic $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         sj $$6 = new sj();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> kc.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         sj $$7 = new sj();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> kc.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dhn a(dhn var1, ib var2, dhn var3, csg var4, hx var5, hx var6);

      default void a(csg $$0) {
      }
   }

   static enum b implements dkh.a {
      a(
         cvh.kO,
         cvh.ed,
         cvh.lM,
         cvh.lN,
         cvh.lO,
         cvh.lP,
         cvh.lQ,
         cvh.lR,
         cvh.lS,
         cvh.lT,
         cvh.lU,
         cvh.lV,
         cvh.lW,
         cvh.lX,
         cvh.lY,
         cvh.lZ,
         cvh.ma,
         cvh.mb,
         cvh.gS,
         cvh.gT,
         cvh.gU,
         cvh.fA,
         cvh.L,
         cvh.I,
         cvh.K,
         cvh.cE,
         cvh.cF,
         cvh.cG,
         cvh.cH,
         cvh.cI,
         cvh.cJ,
         cvh.cK,
         cvh.cR,
         cvh.cS,
         cvh.cT,
         cvh.cU,
         cvh.cW,
         cvh.cX,
         cvh.da,
         cvh.db,
         cvh.dc,
         cvh.dd,
         cvh.df,
         cvh.dg,
         cvh.dl,
         cvh.dm,
         cvh.dn,
         cvh.do,
         cvh.dq,
         cvh.dr
      ) {
         @Override
         public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cvh.cv, cvh.gV) {
         @Override
         public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cwi.d) == dif.a && $$2.c(cwi.d) == dif.a) {
               ib $$6 = $$0.c(cwi.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(cwi.c)) {
                  dif $$7 = $$1 == $$6.h() ? dif.b : dif.c;
                  $$3.a($$5, $$2.a(cwi.d, $$7.a()), 18);
                  if ($$6 == ib.c || $$6 == ib.f) {
                     dfi $$8 = $$3.c_($$4);
                     dfi $$9 = $$3.c_($$5);
                     if ($$8 instanceof dfp && $$9 instanceof dfp) {
                        dfp.a((dfp)$$8, (dfp)$$9);
                     }
                  }

                  return $$0.a(cwi.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cvh.aI, cvh.aJ, cvh.aG, cvh.aK, cvh.aH, cvh.aE, cvh.aF) {
         private final ThreadLocal<List<ObjectSet<hx>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
            dhn $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(did.aC);
               List<ObjectSet<hx>> $$8 = this.g.get();
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
         public void a(csg $$0) {
            hx.a $$1 = new hx.a();
            List<ObjectSet<hx>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<hx> $$5 = $$2.get($$4);
               ObjectSet<hx> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  hx $$7 = (hx)var8.next();
                  dhn $$8 = $$0.a_($$7);
                  if ($$8.c(did.aC) >= $$4) {
                     $$0.a($$7, $$8.a(did.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ib $$9 : f) {
                           $$1.a($$7, $$9);
                           dhn $$10 = $$0.a_($$1);
                           if ($$10.b(did.aC) && $$8.c(did.aC) > $$3) {
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
      e(cvh.fe, cvh.fd) {
         @Override
         public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
            if ($$0.c(dda.c) == 7) {
               cvf $$6 = $$0.a(cvh.fd) ? cvh.eZ : cvh.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(cvh.fd) ? cvh.fb : cvh.fc).o().a(cza.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ib[] f = ib.values();

      b(cvf... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cvf... $$1) {
         for (cvf $$2 : $$1) {
            dkh.i.put($$2, this);
         }

         if ($$0) {
            dkh.j.add(this);
         }
      }
   }
}
