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

public class dod {
   private static final Logger b = LogUtils.getLogger();
   public static final dod a = new dod(cvg.a);
   private static final String c = "Indices";
   private static final ig[] d = ig.values();
   private final EnumSet<ig> e = EnumSet.noneOf(ig.class);
   private final List<epp<cys>> f = Lists.newArrayList();
   private final List<epp<egv>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cys, dod.a> i = new IdentityHashMap<>();
   static final Set<dod.a> j = Sets.newHashSet();

   private dod(cvt $$0) {
      this.h = new int[$$0.al()][];
   }

   public dod(sw $$0, cvt $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> kf.e.b(aiy.a($$0x)).or(() -> Optional.of(cyu.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kf.c.b(aiy.a($$0x)).or(() -> Optional.of(egx.a)), this.g);
   }

   private static <T> void a(sw $$0, String $$1, Function<String, Optional<T>> $$2, List<epp<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (tt $$5 : $$0.c($$1, 10)) {
            epp.a((sw)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dnq $$0) {
      this.b($$0);

      for (ig $$1 : d) {
         a($$0, $$1);
      }

      cvr $$2 = $$0.F();
      this.f.forEach($$1x -> {
         cys $$2x = $$1x.a() == cyu.a ? $$2.a_($$1x.b()).b() : (cys)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         egv $$2x = $$1x.a() == egx.a ? $$2.b_($$1x.b()).a() : (egv)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dnq $$0, ig $$1) {
      cvr $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ie> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ie.f);
         boolean $$7 = $$3.contains(ie.e);
         boolean $$8 = $$3.contains(ie.d);
         boolean $$9 = $$3.contains(ie.c);
         boolean $$10 = $$3.size() == 1;
         cuy $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ie[] $$16 = ie.values();
         hz.a $$17 = new hz.a();

         for (hz $$18 : hz.b($$12, $$2.J_(), $$14, $$13, $$2.ak() - 1, $$15)) {
            dlj $$19 = $$2.a_($$18);
            dlj $$20 = $$19;

            for (ie $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cys.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dlj a(dlj $$0, ie $$1, cvs $$2, hz $$3, hz $$4) {
      return i.getOrDefault($$0.b(), dod.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dnq $$0) {
      hz.a $$1 = new hz.a();
      hz.a $$2 = new hz.a();
      cuy $$3 = $$0.f();
      cvs $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dnr $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ie[] $$8 = ie.values();
            dny<dlj> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jb.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dlj $$16 = $$9.a($$12);
               dlj $$17 = $$16;

               for (ie $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jb.a($$1.u()) == $$3.e && jb.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               cys.a($$16, $$17, $$4, $$1, 18);
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
      dlj a(dlj var1, ie var2, dlj var3, cvs var4, hz var5, hz var6);

      default void a(cvs $$0) {
      }
   }

   static enum b implements dod.a {
      a(
         cyu.kO,
         cyu.ed,
         cyu.lM,
         cyu.lN,
         cyu.lO,
         cyu.lP,
         cyu.lQ,
         cyu.lR,
         cyu.lS,
         cyu.lT,
         cyu.lU,
         cyu.lV,
         cyu.lW,
         cyu.lX,
         cyu.lY,
         cyu.lZ,
         cyu.ma,
         cyu.mb,
         cyu.gS,
         cyu.gT,
         cyu.gU,
         cyu.fA,
         cyu.L,
         cyu.I,
         cyu.K,
         cyu.cE,
         cyu.cF,
         cyu.cG,
         cyu.cH,
         cyu.cI,
         cyu.cJ,
         cyu.cK,
         cyu.cR,
         cyu.cS,
         cyu.cT,
         cyu.cU,
         cyu.cW,
         cyu.cX,
         cyu.da,
         cyu.db,
         cyu.dc,
         cyu.dd,
         cyu.df,
         cyu.dg,
         cyu.dl,
         cyu.dm,
         cyu.dn,
         cyu.do,
         cyu.dq,
         cyu.dr
      ) {
         @Override
         public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cyu.cv, cyu.gV) {
         @Override
         public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(czv.d) == dmb.a && $$2.c(czv.d) == dmb.a) {
               ie $$6 = $$0.c(czv.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(czv.c)) {
                  dmb $$7 = $$1 == $$6.h() ? dmb.b : dmb.c;
                  $$3.a($$5, $$2.a(czv.d, $$7.a()), 18);
                  if ($$6 == ie.c || $$6 == ie.f) {
                     dix $$8 = $$3.c_($$4);
                     dix $$9 = $$3.c_($$5);
                     if ($$8 instanceof dje && $$9 instanceof dje) {
                        dje.a((dje)$$8, (dje)$$9);
                     }
                  }

                  return $$0.a(czv.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cyu.aI, cyu.aJ, cyu.aG, cyu.aK, cyu.aH, cyu.aE, cyu.aF) {
         private final ThreadLocal<List<ObjectSet<hz>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
            dlj $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dlz.aC);
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
         public void a(cvs $$0) {
            hz.a $$1 = new hz.a();
            List<ObjectSet<hz>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<hz> $$5 = $$2.get($$4);
               ObjectSet<hz> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  hz $$7 = (hz)var8.next();
                  dlj $$8 = $$0.a_($$7);
                  if ($$8.c(dlz.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dlz.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ie $$9 : f) {
                           $$1.a($$7, $$9);
                           dlj $$10 = $$0.a_($$1);
                           if ($$10.b(dlz.aC) && $$8.c(dlz.aC) > $$3) {
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
      e(cyu.fe, cyu.fd) {
         @Override
         public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
            if ($$0.c(dgn.c) == 7) {
               cys $$6 = $$0.a(cyu.fd) ? cyu.eZ : cyu.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(cyu.fd) ? cyu.fb : cyu.fc).o().a(dcn.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ie[] f = ie.values();

      b(cys... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cys... $$1) {
         for (cys $$2 : $$1) {
            dod.i.put($$2, this);
         }

         if ($$0) {
            dod.j.add(this);
         }
      }
   }
}
