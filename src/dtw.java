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

public class dtw {
   private static final Logger b = LogUtils.getLogger();
   public static final dtw a = new dtw(dao.a);
   private static final String c = "Indices";
   private static final iu[] d = iu.values();
   private final EnumSet<iu> e = EnumSet.noneOf(iu.class);
   private final List<ewc<dea>> f = Lists.newArrayList();
   private final List<ewc<emv>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dea, dtw.a> i = new IdentityHashMap<>();
   static final Set<dtw.a> j = Sets.newHashSet();

   private dtw(dbb $$0) {
      this.h = new int[$$0.am()][];
   }

   public dtw(ud $$0, dbb $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> le.e.b(akn.a($$0x)).or(() -> Optional.of(dec.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> le.c.b(akn.a($$0x)).or(() -> Optional.of(emx.a)), this.g);
   }

   private static <T> void a(ud $$0, String $$1, Function<String, Optional<T>> $$2, List<ewc<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (va $$5 : $$0.c($$1, 10)) {
            ewc.a((ud)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dtj $$0) {
      this.b($$0);

      for (iu $$1 : d) {
         a($$0, $$1);
      }

      daz $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dea $$2x = $$1x.a() == dec.a ? $$2.a_($$1x.b()).b() : (dea)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         emv $$2x = $$1x.a() == emx.a ? $$2.b_($$1x.b()).a() : (emv)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dtj $$0, iu $$1) {
      daz $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<it> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(it.f);
         boolean $$7 = $$3.contains(it.e);
         boolean $$8 = $$3.contains(it.d);
         boolean $$9 = $$3.contains(it.c);
         boolean $$10 = $$3.size() == 1;
         dag $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         it[] $$16 = it.values();
         io.a $$17 = new io.a();

         for (io $$18 : io.b($$12, $$2.I_(), $$14, $$13, $$2.al() - 1, $$15)) {
            drd $$19 = $$2.a_($$18);
            drd $$20 = $$19;

            for (it $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dea.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static drd a(drd $$0, it $$1, dba $$2, io $$3, io $$4) {
      return i.getOrDefault($$0.b(), dtw.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dtj $$0) {
      io.a $$1 = new io.a();
      io.a $$2 = new io.a();
      dag $$3 = $$0.f();
      dba $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dtk $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            it[] $$8 = it.values();
            dtr<drd> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jq.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               drd $$16 = $$9.a($$12);
               drd $$17 = $$16;

               for (it $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jq.a($$1.u()) == $$3.e && jq.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dea.a($$16, $$17, $$4, $$1, 18);
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
      drd a(drd var1, it var2, drd var3, dba var4, io var5, io var6);

      default void a(dba $$0) {
      }
   }

   static enum b implements dtw.a {
      a(
         dec.kO,
         dec.ed,
         dec.lM,
         dec.lN,
         dec.lO,
         dec.lP,
         dec.lQ,
         dec.lR,
         dec.lS,
         dec.lT,
         dec.lU,
         dec.lV,
         dec.lW,
         dec.lX,
         dec.lY,
         dec.lZ,
         dec.ma,
         dec.mb,
         dec.gS,
         dec.gT,
         dec.gU,
         dec.fA,
         dec.L,
         dec.I,
         dec.K,
         dec.cE,
         dec.cF,
         dec.cG,
         dec.cH,
         dec.cI,
         dec.cJ,
         dec.cK,
         dec.cR,
         dec.cS,
         dec.cT,
         dec.cU,
         dec.cW,
         dec.cX,
         dec.da,
         dec.db,
         dec.dc,
         dec.dd,
         dec.df,
         dec.dg,
         dec.dl,
         dec.dm,
         dec.dn,
         dec.do,
         dec.dq,
         dec.dr
      ) {
         @Override
         public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dec.cv, dec.gV) {
         @Override
         public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dfd.d) == drv.a && $$2.c(dfd.d) == drv.a) {
               it $$6 = $$0.c(dfd.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dfd.c)) {
                  drv $$7 = $$1 == $$6.h() ? drv.b : drv.c;
                  $$3.a($$5, $$2.a(dfd.d, $$7.a()), 18);
                  if ($$6 == it.c || $$6 == it.f) {
                     doi $$8 = $$3.c_($$4);
                     doi $$9 = $$3.c_($$5);
                     if ($$8 instanceof dop && $$9 instanceof dop) {
                        dop.a((dop)$$8, (dop)$$9);
                     }
                  }

                  return $$0.a(dfd.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dec.aI, dec.aJ, dec.aG, dec.aK, dec.aH, dec.aE, dec.aF) {
         private final ThreadLocal<List<ObjectSet<io>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
            drd $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(drt.aC);
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
         public void a(dba $$0) {
            io.a $$1 = new io.a();
            List<ObjectSet<io>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<io> $$5 = $$2.get($$4);
               ObjectSet<io> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  io $$7 = (io)var8.next();
                  drd $$8 = $$0.a_($$7);
                  if ($$8.c(drt.aC) >= $$4) {
                     $$0.a($$7, $$8.a(drt.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (it $$9 : f) {
                           $$1.a($$7, $$9);
                           drd $$10 = $$0.a_($$1);
                           if ($$10.b(drt.aC) && $$8.c(drt.aC) > $$3) {
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
      e(dec.fe, dec.fd) {
         @Override
         public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
            if ($$0.c(dlw.c) == 7) {
               dea $$6 = $$0.a(dec.fd) ? dec.eZ : dec.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dec.fd) ? dec.fb : dec.fc).n().a(dhw.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final it[] f = it.values();

      b(dea... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, dea... $$1) {
         for (dea $$2 : $$1) {
            dtw.i.put($$2, this);
         }

         if ($$0) {
            dtw.j.add(this);
         }
      }
   }
}
