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

public class dpt {
   private static final Logger b = LogUtils.getLogger();
   public static final dpt a = new dpt(cwo.a);
   private static final String c = "Indices";
   private static final ii[] d = ii.values();
   private final EnumSet<ii> e = EnumSet.noneOf(ii.class);
   private final List<erh<daa>> f = Lists.newArrayList();
   private final List<erh<eim>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<daa, dpt.a> i = new IdentityHashMap<>();
   static final Set<dpt.a> j = Sets.newHashSet();

   private dpt(cxb $$0) {
      this.h = new int[$$0.al()][];
   }

   public dpt(ta $$0, cxb $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> ki.e.b(ajh.a($$0x)).or(() -> Optional.of(dac.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> ki.c.b(ajh.a($$0x)).or(() -> Optional.of(eio.a)), this.g);
   }

   private static <T> void a(ta $$0, String $$1, Function<String, Optional<T>> $$2, List<erh<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (tx $$5 : $$0.c($$1, 10)) {
            erh.a((ta)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dpg $$0) {
      this.b($$0);

      for (ii $$1 : d) {
         a($$0, $$1);
      }

      cwz $$2 = $$0.F();
      this.f.forEach($$1x -> {
         daa $$2x = $$1x.a() == dac.a ? $$2.a_($$1x.b()).b() : (daa)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eim $$2x = $$1x.a() == eio.a ? $$2.b_($$1x.b()).a() : (eim)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dpg $$0, ii $$1) {
      cwz $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ih> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ih.f);
         boolean $$7 = $$3.contains(ih.e);
         boolean $$8 = $$3.contains(ih.d);
         boolean $$9 = $$3.contains(ih.c);
         boolean $$10 = $$3.size() == 1;
         cwg $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ih[] $$16 = ih.values();
         ib.a $$17 = new ib.a();

         for (ib $$18 : ib.b($$12, $$2.I_(), $$14, $$13, $$2.ak() - 1, $$15)) {
            dmz $$19 = $$2.a_($$18);
            dmz $$20 = $$19;

            for (ih $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            daa.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dmz a(dmz $$0, ih $$1, cxa $$2, ib $$3, ib $$4) {
      return i.getOrDefault($$0.b(), dpt.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dpg $$0) {
      ib.a $$1 = new ib.a();
      ib.a $$2 = new ib.a();
      cwg $$3 = $$0.f();
      cxa $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dph $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ih[] $$8 = ih.values();
            dpo<dmz> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = je.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dmz $$16 = $$9.a($$12);
               dmz $$17 = $$16;

               for (ih $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (je.a($$1.u()) == $$3.e && je.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               daa.a($$16, $$17, $$4, $$1, 18);
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
      dmz a(dmz var1, ih var2, dmz var3, cxa var4, ib var5, ib var6);

      default void a(cxa $$0) {
      }
   }

   static enum b implements dpt.a {
      a(
         dac.kO,
         dac.ed,
         dac.lM,
         dac.lN,
         dac.lO,
         dac.lP,
         dac.lQ,
         dac.lR,
         dac.lS,
         dac.lT,
         dac.lU,
         dac.lV,
         dac.lW,
         dac.lX,
         dac.lY,
         dac.lZ,
         dac.ma,
         dac.mb,
         dac.gS,
         dac.gT,
         dac.gU,
         dac.fA,
         dac.L,
         dac.I,
         dac.K,
         dac.cE,
         dac.cF,
         dac.cG,
         dac.cH,
         dac.cI,
         dac.cJ,
         dac.cK,
         dac.cR,
         dac.cS,
         dac.cT,
         dac.cU,
         dac.cW,
         dac.cX,
         dac.da,
         dac.db,
         dac.dc,
         dac.dd,
         dac.df,
         dac.dg,
         dac.dl,
         dac.dm,
         dac.dn,
         dac.do,
         dac.dq,
         dac.dr
      ) {
         @Override
         public dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dac.cv, dac.gV) {
         @Override
         public dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dbd.d) == dnr.a && $$2.c(dbd.d) == dnr.a) {
               ih $$6 = $$0.c(dbd.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dbd.c)) {
                  dnr $$7 = $$1 == $$6.h() ? dnr.b : dnr.c;
                  $$3.a($$5, $$2.a(dbd.d, $$7.a()), 18);
                  if ($$6 == ih.c || $$6 == ih.f) {
                     dkg $$8 = $$3.c_($$4);
                     dkg $$9 = $$3.c_($$5);
                     if ($$8 instanceof dkn && $$9 instanceof dkn) {
                        dkn.a((dkn)$$8, (dkn)$$9);
                     }
                  }

                  return $$0.a(dbd.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dac.aI, dac.aJ, dac.aG, dac.aK, dac.aH, dac.aE, dac.aF) {
         private final ThreadLocal<List<ObjectSet<ib>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
            dmz $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dnp.aC);
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
         public void a(cxa $$0) {
            ib.a $$1 = new ib.a();
            List<ObjectSet<ib>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ib> $$5 = $$2.get($$4);
               ObjectSet<ib> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ib $$7 = (ib)var8.next();
                  dmz $$8 = $$0.a_($$7);
                  if ($$8.c(dnp.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dnp.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ih $$9 : f) {
                           $$1.a($$7, $$9);
                           dmz $$10 = $$0.a_($$1);
                           if ($$10.b(dnp.aC) && $$8.c(dnp.aC) > $$3) {
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
      e(dac.fe, dac.fd) {
         @Override
         public dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
            if ($$0.c(dhv.c) == 7) {
               daa $$6 = $$0.a(dac.fd) ? dac.eZ : dac.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dac.fd) ? dac.fb : dac.fc).o().a(ddv.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ih[] f = ih.values();

      b(daa... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, daa... $$1) {
         for (daa $$2 : $$1) {
            dpt.i.put($$2, this);
         }

         if ($$0) {
            dpt.j.add(this);
         }
      }
   }
}
