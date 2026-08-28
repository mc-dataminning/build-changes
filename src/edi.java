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

public class edi {
   private static final Logger b = LogUtils.getLogger();
   public static final edi a = new edi(dix.a);
   private static final String c = "Indices";
   private static final jc[] d = jc.values();
   private static final Codec<List<fgo<dmm>>> e = fgo.a(mg.e.q().orElse(dmo.a)).listOf();
   private static final Codec<List<fgo<ewu>>> f = fgo.a(mg.c.q().orElse(eww.a)).listOf();
   private final EnumSet<jc> g = EnumSet.noneOf(jc.class);
   private final List<fgo<dmm>> h = Lists.newArrayList();
   private final List<fgo<ewu>> i = Lists.newArrayList();
   private final int[][] j;
   static final Map<dmm, edi.a> k = new IdentityHashMap<>();
   static final Set<edi.a> l = Sets.newHashSet();

   private edi(djj $$0) {
      this.j = new int[$$0.ap()][];
   }

   public edi(tz $$0, djj $$1) {
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

   private edi(edi $$0) {
      this.g.addAll($$0.g);
      this.h.addAll($$0.h);
      this.i.addAll($$0.i);
      this.j = new int[$$0.j.length][];

      for (int $$1 = 0; $$1 < $$0.j.length; $$1++) {
         int[] $$2 = $$0.j[$$1];
         this.j[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   public void a(ecv $$0) {
      this.b($$0);

      for (jc $$1 : d) {
         a($$0, $$1);
      }

      djh $$2 = $$0.H();
      this.h.forEach($$1x -> {
         dmm $$2x = $$1x.a() == dmo.a ? $$2.a_($$1x.b()).b() : (dmm)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.i.forEach($$1x -> {
         ewu $$2x = $$1x.a() == eww.a ? $$2.b_($$1x.b()).a() : (ewu)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      l.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(ecv $$0, jc $$1) {
      djh $$2 = $$0.H();
      if ($$0.t().g.remove($$1)) {
         Set<jb> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jb.f);
         boolean $$7 = $$3.contains(jb.e);
         boolean $$8 = $$3.contains(jb.d);
         boolean $$9 = $$3.contains(jb.c);
         boolean $$10 = $$3.size() == 1;
         dio $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jb[] $$16 = jb.values();
         iv.a $$17 = new iv.a();

         for (iv $$18 : iv.b($$12, $$2.G_(), $$14, $$13, $$2.ao(), $$15)) {
            eao $$19 = $$2.a_($$18);
            eao $$20 = $$19;

            for (jb $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dmm.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static eao a(eao $$0, jb $$1, dji $$2, iv $$3, iv $$4) {
      return k.getOrDefault($$0.b(), edi.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(ecv $$0) {
      iv.a $$1 = new iv.a();
      iv.a $$2 = new iv.a();
      dio $$3 = $$0.f();
      dji $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.j.length; $$5++) {
         ecw $$6 = $$0.b($$5);
         int[] $$7 = this.j[$$5];
         this.j[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jb[] $$8 = jb.values();
            edd<eao> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jy.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               eao $$16 = $$9.a($$12);
               eao $$17 = $$16;

               for (jb $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jy.a($$1.u()) == $$3.h && jy.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dmm.a($$16, $$17, $$4, $$1, 18);
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

   public edi c() {
      return this == a ? a : new edi(this);
   }

   public interface a {
      eao a(eao var1, jb var2, eao var3, dji var4, iv var5, iv var6);

      default void a(dji $$0) {
      }
   }

   static enum b implements edi.a {
      a(
         dmo.lu,
         dmo.eu,
         dmo.ms,
         dmo.mt,
         dmo.mu,
         dmo.mv,
         dmo.mw,
         dmo.mx,
         dmo.my,
         dmo.mz,
         dmo.mA,
         dmo.mB,
         dmo.mC,
         dmo.mD,
         dmo.mE,
         dmo.mF,
         dmo.mG,
         dmo.mH,
         dmo.ht,
         dmo.hu,
         dmo.hv,
         dmo.fZ,
         dmo.O,
         dmo.L,
         dmo.N,
         dmo.cP,
         dmo.cQ,
         dmo.cR,
         dmo.cS,
         dmo.cT,
         dmo.cU,
         dmo.cV,
         dmo.cW,
         dmo.dd,
         dmo.de,
         dmo.df,
         dmo.dg,
         dmo.di,
         dmo.dj,
         dmo.dk,
         dmo.dn,
         dmo.do,
         dmo.dp,
         dmo.dq,
         dmo.ds,
         dmo.dt,
         dmo.du,
         dmo.dz,
         dmo.dA,
         dmo.dB,
         dmo.dC,
         dmo.dE,
         dmo.dF,
         dmo.dG
      ) {
         @Override
         public eao a(eao $$0, jb $$1, eao $$2, dji $$3, iv $$4, iv $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public eao a(eao $$0, jb $$1, eao $$2, dji $$3, iv $$4, iv $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
         }
      },
      c(dmo.cG, dmo.hw) {
         @Override
         public eao a(eao $$0, jb $$1, eao $$2, dji $$3, iv $$4, iv $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dnq.d) == ebg.a && $$2.c(dnq.d) == ebg.a) {
               jb $$6 = $$0.c(dnq.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dnq.c)) {
                  ebg $$7 = $$1 == $$6.h() ? ebg.b : ebg.c;
                  $$3.a($$5, $$2.b(dnq.d, $$7.a()), 18);
                  if ($$6 == jb.c || $$6 == jb.f) {
                     dxm $$8 = $$3.c_($$4);
                     dxm $$9 = $$3.c_($$5);
                     if ($$8 instanceof dxu && $$9 instanceof dxu) {
                        dxu.a((dxu)$$8, (dxu)$$9);
                     }
                  }

                  return $$0.b(dnq.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dmo.aO, dmo.aP, dmo.aM, dmo.aR, dmo.aQ, dmo.aN, dmo.aK, dmo.aL) {
         private final ThreadLocal<List<ObjectSet<iv>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public eao a(eao $$0, jb $$1, eao $$2, dji $$3, iv $$4, iv $$5) {
            eao $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(ebe.aF);
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
         public void a(dji $$0) {
            iv.a $$1 = new iv.a();
            List<ObjectSet<iv>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iv> $$5 = $$2.get($$4);
               ObjectSet<iv> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iv $$7 = (iv)var8.next();
                  eao $$8 = $$0.a_($$7);
                  if ($$8.c(ebe.aF) >= $$4) {
                     $$0.a($$7, $$8.b(ebe.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jb $$9 : f) {
                           $$1.a($$7, $$9);
                           eao $$10 = $$0.a_($$1);
                           if ($$10.b(ebe.aF) && $$8.c(ebe.aF) > $$3) {
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
      e(dmo.fw, dmo.fv) {
         @Override
         public eao a(eao $$0, jb $$1, eao $$2, dji $$3, iv $$4, iv $$5) {
            if ($$0.c(dus.c) == 7) {
               dmm $$6 = $$0.a(dmo.fv) ? dmo.fr : dmo.fs;
               if ($$2.a($$6)) {
                  return ($$0.a(dmo.fv) ? dmo.ft : dmo.fu).m().b(dqn.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jb[] f = jb.values();

      b(final dmm... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dmm... $$1) {
         for (dmm $$2 : $$1) {
            edi.k.put($$2, this);
         }

         if ($$0) {
            edi.l.add(this);
         }
      }
   }
}
