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

public class dvt {
   private static final Logger b = LogUtils.getLogger();
   public static final dvt a = new dvt(dcj.a);
   private static final String c = "Indices";
   private static final jj[] d = jj.values();
   private final EnumSet<jj> e = EnumSet.noneOf(jj.class);
   private final List<eym<dfw>> f = Lists.newArrayList();
   private final List<eym<eox>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dfw, dvt.a> i = new IdentityHashMap<>();
   static final Set<dvt.a> j = Sets.newHashSet();

   private dvt(dcw $$0) {
      this.h = new int[$$0.an()][];
   }

   public dvt(ua $$0, dcw $$1) {
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

      for (jj $$6 : jj.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lt.e.b(akq.c($$0x)).or(() -> Optional.of(dfy.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lt.c.b(akq.c($$0x)).or(() -> Optional.of(eoz.a)), this.g);
   }

   private static <T> void a(ua $$0, String $$1, Function<String, Optional<T>> $$2, List<eym<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (ux $$5 : $$0.c($$1, 10)) {
            eym.a((ua)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dvg $$0) {
      this.b($$0);

      for (jj $$1 : d) {
         a($$0, $$1);
      }

      dcu $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dfw $$2x = $$1x.a() == dfy.a ? $$2.a_($$1x.b()).b() : (dfw)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eox $$2x = $$1x.a() == eoz.a ? $$2.b_($$1x.b()).a() : (eox)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dvg $$0, jj $$1) {
      dcu $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ji> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ji.f);
         boolean $$7 = $$3.contains(ji.e);
         boolean $$8 = $$3.contains(ji.d);
         boolean $$9 = $$3.contains(ji.c);
         boolean $$10 = $$3.size() == 1;
         dcb $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ji[] $$16 = ji.values();
         jd.a $$17 = new jd.a();

         for (jd $$18 : jd.b($$12, $$2.I_(), $$14, $$13, $$2.am() - 1, $$15)) {
            dta $$19 = $$2.a_($$18);
            dta $$20 = $$19;

            for (ji $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dfw.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dta a(dta $$0, ji $$1, dcv $$2, jd $$3, jd $$4) {
      return i.getOrDefault($$0.b(), dvt.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dvg $$0) {
      jd.a $$1 = new jd.a();
      jd.a $$2 = new jd.a();
      dcb $$3 = $$0.f();
      dcv $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dvh $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ji[] $$8 = ji.values();
            dvo<dta> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = kf.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dta $$16 = $$9.a($$12);
               dta $$17 = $$16;

               for (ji $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kf.a($$1.u()) == $$3.e && kf.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dfw.a($$16, $$17, $$4, $$1, 18);
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

      for (jj $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         ug $$6 = new ug();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lt.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ug $$7 = new ug();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lt.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dta a(dta var1, ji var2, dta var3, dcv var4, jd var5, jd var6);

      default void a(dcv $$0) {
      }
   }

   static enum b implements dvt.a {
      a(
         dfy.kO,
         dfy.ed,
         dfy.lM,
         dfy.lN,
         dfy.lO,
         dfy.lP,
         dfy.lQ,
         dfy.lR,
         dfy.lS,
         dfy.lT,
         dfy.lU,
         dfy.lV,
         dfy.lW,
         dfy.lX,
         dfy.lY,
         dfy.lZ,
         dfy.ma,
         dfy.mb,
         dfy.gS,
         dfy.gT,
         dfy.gU,
         dfy.fA,
         dfy.L,
         dfy.I,
         dfy.K,
         dfy.cE,
         dfy.cF,
         dfy.cG,
         dfy.cH,
         dfy.cI,
         dfy.cJ,
         dfy.cK,
         dfy.cR,
         dfy.cS,
         dfy.cT,
         dfy.cU,
         dfy.cW,
         dfy.cX,
         dfy.da,
         dfy.db,
         dfy.dc,
         dfy.dd,
         dfy.df,
         dfy.dg,
         dfy.dl,
         dfy.dm,
         dfy.dn,
         dfy.do,
         dfy.dq,
         dfy.dr
      ) {
         @Override
         public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dfy.cv, dfy.gV) {
         @Override
         public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dgz.d) == dts.a && $$2.c(dgz.d) == dts.a) {
               ji $$6 = $$0.c(dgz.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dgz.c)) {
                  dts $$7 = $$1 == $$6.h() ? dts.b : dts.c;
                  $$3.a($$5, $$2.a(dgz.d, $$7.a()), 18);
                  if ($$6 == ji.c || $$6 == ji.f) {
                     dqf $$8 = $$3.c_($$4);
                     dqf $$9 = $$3.c_($$5);
                     if ($$8 instanceof dqm && $$9 instanceof dqm) {
                        dqm.a((dqm)$$8, (dqm)$$9);
                     }
                  }

                  return $$0.a(dgz.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dfy.aI, dfy.aJ, dfy.aG, dfy.aK, dfy.aH, dfy.aE, dfy.aF) {
         private final ThreadLocal<List<ObjectSet<jd>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
            dta $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dtq.aC);
               List<ObjectSet<jd>> $$8 = this.g.get();
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
         public void a(dcv $$0) {
            jd.a $$1 = new jd.a();
            List<ObjectSet<jd>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jd> $$5 = $$2.get($$4);
               ObjectSet<jd> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jd $$7 = (jd)var8.next();
                  dta $$8 = $$0.a_($$7);
                  if ($$8.c(dtq.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dtq.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ji $$9 : f) {
                           $$1.a($$7, $$9);
                           dta $$10 = $$0.a_($$1);
                           if ($$10.b(dtq.aC) && $$8.c(dtq.aC) > $$3) {
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
      e(dfy.fe, dfy.fd) {
         @Override
         public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
            if ($$0.c(dnt.c) == 7) {
               dfw $$6 = $$0.a(dfy.fd) ? dfy.eZ : dfy.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dfy.fd) ? dfy.fb : dfy.fc).o().a(djs.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ji[] f = ji.values();

      b(final dfw... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dfw... $$1) {
         for (dfw $$2 : $$1) {
            dvt.i.put($$2, this);
         }

         if ($$0) {
            dvt.j.add(this);
         }
      }
   }
}
