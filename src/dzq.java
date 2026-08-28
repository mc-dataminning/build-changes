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

public class dzq {
   private static final Logger b = LogUtils.getLogger();
   public static final dzq a = new dzq(dfy.a);
   private static final String c = "Indices";
   private static final jo[] d = jo.values();
   private final EnumSet<jo> e = EnumSet.noneOf(jo.class);
   private final List<fcs<djn>> f = Lists.newArrayList();
   private final List<fcs<esz>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<djn, dzq.a> i = new IdentityHashMap<>();
   static final Set<dzq.a> j = Sets.newHashSet();

   private dzq(dgl $$0) {
      this.h = new int[$$0.ao()][];
   }

   public dzq(tq $$0, dgl $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> mb.e.b(akv.c($$0x)).or(() -> Optional.of(djp.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> mb.c.b(akv.c($$0x)).or(() -> Optional.of(etb.a)), this.g);
   }

   private dzq(dzq $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(tq $$0, String $$1, Function<String, Optional<T>> $$2, List<fcs<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (un $$5 : $$0.c($$1, 10)) {
            fcs.a((tq)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dzd $$0) {
      this.b($$0);

      for (jo $$1 : d) {
         a($$0, $$1);
      }

      dgj $$2 = $$0.H();
      this.f.forEach($$1x -> {
         djn $$2x = $$1x.a() == djp.a ? $$2.a_($$1x.b()).b() : (djn)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         esz $$2x = $$1x.a() == etb.a ? $$2.b_($$1x.b()).a() : (esz)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dzd $$0, jo $$1) {
      dgj $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<jn> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jn.f);
         boolean $$7 = $$3.contains(jn.e);
         boolean $$8 = $$3.contains(jn.d);
         boolean $$9 = $$3.contains(jn.c);
         boolean $$10 = $$3.size() == 1;
         dfp $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jn[] $$16 = jn.values();
         ji.a $$17 = new ji.a();

         for (ji $$18 : ji.b($$12, $$2.L_(), $$14, $$13, $$2.an(), $$15)) {
            dwy $$19 = $$2.a_($$18);
            dwy $$20 = $$19;

            for (jn $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            djn.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dwy a(dwy $$0, jn $$1, dgk $$2, ji $$3, ji $$4) {
      return i.getOrDefault($$0.b(), dzq.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dzd $$0) {
      ji.a $$1 = new ji.a();
      ji.a $$2 = new ji.a();
      dfp $$3 = $$0.f();
      dgk $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dze $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jn[] $$8 = jn.values();
            dzl<dwy> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kk.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dwy $$16 = $$9.a($$12);
               dwy $$17 = $$16;

               for (jn $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kk.a($$1.u()) == $$3.h && kk.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               djn.a($$16, $$17, $$4, $$1, 18);
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

   public dzq c() {
      return this == a ? a : new dzq(this);
   }

   public interface a {
      dwy a(dwy var1, jn var2, dwy var3, dgk var4, ji var5, ji var6);

      default void a(dgk $$0) {
      }
   }

   static enum b implements dzq.a {
      a(
         djp.lq,
         djp.eq,
         djp.mo,
         djp.mp,
         djp.mq,
         djp.mr,
         djp.ms,
         djp.mt,
         djp.mu,
         djp.mv,
         djp.mw,
         djp.mx,
         djp.my,
         djp.mz,
         djp.mA,
         djp.mB,
         djp.mC,
         djp.mD,
         djp.hp,
         djp.hq,
         djp.hr,
         djp.fV,
         djp.O,
         djp.L,
         djp.N,
         djp.cM,
         djp.cN,
         djp.cO,
         djp.cP,
         djp.cQ,
         djp.cR,
         djp.cS,
         djp.cT,
         djp.da,
         djp.db,
         djp.dc,
         djp.dd,
         djp.df,
         djp.dg,
         djp.dh,
         djp.dk,
         djp.dl,
         djp.dm,
         djp.dn,
         djp.dp,
         djp.dq,
         djp.dr,
         djp.dw,
         djp.dx,
         djp.dy,
         djp.dz,
         djp.dB,
         djp.dC,
         djp.dD
      ) {
         @Override
         public dwy a(dwy $$0, jn $$1, dwy $$2, dgk $$3, ji $$4, ji $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dwy a(dwy $$0, jn $$1, dwy $$2, dgk $$3, ji $$4, ji $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
         }
      },
      c(djp.cD, djp.hs) {
         @Override
         public dwy a(dwy $$0, jn $$1, dwy $$2, dgk $$3, ji $$4, ji $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dkq.d) == dxq.a && $$2.c(dkq.d) == dxq.a) {
               jn $$6 = $$0.c(dkq.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dkq.c)) {
                  dxq $$7 = $$1 == $$6.h() ? dxq.b : dxq.c;
                  $$3.a($$5, $$2.b(dkq.d, $$7.a()), 18);
                  if ($$6 == jn.c || $$6 == jn.f) {
                     dua $$8 = $$3.c_($$4);
                     dua $$9 = $$3.c_($$5);
                     if ($$8 instanceof duh && $$9 instanceof duh) {
                        duh.a((duh)$$8, (duh)$$9);
                     }
                  }

                  return $$0.b(dkq.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, djp.aO, djp.aP, djp.aM, djp.aR, djp.aQ, djp.aN, djp.aK, djp.aL) {
         private final ThreadLocal<List<ObjectSet<ji>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dwy a(dwy $$0, jn $$1, dwy $$2, dgk $$3, ji $$4, ji $$5) {
            dwy $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dxo.aF);
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
         public void a(dgk $$0) {
            ji.a $$1 = new ji.a();
            List<ObjectSet<ji>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ji> $$5 = $$2.get($$4);
               ObjectSet<ji> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ji $$7 = (ji)var8.next();
                  dwy $$8 = $$0.a_($$7);
                  if ($$8.c(dxo.aF) >= $$4) {
                     $$0.a($$7, $$8.b(dxo.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jn $$9 : f) {
                           $$1.a($$7, $$9);
                           dwy $$10 = $$0.a_($$1);
                           if ($$10.b(dxo.aF) && $$8.c(dxo.aF) > $$3) {
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
      e(djp.fs, djp.fr) {
         @Override
         public dwy a(dwy $$0, jn $$1, dwy $$2, dgk $$3, ji $$4, ji $$5) {
            if ($$0.c(dro.c) == 7) {
               djn $$6 = $$0.a(djp.fr) ? djp.fn : djp.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(djp.fr) ? djp.fp : djp.fq).m().b(dnl.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jn[] f = jn.values();

      b(final djn... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final djn... $$1) {
         for (djn $$2 : $$1) {
            dzq.i.put($$2, this);
         }

         if ($$0) {
            dzq.j.add(this);
         }
      }
   }
}
