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

public class dzo {
   private static final Logger b = LogUtils.getLogger();
   public static final dzo a = new dzo(dfw.a);
   private static final String c = "Indices";
   private static final jo[] d = jo.values();
   private final EnumSet<jo> e = EnumSet.noneOf(jo.class);
   private final List<fcq<djl>> f = Lists.newArrayList();
   private final List<fcq<esx>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<djl, dzo.a> i = new IdentityHashMap<>();
   static final Set<dzo.a> j = Sets.newHashSet();

   private dzo(dgj $$0) {
      this.h = new int[$$0.ao()][];
   }

   public dzo(tq $$0, dgj $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         tq $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jo $$6 : jo.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> mb.e.b(akv.c($$0x)).or(() -> Optional.of(djn.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> mb.c.b(akv.c($$0x)).or(() -> Optional.of(esz.a)), this.g);
   }

   private dzo(dzo $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(tq $$0, String $$1, Function<String, Optional<T>> $$2, List<fcq<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (un $$5 : $$0.c($$1, 10)) {
            fcq.a((tq)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dzb $$0) {
      this.b($$0);

      for (jo $$1 : d) {
         a($$0, $$1);
      }

      dgh $$2 = $$0.H();
      this.f.forEach($$1x -> {
         djl $$2x = $$1x.a() == djn.a ? $$2.a_($$1x.b()).b() : (djl)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         esx $$2x = $$1x.a() == esz.a ? $$2.b_($$1x.b()).a() : (esx)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dzb $$0, jo $$1) {
      dgh $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<jn> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jn.f);
         boolean $$7 = $$3.contains(jn.e);
         boolean $$8 = $$3.contains(jn.d);
         boolean $$9 = $$3.contains(jn.c);
         boolean $$10 = $$3.size() == 1;
         dfn $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jn[] $$16 = jn.values();
         ji.a $$17 = new ji.a();

         for (ji $$18 : ji.b($$12, $$2.L_(), $$14, $$13, $$2.an(), $$15)) {
            dww $$19 = $$2.a_($$18);
            dww $$20 = $$19;

            for (jn $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            djl.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dww a(dww $$0, jn $$1, dgi $$2, ji $$3, ji $$4) {
      return i.getOrDefault($$0.b(), dzo.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dzb $$0) {
      ji.a $$1 = new ji.a();
      ji.a $$2 = new ji.a();
      dfn $$3 = $$0.f();
      dgi $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dzc $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jn[] $$8 = jn.values();
            dzj<dww> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kk.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dww $$16 = $$9.a($$12);
               dww $$17 = $$16;

               for (jn $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kk.a($$1.u()) == $$3.h && kk.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               djl.a($$16, $$17, $$4, $$1, 18);
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

   public tq b() {
      tq $$0 = new tq();
      tq $$1 = new tq();

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

      for (jo $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         tw $$6 = new tw();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> mb.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         tw $$7 = new tw();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> mb.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public dzo c() {
      return this == a ? a : new dzo(this);
   }

   public interface a {
      dww a(dww var1, jn var2, dww var3, dgi var4, ji var5, ji var6);

      default void a(dgi $$0) {
      }
   }

   static enum b implements dzo.a {
      a(
         djn.lq,
         djn.eq,
         djn.mo,
         djn.mp,
         djn.mq,
         djn.mr,
         djn.ms,
         djn.mt,
         djn.mu,
         djn.mv,
         djn.mw,
         djn.mx,
         djn.my,
         djn.mz,
         djn.mA,
         djn.mB,
         djn.mC,
         djn.mD,
         djn.hp,
         djn.hq,
         djn.hr,
         djn.fV,
         djn.O,
         djn.L,
         djn.N,
         djn.cM,
         djn.cN,
         djn.cO,
         djn.cP,
         djn.cQ,
         djn.cR,
         djn.cS,
         djn.cT,
         djn.da,
         djn.db,
         djn.dc,
         djn.dd,
         djn.df,
         djn.dg,
         djn.dh,
         djn.dk,
         djn.dl,
         djn.dm,
         djn.dn,
         djn.dp,
         djn.dq,
         djn.dr,
         djn.dw,
         djn.dx,
         djn.dy,
         djn.dz,
         djn.dB,
         djn.dC,
         djn.dD
      ) {
         @Override
         public dww a(dww $$0, jn $$1, dww $$2, dgi $$3, ji $$4, ji $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dww a(dww $$0, jn $$1, dww $$2, dgi $$3, ji $$4, ji $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
         }
      },
      c(djn.cD, djn.hs) {
         @Override
         public dww a(dww $$0, jn $$1, dww $$2, dgi $$3, ji $$4, ji $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dko.d) == dxo.a && $$2.c(dko.d) == dxo.a) {
               jn $$6 = $$0.c(dko.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dko.c)) {
                  dxo $$7 = $$1 == $$6.h() ? dxo.b : dxo.c;
                  $$3.a($$5, $$2.b(dko.d, $$7.a()), 18);
                  if ($$6 == jn.c || $$6 == jn.f) {
                     dty $$8 = $$3.c_($$4);
                     dty $$9 = $$3.c_($$5);
                     if ($$8 instanceof duf && $$9 instanceof duf) {
                        duf.a((duf)$$8, (duf)$$9);
                     }
                  }

                  return $$0.b(dko.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, djn.aO, djn.aP, djn.aM, djn.aR, djn.aQ, djn.aN, djn.aK, djn.aL) {
         private final ThreadLocal<List<ObjectSet<ji>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dww a(dww $$0, jn $$1, dww $$2, dgi $$3, ji $$4, ji $$5) {
            dww $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dxm.aF);
               List<ObjectSet<ji>> $$8 = this.g.get();
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
         public void a(dgi $$0) {
            ji.a $$1 = new ji.a();
            List<ObjectSet<ji>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ji> $$5 = $$2.get($$4);
               ObjectSet<ji> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ji $$7 = (ji)var8.next();
                  dww $$8 = $$0.a_($$7);
                  if ($$8.c(dxm.aF) >= $$4) {
                     $$0.a($$7, $$8.b(dxm.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jn $$9 : f) {
                           $$1.a($$7, $$9);
                           dww $$10 = $$0.a_($$1);
                           if ($$10.b(dxm.aF) && $$8.c(dxm.aF) > $$3) {
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
      e(djn.fs, djn.fr) {
         @Override
         public dww a(dww $$0, jn $$1, dww $$2, dgi $$3, ji $$4, ji $$5) {
            if ($$0.c(drm.c) == 7) {
               djl $$6 = $$0.a(djn.fr) ? djn.fn : djn.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(djn.fr) ? djn.fp : djn.fq).m().b(dnj.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jn[] f = jn.values();

      b(final djl... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final djl... $$1) {
         for (djl $$2 : $$1) {
            dzo.i.put($$2, this);
         }

         if ($$0) {
            dzo.j.add(this);
         }
      }
   }
}
