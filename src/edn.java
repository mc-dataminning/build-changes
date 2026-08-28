import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;

public class edn {
   private static final Logger b = LogUtils.getLogger();
   public static final edn a = new edn(djc.a);
   private static final String c = "Indices";
   private static final jc[] d = jc.values();
   private static final Codec<List<fgt<dmr>>> e = fgt.a(mg.e.q().orElse(dmt.a)).listOf();
   private static final Codec<List<fgt<ewz>>> f = fgt.a(mg.c.q().orElse(exb.a)).listOf();
   private final EnumSet<jc> g = EnumSet.noneOf(jc.class);
   private final List<fgt<dmr>> h = Lists.newArrayList();
   private final List<fgt<ewz>> i = Lists.newArrayList();
   private final int[][] j;
   static final Map<dmr, edn.a> k = new IdentityHashMap<>();
   static final Set<edn.a> l = Sets.newHashSet();

   private edn(djo $$0) {
      this.j = new int[$$0.ap()][];
   }

   public edn(tz $$0, djo $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         tz $$2 = $$0.n("Indices");

         for (int $$3 = 0; $$3 < this.j.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.j[$$3] = $$2.l($$4);
            }
         }
      }

      int $$5 = $$0.f("Sides");

      for (jc $$6 : jc.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.g.add($$6);
         }
      }

      $$0.<Collection<? extends E>>a("neighbor_block_ticks", e).ifPresent(this.h::addAll);
      $$0.<Collection<? extends E>>a("neighbor_fluid_ticks", f).ifPresent(this.i::addAll);
   }

   private edn(edn $$0) {
      this.g.addAll($$0.g);
      this.h.addAll($$0.h);
      this.i.addAll($$0.i);
      this.j = new int[$$0.j.length][];

      for (int $$1 = 0; $$1 < $$0.j.length; $$1++) {
         int[] $$2 = $$0.j[$$1];
         this.j[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   public void a(eda $$0) {
      this.b($$0);

      for (jc $$1 : d) {
         a($$0, $$1);
      }

      djm $$2 = $$0.H();
      this.h.forEach($$1x -> {
         dmr $$2x = $$1x.a() == dmt.a ? $$2.a_($$1x.b()).b() : (dmr)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.i.forEach($$1x -> {
         ewz $$2x = $$1x.a() == exb.a ? $$2.b_($$1x.b()).a() : (ewz)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      l.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(eda $$0, jc $$1) {
      djm $$2 = $$0.H();
      if ($$0.t().g.remove($$1)) {
         Set<jb> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jb.f);
         boolean $$7 = $$3.contains(jb.e);
         boolean $$8 = $$3.contains(jb.d);
         boolean $$9 = $$3.contains(jb.c);
         boolean $$10 = $$3.size() == 1;
         dir $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jb[] $$16 = jb.values();
         iv.a $$17 = new iv.a();

         for (iv $$18 : iv.b($$12, $$2.G_(), $$14, $$13, $$2.ao(), $$15)) {
            eat $$19 = $$2.a_($$18);
            eat $$20 = $$19;

            for (jb $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dmr.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static eat a(eat $$0, jb $$1, djn $$2, iv $$3, iv $$4) {
      return k.getOrDefault($$0.b(), edn.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(eda $$0) {
      iv.a $$1 = new iv.a();
      iv.a $$2 = new iv.a();
      dir $$3 = $$0.f();
      djn $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.j.length; $$5++) {
         edb $$6 = $$0.b($$5);
         int[] $$7 = this.j[$$5];
         this.j[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jb[] $$8 = jb.values();
            edi<eat> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jy.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               eat $$16 = $$9.a($$12);
               eat $$17 = $$16;

               for (jb $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jy.a($$1.u()) == $$3.h && jy.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dmr.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.j.length; $$19++) {
         if (this.j[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.h, $$3.i});
         }

         this.j[$$19] = null;
      }
   }

   public boolean a() {
      for (int[] $$0 : this.j) {
         if ($$0 != null) {
            return false;
         }
      }

      return this.g.isEmpty();
   }

   public tz b() {
      tz $$0 = new tz();
      tz $$1 = new tz();

      for (int $$2 = 0; $$2 < this.j.length; $$2++) {
         String $$3 = String.valueOf($$2);
         if (this.j[$$2] != null && this.j[$$2].length != 0) {
            $$1.a($$3, this.j[$$2]);
         }
      }

      if (!$$1.g()) {
         $$0.a("Indices", $$1);
      }

      int $$4 = 0;

      for (jc $$5 : this.g) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.h.isEmpty()) {
         $$0.a("neighbor_block_ticks", e, this.h);
      }

      if (!this.i.isEmpty()) {
         $$0.a("neighbor_fluid_ticks", f, this.i);
      }

      return $$0;
   }

   public edn c() {
      return this == a ? a : new edn(this);
   }

   public interface a {
      eat a(eat var1, jb var2, eat var3, djn var4, iv var5, iv var6);

      default void a(djn $$0) {
      }
   }

   static enum b implements edn.a {
      a(
         dmt.lu,
         dmt.eu,
         dmt.ms,
         dmt.mt,
         dmt.mu,
         dmt.mv,
         dmt.mw,
         dmt.mx,
         dmt.my,
         dmt.mz,
         dmt.mA,
         dmt.mB,
         dmt.mC,
         dmt.mD,
         dmt.mE,
         dmt.mF,
         dmt.mG,
         dmt.mH,
         dmt.ht,
         dmt.hu,
         dmt.hv,
         dmt.fZ,
         dmt.O,
         dmt.L,
         dmt.N,
         dmt.cP,
         dmt.cQ,
         dmt.cR,
         dmt.cS,
         dmt.cT,
         dmt.cU,
         dmt.cV,
         dmt.cW,
         dmt.dd,
         dmt.de,
         dmt.df,
         dmt.dg,
         dmt.di,
         dmt.dj,
         dmt.dk,
         dmt.dn,
         dmt.do,
         dmt.dp,
         dmt.dq,
         dmt.ds,
         dmt.dt,
         dmt.du,
         dmt.dz,
         dmt.dA,
         dmt.dB,
         dmt.dC,
         dmt.dE,
         dmt.dF,
         dmt.dG
      ) {
         @Override
         public eat a(eat $$0, jb $$1, eat $$2, djn $$3, iv $$4, iv $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public eat a(eat $$0, jb $$1, eat $$2, djn $$3, iv $$4, iv $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
         }
      },
      c(dmt.cG, dmt.hw) {
         @Override
         public eat a(eat $$0, jb $$1, eat $$2, djn $$3, iv $$4, iv $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dnv.d) == ebl.a && $$2.c(dnv.d) == ebl.a) {
               jb $$6 = $$0.c(dnv.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dnv.c)) {
                  ebl $$7 = $$1 == $$6.h() ? ebl.b : ebl.c;
                  $$3.a($$5, $$2.b(dnv.d, $$7.a()), 18);
                  if ($$6 == jb.c || $$6 == jb.f) {
                     dxr $$8 = $$3.c_($$4);
                     dxr $$9 = $$3.c_($$5);
                     if ($$8 instanceof dxz && $$9 instanceof dxz) {
                        dxz.a((dxz)$$8, (dxz)$$9);
                     }
                  }

                  return $$0.b(dnv.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dmt.aO, dmt.aP, dmt.aM, dmt.aR, dmt.aQ, dmt.aN, dmt.aK, dmt.aL) {
         private final ThreadLocal<List<ObjectSet<iv>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public eat a(eat $$0, jb $$1, eat $$2, djn $$3, iv $$4, iv $$5) {
            eat $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(ebj.aF);
               List<ObjectSet<iv>> $$8 = this.g.get();
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
         public void a(djn $$0) {
            iv.a $$1 = new iv.a();
            List<ObjectSet<iv>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iv> $$5 = $$2.get($$4);
               ObjectSet<iv> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iv $$7 = (iv)var8.next();
                  eat $$8 = $$0.a_($$7);
                  if ($$8.c(ebj.aF) >= $$4) {
                     $$0.a($$7, $$8.b(ebj.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jb $$9 : f) {
                           $$1.a($$7, $$9);
                           eat $$10 = $$0.a_($$1);
                           if ($$10.b(ebj.aF) && $$8.c(ebj.aF) > $$3) {
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
      e(dmt.fw, dmt.fv) {
         @Override
         public eat a(eat $$0, jb $$1, eat $$2, djn $$3, iv $$4, iv $$5) {
            if ($$0.c(dux.c) == 7) {
               dmr $$6 = $$0.a(dmt.fv) ? dmt.fr : dmt.fs;
               if ($$2.a($$6)) {
                  return ($$0.a(dmt.fv) ? dmt.ft : dmt.fu).m().b(dqs.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jb[] f = jb.values();

      b(final dmr... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dmr... $$1) {
         for (dmr $$2 : $$1) {
            edn.k.put($$2, this);
         }

         if ($$0) {
            edn.l.add(this);
         }
      }
   }
}
