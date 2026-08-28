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

public class dyc {
   private static final Logger b = LogUtils.getLogger();
   public static final dyc a = new dyc(deq.a);
   private static final String c = "Indices";
   private static final jn[] d = jn.values();
   private final EnumSet<jn> e = EnumSet.noneOf(jn.class);
   private final List<fbe<die>> f = Lists.newArrayList();
   private final List<fbe<erj>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<die, dyc.a> i = new IdentityHashMap<>();
   static final Set<dyc.a> j = Sets.newHashSet();

   private dyc(dfd $$0) {
      this.h = new int[$$0.am()][];
   }

   public dyc(uk $$0, dfd $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         uk $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> ly.e.b(ali.c($$0x)).or(() -> Optional.of(dig.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> ly.c.b(ali.c($$0x)).or(() -> Optional.of(erl.a)), this.g);
   }

   private dyc(dyc $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(uk $$0, String $$1, Function<String, Optional<T>> $$2, List<fbe<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vh $$5 : $$0.c($$1, 10)) {
            fbe.a((uk)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dxp $$0) {
      this.b($$0);

      for (jn $$1 : d) {
         a($$0, $$1);
      }

      dfb $$2 = $$0.E();
      this.f.forEach($$1x -> {
         die $$2x = $$1x.a() == dig.a ? $$2.a_($$1x.b()).b() : (die)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         erj $$2x = $$1x.a() == erl.a ? $$2.b_($$1x.b()).a() : (erj)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dxp $$0, jn $$1) {
      dfb $$2 = $$0.E();
      if ($$0.q().e.remove($$1)) {
         Set<jm> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jm.f);
         boolean $$7 = $$3.contains(jm.e);
         boolean $$8 = $$3.contains(jm.d);
         boolean $$9 = $$3.contains(jm.c);
         boolean $$10 = $$3.size() == 1;
         deh $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jm[] $$16 = jm.values();
         jh.a $$17 = new jh.a();

         for (jh $$18 : jh.b($$12, $$2.I_(), $$14, $$13, $$2.al(), $$15)) {
            dvj $$19 = $$2.a_($$18);
            dvj $$20 = $$19;

            for (jm $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            die.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dvj a(dvj $$0, jm $$1, dfc $$2, jh $$3, jh $$4) {
      return i.getOrDefault($$0.b(), dyc.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dxp $$0) {
      jh.a $$1 = new jh.a();
      jh.a $$2 = new jh.a();
      deh $$3 = $$0.f();
      dfc $$4 = $$0.E();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dxq $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jm[] $$8 = jm.values();
            dxx<dvj> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kj.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dvj $$16 = $$9.a($$12);
               dvj $$17 = $$16;

               for (jm $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kj.a($$1.u()) == $$3.g && kj.a($$1.w()) == $$3.h) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               die.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.g, $$3.h});
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

   public uk b() {
      uk $$0 = new uk();
      uk $$1 = new uk();

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
         uq $$6 = new uq();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> ly.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         uq $$7 = new uq();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> ly.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public dyc c() {
      return this == a ? a : new dyc(this);
   }

   public interface a {
      dvj a(dvj var1, jm var2, dvj var3, dfc var4, jh var5, jh var6);

      default void a(dfc $$0) {
      }
   }

   static enum b implements dyc.a {
      a(
         dig.kO,
         dig.ed,
         dig.lM,
         dig.lN,
         dig.lO,
         dig.lP,
         dig.lQ,
         dig.lR,
         dig.lS,
         dig.lT,
         dig.lU,
         dig.lV,
         dig.lW,
         dig.lX,
         dig.lY,
         dig.lZ,
         dig.ma,
         dig.mb,
         dig.gS,
         dig.gT,
         dig.gU,
         dig.fA,
         dig.L,
         dig.I,
         dig.K,
         dig.cE,
         dig.cF,
         dig.cG,
         dig.cH,
         dig.cI,
         dig.cJ,
         dig.cK,
         dig.cR,
         dig.cS,
         dig.cT,
         dig.cU,
         dig.cW,
         dig.cX,
         dig.da,
         dig.db,
         dig.dc,
         dig.dd,
         dig.df,
         dig.dg,
         dig.dl,
         dig.dm,
         dig.dn,
         dig.do,
         dig.dq,
         dig.dr
      ) {
         @Override
         public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dig.cv, dig.gV) {
         @Override
         public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(djh.d) == dwb.a && $$2.c(djh.d) == dwb.a) {
               jm $$6 = $$0.c(djh.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(djh.c)) {
                  dwb $$7 = $$1 == $$6.h() ? dwb.b : dwb.c;
                  $$3.a($$5, $$2.b(djh.d, $$7.a()), 18);
                  if ($$6 == jm.c || $$6 == jm.f) {
                     dsm $$8 = $$3.c_($$4);
                     dsm $$9 = $$3.c_($$5);
                     if ($$8 instanceof dst && $$9 instanceof dst) {
                        dst.a((dst)$$8, (dst)$$9);
                     }
                  }

                  return $$0.b(djh.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dig.aI, dig.aJ, dig.aG, dig.aK, dig.aH, dig.aE, dig.aF) {
         private final ThreadLocal<List<ObjectSet<jh>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
            dvj $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dvz.aC);
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
         public void a(dfc $$0) {
            jh.a $$1 = new jh.a();
            List<ObjectSet<jh>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jh> $$5 = $$2.get($$4);
               ObjectSet<jh> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jh $$7 = (jh)var8.next();
                  dvj $$8 = $$0.a_($$7);
                  if ($$8.c(dvz.aC) >= $$4) {
                     $$0.a($$7, $$8.b(dvz.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jm $$9 : f) {
                           $$1.a($$7, $$9);
                           dvj $$10 = $$0.a_($$1);
                           if ($$10.b(dvz.aC) && $$8.c(dvz.aC) > $$3) {
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
      e(dig.fe, dig.fd) {
         @Override
         public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
            if ($$0.c(dqa.c) == 7) {
               die $$6 = $$0.a(dig.fd) ? dig.eZ : dig.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dig.fd) ? dig.fb : dig.fc).m().b(dlz.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jm[] f = jm.values();

      b(final die... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final die... $$1) {
         for (die $$2 : $$1) {
            dyc.i.put($$2, this);
         }

         if ($$0) {
            dyc.j.add(this);
         }
      }
   }
}
