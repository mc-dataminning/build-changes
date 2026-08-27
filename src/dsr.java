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

public class dsr {
   private static final Logger b = LogUtils.getLogger();
   public static final dsr a = new dsr(czj.a);
   private static final String c = "Indices";
   private static final is[] d = is.values();
   private final EnumSet<is> e = EnumSet.noneOf(is.class);
   private final List<euv<dcv>> f = Lists.newArrayList();
   private final List<euv<elq>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dcv, dsr.a> i = new IdentityHashMap<>();
   static final Set<dsr.a> j = Sets.newHashSet();

   private dsr(czw $$0) {
      this.h = new int[$$0.am()][];
   }

   public dsr(ty $$0, czw $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ty $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (is $$6 : is.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lc.e.b(akf.a($$0x)).or(() -> Optional.of(dcx.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lc.c.b(akf.a($$0x)).or(() -> Optional.of(els.a)), this.g);
   }

   private static <T> void a(ty $$0, String $$1, Function<String, Optional<T>> $$2, List<euv<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (uv $$5 : $$0.c($$1, 10)) {
            euv.a((ty)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dse $$0) {
      this.b($$0);

      for (is $$1 : d) {
         a($$0, $$1);
      }

      czu $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dcv $$2x = $$1x.a() == dcx.a ? $$2.a_($$1x.b()).b() : (dcv)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         elq $$2x = $$1x.a() == els.a ? $$2.b_($$1x.b()).a() : (elq)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dse $$0, is $$1) {
      czu $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ir> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ir.f);
         boolean $$7 = $$3.contains(ir.e);
         boolean $$8 = $$3.contains(ir.d);
         boolean $$9 = $$3.contains(ir.c);
         boolean $$10 = $$3.size() == 1;
         czb $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ir[] $$16 = ir.values();
         im.a $$17 = new im.a();

         for (im $$18 : im.b($$12, $$2.I_(), $$14, $$13, $$2.al() - 1, $$15)) {
            dpy $$19 = $$2.a_($$18);
            dpy $$20 = $$19;

            for (ir $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dcv.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dpy a(dpy $$0, ir $$1, czv $$2, im $$3, im $$4) {
      return i.getOrDefault($$0.b(), dsr.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dse $$0) {
      im.a $$1 = new im.a();
      im.a $$2 = new im.a();
      czb $$3 = $$0.f();
      czv $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dsf $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ir[] $$8 = ir.values();
            dsm<dpy> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jo.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dpy $$16 = $$9.a($$12);
               dpy $$17 = $$16;

               for (ir $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jo.a($$1.u()) == $$3.e && jo.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dcv.a($$16, $$17, $$4, $$1, 18);
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

   public ty b() {
      ty $$0 = new ty();
      ty $$1 = new ty();

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

      for (is $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         ue $$6 = new ue();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lc.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ue $$7 = new ue();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lc.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dpy a(dpy var1, ir var2, dpy var3, czv var4, im var5, im var6);

      default void a(czv $$0) {
      }
   }

   static enum b implements dsr.a {
      a(
         dcx.kO,
         dcx.ed,
         dcx.lM,
         dcx.lN,
         dcx.lO,
         dcx.lP,
         dcx.lQ,
         dcx.lR,
         dcx.lS,
         dcx.lT,
         dcx.lU,
         dcx.lV,
         dcx.lW,
         dcx.lX,
         dcx.lY,
         dcx.lZ,
         dcx.ma,
         dcx.mb,
         dcx.gS,
         dcx.gT,
         dcx.gU,
         dcx.fA,
         dcx.L,
         dcx.I,
         dcx.K,
         dcx.cE,
         dcx.cF,
         dcx.cG,
         dcx.cH,
         dcx.cI,
         dcx.cJ,
         dcx.cK,
         dcx.cR,
         dcx.cS,
         dcx.cT,
         dcx.cU,
         dcx.cW,
         dcx.cX,
         dcx.da,
         dcx.db,
         dcx.dc,
         dcx.dd,
         dcx.df,
         dcx.dg,
         dcx.dl,
         dcx.dm,
         dcx.dn,
         dcx.do,
         dcx.dq,
         dcx.dr
      ) {
         @Override
         public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dcx.cv, dcx.gV) {
         @Override
         public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(ddy.d) == dqq.a && $$2.c(ddy.d) == dqq.a) {
               ir $$6 = $$0.c(ddy.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(ddy.c)) {
                  dqq $$7 = $$1 == $$6.h() ? dqq.b : dqq.c;
                  $$3.a($$5, $$2.a(ddy.d, $$7.a()), 18);
                  if ($$6 == ir.c || $$6 == ir.f) {
                     dnd $$8 = $$3.c_($$4);
                     dnd $$9 = $$3.c_($$5);
                     if ($$8 instanceof dnk && $$9 instanceof dnk) {
                        dnk.a((dnk)$$8, (dnk)$$9);
                     }
                  }

                  return $$0.a(ddy.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dcx.aI, dcx.aJ, dcx.aG, dcx.aK, dcx.aH, dcx.aE, dcx.aF) {
         private final ThreadLocal<List<ObjectSet<im>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
            dpy $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dqo.aC);
               List<ObjectSet<im>> $$8 = this.g.get();
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
         public void a(czv $$0) {
            im.a $$1 = new im.a();
            List<ObjectSet<im>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<im> $$5 = $$2.get($$4);
               ObjectSet<im> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  im $$7 = (im)var8.next();
                  dpy $$8 = $$0.a_($$7);
                  if ($$8.c(dqo.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dqo.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ir $$9 : f) {
                           $$1.a($$7, $$9);
                           dpy $$10 = $$0.a_($$1);
                           if ($$10.b(dqo.aC) && $$8.c(dqo.aC) > $$3) {
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
      e(dcx.fe, dcx.fd) {
         @Override
         public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
            if ($$0.c(dkr.c) == 7) {
               dcv $$6 = $$0.a(dcx.fd) ? dcx.eZ : dcx.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dcx.fd) ? dcx.fb : dcx.fc).n().a(dgr.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ir[] f = ir.values();

      b(dcv... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, dcv... $$1) {
         for (dcv $$2 : $$1) {
            dsr.i.put($$2, this);
         }

         if ($$0) {
            dsr.j.add(this);
         }
      }
   }
}
