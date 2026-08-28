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

public class eci {
   private static final Logger b = LogUtils.getLogger();
   public static final eci a = new eci(dif.a);
   private static final String c = "Indices";
   private static final jb[] d = jb.values();
   private final EnumSet<jb> e = EnumSet.noneOf(jb.class);
   private final List<ffn<dlu>> f = Lists.newArrayList();
   private final List<ffn<evu>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dlu, eci.a> i = new IdentityHashMap<>();
   static final Set<eci.a> j = Sets.newHashSet();

   private eci(dir $$0) {
      this.h = new int[$$0.ap()][];
   }

   public eci(tx $$0, dir $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         tx $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> mf.e.b(ale.c($$0x)).or(() -> Optional.of(dlw.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> mf.c.b(ale.c($$0x)).or(() -> Optional.of(evw.a)), this.g);
   }

   private eci(eci $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(tx $$0, String $$1, Function<String, Optional<T>> $$2, List<ffn<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (uu $$5 : $$0.c($$1, 10)) {
            ffn.a((tx)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(ebv $$0) {
      this.b($$0);

      for (jb $$1 : d) {
         a($$0, $$1);
      }

      dip $$2 = $$0.H();
      this.f.forEach($$1x -> {
         dlu $$2x = $$1x.a() == dlw.a ? $$2.a_($$1x.b()).b() : (dlu)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         evu $$2x = $$1x.a() == evw.a ? $$2.b_($$1x.b()).a() : (evu)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(ebv $$0, jb $$1) {
      dip $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<ja> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ja.f);
         boolean $$7 = $$3.contains(ja.e);
         boolean $$8 = $$3.contains(ja.d);
         boolean $$9 = $$3.contains(ja.c);
         boolean $$10 = $$3.size() == 1;
         dhw $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ja[] $$16 = ja.values();
         iu.a $$17 = new iu.a();

         for (iu $$18 : iu.b($$12, $$2.G_(), $$14, $$13, $$2.ao(), $$15)) {
            dzo $$19 = $$2.a_($$18);
            dzo $$20 = $$19;

            for (ja $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dlu.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dzo a(dzo $$0, ja $$1, diq $$2, iu $$3, iu $$4) {
      return i.getOrDefault($$0.b(), eci.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(ebv $$0) {
      iu.a $$1 = new iu.a();
      iu.a $$2 = new iu.a();
      dhw $$3 = $$0.f();
      diq $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         ebw $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ja[] $$8 = ja.values();
            ecd<dzo> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jx.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dzo $$16 = $$9.a($$12);
               dzo $$17 = $$16;

               for (ja $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jx.a($$1.u()) == $$3.h && jx.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dlu.a($$16, $$17, $$4, $$1, 18);
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

   public tx b() {
      tx $$0 = new tx();
      tx $$1 = new tx();

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
         ud $$6 = new ud();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> mf.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ud $$7 = new ud();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> mf.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public eci c() {
      return this == a ? a : new eci(this);
   }

   public interface a {
      dzo a(dzo var1, ja var2, dzo var3, diq var4, iu var5, iu var6);

      default void a(diq $$0) {
      }
   }

   static enum b implements eci.a {
      a(
         dlw.lq,
         dlw.eq,
         dlw.mo,
         dlw.mp,
         dlw.mq,
         dlw.mr,
         dlw.ms,
         dlw.mt,
         dlw.mu,
         dlw.mv,
         dlw.mw,
         dlw.mx,
         dlw.my,
         dlw.mz,
         dlw.mA,
         dlw.mB,
         dlw.mC,
         dlw.mD,
         dlw.hp,
         dlw.hq,
         dlw.hr,
         dlw.fV,
         dlw.O,
         dlw.L,
         dlw.N,
         dlw.cM,
         dlw.cN,
         dlw.cO,
         dlw.cP,
         dlw.cQ,
         dlw.cR,
         dlw.cS,
         dlw.cT,
         dlw.da,
         dlw.db,
         dlw.dc,
         dlw.dd,
         dlw.df,
         dlw.dg,
         dlw.dh,
         dlw.dk,
         dlw.dl,
         dlw.dm,
         dlw.dn,
         dlw.dp,
         dlw.dq,
         dlw.dr,
         dlw.dw,
         dlw.dx,
         dlw.dy,
         dlw.dz,
         dlw.dB,
         dlw.dC,
         dlw.dD
      ) {
         @Override
         public dzo a(dzo $$0, ja $$1, dzo $$2, diq $$3, iu $$4, iu $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dzo a(dzo $$0, ja $$1, dzo $$2, diq $$3, iu $$4, iu $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
         }
      },
      c(dlw.cD, dlw.hs) {
         @Override
         public dzo a(dzo $$0, ja $$1, dzo $$2, diq $$3, iu $$4, iu $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dmx.d) == eag.a && $$2.c(dmx.d) == eag.a) {
               ja $$6 = $$0.c(dmx.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dmx.c)) {
                  eag $$7 = $$1 == $$6.h() ? eag.b : eag.c;
                  $$3.a($$5, $$2.b(dmx.d, $$7.a()), 18);
                  if ($$6 == ja.c || $$6 == ja.f) {
                     dwn $$8 = $$3.c_($$4);
                     dwn $$9 = $$3.c_($$5);
                     if ($$8 instanceof dwv && $$9 instanceof dwv) {
                        dwv.a((dwv)$$8, (dwv)$$9);
                     }
                  }

                  return $$0.b(dmx.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dlw.aO, dlw.aP, dlw.aM, dlw.aR, dlw.aQ, dlw.aN, dlw.aK, dlw.aL) {
         private final ThreadLocal<List<ObjectSet<iu>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dzo a(dzo $$0, ja $$1, dzo $$2, diq $$3, iu $$4, iu $$5) {
            dzo $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(eae.aF);
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
         public void a(diq $$0) {
            iu.a $$1 = new iu.a();
            List<ObjectSet<iu>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iu> $$5 = $$2.get($$4);
               ObjectSet<iu> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iu $$7 = (iu)var8.next();
                  dzo $$8 = $$0.a_($$7);
                  if ($$8.c(eae.aF) >= $$4) {
                     $$0.a($$7, $$8.b(eae.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ja $$9 : f) {
                           $$1.a($$7, $$9);
                           dzo $$10 = $$0.a_($$1);
                           if ($$10.b(eae.aF) && $$8.c(eae.aF) > $$3) {
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
      e(dlw.fs, dlw.fr) {
         @Override
         public dzo a(dzo $$0, ja $$1, dzo $$2, diq $$3, iu $$4, iu $$5) {
            if ($$0.c(dtw.c) == 7) {
               dlu $$6 = $$0.a(dlw.fr) ? dlw.fn : dlw.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(dlw.fr) ? dlw.fp : dlw.fq).m().b(dpt.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ja[] f = ja.values();

      b(final dlu... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dlu... $$1) {
         for (dlu $$2 : $$1) {
            eci.i.put($$2, this);
         }

         if ($$0) {
            eci.j.add(this);
         }
      }
   }
}
