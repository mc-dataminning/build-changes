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

public class dux {
   private static final Logger b = LogUtils.getLogger();
   public static final dux a = new dux(dbp.a);
   private static final String c = "Indices";
   private static final jf[] d = jf.values();
   private final EnumSet<jf> e = EnumSet.noneOf(jf.class);
   private final List<exj<dfb>> f = Lists.newArrayList();
   private final List<exj<enw>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dfb, dux.a> i = new IdentityHashMap<>();
   static final Set<dux.a> j = Sets.newHashSet();

   private dux(dcc $$0) {
      this.h = new int[$$0.an()][];
   }

   public dux(us $$0, dcc $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> lp.e.b(alf.a($$0x)).or(() -> Optional.of(dfd.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lp.c.b(alf.a($$0x)).or(() -> Optional.of(eny.a)), this.g);
   }

   private static <T> void a(us $$0, String $$1, Function<String, Optional<T>> $$2, List<exj<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vp $$5 : $$0.c($$1, 10)) {
            exj.a((us)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(duk $$0) {
      this.b($$0);

      for (jf $$1 : d) {
         a($$0, $$1);
      }

      dca $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dfb $$2x = $$1x.a() == dfd.a ? $$2.a_($$1x.b()).b() : (dfb)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         enw $$2x = $$1x.a() == eny.a ? $$2.b_($$1x.b()).a() : (enw)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(duk $$0, jf $$1) {
      dca $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<je> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(je.f);
         boolean $$7 = $$3.contains(je.e);
         boolean $$8 = $$3.contains(je.d);
         boolean $$9 = $$3.contains(je.c);
         boolean $$10 = $$3.size() == 1;
         dbh $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         je[] $$16 = je.values();
         iz.a $$17 = new iz.a();

         for (iz $$18 : iz.b($$12, $$2.I_(), $$14, $$13, $$2.am() - 1, $$15)) {
            dse $$19 = $$2.a_($$18);
            dse $$20 = $$19;

            for (je $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dfb.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dse a(dse $$0, je $$1, dcb $$2, iz $$3, iz $$4) {
      return i.getOrDefault($$0.b(), dux.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(duk $$0) {
      iz.a $$1 = new iz.a();
      iz.a $$2 = new iz.a();
      dbh $$3 = $$0.f();
      dcb $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dul $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            je[] $$8 = je.values();
            dus<dse> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = kb.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dse $$16 = $$9.a($$12);
               dse $$17 = $$16;

               for (je $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kb.a($$1.u()) == $$3.e && kb.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dfb.a($$16, $$17, $$4, $$1, 18);
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
      dse a(dse var1, je var2, dse var3, dcb var4, iz var5, iz var6);

      default void a(dcb $$0) {
      }
   }

   static enum b implements dux.a {
      a(
         dfd.kO,
         dfd.ed,
         dfd.lM,
         dfd.lN,
         dfd.lO,
         dfd.lP,
         dfd.lQ,
         dfd.lR,
         dfd.lS,
         dfd.lT,
         dfd.lU,
         dfd.lV,
         dfd.lW,
         dfd.lX,
         dfd.lY,
         dfd.lZ,
         dfd.ma,
         dfd.mb,
         dfd.gS,
         dfd.gT,
         dfd.gU,
         dfd.fA,
         dfd.L,
         dfd.I,
         dfd.K,
         dfd.cE,
         dfd.cF,
         dfd.cG,
         dfd.cH,
         dfd.cI,
         dfd.cJ,
         dfd.cK,
         dfd.cR,
         dfd.cS,
         dfd.cT,
         dfd.cU,
         dfd.cW,
         dfd.cX,
         dfd.da,
         dfd.db,
         dfd.dc,
         dfd.dd,
         dfd.df,
         dfd.dg,
         dfd.dl,
         dfd.dm,
         dfd.dn,
         dfd.do,
         dfd.dq,
         dfd.dr
      ) {
         @Override
         public dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dfd.cv, dfd.gV) {
         @Override
         public dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dge.d) == dsw.a && $$2.c(dge.d) == dsw.a) {
               je $$6 = $$0.c(dge.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dge.c)) {
                  dsw $$7 = $$1 == $$6.h() ? dsw.b : dsw.c;
                  $$3.a($$5, $$2.a(dge.d, $$7.a()), 18);
                  if ($$6 == je.c || $$6 == je.f) {
                     dpj $$8 = $$3.c_($$4);
                     dpj $$9 = $$3.c_($$5);
                     if ($$8 instanceof dpq && $$9 instanceof dpq) {
                        dpq.a((dpq)$$8, (dpq)$$9);
                     }
                  }

                  return $$0.a(dge.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dfd.aI, dfd.aJ, dfd.aG, dfd.aK, dfd.aH, dfd.aE, dfd.aF) {
         private final ThreadLocal<List<ObjectSet<iz>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
            dse $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dsu.aC);
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
         public void a(dcb $$0) {
            iz.a $$1 = new iz.a();
            List<ObjectSet<iz>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iz> $$5 = $$2.get($$4);
               ObjectSet<iz> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iz $$7 = (iz)var8.next();
                  dse $$8 = $$0.a_($$7);
                  if ($$8.c(dsu.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dsu.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (je $$9 : f) {
                           $$1.a($$7, $$9);
                           dse $$10 = $$0.a_($$1);
                           if ($$10.b(dsu.aC) && $$8.c(dsu.aC) > $$3) {
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
      e(dfd.fe, dfd.fd) {
         @Override
         public dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
            if ($$0.c(dmx.c) == 7) {
               dfb $$6 = $$0.a(dfd.fd) ? dfd.eZ : dfd.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dfd.fd) ? dfd.fb : dfd.fc).o().a(dix.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final je[] f = je.values();

      b(final dfb... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dfb... $$1) {
         for (dfb $$2 : $$1) {
            dux.i.put($$2, this);
         }

         if ($$0) {
            dux.j.add(this);
         }
      }
   }
}
