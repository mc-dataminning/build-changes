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

public class dvv {
   private static final Logger b = LogUtils.getLogger();
   public static final dvv a = new dvv(dcl.a);
   private static final String c = "Indices";
   private static final jj[] d = jj.values();
   private final EnumSet<jj> e = EnumSet.noneOf(jj.class);
   private final List<eyq<dfy>> f = Lists.newArrayList();
   private final List<eyq<epb>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dfy, dvv.a> i = new IdentityHashMap<>();
   static final Set<dvv.a> j = Sets.newHashSet();

   private dvv(dcy $$0) {
      this.h = new int[$$0.an()][];
   }

   public dvv(ub $$0, dcy $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ub $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jj $$6 : jj.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lt.e.b(akr.c($$0x)).or(() -> Optional.of(dga.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lt.c.b(akr.c($$0x)).or(() -> Optional.of(epd.a)), this.g);
   }

   private static <T> void a(ub $$0, String $$1, Function<String, Optional<T>> $$2, List<eyq<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (uy $$5 : $$0.c($$1, 10)) {
            eyq.a((ub)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dvi $$0) {
      this.b($$0);

      for (jj $$1 : d) {
         a($$0, $$1);
      }

      dcw $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dfy $$2x = $$1x.a() == dga.a ? $$2.a_($$1x.b()).b() : (dfy)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         epb $$2x = $$1x.a() == epd.a ? $$2.b_($$1x.b()).a() : (epb)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dvi $$0, jj $$1) {
      dcw $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ji> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ji.f);
         boolean $$7 = $$3.contains(ji.e);
         boolean $$8 = $$3.contains(ji.d);
         boolean $$9 = $$3.contains(ji.c);
         boolean $$10 = $$3.size() == 1;
         dcd $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ji[] $$16 = ji.values();
         jd.a $$17 = new jd.a();

         for (jd $$18 : jd.b($$12, $$2.I_(), $$14, $$13, $$2.am() - 1, $$15)) {
            dtc $$19 = $$2.a_($$18);
            dtc $$20 = $$19;

            for (ji $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dfy.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dtc a(dtc $$0, ji $$1, dcx $$2, jd $$3, jd $$4) {
      return i.getOrDefault($$0.b(), dvv.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dvi $$0) {
      jd.a $$1 = new jd.a();
      jd.a $$2 = new jd.a();
      dcd $$3 = $$0.f();
      dcx $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dvj $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ji[] $$8 = ji.values();
            dvq<dtc> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = kf.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dtc $$16 = $$9.a($$12);
               dtc $$17 = $$16;

               for (ji $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kf.a($$1.u()) == $$3.e && kf.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dfy.a($$16, $$17, $$4, $$1, 18);
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

   public ub b() {
      ub $$0 = new ub();
      ub $$1 = new ub();

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

      for (jj $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         uh $$6 = new uh();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lt.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         uh $$7 = new uh();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lt.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dtc a(dtc var1, ji var2, dtc var3, dcx var4, jd var5, jd var6);

      default void a(dcx $$0) {
      }
   }

   static enum b implements dvv.a {
      a(
         dga.kO,
         dga.ed,
         dga.lM,
         dga.lN,
         dga.lO,
         dga.lP,
         dga.lQ,
         dga.lR,
         dga.lS,
         dga.lT,
         dga.lU,
         dga.lV,
         dga.lW,
         dga.lX,
         dga.lY,
         dga.lZ,
         dga.ma,
         dga.mb,
         dga.gS,
         dga.gT,
         dga.gU,
         dga.fA,
         dga.L,
         dga.I,
         dga.K,
         dga.cE,
         dga.cF,
         dga.cG,
         dga.cH,
         dga.cI,
         dga.cJ,
         dga.cK,
         dga.cR,
         dga.cS,
         dga.cT,
         dga.cU,
         dga.cW,
         dga.cX,
         dga.da,
         dga.db,
         dga.dc,
         dga.dd,
         dga.df,
         dga.dg,
         dga.dl,
         dga.dm,
         dga.dn,
         dga.do,
         dga.dq,
         dga.dr
      ) {
         @Override
         public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dga.cv, dga.gV) {
         @Override
         public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dhb.d) == dtu.a && $$2.c(dhb.d) == dtu.a) {
               ji $$6 = $$0.c(dhb.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dhb.c)) {
                  dtu $$7 = $$1 == $$6.h() ? dtu.b : dtu.c;
                  $$3.a($$5, $$2.a(dhb.d, $$7.a()), 18);
                  if ($$6 == ji.c || $$6 == ji.f) {
                     dqh $$8 = $$3.c_($$4);
                     dqh $$9 = $$3.c_($$5);
                     if ($$8 instanceof dqo && $$9 instanceof dqo) {
                        dqo.a((dqo)$$8, (dqo)$$9);
                     }
                  }

                  return $$0.a(dhb.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dga.aI, dga.aJ, dga.aG, dga.aK, dga.aH, dga.aE, dga.aF) {
         private final ThreadLocal<List<ObjectSet<jd>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
            dtc $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dts.aC);
               List<ObjectSet<jd>> $$8 = this.g.get();
               if ($$8.isEmpty()) {
                  for (int $$9 = 0; $$9 < 7; $$9++) {
                     $$8.add(new ObjectOpenHashSet());
                  }
               }

               $$8.get($$7).add($$4.j());
            }

            return $$0;
         }

         @Override
         public void a(dcx $$0) {
            jd.a $$1 = new jd.a();
            List<ObjectSet<jd>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jd> $$5 = $$2.get($$4);
               ObjectSet<jd> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jd $$7 = (jd)var8.next();
                  dtc $$8 = $$0.a_($$7);
                  if ($$8.c(dts.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dts.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ji $$9 : f) {
                           $$1.a($$7, $$9);
                           dtc $$10 = $$0.a_($$1);
                           if ($$10.b(dts.aC) && $$8.c(dts.aC) > $$3) {
                              $$6.add($$1.j());
                           }
                        }
                     }
                  }
               }
            }

            $$2.clear();
         }
      },
      e(dga.fe, dga.fd) {
         @Override
         public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
            if ($$0.c(dnv.c) == 7) {
               dfy $$6 = $$0.a(dga.fd) ? dga.eZ : dga.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dga.fd) ? dga.fb : dga.fc).o().a(dju.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ji[] f = ji.values();

      b(final dfy... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dfy... $$1) {
         for (dfy $$2 : $$1) {
            dvv.i.put($$2, this);
         }

         if ($$0) {
            dvv.j.add(this);
         }
      }
   }
}
