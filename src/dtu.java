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

public class dtu {
   private static final Logger b = LogUtils.getLogger();
   public static final dtu a = new dtu(dam.a);
   private static final String c = "Indices";
   private static final iu[] d = iu.values();
   private final EnumSet<iu> e = EnumSet.noneOf(iu.class);
   private final List<ewa<ddy>> f = Lists.newArrayList();
   private final List<ewa<emt>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<ddy, dtu.a> i = new IdentityHashMap<>();
   static final Set<dtu.a> j = Sets.newHashSet();

   private dtu(daz $$0) {
      this.h = new int[$$0.am()][];
   }

   public dtu(ud $$0, daz $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ud $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (iu $$6 : iu.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> le.e.b(akm.a($$0x)).or(() -> Optional.of(dea.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> le.c.b(akm.a($$0x)).or(() -> Optional.of(emv.a)), this.g);
   }

   private static <T> void a(ud $$0, String $$1, Function<String, Optional<T>> $$2, List<ewa<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (va $$5 : $$0.c($$1, 10)) {
            ewa.a((ud)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dth $$0) {
      this.b($$0);

      for (iu $$1 : d) {
         a($$0, $$1);
      }

      dax $$2 = $$0.F();
      this.f.forEach($$1x -> {
         ddy $$2x = $$1x.a() == dea.a ? $$2.a_($$1x.b()).b() : (ddy)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         emt $$2x = $$1x.a() == emv.a ? $$2.b_($$1x.b()).a() : (emt)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dth $$0, iu $$1) {
      dax $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<it> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(it.f);
         boolean $$7 = $$3.contains(it.e);
         boolean $$8 = $$3.contains(it.d);
         boolean $$9 = $$3.contains(it.c);
         boolean $$10 = $$3.size() == 1;
         dae $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         it[] $$16 = it.values();
         io.a $$17 = new io.a();

         for (io $$18 : io.b($$12, $$2.I_(), $$14, $$13, $$2.al() - 1, $$15)) {
            drb $$19 = $$2.a_($$18);
            drb $$20 = $$19;

            for (it $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            ddy.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static drb a(drb $$0, it $$1, day $$2, io $$3, io $$4) {
      return i.getOrDefault($$0.b(), dtu.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dth $$0) {
      io.a $$1 = new io.a();
      io.a $$2 = new io.a();
      dae $$3 = $$0.f();
      day $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dti $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            it[] $$8 = it.values();
            dtp<drb> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jq.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               drb $$16 = $$9.a($$12);
               drb $$17 = $$16;

               for (it $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jq.a($$1.u()) == $$3.e && jq.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               ddy.a($$16, $$17, $$4, $$1, 18);
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

   public ud b() {
      ud $$0 = new ud();
      ud $$1 = new ud();

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

      for (iu $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         uj $$6 = new uj();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> le.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         uj $$7 = new uj();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> le.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      drb a(drb var1, it var2, drb var3, day var4, io var5, io var6);

      default void a(day $$0) {
      }
   }

   static enum b implements dtu.a {
      a(
         dea.kO,
         dea.ed,
         dea.lM,
         dea.lN,
         dea.lO,
         dea.lP,
         dea.lQ,
         dea.lR,
         dea.lS,
         dea.lT,
         dea.lU,
         dea.lV,
         dea.lW,
         dea.lX,
         dea.lY,
         dea.lZ,
         dea.ma,
         dea.mb,
         dea.gS,
         dea.gT,
         dea.gU,
         dea.fA,
         dea.L,
         dea.I,
         dea.K,
         dea.cE,
         dea.cF,
         dea.cG,
         dea.cH,
         dea.cI,
         dea.cJ,
         dea.cK,
         dea.cR,
         dea.cS,
         dea.cT,
         dea.cU,
         dea.cW,
         dea.cX,
         dea.da,
         dea.db,
         dea.dc,
         dea.dd,
         dea.df,
         dea.dg,
         dea.dl,
         dea.dm,
         dea.dn,
         dea.do,
         dea.dq,
         dea.dr
      ) {
         @Override
         public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dea.cv, dea.gV) {
         @Override
         public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dfb.d) == drt.a && $$2.c(dfb.d) == drt.a) {
               it $$6 = $$0.c(dfb.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dfb.c)) {
                  drt $$7 = $$1 == $$6.h() ? drt.b : drt.c;
                  $$3.a($$5, $$2.a(dfb.d, $$7.a()), 18);
                  if ($$6 == it.c || $$6 == it.f) {
                     dog $$8 = $$3.c_($$4);
                     dog $$9 = $$3.c_($$5);
                     if ($$8 instanceof don && $$9 instanceof don) {
                        don.a((don)$$8, (don)$$9);
                     }
                  }

                  return $$0.a(dfb.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dea.aI, dea.aJ, dea.aG, dea.aK, dea.aH, dea.aE, dea.aF) {
         private final ThreadLocal<List<ObjectSet<io>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
            drb $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(drr.aC);
               List<ObjectSet<io>> $$8 = this.g.get();
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
         public void a(day $$0) {
            io.a $$1 = new io.a();
            List<ObjectSet<io>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<io> $$5 = $$2.get($$4);
               ObjectSet<io> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  io $$7 = (io)var8.next();
                  drb $$8 = $$0.a_($$7);
                  if ($$8.c(drr.aC) >= $$4) {
                     $$0.a($$7, $$8.a(drr.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (it $$9 : f) {
                           $$1.a($$7, $$9);
                           drb $$10 = $$0.a_($$1);
                           if ($$10.b(drr.aC) && $$8.c(drr.aC) > $$3) {
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
      e(dea.fe, dea.fd) {
         @Override
         public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
            if ($$0.c(dlu.c) == 7) {
               ddy $$6 = $$0.a(dea.fd) ? dea.eZ : dea.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dea.fd) ? dea.fb : dea.fc).n().a(dhu.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final it[] f = it.values();

      b(ddy... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, ddy... $$1) {
         for (ddy $$2 : $$1) {
            dtu.i.put($$2, this);
         }

         if ($$0) {
            dtu.j.add(this);
         }
      }
   }
}
