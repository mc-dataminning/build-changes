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

public class dlj {
   private static final Logger b = LogUtils.getLogger();
   public static final dlj a = new dlj(csn.a);
   private static final String c = "Indices";
   private static final ib[] d = ib.values();
   private final EnumSet<ib> e = EnumSet.noneOf(ib.class);
   private final List<emm<cvz>> f = Lists.newArrayList();
   private final List<emm<edy>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cvz, dlj.a> i = new IdentityHashMap<>();
   static final Set<dlj.a> j = Sets.newHashSet();

   private dlj(cta $$0) {
      this.h = new int[$$0.al()][];
   }

   public dlj(sj $$0, cta $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         sj $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (ib $$6 : ib.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> kb.e.b(agt.a($$0x)).or(() -> Optional.of(cwb.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kb.c.b(agt.a($$0x)).or(() -> Optional.of(eea.a)), this.g);
   }

   private static <T> void a(sj $$0, String $$1, Function<String, Optional<T>> $$2, List<emm<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (tg $$5 : $$0.c($$1, 10)) {
            emm.a((sj)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dkw $$0) {
      this.b($$0);

      for (ib $$1 : d) {
         a($$0, $$1);
      }

      csy $$2 = $$0.F();
      this.f.forEach($$1x -> {
         cvz $$2x = $$1x.a() == cwb.a ? $$2.a_($$1x.b()).b() : (cvz)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         edy $$2x = $$1x.a() == eea.a ? $$2.b_($$1x.b()).a() : (edy)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dkw $$0, ib $$1) {
      csy $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ia> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ia.f);
         boolean $$7 = $$3.contains(ia.e);
         boolean $$8 = $$3.contains(ia.d);
         boolean $$9 = $$3.contains(ia.c);
         boolean $$10 = $$3.size() == 1;
         csf $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ia[] $$16 = ia.values();
         hv.a $$17 = new hv.a();

         for (hv $$18 : hv.b($$12, $$2.J_(), $$14, $$13, $$2.ak() - 1, $$15)) {
            dip $$19 = $$2.a_($$18);
            dip $$20 = $$19;

            for (ia $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cvz.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dip a(dip $$0, ia $$1, csz $$2, hv $$3, hv $$4) {
      return i.getOrDefault($$0.b(), dlj.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dkw $$0) {
      hv.a $$1 = new hv.a();
      hv.a $$2 = new hv.a();
      csf $$3 = $$0.f();
      csz $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dkx $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ia[] $$8 = ia.values();
            dle<dip> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = ix.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dip $$16 = $$9.a($$12);
               dip $$17 = $$16;

               for (ia $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (ix.a($$1.u()) == $$3.e && ix.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               cvz.a($$16, $$17, $$4, $$1, 18);
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

   public sj b() {
      sj $$0 = new sj();
      sj $$1 = new sj();

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

      for (ib $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         sp $$6 = new sp();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> kb.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         sp $$7 = new sp();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> kb.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dip a(dip var1, ia var2, dip var3, csz var4, hv var5, hv var6);

      default void a(csz $$0) {
      }
   }

   static enum b implements dlj.a {
      a(
         cwb.kO,
         cwb.ed,
         cwb.lM,
         cwb.lN,
         cwb.lO,
         cwb.lP,
         cwb.lQ,
         cwb.lR,
         cwb.lS,
         cwb.lT,
         cwb.lU,
         cwb.lV,
         cwb.lW,
         cwb.lX,
         cwb.lY,
         cwb.lZ,
         cwb.ma,
         cwb.mb,
         cwb.gS,
         cwb.gT,
         cwb.gU,
         cwb.fA,
         cwb.L,
         cwb.I,
         cwb.K,
         cwb.cE,
         cwb.cF,
         cwb.cG,
         cwb.cH,
         cwb.cI,
         cwb.cJ,
         cwb.cK,
         cwb.cR,
         cwb.cS,
         cwb.cT,
         cwb.cU,
         cwb.cW,
         cwb.cX,
         cwb.da,
         cwb.db,
         cwb.dc,
         cwb.dd,
         cwb.df,
         cwb.dg,
         cwb.dl,
         cwb.dm,
         cwb.dn,
         cwb.do,
         cwb.dq,
         cwb.dr
      ) {
         @Override
         public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cwb.cv, cwb.gV) {
         @Override
         public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cxc.d) == djh.a && $$2.c(cxc.d) == djh.a) {
               ia $$6 = $$0.c(cxc.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(cxc.c)) {
                  djh $$7 = $$1 == $$6.h() ? djh.b : djh.c;
                  $$3.a($$5, $$2.a(cxc.d, $$7.a()), 18);
                  if ($$6 == ia.c || $$6 == ia.f) {
                     dgd $$8 = $$3.c_($$4);
                     dgd $$9 = $$3.c_($$5);
                     if ($$8 instanceof dgk && $$9 instanceof dgk) {
                        dgk.a((dgk)$$8, (dgk)$$9);
                     }
                  }

                  return $$0.a(cxc.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cwb.aI, cwb.aJ, cwb.aG, cwb.aK, cwb.aH, cwb.aE, cwb.aF) {
         private final ThreadLocal<List<ObjectSet<hv>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
            dip $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(djf.aC);
               List<ObjectSet<hv>> $$8 = this.g.get();
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
         public void a(csz $$0) {
            hv.a $$1 = new hv.a();
            List<ObjectSet<hv>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<hv> $$5 = $$2.get($$4);
               ObjectSet<hv> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  hv $$7 = (hv)var8.next();
                  dip $$8 = $$0.a_($$7);
                  if ($$8.c(djf.aC) >= $$4) {
                     $$0.a($$7, $$8.a(djf.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ia $$9 : f) {
                           $$1.a($$7, $$9);
                           dip $$10 = $$0.a_($$1);
                           if ($$10.b(djf.aC) && $$8.c(djf.aC) > $$3) {
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
      e(cwb.fe, cwb.fd) {
         @Override
         public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
            if ($$0.c(ddu.c) == 7) {
               cvz $$6 = $$0.a(cwb.fd) ? cwb.eZ : cwb.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(cwb.fd) ? cwb.fb : cwb.fc).o().a(czu.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ia[] f = ia.values();

      b(cvz... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cvz... $$1) {
         for (cvz $$2 : $$1) {
            dlj.i.put($$2, this);
         }

         if ($$0) {
            dlj.j.add(this);
         }
      }
   }
}
