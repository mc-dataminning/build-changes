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

public class edy {
   private static final Logger b = LogUtils.getLogger();
   public static final edy a = new edy(djn.a);
   private static final String c = "Indices";
   private static final jc[] d = jc.values();
   private static final Codec<List<fhh<dnc>>> e = fhh.a(mg.e.q().orElse(dne.a)).listOf();
   private static final Codec<List<fhh<exn>>> f = fhh.a(mg.c.q().orElse(exp.a)).listOf();
   private final EnumSet<jc> g = EnumSet.noneOf(jc.class);
   private final List<fhh<dnc>> h = Lists.newArrayList();
   private final List<fhh<exn>> i = Lists.newArrayList();
   private final int[][] j;
   static final Map<dnc, edy.a> k = new IdentityHashMap<>();
   static final Set<edy.a> l = Sets.newHashSet();

   private edy(djz $$0) {
      this.j = new int[$$0.ap()][];
   }

   public edy(tz $$0, djz $$1) {
      this($$1);
      $$0.m("Indices").ifPresent($$0x -> {
         for (int $$1x = 0; $$1x < this.j.length; $$1x++) {
            this.j[$$1x] = $$0x.k(String.valueOf($$1x)).orElse(null);
         }
      });
      int $$2 = $$0.b("Sides", 0);

      for (jc $$3 : jc.values()) {
         if (($$2 & 1 << $$3.ordinal()) != 0) {
            this.g.add($$3);
         }
      }

      $$0.<Collection<? extends E>>a("neighbor_block_ticks", e).ifPresent(this.h::addAll);
      $$0.<Collection<? extends E>>a("neighbor_fluid_ticks", f).ifPresent(this.i::addAll);
   }

