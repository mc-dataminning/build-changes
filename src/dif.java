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

public class dif {
   private static final Logger b = LogUtils.getLogger();
   public static final dif a = new dif(cpm.a);
   private static final String c = "Indices";
   private static final hd[] d = hd.values();
   private final EnumSet<hd> e = EnumSet.noneOf(hd.class);
   private final List<eja<csx>> f = Lists.newArrayList();
   private final List<eja<ean>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<csx, dif.a> i = new IdentityHashMap<>();
   static final Set<dif.a> j = Sets.newHashSet();

   private dif(cpz $$0) {
      this.h = new int[$$0.ak()][];
   }

   public dif(qy $$0, cpz $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         qy $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> jd.f.b(aey.a($$0x)).or(() -> Optional.of(csy.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> jd.d.b(aey.a($$0x)).or(() -> Optional.of(eap.a)), this.g);
   }

   private static <T> void a(qy $$0, String $$1, Function<String, Optional<T>> $$2, List<eja<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (rs $$5 : $$0.c($$1, 10)) {
            eja.a((qy)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dhs $$0) {
      this.b($$0);

      for (hd $$1 : d) {
         a($$0, $$1);
      }

      cpx $$2 = $$0.F();
      this.f.forEach($$1x -> {
         csx $$2x = $$1x.a() == csy.a ? $$2.a_($$1x.b()).b() : (csx)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ean $$2x = $$1x.a() == eap.a ? $$2.b_($$1x.b()).a() : (ean)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dhs $$0, hd $$1) {
      cpx $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<hc> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(hc.f);
         boolean $$7 = $$3.contains(hc.e);
         boolean $$8 = $$3.contains(hc.d);
         boolean $$9 = $$3.contains(hc.c);
         boolean $$10 = $$3.size() == 1;
         cpe $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         hc[] $$16 = hc.values();
         gw.a $$17 = new gw.a();

         for (gw $$18 : gw.b($$12, $$2.H_(), $$14, $$13, $$2.aj() - 1, $$15)) {
            dfl $$19 = $$2.a_($$18);
            dfl $$20 = $$19;

            for (hc $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            csx.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dfl a(dfl $$0, hc $$1, cpy $$2, gw $$3, gw $$4) {
      return i.getOrDefault($$0.b(), dif.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dhs $$0) {
      gw.a $$1 = new gw.a();
      gw.a $$2 = new gw.a();
      cpe $$3 = $$0.f();
      cpy $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dht $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            hc[] $$8 = hc.values();
            dia<dfl> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = hz.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dfl $$16 = $$9.a($$12);
               dfl $$17 = $$16;

               for (hc $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (hz.a($$1.u()) == $$3.e && hz.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               csx.a($$16, $$17, $$4, $$1, 18);
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

   public qy b() {
      qy $$0 = new qy();
      qy $$1 = new qy();

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
         re $$6 = new re();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> jd.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         re $$7 = new re();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> jd.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dfl a(dfl var1, hc var2, dfl var3, cpy var4, gw var5, gw var6);

      default void a(cpy $$0) {
      }
   }

   static enum b implements dif.a {
      a(
         csy.kO,
         csy.ee,
         csy.lM,
         csy.lN,
         csy.lO,
         csy.lP,
         csy.lQ,
         csy.lR,
         csy.lS,
         csy.lT,
         csy.lU,
         csy.lV,
         csy.lW,
         csy.lX,
         csy.lY,
         csy.lZ,
         csy.ma,
         csy.mb,
         csy.gS,
         csy.gT,
         csy.gU,
         csy.fA,
         csy.L,
         csy.I,
         csy.K,
         csy.cE,
         csy.cF,
         csy.cG,
         csy.cH,
         csy.cI,
         csy.cJ,
         csy.cK,
         csy.cR,
         csy.cS,
         csy.cT,
         csy.cU,
         csy.cW,
         csy.cX,
         csy.da,
         csy.db,
         csy.dc,
         csy.dd,
         csy.df,
         csy.dg,
         csy.dl,
         csy.dm,
         csy.dn,
         csy.do,
         csy.dq,
         csy.dr
      ) {
         @Override
         public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(csy.cv, csy.gV) {
         @Override
         public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(ctz.c) == dgd.a && $$2.c(ctz.c) == dgd.a) {
               hc $$6 = $$0.c(ctz.b);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(ctz.b)) {
                  dgd $$7 = $$1 == $$6.h() ? dgd.b : dgd.c;
                  $$3.a($$5, $$2.a(ctz.c, $$7.a()), 18);
                  if ($$6 == hc.c || $$6 == hc.f) {
                     dcx $$8 = $$3.c_($$4);
                     dcx $$9 = $$3.c_($$5);
                     if ($$8 instanceof dde && $$9 instanceof dde) {
                        dde.a((dde)$$8, (dde)$$9);
                     }
                  }

                  return $$0.a(ctz.c, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, csy.aI, csy.aJ, csy.aG, csy.aK, csy.aH, csy.aE, csy.aF) {
         private final ThreadLocal<List<ObjectSet<gw>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
            dfl $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dgb.aC);
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
         public void a(cpy $$0) {
            gw.a $$1 = new gw.a();
            List<ObjectSet<gw>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<gw> $$5 = $$2.get($$4);
               ObjectSet<gw> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  gw $$7 = (gw)var8.next();
                  dfl $$8 = $$0.a_($$7);
                  if ($$8.c(dgb.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dgb.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (hc $$9 : f) {
                           $$1.a($$7, $$9);
                           dfl $$10 = $$0.a_($$1);
                           if ($$10.b(dgb.aC) && $$8.c(dgb.aC) > $$3) {
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
      e(csy.fe, csy.fd) {
         @Override
         public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
            if ($$0.c(dat.b) == 7) {
               dau $$6 = ((dat)$$0.b()).a();
               if ($$2.a($$6)) {
                  return $$6.b().n().a(cwq.aC, $$1);
               }
            }

            return $$0;
         }
      };

      public static final hc[] f = hc.values();

      b(csx... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, csx... $$1) {
         for (csx $$2 : $$1) {
            dif.i.put($$2, this);
         }

         if ($$0) {
            dif.j.add(this);
         }
      }
   }
}
