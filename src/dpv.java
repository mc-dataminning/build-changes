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

public class dpv {
   private static final Logger b = LogUtils.getLogger();
   public static final dpv a = new dpv(cwq.a);
   private static final String c = "Indices";
   private static final ii[] d = ii.values();
   private final EnumSet<ii> e = EnumSet.noneOf(ii.class);
   private final List<erj<dac>> f = Lists.newArrayList();
   private final List<erj<eio>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dac, dpv.a> i = new IdentityHashMap<>();
   static final Set<dpv.a> j = Sets.newHashSet();

   private dpv(cxd $$0) {
      this.h = new int[$$0.al()][];
   }

   public dpv(ta $$0, cxd $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ta $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (ii $$6 : ii.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> ki.e.b(ajh.a($$0x)).or(() -> Optional.of(dae.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> ki.c.b(ajh.a($$0x)).or(() -> Optional.of(eiq.a)), this.g);
   }

   private static <T> void a(ta $$0, String $$1, Function<String, Optional<T>> $$2, List<erj<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (tx $$5 : $$0.c($$1, 10)) {
            erj.a((ta)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dpi $$0) {
      this.b($$0);

      for (ii $$1 : d) {
         a($$0, $$1);
      }

      cxb $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dac $$2x = $$1x.a() == dae.a ? $$2.a_($$1x.b()).b() : (dac)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eio $$2x = $$1x.a() == eiq.a ? $$2.b_($$1x.b()).a() : (eio)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dpi $$0, ii $$1) {
      cxb $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ih> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ih.f);
         boolean $$7 = $$3.contains(ih.e);
         boolean $$8 = $$3.contains(ih.d);
         boolean $$9 = $$3.contains(ih.c);
         boolean $$10 = $$3.size() == 1;
         cwi $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ih[] $$16 = ih.values();
         ib.a $$17 = new ib.a();

         for (ib $$18 : ib.b($$12, $$2.I_(), $$14, $$13, $$2.ak() - 1, $$15)) {
            dnb $$19 = $$2.a_($$18);
            dnb $$20 = $$19;

            for (ih $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dac.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dnb a(dnb $$0, ih $$1, cxc $$2, ib $$3, ib $$4) {
      return i.getOrDefault($$0.b(), dpv.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dpi $$0) {
      ib.a $$1 = new ib.a();
      ib.a $$2 = new ib.a();
      cwi $$3 = $$0.f();
      cxc $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dpj $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ih[] $$8 = ih.values();
            dpq<dnb> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = je.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dnb $$16 = $$9.a($$12);
               dnb $$17 = $$16;

               for (ih $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (je.a($$1.u()) == $$3.e && je.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dac.a($$16, $$17, $$4, $$1, 18);
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

   public ta b() {
      ta $$0 = new ta();
      ta $$1 = new ta();

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

      for (ii $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         tg $$6 = new tg();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> ki.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         tg $$7 = new tg();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> ki.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dnb a(dnb var1, ih var2, dnb var3, cxc var4, ib var5, ib var6);

      default void a(cxc $$0) {
      }
   }

   static enum b implements dpv.a {
      a(
         dae.kO,
         dae.ed,
         dae.lM,
         dae.lN,
         dae.lO,
         dae.lP,
         dae.lQ,
         dae.lR,
         dae.lS,
         dae.lT,
         dae.lU,
         dae.lV,
         dae.lW,
         dae.lX,
         dae.lY,
         dae.lZ,
         dae.ma,
         dae.mb,
         dae.gS,
         dae.gT,
         dae.gU,
         dae.fA,
         dae.L,
         dae.I,
         dae.K,
         dae.cE,
         dae.cF,
         dae.cG,
         dae.cH,
         dae.cI,
         dae.cJ,
         dae.cK,
         dae.cR,
         dae.cS,
         dae.cT,
         dae.cU,
         dae.cW,
         dae.cX,
         dae.da,
         dae.db,
         dae.dc,
         dae.dd,
         dae.df,
         dae.dg,
         dae.dl,
         dae.dm,
         dae.dn,
         dae.do,
         dae.dq,
         dae.dr
      ) {
         @Override
         public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dae.cv, dae.gV) {
         @Override
         public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dbf.d) == dnt.a && $$2.c(dbf.d) == dnt.a) {
               ih $$6 = $$0.c(dbf.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dbf.c)) {
                  dnt $$7 = $$1 == $$6.h() ? dnt.b : dnt.c;
                  $$3.a($$5, $$2.a(dbf.d, $$7.a()), 18);
                  if ($$6 == ih.c || $$6 == ih.f) {
                     dki $$8 = $$3.c_($$4);
                     dki $$9 = $$3.c_($$5);
                     if ($$8 instanceof dkp && $$9 instanceof dkp) {
                        dkp.a((dkp)$$8, (dkp)$$9);
                     }
                  }

                  return $$0.a(dbf.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dae.aI, dae.aJ, dae.aG, dae.aK, dae.aH, dae.aE, dae.aF) {
         private final ThreadLocal<List<ObjectSet<ib>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
            dnb $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dnr.aC);
               List<ObjectSet<ib>> $$8 = this.g.get();
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
         public void a(cxc $$0) {
            ib.a $$1 = new ib.a();
            List<ObjectSet<ib>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ib> $$5 = $$2.get($$4);
               ObjectSet<ib> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ib $$7 = (ib)var8.next();
                  dnb $$8 = $$0.a_($$7);
                  if ($$8.c(dnr.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dnr.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ih $$9 : f) {
                           $$1.a($$7, $$9);
                           dnb $$10 = $$0.a_($$1);
                           if ($$10.b(dnr.aC) && $$8.c(dnr.aC) > $$3) {
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
      e(dae.fe, dae.fd) {
         @Override
         public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
            if ($$0.c(dhx.c) == 7) {
               dac $$6 = $$0.a(dae.fd) ? dae.eZ : dae.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dae.fd) ? dae.fb : dae.fc).o().a(ddx.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ih[] f = ih.values();

      b(dac... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, dac... $$1) {
         for (dac $$2 : $$1) {
            dpv.i.put($$2, this);
         }

         if ($$0) {
            dpv.j.add(this);
         }
      }
   }
}
