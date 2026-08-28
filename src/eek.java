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

public class eek {
   private static final Logger b = LogUtils.getLogger();
   public static final eek a = new eek(djz.a);
   private static final String c = "Indices";
   private static final jd[] d = jd.values();
   private static final Codec<List<fht<dno>>> e = fht.a(mh.e.q().orElse(dnq.a)).listOf();
   private static final Codec<List<fht<exz>>> f = fht.a(mh.c.q().orElse(eyb.a)).listOf();
   private final EnumSet<jd> g = EnumSet.noneOf(jd.class);
   private final List<fht<dno>> h = Lists.newArrayList();
   private final List<fht<exz>> i = Lists.newArrayList();
   private final int[][] j;
   static final Map<dno, eek.a> k = new IdentityHashMap<>();
   static final Set<eek.a> l = Sets.newHashSet();

   private eek(dkl $$0) {
      this.j = new int[$$0.ap()][];
   }

   public eek(ua $$0, dkl $$1) {
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

   private eek(eek $$0) {
      this.g.addAll($$0.g);
      this.h.addAll($$0.h);
      this.i.addAll($$0.i);
      this.j = new int[$$0.j.length][];

      for (int $$1 = 0; $$1 < $$0.j.length; $$1++) {
         int[] $$2 = $$0.j[$$1];
         this.j[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   public void a(edx $$0) {
      this.b($$0);

      for (jd $$1 : d) {
         a($$0, $$1);
      }

      dkj $$2 = $$0.H();
      this.h.forEach($$1x -> {
         dno $$2x = $$1x.a() == dnq.a ? $$2.a_($$1x.b()).b() : (dno)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.i.forEach($$1x -> {
         exz $$2x = $$1x.a() == eyb.a ? $$2.b_($$1x.b()).a() : (exz)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      l.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(edx $$0, jd $$1) {
      dkj $$2 = $$0.H();
      if ($$0.t().g.remove($$1)) {
         Set<jc> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jc.f);
         boolean $$7 = $$3.contains(jc.e);
         boolean $$8 = $$3.contains(jc.d);
         boolean $$9 = $$3.contains(jc.c);
         boolean $$10 = $$3.size() == 1;
         djo $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jc[] $$16 = jc.values();
         iw.a $$17 = new iw.a();

         for (iw $$18 : iw.b($$12, $$2.K_(), $$14, $$13, $$2.ao(), $$15)) {
            ebq $$19 = $$2.a_($$18);
            ebq $$20 = $$19;

            for (jc $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dno.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static ebq a(ebq $$0, jc $$1, dkk $$2, iw $$3, iw $$4) {
      return k.getOrDefault($$0.b(), eek.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(edx $$0) {
      iw.a $$1 = new iw.a();
      iw.a $$2 = new iw.a();
      djo $$3 = $$0.f();
      dkk $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.j.length; $$5++) {
         edy $$6 = $$0.b($$5);
         int[] $$7 = this.j[$$5];
         this.j[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jc[] $$8 = jc.values();
            eef<ebq> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jz.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               ebq $$16 = $$9.a($$12);
               ebq $$17 = $$16;

               for (jc $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jz.a($$1.u()) == $$3.h && jz.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dno.a($$16, $$17, $$4, $$1, 18);
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

   public eek c() {
      return this == a ? a : new eek(this);
   }

   public interface a {
      ebq a(ebq var1, jc var2, ebq var3, dkk var4, iw var5, iw var6);

      default void a(dkk $$0) {
      }
   }

   static enum b implements eek.a {
      a(
         dnq.lu,
         dnq.eu,
         dnq.ms,
         dnq.mt,
         dnq.mu,
         dnq.mv,
         dnq.mw,
         dnq.mx,
         dnq.my,
         dnq.mz,
         dnq.mA,
         dnq.mB,
         dnq.mC,
         dnq.mD,
         dnq.mE,
         dnq.mF,
         dnq.mG,
         dnq.mH,
         dnq.ht,
         dnq.hu,
         dnq.hv,
         dnq.fZ,
         dnq.O,
         dnq.L,
         dnq.N,
         dnq.cP,
         dnq.cQ,
         dnq.cR,
         dnq.cS,
         dnq.cT,
         dnq.cU,
         dnq.cV,
         dnq.cW,
         dnq.dd,
         dnq.de,
         dnq.df,
         dnq.dg,
         dnq.di,
         dnq.dj,
         dnq.dk,
         dnq.dn,
         dnq.do,
         dnq.dp,
         dnq.dq,
         dnq.ds,
         dnq.dt,
         dnq.du,
         dnq.dz,
         dnq.dA,
         dnq.dB,
         dnq.dC,
         dnq.dE,
         dnq.dF,
         dnq.dG
      ) {
         @Override
         public ebq a(ebq $$0, jc $$1, ebq $$2, dkk $$3, iw $$4, iw $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public ebq a(ebq $$0, jc $$1, ebq $$2, dkk $$3, iw $$4, iw $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
         }
      },
      c(dnq.cG, dnq.hw) {
         @Override
         public ebq a(ebq $$0, jc $$1, ebq $$2, dkk $$3, iw $$4, iw $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dos.d) == eci.a && $$2.c(dos.d) == eci.a) {
               jc $$6 = $$0.c(dos.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dos.c)) {
                  eci $$7 = $$1 == $$6.h() ? eci.b : eci.c;
                  $$3.a($$5, $$2.b(dos.d, $$7.a()), 18);
                  if ($$6 == jc.c || $$6 == jc.f) {
                     dyo $$8 = $$3.c_($$4);
                     dyo $$9 = $$3.c_($$5);
                     if ($$8 instanceof dyw && $$9 instanceof dyw) {
                        dyw.a((dyw)$$8, (dyw)$$9);
                     }
                  }

                  return $$0.b(dos.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dnq.aO, dnq.aP, dnq.aM, dnq.aR, dnq.aQ, dnq.aN, dnq.aK, dnq.aL) {
         private final ThreadLocal<List<ObjectSet<iw>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public ebq a(ebq $$0, jc $$1, ebq $$2, dkk $$3, iw $$4, iw $$5) {
            ebq $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(ecg.aF);
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
         public void a(dkk $$0) {
            iw.a $$1 = new iw.a();
            List<ObjectSet<iw>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iw> $$5 = $$2.get($$4);
               ObjectSet<iw> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iw $$7 = (iw)var8.next();
                  ebq $$8 = $$0.a_($$7);
                  if ($$8.c(ecg.aF) >= $$4) {
                     $$0.a($$7, $$8.b(ecg.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jc $$9 : f) {
                           $$1.a($$7, $$9);
                           ebq $$10 = $$0.a_($$1);
                           if ($$10.b(ecg.aF) && $$8.c(ecg.aF) > $$3) {
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
      e(dnq.fw, dnq.fv) {
         @Override
         public ebq a(ebq $$0, jc $$1, ebq $$2, dkk $$3, iw $$4, iw $$5) {
            if ($$0.c(dvu.c) == 7) {
               dno $$6 = $$0.a(dnq.fv) ? dnq.fr : dnq.fs;
               if ($$2.a($$6)) {
                  return ($$0.a(dnq.fv) ? dnq.ft : dnq.fu).m().b(drp.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jc[] f = jc.values();

      b(final dno... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dno... $$1) {
         for (dno $$2 : $$1) {
            eek.k.put($$2, this);
         }

         if ($$0) {
            eek.l.add(this);
         }
      }
   }
}
