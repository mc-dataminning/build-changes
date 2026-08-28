import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrays;
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

public class eaf {
   private static final Logger b = LogUtils.getLogger();
   public static final eaf a = new eaf(dgp.a);
   private static final String c = "Indices";
   private static final jn[] d = jn.values();
   private final EnumSet<jn> e = EnumSet.noneOf(jn.class);
   private final List<fdj<dke>> f = Lists.newArrayList();
   private final List<fdj<eto>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dke, eaf.a> i = new IdentityHashMap<>();
   static final Set<eaf.a> j = Sets.newHashSet();

   private eaf(dhc $$0) {
      this.h = new int[$$0.an()][];
   }

   public eaf(ux $$0, dhc $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ux $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jn $$6 : jn.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> ma.e.b(alz.c($$0x)).or(() -> Optional.of(dkg.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> ma.c.b(alz.c($$0x)).or(() -> Optional.of(etq.a)), this.g);
   }

   private eaf(eaf $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(ux $$0, String $$1, Function<String, Optional<T>> $$2, List<fdj<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vu $$5 : $$0.c($$1, 10)) {
            fdj.a((ux)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dzs $$0) {
      this.b($$0);

      for (jn $$1 : d) {
         a($$0, $$1);
      }

      dha $$2 = $$0.E();
      this.f.forEach($$1x -> {
         dke $$2x = $$1x.a() == dkg.a ? $$2.a_($$1x.b()).b() : (dke)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eto $$2x = $$1x.a() == etq.a ? $$2.b_($$1x.b()).a() : (eto)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dzs $$0, jn $$1) {
      dha $$2 = $$0.E();
      if ($$0.q().e.remove($$1)) {
         Set<jm> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jm.f);
         boolean $$7 = $$3.contains(jm.e);
         boolean $$8 = $$3.contains(jm.d);
         boolean $$9 = $$3.contains(jm.c);
         boolean $$10 = $$3.size() == 1;
         dgg $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jm[] $$16 = jm.values();
         jh.a $$17 = new jh.a();

         for (jh $$18 : jh.b($$12, $$2.L_(), $$14, $$13, $$2.am(), $$15)) {
            dxn $$19 = $$2.a_($$18);
            dxn $$20 = $$19;

            for (jm $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dke.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dxn a(dxn $$0, jm $$1, dhb $$2, jh $$3, jh $$4) {
      return i.getOrDefault($$0.b(), eaf.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dzs $$0) {
      jh.a $$1 = new jh.a();
      jh.a $$2 = new jh.a();
      dgg $$3 = $$0.f();
      dhb $$4 = $$0.E();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dzt $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jm[] $$8 = jm.values();
            eaa<dxn> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kj.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dxn $$16 = $$9.a($$12);
               dxn $$17 = $$16;

               for (jm $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kj.a($$1.u()) == $$3.g && kj.a($$1.w()) == $$3.h) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dke.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.g, $$3.h});
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

   public ux b() {
      ux $$0 = new ux();
      ux $$1 = new ux();

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

      for (jn $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         vd $$6 = new vd();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> ma.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         vd $$7 = new vd();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> ma.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public eaf c() {
      return this == a ? a : new eaf(this);
   }

   public interface a {
      dxn a(dxn var1, jm var2, dxn var3, dhb var4, jh var5, jh var6);

      default void a(dhb $$0) {
      }
   }

   static enum b implements eaf.a {
      a(
         dkg.lj,
         dkg.eq,
         dkg.mh,
         dkg.mi,
         dkg.mj,
         dkg.mk,
         dkg.ml,
         dkg.mm,
         dkg.mn,
         dkg.mo,
         dkg.mp,
         dkg.mq,
         dkg.mr,
         dkg.ms,
         dkg.mt,
         dkg.mu,
         dkg.mv,
         dkg.mw,
         dkg.hi,
         dkg.hj,
         dkg.hk,
         dkg.fO,
         dkg.O,
         dkg.L,
         dkg.N,
         dkg.cM,
         dkg.cN,
         dkg.cO,
         dkg.cP,
         dkg.cQ,
         dkg.cR,
         dkg.cS,
         dkg.cT,
         dkg.da,
         dkg.db,
         dkg.dc,
         dkg.dd,
         dkg.df,
         dkg.dg,
         dkg.dh,
         dkg.dk,
         dkg.dl,
         dkg.dm,
         dkg.dn,
         dkg.dp,
         dkg.dq,
         dkg.dr,
         dkg.dw,
         dkg.dx,
         dkg.dy,
         dkg.dz,
         dkg.dB,
         dkg.dC,
         dkg.dD
      ) {
         @Override
         public dxn a(dxn $$0, jm $$1, dxn $$2, dhb $$3, jh $$4, jh $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dxn a(dxn $$0, jm $$1, dxn $$2, dhb $$3, jh $$4, jh $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
         }
      },
      c(dkg.cD, dkg.hl) {
         @Override
         public dxn a(dxn $$0, jm $$1, dxn $$2, dhb $$3, jh $$4, jh $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dli.d) == dyf.a && $$2.c(dli.d) == dyf.a) {
               jm $$6 = $$0.c(dli.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dli.c)) {
                  dyf $$7 = $$1 == $$6.h() ? dyf.b : dyf.c;
                  $$3.a($$5, $$2.b(dli.d, $$7.a()), 18);
                  if ($$6 == jm.c || $$6 == jm.f) {
                     dup $$8 = $$3.c_($$4);
                     dup $$9 = $$3.c_($$5);
                     if ($$8 instanceof duw && $$9 instanceof duw) {
                        duw.a((duw)$$8, (duw)$$9);
                     }
                  }

                  return $$0.b(dli.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dkg.aO, dkg.aP, dkg.aM, dkg.aR, dkg.aQ, dkg.aN, dkg.aK, dkg.aL) {
         private final ThreadLocal<List<ObjectSet<jh>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dxn a(dxn $$0, jm $$1, dxn $$2, dhb $$3, jh $$4, jh $$5) {
            dxn $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dyd.aD);
               List<ObjectSet<jh>> $$8 = this.g.get();
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
         public void a(dhb $$0) {
            jh.a $$1 = new jh.a();
            List<ObjectSet<jh>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jh> $$5 = $$2.get($$4);
               ObjectSet<jh> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jh $$7 = (jh)var8.next();
                  dxn $$8 = $$0.a_($$7);
                  if ($$8.c(dyd.aD) >= $$4) {
                     $$0.a($$7, $$8.b(dyd.aD, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jm $$9 : f) {
                           $$1.a($$7, $$9);
                           dxn $$10 = $$0.a_($$1);
                           if ($$10.b(dyd.aD) && $$8.c(dyd.aD) > $$3) {
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
      e(dkg.fs, dkg.fr) {
         @Override
         public dxn a(dxn $$0, jm $$1, dxn $$2, dhb $$3, jh $$4, jh $$5) {
            if ($$0.c(dsd.c) == 7) {
               dke $$6 = $$0.a(dkg.fr) ? dkg.fn : dkg.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(dkg.fr) ? dkg.fp : dkg.fq).m().b(doc.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jm[] f = jm.values();

      b(final dke... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dke... $$1) {
         for (dke $$2 : $$1) {
            eaf.i.put($$2, this);
         }

         if ($$0) {
            eaf.j.add(this);
         }
      }
   }
}
