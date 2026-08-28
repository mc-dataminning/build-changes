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

public class eea {
   private static final Logger b = LogUtils.getLogger();
   public static final eea a = new eea(djp.a);
   private static final String c = "Indices";
   private static final jd[] d = jd.values();
   private static final Codec<List<fhj<dne>>> e = fhj.a(mh.e.q().orElse(dng.a)).listOf();
   private static final Codec<List<fhj<exp>>> f = fhj.a(mh.c.q().orElse(exr.a)).listOf();
   private final EnumSet<jd> g = EnumSet.noneOf(jd.class);
   private final List<fhj<dne>> h = Lists.newArrayList();
   private final List<fhj<exp>> i = Lists.newArrayList();
   private final int[][] j;
   static final Map<dne, eea.a> k = new IdentityHashMap<>();
   static final Set<eea.a> l = Sets.newHashSet();

   private eea(dkb $$0) {
      this.j = new int[$$0.ap()][];
   }

   public eea(ua $$0, dkb $$1) {
      this($$1);
      $$0.m("Indices").ifPresent($$0x -> {
         for (int $$1x = 0; $$1x < this.j.length; $$1x++) {
            this.j[$$1x] = $$0x.k(String.valueOf($$1x)).orElse(null);
         }
      });
      int $$2 = $$0.b("Sides", 0);

      for (jd $$3 : jd.values()) {
         if (($$2 & 1 << $$3.ordinal()) != 0) {
            this.g.add($$3);
         }
      }

      $$0.<Collection<? extends E>>a("neighbor_block_ticks", e).ifPresent(this.h::addAll);
      $$0.<Collection<? extends E>>a("neighbor_fluid_ticks", f).ifPresent(this.i::addAll);
   }

