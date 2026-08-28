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

public class duv {
   private static final Logger b = LogUtils.getLogger();
   public static final duv a = new duv(dbn.a);
   private static final String c = "Indices";
   private static final jf[] d = jf.values();
   private final EnumSet<jf> e = EnumSet.noneOf(jf.class);
   private final List<exh<dez>> f = Lists.newArrayList();
   private final List<exh<enu>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dez, duv.a> i = new IdentityHashMap<>();
   static final Set<duv.a> j = Sets.newHashSet();

   private duv(dca $$0) {
      this.h = new int[$$0.an()][];
   }

   public duv(us $$0, dca $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         us $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jf $$6 : jf.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lp.e.b(alf.a($$0x)).or(() -> Optional.of(dfb.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lp.c.b(alf.a($$0x)).or(() -> Optional.of(enw.a)), this.g);
   }

   private static <T> void a(us $$0, String $$1, Function<String, Optional<T>> $$2, List<exh<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vp $$5 : $$0.c($$1, 10)) {
            exh.a((us)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dui $$0) {
      this.b($$0);

      for (jf $$1 : d) {
         a($$0, $$1);
      }

      dby $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dez $$2x = $$1x.a() == dfb.a ? $$2.a_($$1x.b()).b() : (dez)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         enu $$2x = $$1x.a() == enw.a ? $$2.b_($$1x.b()).a() : (enu)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dui $$0, jf $$1) {
      dby $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<je> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(je.f);
         boolean $$7 = $$3.contains(je.e);
         boolean $$8 = $$3.contains(je.d);
         boolean $$9 = $$3.contains(je.c);
         boolean $$10 = $$3.size() == 1;
         dbf $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         je[] $$16 = je.values();
         iz.a $$17 = new iz.a();

         for (iz $$18 : iz.b($$12, $$2.I_(), $$14, $$13, $$2.am() - 1, $$15)) {
            dsc $$19 = $$2.a_($$18);
            dsc $$20 = $$19;

            for (je $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dez.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dsc a(dsc $$0, je $$1, dbz $$2, iz $$3, iz $$4) {
      return i.getOrDefault($$0.b(), duv.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dui $$0) {
      iz.a $$1 = new iz.a();
      iz.a $$2 = new iz.a();
      dbf $$3 = $$0.f();
      dbz $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         duj $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            je[] $$8 = je.values();
            duq<dsc> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = kb.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dsc $$16 = $$9.a($$12);
               dsc $$17 = $$16;

               for (je $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kb.a($$1.u()) == $$3.e && kb.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dez.a($$16, $$17, $$4, $$1, 18);
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

   public us b() {
      us $$0 = new us();
      us $$1 = new us();

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

      for (jf $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         uy $$6 = new uy();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lp.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         uy $$7 = new uy();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lp.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dsc a(dsc var1, je var2, dsc var3, dbz var4, iz var5, iz var6);

      default void a(dbz $$0) {
      }
   }

   static enum b implements duv.a {
      a(
         dfb.kO,
         dfb.ed,
         dfb.lM,
         dfb.lN,
         dfb.lO,
         dfb.lP,
         dfb.lQ,
         dfb.lR,
         dfb.lS,
         dfb.lT,
         dfb.lU,
         dfb.lV,
         dfb.lW,
         dfb.lX,
         dfb.lY,
         dfb.lZ,
         dfb.ma,
         dfb.mb,
         dfb.gS,
         dfb.gT,
         dfb.gU,
         dfb.fA,
         dfb.L,
         dfb.I,
         dfb.K,
         dfb.cE,
         dfb.cF,
         dfb.cG,
         dfb.cH,
         dfb.cI,
         dfb.cJ,
         dfb.cK,
         dfb.cR,
         dfb.cS,
         dfb.cT,
         dfb.cU,
         dfb.cW,
         dfb.cX,
         dfb.da,
         dfb.db,
         dfb.dc,
         dfb.dd,
         dfb.df,
         dfb.dg,
         dfb.dl,
         dfb.dm,
         dfb.dn,
         dfb.do,
         dfb.dq,
         dfb.dr
      ) {
         @Override
         public dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dfb.cv, dfb.gV) {
         @Override
         public dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dgc.d) == dsu.a && $$2.c(dgc.d) == dsu.a) {
               je $$6 = $$0.c(dgc.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dgc.c)) {
                  dsu $$7 = $$1 == $$6.h() ? dsu.b : dsu.c;
                  $$3.a($$5, $$2.a(dgc.d, $$7.a()), 18);
                  if ($$6 == je.c || $$6 == je.f) {
                     dph $$8 = $$3.c_($$4);
                     dph $$9 = $$3.c_($$5);
                     if ($$8 instanceof dpo && $$9 instanceof dpo) {
                        dpo.a((dpo)$$8, (dpo)$$9);
                     }
                  }

                  return $$0.a(dgc.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dfb.aI, dfb.aJ, dfb.aG, dfb.aK, dfb.aH, dfb.aE, dfb.aF) {
         private final ThreadLocal<List<ObjectSet<iz>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
            dsc $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dss.aC);
               List<ObjectSet<iz>> $$8 = this.g.get();
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
         public void a(dbz $$0) {
            iz.a $$1 = new iz.a();
            List<ObjectSet<iz>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iz> $$5 = $$2.get($$4);
               ObjectSet<iz> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iz $$7 = (iz)var8.next();
                  dsc $$8 = $$0.a_($$7);
                  if ($$8.c(dss.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dss.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (je $$9 : f) {
                           $$1.a($$7, $$9);
                           dsc $$10 = $$0.a_($$1);
                           if ($$10.b(dss.aC) && $$8.c(dss.aC) > $$3) {
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
      e(dfb.fe, dfb.fd) {
         @Override
         public dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
            if ($$0.c(dmv.c) == 7) {
               dez $$6 = $$0.a(dfb.fd) ? dfb.eZ : dfb.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dfb.fd) ? dfb.fb : dfb.fc).o().a(div.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final je[] f = je.values();

      b(final dez... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dez... $$1) {
         for (dez $$2 : $$1) {
            duv.i.put($$2, this);
         }

         if ($$0) {
            duv.j.add(this);
         }
      }
   }
}
