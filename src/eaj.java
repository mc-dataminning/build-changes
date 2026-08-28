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

public class eaj {
   private static final Logger b = LogUtils.getLogger();
   public static final eaj a = new eaj(dgp.a);
   private static final String c = "Indices";
   private static final jo[] d = jo.values();
   private final EnumSet<jo> e = EnumSet.noneOf(jo.class);
   private final List<fdo<dke>> f = Lists.newArrayList();
   private final List<fdo<etv>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dke, eaj.a> i = new IdentityHashMap<>();
   static final Set<eaj.a> j = Sets.newHashSet();

   private eaj(dhb $$0) {
      this.h = new int[$$0.ap()][];
   }

   public eaj(tq $$0, dhb $$1) {
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

      a($$0, "neighbor_block_ticks", $$0x -> mb.e.b(aku.c($$0x)).or(() -> Optional.of(dkg.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> mb.c.b(aku.c($$0x)).or(() -> Optional.of(etx.a)), this.g);
   }

   private eaj(eaj $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(tq $$0, String $$1, Function<String, Optional<T>> $$2, List<fdo<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (un $$5 : $$0.c($$1, 10)) {
            fdo.a((tq)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dzw $$0) {
      this.b($$0);

      for (jo $$1 : d) {
         a($$0, $$1);
      }

      dgz $$2 = $$0.H();
      this.f.forEach($$1x -> {
         dke $$2x = $$1x.a() == dkg.a ? $$2.a_($$1x.b()).b() : (dke)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         etv $$2x = $$1x.a() == etx.a ? $$2.b_($$1x.b()).a() : (etv)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dzw $$0, jo $$1) {
      dgz $$2 = $$0.H();
      if ($$0.t().e.remove($$1)) {
         Set<jn> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jn.f);
         boolean $$7 = $$3.contains(jn.e);
         boolean $$8 = $$3.contains(jn.d);
         boolean $$9 = $$3.contains(jn.c);
         boolean $$10 = $$3.size() == 1;
         dgg $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jn[] $$16 = jn.values();
         ji.a $$17 = new ji.a();

         for (ji $$18 : ji.b($$12, $$2.G_(), $$14, $$13, $$2.ao(), $$15)) {
            dxq $$19 = $$2.a_($$18);
            dxq $$20 = $$19;

            for (jn $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dke.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dxq a(dxq $$0, jn $$1, dha $$2, ji $$3, ji $$4) {
      return i.getOrDefault($$0.b(), eaj.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dzw $$0) {
      ji.a $$1 = new ji.a();
      ji.a $$2 = new ji.a();
      dgg $$3 = $$0.f();
      dha $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dzx $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jn[] $$8 = jn.values();
            eae<dxq> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kk.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dxq $$16 = $$9.a($$12);
               dxq $$17 = $$16;

               for (jn $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kk.a($$1.u()) == $$3.h && kk.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dke.a($$16, $$17, $$4, $$1, 18);
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

   public eaj c() {
      return this == a ? a : new eaj(this);
   }

   public interface a {
      dxq a(dxq var1, jn var2, dxq var3, dha var4, ji var5, ji var6);

      default void a(dha $$0) {
      }
   }

   static enum b implements eaj.a {
      a(
         dkg.lq,
         dkg.eq,
         dkg.mo,
         dkg.mp,
         dkg.mq,
         dkg.mr,
         dkg.ms,
         dkg.mt,
         dkg.mu,
         dkg.mv,
         dkg.mw,
         dkg.mx,
         dkg.my,
         dkg.mz,
         dkg.mA,
         dkg.mB,
         dkg.mC,
         dkg.mD,
         dkg.hp,
         dkg.hq,
         dkg.hr,
         dkg.fV,
         dkg.O,
         dkg.L,
         dkg.N,
         dkg.cM,
         dkg.cN,
         dkg.cO,
         dkg.cP,
         dkg.cQ,
         dkg.cR,
         dkg.cS,
         dkg.cT,
         dkg.da,
         dkg.db,
         dkg.dc,
         dkg.dd,
         dkg.df,
         dkg.dg,
         dkg.dh,
         dkg.dk,
         dkg.dl,
         dkg.dm,
         dkg.dn,
         dkg.dp,
         dkg.dq,
         dkg.dr,
         dkg.dw,
         dkg.dx,
         dkg.dy,
         dkg.dz,
         dkg.dB,
         dkg.dC,
         dkg.dD
      ) {
         @Override
         public dxq a(dxq $$0, jn $$1, dxq $$2, dha $$3, ji $$4, ji $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dxq a(dxq $$0, jn $$1, dxq $$2, dha $$3, ji $$4, ji $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
         }
      },
      c(dkg.cD, dkg.hs) {
         @Override
         public dxq a(dxq $$0, jn $$1, dxq $$2, dha $$3, ji $$4, ji $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dlh.d) == dyi.a && $$2.c(dlh.d) == dyi.a) {
               jn $$6 = $$0.c(dlh.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dlh.c)) {
                  dyi $$7 = $$1 == $$6.h() ? dyi.b : dyi.c;
                  $$3.a($$5, $$2.b(dlh.d, $$7.a()), 18);
                  if ($$6 == jn.c || $$6 == jn.f) {
                     dus $$8 = $$3.c_($$4);
                     dus $$9 = $$3.c_($$5);
                     if ($$8 instanceof duz && $$9 instanceof duz) {
                        duz.a((duz)$$8, (duz)$$9);
                     }
                  }

                  return $$0.b(dlh.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dkg.aO, dkg.aP, dkg.aM, dkg.aR, dkg.aQ, dkg.aN, dkg.aK, dkg.aL) {
         private final ThreadLocal<List<ObjectSet<ji>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dxq a(dxq $$0, jn $$1, dxq $$2, dha $$3, ji $$4, ji $$5) {
            dxq $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.C_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(dyg.aF);
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
         public void a(dha $$0) {
            ji.a $$1 = new ji.a();
            List<ObjectSet<ji>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ji> $$5 = $$2.get($$4);
               ObjectSet<ji> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ji $$7 = (ji)var8.next();
                  dxq $$8 = $$0.a_($$7);
                  if ($$8.c(dyg.aF) >= $$4) {
                     $$0.a($$7, $$8.b(dyg.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jn $$9 : f) {
                           $$1.a($$7, $$9);
                           dxq $$10 = $$0.a_($$1);
                           if ($$10.b(dyg.aF) && $$8.c(dyg.aF) > $$3) {
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
      e(dkg.fs, dkg.fr) {
         @Override
         public dxq a(dxq $$0, jn $$1, dxq $$2, dha $$3, ji $$4, ji $$5) {
            if ($$0.c(dsg.c) == 7) {
               dke $$6 = $$0.a(dkg.fr) ? dkg.fn : dkg.fo;
               if ($$2.a($$6)) {
                  return ($$0.a(dkg.fr) ? dkg.fp : dkg.fq).m().b(dod.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jn[] f = jn.values();

      b(final dke... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dke... $$1) {
         for (dke $$2 : $$1) {
            eaj.i.put($$2, this);
         }

         if ($$0) {
            eaj.j.add(this);
         }
      }
   }
}