   private eea(eea $$0) {
      this.g.addAll($$0.g);
      this.h.addAll($$0.h);
      this.i.addAll($$0.i);
      this.j = new int[$$0.j.length][];

      for (int $$1 = 0; $$1 < $$0.j.length; $$1++) {
         int[] $$2 = $$0.j[$$1];
         this.j[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   public void a(edn $$0) {
      this.b($$0);

      for (jd $$1 : d) {
         a($$0, $$1);
      }

      djz $$2 = $$0.H();
      this.h.forEach($$1x -> {
         dne $$2x = $$1x.a() == dng.a ? $$2.a_($$1x.b()).b() : (dne)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.i.forEach($$1x -> {
         exp $$2x = $$1x.a() == exr.a ? $$2.b_($$1x.b()).a() : (exp)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      l.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(edn $$0, jd $$1) {
      djz $$2 = $$0.H();
      if ($$0.t().g.remove($$1)) {
         Set<jc> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jc.f);
         boolean $$7 = $$3.contains(jc.e);
         boolean $$8 = $$3.contains(jc.d);
         boolean $$9 = $$3.contains(jc.c);
         boolean $$10 = $$3.size() == 1;
         dje $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jc[] $$16 = jc.values();
         iw.a $$17 = new iw.a();

         for (iw $$18 : iw.b($$12, $$2.K_(), $$14, $$13, $$2.ao(), $$15)) {
            ebg $$19 = $$2.a_($$18);
            ebg $$20 = $$19;

            for (jc $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dne.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static ebg a(ebg $$0, jc $$1, dka $$2, iw $$3, iw $$4) {
      return k.getOrDefault($$0.b(), eea.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(edn $$0) {
      iw.a $$1 = new iw.a();
      iw.a $$2 = new iw.a();
      dje $$3 = $$0.f();
      dka $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.j.length; $$5++) {
         edo $$6 = $$0.b($$5);
         int[] $$7 = this.j[$$5];
         this.j[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jc[] $$8 = jc.values();
            edv<ebg> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jz.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               ebg $$16 = $$9.a($$12);
               ebg $$17 = $$16;

               for (jc $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jz.a($$1.u()) == $$3.h && jz.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dne.a($$16, $$17, $$4, $$1, 18);
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

   public ua b() {
      ua $$0 = new ua();
      ua $$1 = new ua();

      for (int $$2 = 0; $$2 < this.j.length; $$2++) {
         String $$3 = String.valueOf($$2);
         if (this.j[$$2] != null && this.j[$$2].length != 0) {
            $$1.a($$3, this.j[$$2]);
         }
      }

      if (!$$1.j()) {
         $$0.a("Indices", $$1);
      }

      int $$4 = 0;

      for (jd $$5 : this.g) {
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

   public eea c() {
      return this == a ? a : new eea(this);
   }

   public interface a {
      ebg a(ebg var1, jc var2, ebg var3, dka var4, iw var5, iw var6);

      default void a(dka $$0) {
      }
   }

   static enum b implements eea.a {
      a(
         dng.lu,
         dng.eu,
         dng.ms,
         dng.mt,
         dng.mu,
         dng.mv,
         dng.mw,
         dng.mx,
         dng.my,
         dng.mz,
         dng.mA,
         dng.mB,
         dng.mC,
         dng.mD,
         dng.mE,
         dng.mF,
         dng.mG,
         dng.mH,
         dng.ht,
         dng.hu,
         dng.hv,
         dng.fZ,
         dng.O,
         dng.L,
         dng.N,
         dng.cP,
         dng.cQ,
         dng.cR,
         dng.cS,
         dng.cT,
         dng.cU,
         dng.cV,
         dng.cW,
         dng.dd,
         dng.de,
         dng.df,
         dng.dg,
         dng.di,
         dng.dj,
         dng.dk,
         dng.dn,
         dng.do,
         dng.dp,
         dng.dq,
         dng.ds,
         dng.dt,
         dng.du,
         dng.dz,
         dng.dA,
         dng.dB,
         dng.dC,
         dng.dE,
         dng.dF,
         dng.dG
      ) {
         @Override
         public ebg a(ebg $$0, jc $$1, ebg $$2, dka $$3, iw $$4, iw $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public ebg a(ebg $$0, jc $$1, ebg $$2, dka $$3, iw $$4, iw $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
         }
      },
      c(dng.cG, dng.hw) {
         @Override
         public ebg a(ebg $$0, jc $$1, ebg $$2, dka $$3, iw $$4, iw $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(doi.d) == eby.a && $$2.c(doi.d) == eby.a) {
               jc $$6 = $$0.c(doi.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(doi.c)) {
                  eby $$7 = $$1 == $$6.h() ? eby.b : eby.c;
                  $$3.a($$5, $$2.b(doi.d, $$7.a()), 18);
                  if ($$6 == jc.c || $$6 == jc.f) {
                     dye $$8 = $$3.c_($$4);
                     dye $$9 = $$3.c_($$5);
                     if ($$8 instanceof dym && $$9 instanceof dym) {
                        dym.a((dym)$$8, (dym)$$9);
                     }
                  }

                  return $$0.b(doi.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dng.aO, dng.aP, dng.aM, dng.aR, dng.aQ, dng.aN, dng.aK, dng.aL) {
         private final ThreadLocal<List<ObjectSet<iw>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public ebg a(ebg $$0, jc $$1, ebg $$2, dka $$3, iw $$4, iw $$5) {
            ebg $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(ebw.aF);
               List<ObjectSet<iw>> $$8 = this.g.get();
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
         public void a(dka $$0) {
            iw.a $$1 = new iw.a();
            List<ObjectSet<iw>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iw> $$5 = $$2.get($$4);
               ObjectSet<iw> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iw $$7 = (iw)var8.next();
                  ebg $$8 = $$0.a_($$7);
                  if ($$8.c(ebw.aF) >= $$4) {
                     $$0.a($$7, $$8.b(ebw.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jc $$9 : f) {
                           $$1.a($$7, $$9);
                           ebg $$10 = $$0.a_($$1);
                           if ($$10.b(ebw.aF) && $$8.c(ebw.aF) > $$3) {
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
      e(dng.fw, dng.fv) {
         @Override
         public ebg a(ebg $$0, jc $$1, ebg $$2, dka $$3, iw $$4, iw $$5) {
            if ($$0.c(dvk.c) == 7) {
               dne $$6 = $$0.a(dng.fv) ? dng.fr : dng.fs;
               if ($$2.a($$6)) {
                  return ($$0.a(dng.fv) ? dng.ft : dng.fu).m().b(drf.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jc[] f = jc.values();

      b(final dne... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dne... $$1) {
         for (dne $$2 : $$1) {
            eea.k.put($$2, this);
         }

         if ($$0) {
            eea.l.add(this);
         }
      }
   }
}
