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

public class dnz {
   private static final Logger b = LogUtils.getLogger();
   public static final dnz a = new dnz(cvc.a);
   private static final String c = "Indices";
   private static final ig[] d = ig.values();
   private final EnumSet<ig> e = EnumSet.noneOf(ig.class);
   private final List<epi<cyo>> f = Lists.newArrayList();
   private final List<epi<ego>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cyo, dnz.a> i = new IdentityHashMap<>();
   static final Set<dnz.a> j = Sets.newHashSet();

   private dnz(cvp $$0) {
      this.h = new int[$$0.am()][];
   }

   public dnz(sw $$0, cvp $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         sw $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (ig $$6 : ig.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> kf.e.b(aiy.a($$0x)).or(() -> Optional.of(cyq.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kf.c.b(aiy.a($$0x)).or(() -> Optional.of(egq.a)), this.g);
   }

   private static <T> void a(sw $$0, String $$1, Function<String, Optional<T>> $$2, List<epi<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (tt $$5 : $$0.c($$1, 10)) {
            epi.a((sw)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dnm $$0) {
      this.b($$0);

      for (ig $$1 : d) {
         a($$0, $$1);
      }

      cvn $$2 = $$0.F();
      this.f.forEach($$1x -> {
         cyo $$2x = $$1x.a() == cyq.a ? $$2.a_($$1x.b()).b() : (cyo)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ego $$2x = $$1x.a() == egq.a ? $$2.b_($$1x.b()).a() : (ego)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dnm $$0, ig $$1) {
      cvn $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ie> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ie.f);
         boolean $$7 = $$3.contains(ie.e);
         boolean $$8 = $$3.contains(ie.d);
         boolean $$9 = $$3.contains(ie.c);
         boolean $$10 = $$3.size() == 1;
         cuu $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ie[] $$16 = ie.values();
         hz.a $$17 = new hz.a();

         for (hz $$18 : hz.b($$12, $$2.J_(), $$14, $$13, $$2.al() - 1, $$15)) {
            dlf $$19 = $$2.a_($$18);
            dlf $$20 = $$19;

            for (ie $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cyo.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dlf a(dlf $$0, ie $$1, cvo $$2, hz $$3, hz $$4) {
      return i.getOrDefault($$0.b(), dnz.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dnm $$0) {
      hz.a $$1 = new hz.a();
      hz.a $$2 = new hz.a();
      cuu $$3 = $$0.f();
      cvo $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dnn $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ie[] $$8 = ie.values();
            dnu<dlf> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jb.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dlf $$16 = $$9.a($$12);
               dlf $$17 = $$16;

               for (ie $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jb.a($$1.u()) == $$3.e && jb.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               cyo.a($$16, $$17, $$4, $$1, 18);
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

   public sw b() {
      sw $$0 = new sw();
      sw $$1 = new sw();

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

      for (ig $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         tc $$6 = new tc();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> kf.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         tc $$7 = new tc();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> kf.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dlf a(dlf var1, ie var2, dlf var3, cvo var4, hz var5, hz var6);

      default void a(cvo $$0) {
      }
   }

   static enum b implements dnz.a {
      a(
         cyq.kO,
         cyq.ed,
         cyq.lM,
         cyq.lN,
         cyq.lO,
         cyq.lP,
         cyq.lQ,
         cyq.lR,
         cyq.lS,
         cyq.lT,
         cyq.lU,
         cyq.lV,
         cyq.lW,
         cyq.lX,
         cyq.lY,
         cyq.lZ,
         cyq.ma,
         cyq.mb,
         cyq.gS,
         cyq.gT,
         cyq.gU,
         cyq.fA,
         cyq.L,
         cyq.I,
         cyq.K,
         cyq.cE,
         cyq.cF,
         cyq.cG,
         cyq.cH,
         cyq.cI,
         cyq.cJ,
         cyq.cK,
         cyq.cR,
         cyq.cS,
         cyq.cT,
         cyq.cU,
         cyq.cW,
         cyq.cX,
         cyq.da,
         cyq.db,
         cyq.dc,
         cyq.dd,
         cyq.df,
         cyq.dg,
         cyq.dl,
         cyq.dm,
         cyq.dn,
         cyq.do,
         cyq.dq,
         cyq.dr
      ) {
         @Override
         public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cyq.cv, cyq.gV) {
         @Override
         public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(czr.d) == dlx.a && $$2.c(czr.d) == dlx.a) {
               ie $$6 = $$0.c(czr.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(czr.c)) {
                  dlx $$7 = $$1 == $$6.h() ? dlx.b : dlx.c;
                  $$3.a($$5, $$2.a(czr.d, $$7.a()), 18);
                  if ($$6 == ie.c || $$6 == ie.f) {
                     dit $$8 = $$3.c_($$4);
                     dit $$9 = $$3.c_($$5);
                     if ($$8 instanceof dja && $$9 instanceof dja) {
                        dja.a((dja)$$8, (dja)$$9);
                     }
                  }

                  return $$0.a(czr.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cyq.aI, cyq.aJ, cyq.aG, cyq.aK, cyq.aH, cyq.aE, cyq.aF) {
         private final ThreadLocal<List<ObjectSet<hz>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
            dlf $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dlv.aC);
               List<ObjectSet<hz>> $$8 = this.g.get();
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
         public void a(cvo $$0) {
            hz.a $$1 = new hz.a();
            List<ObjectSet<hz>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<hz> $$5 = $$2.get($$4);
               ObjectSet<hz> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  hz $$7 = (hz)var8.next();
                  dlf $$8 = $$0.a_($$7);
                  if ($$8.c(dlv.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dlv.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ie $$9 : f) {
                           $$1.a($$7, $$9);
                           dlf $$10 = $$0.a_($$1);
                           if ($$10.b(dlv.aC) && $$8.c(dlv.aC) > $$3) {
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
      e(cyq.fe, cyq.fd) {
         @Override
         public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
            if ($$0.c(dgj.c) == 7) {
               cyo $$6 = $$0.a(cyq.fd) ? cyq.eZ : cyq.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(cyq.fd) ? cyq.fb : cyq.fc).o().a(dcj.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ie[] f = ie.values();

      b(cyo... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cyo... $$1) {
         for (cyo $$2 : $$1) {
            dnz.i.put($$2, this);
         }

         if ($$0) {
            dnz.j.add(this);
         }
      }
   }
}
