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

public class dwt {
   private static final Logger b = LogUtils.getLogger();
   public static final dwt a = new dwt(ddh.a);
   private static final String c = "Indices";
   private static final jk[] d = jk.values();
   private final EnumSet<jk> e = EnumSet.noneOf(jk.class);
   private final List<ezu<dgv>> f = Lists.newArrayList();
   private final List<ezu<eqa>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dgv, dwt.a> i = new IdentityHashMap<>();
   static final Set<dwt.a> j = Sets.newHashSet();

   private dwt(ddu $$0) {
      this.h = new int[$$0.ao()][];
   }

   public dwt(uf $$0, ddu $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         uf $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jk $$6 : jk.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lu.e.b(alb.c($$0x)).or(() -> Optional.of(dgx.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lu.c.b(alb.c($$0x)).or(() -> Optional.of(eqc.a)), this.g);
   }

   private dwt(dwt $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(uf $$0, String $$1, Function<String, Optional<T>> $$2, List<ezu<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vc $$5 : $$0.c($$1, 10)) {
            ezu.a((uf)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dwg $$0) {
      this.b($$0);

      for (jk $$1 : d) {
         a($$0, $$1);
      }

      dds $$2 = $$0.E();
      this.f.forEach($$1x -> {
         dgv $$2x = $$1x.a() == dgx.a ? $$2.a_($$1x.b()).b() : (dgv)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eqa $$2x = $$1x.a() == eqc.a ? $$2.b_($$1x.b()).a() : (eqa)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dwg $$0, jk $$1) {
      dds $$2 = $$0.E();
      if ($$0.q().e.remove($$1)) {
         Set<jj> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jj.f);
         boolean $$7 = $$3.contains(jj.e);
         boolean $$8 = $$3.contains(jj.d);
         boolean $$9 = $$3.contains(jj.c);
         boolean $$10 = $$3.size() == 1;
         dcy $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jj[] $$16 = jj.values();
         je.a $$17 = new je.a();

         for (je $$18 : je.b($$12, $$2.G_(), $$14, $$13, $$2.an() - 1, $$15)) {
            dua $$19 = $$2.a_($$18);
            dua $$20 = $$19;

            for (jj $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dgv.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dua a(dua $$0, jj $$1, ddt $$2, je $$3, je $$4) {
      return i.getOrDefault($$0.b(), dwt.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dwg $$0) {
      je.a $$1 = new je.a();
      je.a $$2 = new je.a();
      dcy $$3 = $$0.f();
      ddt $$4 = $$0.E();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dwh $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jj[] $$8 = jj.values();
            dwo<dua> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = kg.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dua $$16 = $$9.a($$12);
               dua $$17 = $$16;

               for (jj $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kg.a($$1.u()) == $$3.e && kg.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dgv.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.g($$19), $$3.e, $$3.f});
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

   public uf b() {
      uf $$0 = new uf();
      uf $$1 = new uf();

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

      for (jk $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         ul $$6 = new ul();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lu.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         ul $$7 = new ul();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lu.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public dwt c() {
      return this == a ? a : new dwt(this);
   }

   public interface a {
      dua a(dua var1, jj var2, dua var3, ddt var4, je var5, je var6);

      default void a(ddt $$0) {
      }
   }

   static enum b implements dwt.a {
      a(
         dgx.kO,
         dgx.ed,
         dgx.lM,
         dgx.lN,
         dgx.lO,
         dgx.lP,
         dgx.lQ,
         dgx.lR,
         dgx.lS,
         dgx.lT,
         dgx.lU,
         dgx.lV,
         dgx.lW,
         dgx.lX,
         dgx.lY,
         dgx.lZ,
         dgx.ma,
         dgx.mb,
         dgx.gS,
         dgx.gT,
         dgx.gU,
         dgx.fA,
         dgx.L,
         dgx.I,
         dgx.K,
         dgx.cE,
         dgx.cF,
         dgx.cG,
         dgx.cH,
         dgx.cI,
         dgx.cJ,
         dgx.cK,
         dgx.cR,
         dgx.cS,
         dgx.cT,
         dgx.cU,
         dgx.cW,
         dgx.cX,
         dgx.da,
         dgx.db,
         dgx.dc,
         dgx.dd,
         dgx.df,
         dgx.dg,
         dgx.dl,
         dgx.dm,
         dgx.dn,
         dgx.do,
         dgx.dq,
         dgx.dr
      ) {
         @Override
         public dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dgx.cv, dgx.gV) {
         @Override
         public dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dhy.d) == dus.a && $$2.c(dhy.d) == dus.a) {
               jj $$6 = $$0.c(dhy.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dhy.c)) {
                  dus $$7 = $$1 == $$6.h() ? dus.b : dus.c;
                  $$3.a($$5, $$2.b(dhy.d, $$7.a()), 18);
                  if ($$6 == jj.c || $$6 == jj.f) {
                     dre $$8 = $$3.c_($$4);
                     dre $$9 = $$3.c_($$5);
                     if ($$8 instanceof drl && $$9 instanceof drl) {
                        drl.a((drl)$$8, (drl)$$9);
                     }
                  }

                  return $$0.b(dhy.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dgx.aI, dgx.aJ, dgx.aG, dgx.aK, dgx.aH, dgx.aE, dgx.aF) {
         private final ThreadLocal<List<ObjectSet<je>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
            dua $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(duq.aC);
               List<ObjectSet<je>> $$8 = this.g.get();
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
         public void a(ddt $$0) {
            je.a $$1 = new je.a();
            List<ObjectSet<je>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<je> $$5 = $$2.get($$4);
               ObjectSet<je> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  je $$7 = (je)var8.next();
                  dua $$8 = $$0.a_($$7);
                  if ($$8.c(duq.aC) >= $$4) {
                     $$0.a($$7, $$8.b(duq.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jj $$9 : f) {
                           $$1.a($$7, $$9);
                           dua $$10 = $$0.a_($$1);
                           if ($$10.b(duq.aC) && $$8.c(duq.aC) > $$3) {
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
      e(dgx.fe, dgx.fd) {
         @Override
         public dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
            if ($$0.c(dos.c) == 7) {
               dgv $$6 = $$0.a(dgx.fd) ? dgx.eZ : dgx.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dgx.fd) ? dgx.fb : dgx.fc).o().b(dkr.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jj[] f = jj.values();

      b(final dgv... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dgv... $$1) {
         for (dgv $$2 : $$1) {
            dwt.i.put($$2, this);
         }

         if ($$0) {
            dwt.j.add(this);
         }
      }
   }
}
