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

public class edb {
   private static final Logger b = LogUtils.getLogger();
   public static final edb a = new edb(diq.a);
   private static final String c = "Indices";
   private static final jb[] d = jb.values();
   private final EnumSet<jb> e = EnumSet.noneOf(jb.class);
   private final List<fgh<dmf>> f = Lists.newArrayList();
   private final List<fgh<ewn>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dmf, edb.a> i = new IdentityHashMap<>();
   static final Set<edb.a> j = Sets.newHashSet();

   private edb(djc $$0) {
      this.h = new int[$$0.ap()][];
   }

   public edb(tz $$0, djc $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         tz $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jb $$6 : jb.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> mf.e.b(alg.c($$0x)).or(() -> Optional.of(dmh.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> mf.c.b(alg.c($$0x)).or(() -> Optional.of(ewp.a)), this.g);
   }

   private edb(edb $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(tz $$0, String $$1, Function<String, Optional<T>> $$2, List<fgh<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (uw $$5 : $$0.c($$1, 10)) {
            fgh.a((tz)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(eco $$0) {
      this.b($$0);

      for (jb $$1 : d) {
         a($$0, $$1);
      }

      dja $$2 = $$0.H();
      this.f.forEach($$1x -> {
         dmf $$2x = $$1x.a() == dmh.a ? $$2.a_($$1x.b()).b() : (dmf)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ewn $$2x = $$1x.a() == ewp.a ? $$2.b_($$1x.b()).a() : (ewn)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(eco $$0, jb $$1) {
      dja $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<ja> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ja.f);
         boolean $$7 = $$3.contains(ja.e);
         boolean $$8 = $$3.contains(ja.d);
         boolean $$9 = $$3.contains(ja.c);
         boolean $$10 = $$3.size() == 1;
         dih $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ja[] $$16 = ja.values();
         iu.a $$17 = new iu.a();

         for (iu $$18 : iu.b($$12, $$2.G_(), $$14, $$13, $$2.ao(), $$15)) {
            eah $$19 = $$2.a_($$18);
            eah $$20 = $$19;

            for (ja $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dmf.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static eah a(eah $$0, ja $$1, djb $$2, iu $$3, iu $$4) {
      return i.getOrDefault($$0.b(), edb.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(eco $$0) {
      iu.a $$1 = new iu.a();
      iu.a $$2 = new iu.a();
      dih $$3 = $$0.f();
      djb $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         ecp $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ja[] $$8 = ja.values();
            ecw<eah> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jx.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               eah $$16 = $$9.a($$12);
               eah $$17 = $$16;

               for (ja $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jx.a($$1.u()) == $$3.h && jx.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dmf.a($$16, $$17, $$4, $$1, 18);
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

   public tz b() {
      tz $$0 = new tz();
      tz $$1 = new tz();

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

      for (jb $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         uf $$6 = new uf();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> mf.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         uf $$7 = new uf();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> mf.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public edb c() {
      return this == a ? a : new edb(this);
   }

   public interface a {
      eah a(eah var1, ja var2, eah var3, djb var4, iu var5, iu var6);

      default void a(djb $$0) {
      }
   }

   static enum b implements edb.a {
      a(
         dmh.lu,
         dmh.eu,
         dmh.ms,
         dmh.mt,
         dmh.mu,
         dmh.mv,
         dmh.mw,
         dmh.mx,
         dmh.my,
         dmh.mz,
         dmh.mA,
         dmh.mB,
         dmh.mC,
         dmh.mD,
         dmh.mE,
         dmh.mF,
         dmh.mG,
         dmh.mH,
         dmh.ht,
         dmh.hu,
         dmh.hv,
         dmh.fZ,
         dmh.O,
         dmh.L,
         dmh.N,
         dmh.cP,
         dmh.cQ,
         dmh.cR,
         dmh.cS,
         dmh.cT,
         dmh.cU,
         dmh.cV,
         dmh.cW,
         dmh.dd,
         dmh.de,
         dmh.df,
         dmh.dg,
         dmh.di,
         dmh.dj,
         dmh.dk,
         dmh.dn,
         dmh.do,
         dmh.dp,
         dmh.dq,
         dmh.ds,
         dmh.dt,
         dmh.du,
         dmh.dz,
         dmh.dA,
         dmh.dB,
         dmh.dC,
         dmh.dE,
         dmh.dF,
         dmh.dG
      ) {
         @Override
         public eah a(eah $$0, ja $$1, eah $$2, djb $$3, iu $$4, iu $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public eah a(eah $$0, ja $$1, eah $$2, djb $$3, iu $$4, iu $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
         }
      },
      c(dmh.cG, dmh.hw) {
         @Override
         public eah a(eah $$0, ja $$1, eah $$2, djb $$3, iu $$4, iu $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dnj.d) == eaz.a && $$2.c(dnj.d) == eaz.a) {
               ja $$6 = $$0.c(dnj.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dnj.c)) {
                  eaz $$7 = $$1 == $$6.h() ? eaz.b : eaz.c;
                  $$3.a($$5, $$2.b(dnj.d, $$7.a()), 18);
                  if ($$6 == ja.c || $$6 == ja.f) {
                     dxf $$8 = $$3.c_($$4);
                     dxf $$9 = $$3.c_($$5);
                     if ($$8 instanceof dxn && $$9 instanceof dxn) {
                        dxn.a((dxn)$$8, (dxn)$$9);
                     }
                  }

                  return $$0.b(dnj.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dmh.aO, dmh.aP, dmh.aM, dmh.aR, dmh.aQ, dmh.aN, dmh.aK, dmh.aL) {
         private final ThreadLocal<List<ObjectSet<iu>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public eah a(eah $$0, ja $$1, eah $$2, djb $$3, iu $$4, iu $$5) {
            eah $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(eax.aF);
               List<ObjectSet<iu>> $$8 = this.g.get();
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
         public void a(djb $$0) {
            iu.a $$1 = new iu.a();
            List<ObjectSet<iu>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iu> $$5 = $$2.get($$4);
               ObjectSet<iu> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iu $$7 = (iu)var8.next();
                  eah $$8 = $$0.a_($$7);
                  if ($$8.c(eax.aF) >= $$4) {
                     $$0.a($$7, $$8.b(eax.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ja $$9 : f) {
                           $$1.a($$7, $$9);
                           eah $$10 = $$0.a_($$1);
                           if ($$10.b(eax.aF) && $$8.c(eax.aF) > $$3) {
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
      e(dmh.fw, dmh.fv) {
         @Override
         public eah a(eah $$0, ja $$1, eah $$2, djb $$3, iu $$4, iu $$5) {
            if ($$0.c(dul.c) == 7) {
               dmf $$6 = $$0.a(dmh.fv) ? dmh.fr : dmh.fs;
               if ($$2.a($$6)) {
                  return ($$0.a(dmh.fv) ? dmh.ft : dmh.fu).m().b(dqg.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ja[] f = ja.values();

      b(final dmf... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dmf... $$1) {
         for (dmf $$2 : $$1) {
            edb.i.put($$2, this);
         }

         if ($$0) {
            edb.j.add(this);
         }
      }
   }
}
