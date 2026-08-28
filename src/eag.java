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

public class eag {
   private static final Logger b = LogUtils.getLogger();
   public static final eag a = new eag(dgo.a);
   private static final String c = "Indices";
   private static final jn[] d = jn.values();
   private final EnumSet<jn> e = EnumSet.noneOf(jn.class);
   private final List<fdi<dkd>> f = Lists.newArrayList();
   private final List<fdi<etp>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dkd, eag.a> i = new IdentityHashMap<>();
   static final Set<eag.a> j = Sets.newHashSet();

   private eag(dhb $$0) {
      this.h = new int[$$0.ao()][];
   }

   public eag(um $$0, dhb $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         um $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> ma.e.b(alp.c($$0x)).or(() -> Optional.of(dkf.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> ma.c.b(alp.c($$0x)).or(() -> Optional.of(etr.a)), this.g);
   }

   private eag(eag $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(um $$0, String $$1, Function<String, Optional<T>> $$2, List<fdi<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vj $$5 : $$0.c($$1, 10)) {
            fdi.a((um)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dzt $$0) {
      this.b($$0);

      for (jn $$1 : d) {
         a($$0, $$1);
      }

      dgz $$2 = $$0.H();
      this.f.forEach($$1x -> {
         dkd $$2x = $$1x.a() == dkf.a ? $$2.a_($$1x.b()).b() : (dkd)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         etp $$2x = $$1x.a() == etr.a ? $$2.b_($$1x.b()).a() : (etp)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dzt $$0, jn $$1) {
      dgz $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<jm> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jm.f);
         boolean $$7 = $$3.contains(jm.e);
         boolean $$8 = $$3.contains(jm.d);
         boolean $$9 = $$3.contains(jm.c);
         boolean $$10 = $$3.size() == 1;
         dgf $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jm[] $$16 = jm.values();
         jh.a $$17 = new jh.a();

         for (jh $$18 : jh.b($$12, $$2.L_(), $$14, $$13, $$2.an(), $$15)) {
            dxo $$19 = $$2.a_($$18);
            dxo $$20 = $$19;

            for (jm $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dkd.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dxo a(dxo $$0, jm $$1, dha $$2, jh $$3, jh $$4) {
      return i.getOrDefault($$0.b(), eag.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dzt $$0) {
      jh.a $$1 = new jh.a();
      jh.a $$2 = new jh.a();
      dgf $$3 = $$0.f();
      dha $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dzu $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jm[] $$8 = jm.values();
            eab<dxo> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kj.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dxo $$16 = $$9.a($$12);
               dxo $$17 = $$16;

               for (jm $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kj.a($$1.u()) == $$3.h && kj.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dkd.a($$16, $$17, $$4, $$1, 18);
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

   public um b() {
      um $$0 = new um();
      um $$1 = new um();

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
         us $$6 = new us();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> ma.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         us $$7 = new us();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> ma.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public eag c() {
      return this == a ? a : new eag(this);
   }

   public interface a {
      dxo a(dxo var1, jm var2, dxo var3, dha var4, jh var5, jh var6);

      default void a(dha $$0) {
      }
   }

   static enum b implements eag.a {
      a(
         dkf.lq,
         dkf.eq,
         dkf.mo,
         dkf.mp,
         dkf.mq,
         dkf.mr,
         dkf.ms,
         dkf.mt,
         dkf.mu,
         dkf.mv,
         dkf.mw,
         dkf.mx,
         dkf.my,
         dkf.mz,
         dkf.mA,
         dkf.mB,
         dkf.mC,
         dkf.mD,
         dkf.hp,
         dkf.hq,
         dkf.hr,
         dkf.fV,
         dkf.O,
         dkf.L,
         dkf.N,
         dkf.cM,
         dkf.cN,
         dkf.cO,
         dkf.cP,
         dkf.cQ,
         dkf.cR,
         dkf.cS,
         dkf.cT,
         dkf.da,
         dkf.db,
         dkf.dc,
         dkf.dd,
         dkf.df,
         dkf.dg,
         dkf.dh,
         dkf.dk,
         dkf.dl,
         dkf.dm,
         dkf.dn,
         dkf.dp,
         dkf.dq,
         dkf.dr,
         dkf.dw,
         dkf.dx,
         dkf.dy,
         dkf.dz,
         dkf.dB,
         dkf.dC,
         dkf.dD
      ) {
         @Override
         public dxo a(dxo $$0, jm $$1, dxo $$2, dha $$3, jh $$4, jh $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dxo a(dxo $$0, jm $$1, dxo $$2, dha $$3, jh $$4, jh $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
         }
      },
      c(dkf.cD, dkf.hs) {
         @Override
         public dxo a(dxo $$0, jm $$1, dxo $$2, dha $$3, jh $$4, jh $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dlg.d) == dyg.a && $$2.c(dlg.d) == dyg.a) {
               jm $$6 = $$0.c(dlg.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dlg.c)) {
                  dyg $$7 = $$1 == $$6.h() ? dyg.b : dyg.c;
                  $$3.a($$5, $$2.b(dlg.d, $$7.a()), 18);
                  if ($$6 == jm.c || $$6 == jm.f) {
                     duq $$8 = $$3.c_($$4);
                     duq $$9 = $$3.c_($$5);
                     if ($$8 instanceof dux && $$9 instanceof dux) {
                        dux.a((dux)$$8, (dux)$$9);
                     }
                  }

                  return $$0.b(dlg.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dkf.aO, dkf.aP, dkf.aM, dkf.aR, dkf.aQ, dkf.aN, dkf.aK, dkf.aL) {
         private final ThreadLocal<List<ObjectSet<jh>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dxo a(dxo $$0, jm $$1, dxo $$2, dha $$3, jh $$4, jh $$5) {
            dxo $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dye.aF);
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
         public void a(dha $$0) {
            jh.a $$1 = new jh.a();
            List<ObjectSet<jh>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jh> $$5 = $$2.get($$4);
               ObjectSet<jh> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jh $$7 = (jh)var8.next();
                  dxo $$8 = $$0.a_($$7);
                  if ($$8.c(dye.aF) >= $$4) {
                     $$0.a($$7, $$8.b(dye.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jm $$9 : f) {
                           $$1.a($$7, $$9);
                           dxo $$10 = $$0.a_($$1);
                           if ($$10.b(dye.aF) && $$8.c(dye.aF) > $$3) {
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
      e(dkf.fs, dkf.fr) {
         @Override
         public dxo a(dxo $$0, jm $$1, dxo $$2, dha $$3, jh $$4, jh $$5) {
            if ($$0.c(dse.c) == 7) {
               dkd $$6 = $$0.a(dkf.fr) ? dkf.fn : dkf.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(dkf.fr) ? dkf.fp : dkf.fq).m().b(dob.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jm[] f = jm.values();

      b(final dkd... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dkd... $$1) {
         for (dkd $$2 : $$1) {
            eag.i.put($$2, this);
         }

         if ($$0) {
            eag.j.add(this);
         }
      }
   }
}
