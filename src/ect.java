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

public class ect {
   private static final Logger b = LogUtils.getLogger();
   public static final ect a = new ect(dil.a);
   private static final String c = "Indices";
   private static final jb[] d = jb.values();
   private final EnumSet<jb> e = EnumSet.noneOf(jb.class);
   private final List<ffz<dma>> f = Lists.newArrayList();
   private final List<ffz<ewf>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dma, ect.a> i = new IdentityHashMap<>();
   static final Set<ect.a> j = Sets.newHashSet();

   private ect(dix $$0) {
      this.h = new int[$$0.ap()][];
   }

   public ect(tz $$0, dix $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> mf.e.b(alg.c($$0x)).or(() -> Optional.of(dmc.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> mf.c.b(alg.c($$0x)).or(() -> Optional.of(ewh.a)), this.g);
   }

   private ect(ect $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(tz $$0, String $$1, Function<String, Optional<T>> $$2, List<ffz<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (uw $$5 : $$0.c($$1, 10)) {
            ffz.a((tz)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(ecg $$0) {
      this.b($$0);

      for (jb $$1 : d) {
         a($$0, $$1);
      }

      div $$2 = $$0.H();
      this.f.forEach($$1x -> {
         dma $$2x = $$1x.a() == dmc.a ? $$2.a_($$1x.b()).b() : (dma)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ewf $$2x = $$1x.a() == ewh.a ? $$2.b_($$1x.b()).a() : (ewf)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(ecg $$0, jb $$1) {
      div $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<ja> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ja.f);
         boolean $$7 = $$3.contains(ja.e);
         boolean $$8 = $$3.contains(ja.d);
         boolean $$9 = $$3.contains(ja.c);
         boolean $$10 = $$3.size() == 1;
         dic $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ja[] $$16 = ja.values();
         iu.a $$17 = new iu.a();

         for (iu $$18 : iu.b($$12, $$2.G_(), $$14, $$13, $$2.ao(), $$15)) {
            dzz $$19 = $$2.a_($$18);
            dzz $$20 = $$19;

            for (ja $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dma.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dzz a(dzz $$0, ja $$1, diw $$2, iu $$3, iu $$4) {
      return i.getOrDefault($$0.b(), ect.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(ecg $$0) {
      iu.a $$1 = new iu.a();
      iu.a $$2 = new iu.a();
      dic $$3 = $$0.f();
      diw $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         ech $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ja[] $$8 = ja.values();
            eco<dzz> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jx.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dzz $$16 = $$9.a($$12);
               dzz $$17 = $$16;

               for (ja $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jx.a($$1.u()) == $$3.h && jx.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dma.a($$16, $$17, $$4, $$1, 18);
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

   public ect c() {
      return this == a ? a : new ect(this);
   }

   public interface a {
      dzz a(dzz var1, ja var2, dzz var3, diw var4, iu var5, iu var6);

      default void a(diw $$0) {
      }
   }

   static enum b implements ect.a {
      a(
         dmc.lr,
         dmc.er,
         dmc.mp,
         dmc.mq,
         dmc.mr,
         dmc.ms,
         dmc.mt,
         dmc.mu,
         dmc.mv,
         dmc.mw,
         dmc.mx,
         dmc.my,
         dmc.mz,
         dmc.mA,
         dmc.mB,
         dmc.mC,
         dmc.mD,
         dmc.mE,
         dmc.hq,
         dmc.hr,
         dmc.hs,
         dmc.fW,
         dmc.O,
         dmc.L,
         dmc.N,
         dmc.cN,
         dmc.cO,
         dmc.cP,
         dmc.cQ,
         dmc.cR,
         dmc.cS,
         dmc.cT,
         dmc.cU,
         dmc.db,
         dmc.dc,
         dmc.dd,
         dmc.de,
         dmc.dg,
         dmc.dh,
         dmc.di,
         dmc.dl,
         dmc.dm,
         dmc.dn,
         dmc.do,
         dmc.dq,
         dmc.dr,
         dmc.ds,
         dmc.dx,
         dmc.dy,
         dmc.dz,
         dmc.dA,
         dmc.dC,
         dmc.dD,
         dmc.dE
      ) {
         @Override
         public dzz a(dzz $$0, ja $$1, dzz $$2, diw $$3, iu $$4, iu $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dzz a(dzz $$0, ja $$1, dzz $$2, diw $$3, iu $$4, iu $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
         }
      },
      c(dmc.cE, dmc.ht) {
         @Override
         public dzz a(dzz $$0, ja $$1, dzz $$2, diw $$3, iu $$4, iu $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dnd.d) == ear.a && $$2.c(dnd.d) == ear.a) {
               ja $$6 = $$0.c(dnd.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dnd.c)) {
                  ear $$7 = $$1 == $$6.h() ? ear.b : ear.c;
                  $$3.a($$5, $$2.b(dnd.d, $$7.a()), 18);
                  if ($$6 == ja.c || $$6 == ja.f) {
                     dwx $$8 = $$3.c_($$4);
                     dwx $$9 = $$3.c_($$5);
                     if ($$8 instanceof dxf && $$9 instanceof dxf) {
                        dxf.a((dxf)$$8, (dxf)$$9);
                     }
                  }

                  return $$0.b(dnd.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dmc.aO, dmc.aP, dmc.aM, dmc.aR, dmc.aQ, dmc.aN, dmc.aK, dmc.aL) {
         private final ThreadLocal<List<ObjectSet<iu>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dzz a(dzz $$0, ja $$1, dzz $$2, diw $$3, iu $$4, iu $$5) {
            dzz $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(eap.aF);
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
         public void a(diw $$0) {
            iu.a $$1 = new iu.a();
            List<ObjectSet<iu>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iu> $$5 = $$2.get($$4);
               ObjectSet<iu> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iu $$7 = (iu)var8.next();
                  dzz $$8 = $$0.a_($$7);
                  if ($$8.c(eap.aF) >= $$4) {
                     $$0.a($$7, $$8.b(eap.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ja $$9 : f) {
                           $$1.a($$7, $$9);
                           dzz $$10 = $$0.a_($$1);
                           if ($$10.b(eap.aF) && $$8.c(eap.aF) > $$3) {
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
      e(dmc.ft, dmc.fs) {
         @Override
         public dzz a(dzz $$0, ja $$1, dzz $$2, diw $$3, iu $$4, iu $$5) {
            if ($$0.c(due.c) == 7) {
               dma $$6 = $$0.a(dmc.fs) ? dmc.fo : dmc.fp;
               if ($$2.a($$6)) {
                  return ($$0.a(dmc.fs) ? dmc.fq : dmc.fr).m().b(dqa.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ja[] f = ja.values();

      b(final dma... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dma... $$1) {
         for (dma $$2 : $$1) {
            ect.i.put($$2, this);
         }

         if ($$0) {
            ect.j.add(this);
         }
      }
   }
}
