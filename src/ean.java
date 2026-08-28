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

public class ean {
   private static final Logger b = LogUtils.getLogger();
   public static final ean a = new ean(dgx.a);
   private static final String c = "Indices";
   private static final jn[] d = jn.values();
   private final EnumSet<jn> e = EnumSet.noneOf(jn.class);
   private final List<fdp<dkm>> f = Lists.newArrayList();
   private final List<fdp<etw>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dkm, ean.a> i = new IdentityHashMap<>();
   static final Set<ean.a> j = Sets.newHashSet();

   private ean(dhk $$0) {
      this.h = new int[$$0.an()][];
   }

   public ean(ux $$0, dhk $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> ma.e.b(alz.c($$0x)).or(() -> Optional.of(dko.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> ma.c.b(alz.c($$0x)).or(() -> Optional.of(ety.a)), this.g);
   }

   private ean(ean $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(ux $$0, String $$1, Function<String, Optional<T>> $$2, List<fdp<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vu $$5 : $$0.c($$1, 10)) {
            fdp.a((ux)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(eaa $$0) {
      this.b($$0);

      for (jn $$1 : d) {
         a($$0, $$1);
      }

      dhi $$2 = $$0.H();
      this.f.forEach($$1x -> {
         dkm $$2x = $$1x.a() == dko.a ? $$2.a_($$1x.b()).b() : (dkm)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         etw $$2x = $$1x.a() == ety.a ? $$2.b_($$1x.b()).a() : (etw)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(eaa $$0, jn $$1) {
      dhi $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<jm> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jm.f);
         boolean $$7 = $$3.contains(jm.e);
         boolean $$8 = $$3.contains(jm.d);
         boolean $$9 = $$3.contains(jm.c);
         boolean $$10 = $$3.size() == 1;
         dgo $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jm[] $$16 = jm.values();
         jh.a $$17 = new jh.a();

         for (jh $$18 : jh.b($$12, $$2.L_(), $$14, $$13, $$2.am(), $$15)) {
            dxv $$19 = $$2.a_($$18);
            dxv $$20 = $$19;

            for (jm $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dkm.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dxv a(dxv $$0, jm $$1, dhj $$2, jh $$3, jh $$4) {
      return i.getOrDefault($$0.b(), ean.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(eaa $$0) {
      jh.a $$1 = new jh.a();
      jh.a $$2 = new jh.a();
      dgo $$3 = $$0.f();
      dhj $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         eab $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jm[] $$8 = jm.values();
            eai<dxv> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kj.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dxv $$16 = $$9.a($$12);
               dxv $$17 = $$16;

               for (jm $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kj.a($$1.u()) == $$3.h && kj.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dkm.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.h, $$3.i});
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

   public ean c() {
      return this == a ? a : new ean(this);
   }

   public interface a {
      dxv a(dxv var1, jm var2, dxv var3, dhj var4, jh var5, jh var6);

      default void a(dhj $$0) {
      }
   }

   static enum b implements ean.a {
      a(
         dko.lj,
         dko.eq,
         dko.mh,
         dko.mi,
         dko.mj,
         dko.mk,
         dko.ml,
         dko.mm,
         dko.mn,
         dko.mo,
         dko.mp,
         dko.mq,
         dko.mr,
         dko.ms,
         dko.mt,
         dko.mu,
         dko.mv,
         dko.mw,
         dko.hi,
         dko.hj,
         dko.hk,
         dko.fO,
         dko.O,
         dko.L,
         dko.N,
         dko.cM,
         dko.cN,
         dko.cO,
         dko.cP,
         dko.cQ,
         dko.cR,
         dko.cS,
         dko.cT,
         dko.da,
         dko.db,
         dko.dc,
         dko.dd,
         dko.df,
         dko.dg,
         dko.dh,
         dko.dk,
         dko.dl,
         dko.dm,
         dko.dn,
         dko.dp,
         dko.dq,
         dko.dr,
         dko.dw,
         dko.dx,
         dko.dy,
         dko.dz,
         dko.dB,
         dko.dC,
         dko.dD
      ) {
         @Override
         public dxv a(dxv $$0, jm $$1, dxv $$2, dhj $$3, jh $$4, jh $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dxv a(dxv $$0, jm $$1, dxv $$2, dhj $$3, jh $$4, jh $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
         }
      },
      c(dko.cD, dko.hl) {
         @Override
         public dxv a(dxv $$0, jm $$1, dxv $$2, dhj $$3, jh $$4, jh $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dlq.d) == dyn.a && $$2.c(dlq.d) == dyn.a) {
               jm $$6 = $$0.c(dlq.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dlq.c)) {
                  dyn $$7 = $$1 == $$6.h() ? dyn.b : dyn.c;
                  $$3.a($$5, $$2.b(dlq.d, $$7.a()), 18);
                  if ($$6 == jm.c || $$6 == jm.f) {
                     dux $$8 = $$3.c_($$4);
                     dux $$9 = $$3.c_($$5);
                     if ($$8 instanceof dve && $$9 instanceof dve) {
                        dve.a((dve)$$8, (dve)$$9);
                     }
                  }

                  return $$0.b(dlq.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dko.aO, dko.aP, dko.aM, dko.aR, dko.aQ, dko.aN, dko.aK, dko.aL) {
         private final ThreadLocal<List<ObjectSet<jh>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dxv a(dxv $$0, jm $$1, dxv $$2, dhj $$3, jh $$4, jh $$5) {
            dxv $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dyl.aD);
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
         public void a(dhj $$0) {
            jh.a $$1 = new jh.a();
            List<ObjectSet<jh>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jh> $$5 = $$2.get($$4);
               ObjectSet<jh> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jh $$7 = (jh)var8.next();
                  dxv $$8 = $$0.a_($$7);
                  if ($$8.c(dyl.aD) >= $$4) {
                     $$0.a($$7, $$8.b(dyl.aD, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jm $$9 : f) {
                           $$1.a($$7, $$9);
                           dxv $$10 = $$0.a_($$1);
                           if ($$10.b(dyl.aD) && $$8.c(dyl.aD) > $$3) {
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
      e(dko.fs, dko.fr) {
         @Override
         public dxv a(dxv $$0, jm $$1, dxv $$2, dhj $$3, jh $$4, jh $$5) {
            if ($$0.c(dsl.c) == 7) {
               dkm $$6 = $$0.a(dko.fr) ? dko.fn : dko.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(dko.fr) ? dko.fp : dko.fq).m().b(dok.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jm[] f = jm.values();

      b(final dkm... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dkm... $$1) {
         for (dkm $$2 : $$1) {
            ean.i.put($$2, this);
         }

         if ($$0) {
            ean.j.add(this);
         }
      }
   }
}