   private edy(edy $$0) {
      this.g.addAll($$0.g);
      this.h.addAll($$0.h);
      this.i.addAll($$0.i);
      this.j = new int[$$0.j.length][];

      for (int $$1 = 0; $$1 < $$0.j.length; $$1++) {
         int[] $$2 = $$0.j[$$1];
         this.j[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   public void a(edl $$0) {
      this.b($$0);

      for (jc $$1 : d) {
         a($$0, $$1);
      }

      djx $$2 = $$0.H();
      this.h.forEach($$1x -> {
         dnc $$2x = $$1x.a() == dne.a ? $$2.a_($$1x.b()).b() : (dnc)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.i.forEach($$1x -> {
         exn $$2x = $$1x.a() == exp.a ? $$2.b_($$1x.b()).a() : (exn)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      l.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(edl $$0, jc $$1) {
      djx $$2 = $$0.H();
      if ($$0.t().g.remove($$1)) {
         Set<jb> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jb.f);
         boolean $$7 = $$3.contains(jb.e);
         boolean $$8 = $$3.contains(jb.d);
         boolean $$9 = $$3.contains(jb.c);
         boolean $$10 = $$3.size() == 1;
         djc $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jb[] $$16 = jb.values();
         iv.a $$17 = new iv.a();

         for (iv $$18 : iv.b($$12, $$2.K_(), $$14, $$13, $$2.ao(), $$15)) {
            ebe $$19 = $$2.a_($$18);
            ebe $$20 = $$19;

            for (jb $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dnc.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static ebe a(ebe $$0, jb $$1, djy $$2, iv $$3, iv $$4) {
      return k.getOrDefault($$0.b(), edy.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(edl $$0) {
      iv.a $$1 = new iv.a();
      iv.a $$2 = new iv.a();
      djc $$3 = $$0.f();
      djy $$4 = $$0.H();

      for (int $$5 = 0; $$5 < this.j.length; $$5++) {
         edm $$6 = $$0.b($$5);
         int[] $$7 = this.j[$$5];
         this.j[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jb[] $$8 = jb.values();
            edt<ebe> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jy.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               ebe $$16 = $$9.a($$12);
               ebe $$17 = $$16;

               for (jb $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jy.a($$1.u()) == $$3.h && jy.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dnc.a($$16, $$17, $$4, $$1, 18);
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

      if (!$$1.j()) {
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

   public edy c() {
      return this == a ? a : new edy(this);
   }

   public interface a {
      ebe a(ebe var1, jb var2, ebe var3, djy var4, iv var5, iv var6);

      default void a(djy $$0) {
      }
   }

   static enum b implements edy.a {
      a(
         dne.lu,
         dne.eu,
         dne.ms,
         dne.mt,
         dne.mu,
         dne.mv,
         dne.mw,
         dne.mx,
         dne.my,
         dne.mz,
         dne.mA,
         dne.mB,
         dne.mC,
         dne.mD,
         dne.mE,
         dne.mF,
         dne.mG,
         dne.mH,
         dne.ht,
         dne.hu,
         dne.hv,
         dne.fZ,
         dne.O,
         dne.L,
         dne.N,
         dne.cP,
         dne.cQ,
         dne.cR,
         dne.cS,
         dne.cT,
         dne.cU,
         dne.cV,
         dne.cW,
         dne.dd,
         dne.de,
         dne.df,
         dne.dg,
         dne.di,
         dne.dj,
         dne.dk,
         dne.dn,
         dne.do,
         dne.dp,
         dne.dq,
         dne.ds,
         dne.dt,
         dne.du,
         dne.dz,
         dne.dA,
         dne.dB,
         dne.dC,
         dne.dE,
         dne.dF,
         dne.dG
      ) {
         @Override
         public ebe a(ebe $$0, jb $$1, ebe $$2, djy $$3, iv $$4, iv $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public ebe a(ebe $$0, jb $$1, ebe $$2, djy $$3, iv $$4, iv $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
         }
      },
      c(dne.cG, dne.hw) {
         @Override
         public ebe a(ebe $$0, jb $$1, ebe $$2, djy $$3, iv $$4, iv $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dog.d) == ebw.a && $$2.c(dog.d) == ebw.a) {
               jb $$6 = $$0.c(dog.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dog.c)) {
                  ebw $$7 = $$1 == $$6.h() ? ebw.b : ebw.c;
                  $$3.a($$5, $$2.b(dog.d, $$7.a()), 18);
                  if ($$6 == jb.c || $$6 == jb.f) {
                     dyc $$8 = $$3.c_($$4);
                     dyc $$9 = $$3.c_($$5);
                     if ($$8 instanceof dyk && $$9 instanceof dyk) {
                        dyk.a((dyk)$$8, (dyk)$$9);
                     }
                  }

                  return $$0.b(dog.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dne.aO, dne.aP, dne.aM, dne.aR, dne.aQ, dne.aN, dne.aK, dne.aL) {
         private final ThreadLocal<List<ObjectSet<iv>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public ebe a(ebe $$0, jb $$1, ebe $$2, djy $$3, iv $$4, iv $$5) {
            ebe $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(ebu.aF);
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
         public void a(djy $$0) {
            iv.a $$1 = new iv.a();
            List<ObjectSet<iv>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<iv> $$5 = $$2.get($$4);
               ObjectSet<iv> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  iv $$7 = (iv)var8.next();
                  ebe $$8 = $$0.a_($$7);
                  if ($$8.c(ebu.aF) >= $$4) {
                     $$0.a($$7, $$8.b(ebu.aF, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jb $$9 : f) {
                           $$1.a($$7, $$9);
                           ebe $$10 = $$0.a_($$1);
                           if ($$10.b(ebu.aF) && $$8.c(ebu.aF) > $$3) {
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
      e(dne.fw, dne.fv) {
         @Override
         public ebe a(ebe $$0, jb $$1, ebe $$2, djy $$3, iv $$4, iv $$5) {
            if ($$0.c(dvi.c) == 7) {
               dnc $$6 = $$0.a(dne.fv) ? dne.fr : dne.fs;
               if ($$2.a($$6)) {
                  return ($$0.a(dne.fv) ? dne.ft : dne.fu).m().b(drd.e, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jb[] f = jb.values();

      b(final dnc... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dnc... $$1) {
         for (dnc $$2 : $$1) {
            edy.k.put($$2, this);
         }

         if ($$0) {
            edy.l.add(this);
         }
      }
   }
}
