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

public class dhy {
   private static final Logger b = LogUtils.getLogger();
   public static final dhy a = new dhy(cpf.a);
   private static final String c = "Indices";
   private static final hd[] d = hd.values();
   private final EnumSet<hd> e = EnumSet.noneOf(hd.class);
   private final List<eit<csq>> f = Lists.newArrayList();
   private final List<eit<eag>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<csq, dhy.a> i = new IdentityHashMap<>();
   static final Set<dhy.a> j = Sets.newHashSet();

   private dhy(cps $$0) {
      this.h = new int[$$0.ak()][];
   }

   public dhy(qu $$0, cps $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         qu $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (hd $$6 : hd.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> jd.f.b(aeu.a($$0x)).or(() -> Optional.of(csr.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> jd.d.b(aeu.a($$0x)).or(() -> Optional.of(eai.a)), this.g);
   }

   private static <T> void a(qu $$0, String $$1, Function<String, Optional<T>> $$2, List<eit<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (rn $$5 : $$0.c($$1, 10)) {
            eit.a((qu)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dhl $$0) {
      this.b($$0);

      for (hd $$1 : d) {
         a($$0, $$1);
      }

      cpq $$2 = $$0.F();
      this.f.forEach($$1x -> {
         csq $$2x = $$1x.a() == csr.a ? $$2.a_($$1x.b()).b() : (csq)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eag $$2x = $$1x.a() == eai.a ? $$2.b_($$1x.b()).a() : (eag)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dhl $$0, hd $$1) {
      cpq $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<hc> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(hc.f);
         boolean $$7 = $$3.contains(hc.e);
         boolean $$8 = $$3.contains(hc.d);
         boolean $$9 = $$3.contains(hc.c);
         boolean $$10 = $$3.size() == 1;
         cox $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         hc[] $$16 = hc.values();
         gw.a $$17 = new gw.a();

         for (gw $$18 : gw.b($$12, $$2.C_(), $$14, $$13, $$2.aj() - 1, $$15)) {
            dfe $$19 = $$2.a_($$18);
            dfe $$20 = $$19;

            for (hc $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            csq.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dfe a(dfe $$0, hc $$1, cpr $$2, gw $$3, gw $$4) {
      return i.getOrDefault($$0.b(), dhy.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dhl $$0) {
      gw.a $$1 = new gw.a();
      gw.a $$2 = new gw.a();
      cox $$3 = $$0.f();
      cpr $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dhm $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            hc[] $$8 = hc.values();
            dht<dfe> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = hz.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dfe $$16 = $$9.a($$12);
               dfe $$17 = $$16;

               for (hc $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (hz.a($$1.u()) == $$3.e && hz.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               csq.a($$16, $$17, $$4, $$1, 18);
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

   public qu b() {
      qu $$0 = new qu();
      qu $$1 = new qu();

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

      for (hd $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         ra $$6 = new ra();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> jd.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ra $$7 = new ra();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> jd.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dfe a(dfe var1, hc var2, dfe var3, cpr var4, gw var5, gw var6);

      default void a(cpr $$0) {
      }
   }

   static enum b implements dhy.a {
      a(
         csr.kO,
         csr.ee,
         csr.lM,
         csr.lN,
         csr.lO,
         csr.lP,
         csr.lQ,
         csr.lR,
         csr.lS,
         csr.lT,
         csr.lU,
         csr.lV,
         csr.lW,
         csr.lX,
         csr.lY,
         csr.lZ,
         csr.ma,
         csr.mb,
         csr.gS,
         csr.gT,
         csr.gU,
         csr.fA,
         csr.L,
         csr.I,
         csr.K,
         csr.cE,
         csr.cF,
         csr.cG,
         csr.cH,
         csr.cI,
         csr.cJ,
         csr.cK,
         csr.cR,
         csr.cS,
         csr.cT,
         csr.cU,
         csr.cW,
         csr.cX,
         csr.da,
         csr.db,
         csr.dc,
         csr.dd,
         csr.df,
         csr.dg,
         csr.dl,
         csr.dm,
         csr.dn,
         csr.do,
         csr.dq,
         csr.dr
      ) {
         @Override
         public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(csr.cv, csr.gV) {
         @Override
         public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cts.c) == dfw.a && $$2.c(cts.c) == dfw.a) {
               hc $$6 = $$0.c(cts.b);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(cts.b)) {
                  dfw $$7 = $$1 == $$6.h() ? dfw.b : dfw.c;
                  $$3.a($$5, $$2.a(cts.c, $$7.a()), 18);
                  if ($$6 == hc.c || $$6 == hc.f) {
                     dcq $$8 = $$3.c_($$4);
                     dcq $$9 = $$3.c_($$5);
                     if ($$8 instanceof dcx && $$9 instanceof dcx) {
                        dcx.a((dcx)$$8, (dcx)$$9);
                     }
                  }

                  return $$0.a(cts.c, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, csr.aI, csr.aJ, csr.aG, csr.aK, csr.aH, csr.aE, csr.aF) {
         private final ThreadLocal<List<ObjectSet<gw>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
            dfe $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dfu.aC);
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
         public void a(cpr $$0) {
            gw.a $$1 = new gw.a();
            List<ObjectSet<gw>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<gw> $$5 = $$2.get($$4);
               ObjectSet<gw> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  gw $$7 = (gw)var8.next();
                  dfe $$8 = $$0.a_($$7);
                  if ($$8.c(dfu.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dfu.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (hc $$9 : f) {
                           $$1.a($$7, $$9);
                           dfe $$10 = $$0.a_($$1);
                           if ($$10.b(dfu.aC) && $$8.c(dfu.aC) > $$3) {
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
      e(csr.fe, csr.fd) {
         @Override
         public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
            if ($$0.c(dam.b) == 7) {
               dan $$6 = ((dam)$$0.b()).a();
               if ($$2.a($$6)) {
                  return $$6.b().n().a(cwj.aC, $$1);
               }
            }

            return $$0;
         }
      };

      public static final hc[] f = hc.values();

      b(csq... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, csq... $$1) {
         for (csq $$2 : $$1) {
            dhy.i.put($$2, this);
         }

         if ($$0) {
            dhy.j.add(this);
         }
      }
   }
}
