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

public class dvv {
   private static final Logger b = LogUtils.getLogger();
   public static final dvv a = new dvv(dbp.a);
   private static final String c = "Indices";
   private static final ix[] d = ix.values();
   private final EnumSet<ix> e = EnumSet.noneOf(ix.class);
   private final List<eyk<dfc>> f = Lists.newArrayList();
   private final List<eyk<epd>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dfc, dvv.a> i = new IdentityHashMap<>();
   static final Set<dvv.a> j = Sets.newHashSet();

   private dvv(dcc $$0) {
      this.h = new int[$$0.an()][];
   }

   public dvv(uk $$0, dcc $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         uk $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (ix $$6 : ix.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lh.e.b(akt.a($$0x)).or(() -> Optional.of(dfe.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lh.c.b(akt.a($$0x)).or(() -> Optional.of(epf.a)), this.g);
   }

   private static <T> void a(uk $$0, String $$1, Function<String, Optional<T>> $$2, List<eyk<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vh $$5 : $$0.c($$1, 10)) {
            eyk.a((uk)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dvi $$0) {
      this.b($$0);

      for (ix $$1 : d) {
         a($$0, $$1);
      }

      dca $$2 = $$0.G();
      this.f.forEach($$1x -> {
         dfc $$2x = $$1x.a() == dfe.a ? $$2.a_($$1x.b()).b() : (dfc)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         epd $$2x = $$1x.a() == epf.a ? $$2.b_($$1x.b()).a() : (epd)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dvi $$0, ix $$1) {
      dca $$2 = $$0.G();
      if ($$0.s().e.remove($$1)) {
         Set<iw> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(iw.f);
         boolean $$7 = $$3.contains(iw.e);
         boolean $$8 = $$3.contains(iw.d);
         boolean $$9 = $$3.contains(iw.c);
         boolean $$10 = $$3.size() == 1;
         dbh $$11 = $$0.g();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         iw[] $$16 = iw.values();
         ir.a $$17 = new ir.a();

         for (ir $$18 : ir.b($$12, $$2.J_(), $$14, $$13, $$2.am() - 1, $$15)) {
            dtc $$19 = $$2.a_($$18);
            dtc $$20 = $$19;

            for (iw $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dfc.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dtc a(dtc $$0, iw $$1, dcb $$2, ir $$3, ir $$4) {
      return i.getOrDefault($$0.b(), dvv.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dvi $$0) {
      ir.a $$1 = new ir.a();
      ir.a $$2 = new ir.a();
      dbh $$3 = $$0.g();
      dcb $$4 = $$0.G();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dvj $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            iw[] $$8 = iw.values();
            dvq<dtc> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jt.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dtc $$16 = $$9.a($$12);
               dtc $$17 = $$16;

               for (iw $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jt.a($$1.u()) == $$3.e && jt.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dfc.a($$16, $$17, $$4, $$1, 18);
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

   public uk b() {
      uk $$0 = new uk();
      uk $$1 = new uk();

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

      for (ix $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         uq $$6 = new uq();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lh.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         uq $$7 = new uq();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lh.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dtc a(dtc var1, iw var2, dtc var3, dcb var4, ir var5, ir var6);

      default void a(dcb $$0) {
      }
   }

   static enum b implements dvv.a {
      a(
         dfe.lM,
         dfe.eR,
         dfe.mK,
         dfe.mL,
         dfe.mM,
         dfe.mN,
         dfe.mO,
         dfe.mP,
         dfe.mQ,
         dfe.mR,
         dfe.mS,
         dfe.mT,
         dfe.mU,
         dfe.mV,
         dfe.mW,
         dfe.mX,
         dfe.mY,
         dfe.mZ,
         dfe.hM,
         dfe.hN,
         dfe.hO,
         dfe.gs,
         dfe.ar,
         dfe.an,
         dfe.ao,
         dfe.aq,
         dfe.dq,
         dfe.dr,
         dfe.ds,
         dfe.dt,
         dfe.du,
         dfe.dv,
         dfe.dw,
         dfe.dD,
         dfe.dE,
         dfe.dF,
         dfe.dG,
         dfe.dI,
         dfe.dJ,
         dfe.dM,
         dfe.dN,
         dfe.dO,
         dfe.dP,
         dfe.dR,
         dfe.dS,
         dfe.dY,
         dfe.dZ,
         dfe.ea,
         dfe.eb,
         dfe.ed,
         dfe.ee
      ) {
         @Override
         public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dfe.dg, dfe.hP) {
         @Override
         public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dgf.d) == dtu.a && $$2.c(dgf.d) == dtu.a) {
               iw $$6 = $$0.c(dgf.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dgf.c)) {
                  dtu $$7 = $$1 == $$6.h() ? dtu.b : dtu.c;
                  $$3.a($$5, $$2.a(dgf.d, $$7.a()), 18);
                  if ($$6 == iw.c || $$6 == iw.f) {
                     dqc $$8 = $$3.c_($$4);
                     dqc $$9 = $$3.c_($$5);
                     if ($$8 instanceof dqj && $$9 instanceof dqj) {
                        dqj.a((dqj)$$8, (dqj)$$9);
                     }
                  }

                  return $$0.a(dgf.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dfe.tH, dfe.bq, dfe.br, dfe.bo, dfe.bs, dfe.bp, dfe.bm, dfe.bn) {
         private final ThreadLocal<List<ObjectSet<ir>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
            dtc $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dts.aC);
               List<ObjectSet<ir>> $$8 = this.g.get();
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
         public void a(dcb $$0) {
            ir.a $$1 = new ir.a();
            List<ObjectSet<ir>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ir> $$5 = $$2.get($$4);
               ObjectSet<ir> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ir $$7 = (ir)var8.next();
                  dtc $$8 = $$0.a_($$7);
                  if ($$8.c(dts.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dts.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (iw $$9 : f) {
                           $$1.a($$7, $$9);
                           dtc $$10 = $$0.a_($$1);
                           if ($$10.b(dts.aC) && $$8.c(dts.aC) > $$3) {
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
      e(dfe.fW, dfe.fV) {
         @Override
         public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
            if ($$0.c(dnm.c) == 7) {
               dfc $$6 = $$0.a(dfe.fV) ? dfe.fR : dfe.fS;
               if ($$2.a($$6)) {
                  return ($$0.a(dfe.fV) ? dfe.fT : dfe.fU).n().a(djc.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final iw[] f = iw.values();

      b(dfc... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, dfc... $$1) {
         for (dfc $$2 : $$1) {
            dvv.i.put($$2, this);
         }

         if ($$0) {
            dvv.j.add(this);
         }
      }
   }
}
