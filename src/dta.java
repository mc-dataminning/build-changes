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

public class dta {
   private static final Logger b = LogUtils.getLogger();
   public static final dta a = new dta(czs.a);
   private static final String c = "Indices";
   private static final it[] d = it.values();
   private final EnumSet<it> e = EnumSet.noneOf(it.class);
   private final List<evf<dde>> f = Lists.newArrayList();
   private final List<evf<elz>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dde, dta.a> i = new IdentityHashMap<>();
   static final Set<dta.a> j = Sets.newHashSet();

   private dta(daf $$0) {
      this.h = new int[$$0.am()][];
   }

   public dta(ua $$0, daf $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ua $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (it $$6 : it.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> ld.e.b(akh.a($$0x)).or(() -> Optional.of(ddg.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> ld.c.b(akh.a($$0x)).or(() -> Optional.of(emb.a)), this.g);
   }

   private static <T> void a(ua $$0, String $$1, Function<String, Optional<T>> $$2, List<evf<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (ux $$5 : $$0.c($$1, 10)) {
            evf.a((ua)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dsn $$0) {
      this.b($$0);

      for (it $$1 : d) {
         a($$0, $$1);
      }

      dad $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dde $$2x = $$1x.a() == ddg.a ? $$2.a_($$1x.b()).b() : (dde)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         elz $$2x = $$1x.a() == emb.a ? $$2.b_($$1x.b()).a() : (elz)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dsn $$0, it $$1) {
      dad $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<is> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(is.f);
         boolean $$7 = $$3.contains(is.e);
         boolean $$8 = $$3.contains(is.d);
         boolean $$9 = $$3.contains(is.c);
         boolean $$10 = $$3.size() == 1;
         czk $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         is[] $$16 = is.values();
         in.a $$17 = new in.a();

         for (in $$18 : in.b($$12, $$2.I_(), $$14, $$13, $$2.al() - 1, $$15)) {
            dqh $$19 = $$2.a_($$18);
            dqh $$20 = $$19;

            for (is $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dde.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dqh a(dqh $$0, is $$1, dae $$2, in $$3, in $$4) {
      return i.getOrDefault($$0.b(), dta.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dsn $$0) {
      in.a $$1 = new in.a();
      in.a $$2 = new in.a();
      czk $$3 = $$0.f();
      dae $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dso $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            is[] $$8 = is.values();
            dsv<dqh> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jp.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dqh $$16 = $$9.a($$12);
               dqh $$17 = $$16;

               for (is $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jp.a($$1.u()) == $$3.e && jp.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dde.a($$16, $$17, $$4, $$1, 18);
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

   public ua b() {
      ua $$0 = new ua();
      ua $$1 = new ua();

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

      for (it $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         ug $$6 = new ug();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> ld.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ug $$7 = new ug();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> ld.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dqh a(dqh var1, is var2, dqh var3, dae var4, in var5, in var6);

      default void a(dae $$0) {
      }
   }

   static enum b implements dta.a {
      a(
         ddg.kO,
         ddg.ed,
         ddg.lM,
         ddg.lN,
         ddg.lO,
         ddg.lP,
         ddg.lQ,
         ddg.lR,
         ddg.lS,
         ddg.lT,
         ddg.lU,
         ddg.lV,
         ddg.lW,
         ddg.lX,
         ddg.lY,
         ddg.lZ,
         ddg.ma,
         ddg.mb,
         ddg.gS,
         ddg.gT,
         ddg.gU,
         ddg.fA,
         ddg.L,
         ddg.I,
         ddg.K,
         ddg.cE,
         ddg.cF,
         ddg.cG,
         ddg.cH,
         ddg.cI,
         ddg.cJ,
         ddg.cK,
         ddg.cR,
         ddg.cS,
         ddg.cT,
         ddg.cU,
         ddg.cW,
         ddg.cX,
         ddg.da,
         ddg.db,
         ddg.dc,
         ddg.dd,
         ddg.df,
         ddg.dg,
         ddg.dl,
         ddg.dm,
         ddg.dn,
         ddg.do,
         ddg.dq,
         ddg.dr
      ) {
         @Override
         public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(ddg.cv, ddg.gV) {
         @Override
         public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(deh.d) == dqz.a && $$2.c(deh.d) == dqz.a) {
               is $$6 = $$0.c(deh.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(deh.c)) {
                  dqz $$7 = $$1 == $$6.h() ? dqz.b : dqz.c;
                  $$3.a($$5, $$2.a(deh.d, $$7.a()), 18);
                  if ($$6 == is.c || $$6 == is.f) {
                     dnm $$8 = $$3.c_($$4);
                     dnm $$9 = $$3.c_($$5);
                     if ($$8 instanceof dnt && $$9 instanceof dnt) {
                        dnt.a((dnt)$$8, (dnt)$$9);
                     }
                  }

                  return $$0.a(deh.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, ddg.aI, ddg.aJ, ddg.aG, ddg.aK, ddg.aH, ddg.aE, ddg.aF) {
         private final ThreadLocal<List<ObjectSet<in>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
            dqh $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dqx.aC);
               List<ObjectSet<in>> $$8 = this.g.get();
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
         public void a(dae $$0) {
            in.a $$1 = new in.a();
            List<ObjectSet<in>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<in> $$5 = $$2.get($$4);
               ObjectSet<in> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  in $$7 = (in)var8.next();
                  dqh $$8 = $$0.a_($$7);
                  if ($$8.c(dqx.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dqx.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (is $$9 : f) {
                           $$1.a($$7, $$9);
                           dqh $$10 = $$0.a_($$1);
                           if ($$10.b(dqx.aC) && $$8.c(dqx.aC) > $$3) {
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
      e(ddg.fe, ddg.fd) {
         @Override
         public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
            if ($$0.c(dla.c) == 7) {
               dde $$6 = $$0.a(ddg.fd) ? ddg.eZ : ddg.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(ddg.fd) ? ddg.fb : ddg.fc).n().a(dha.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final is[] f = is.values();

      b(dde... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, dde... $$1) {
         for (dde $$2 : $$1) {
            dta.i.put($$2, this);
         }

         if ($$0) {
            dta.j.add(this);
         }
      }
   }
}
