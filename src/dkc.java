import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
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

public class dkc {
   private static final Logger b = LogUtils.getLogger();
   public static final dkc a = new dkc(crp.a);
   private static final String c = "Indices";
   private static final hy[] d = hy.values();
   private final EnumSet<hy> e = EnumSet.noneOf(hy.class);
   private final List<elf<cva>> f = Lists.newArrayList();
   private final List<elf<ecr>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cva, dkc.a> i = new IdentityHashMap<>();
   static final Set<dkc.a> j = Sets.newHashSet();

   private dkc(csc $$0) {
      this.h = new int[$$0.al()][];
   }

   public dkc(rz $$0, csc $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         rz $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (hy $$6 : hy.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> jy.f.b(agi.a($$0x)).or(() -> Optional.of(cvc.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> jy.d.b(agi.a($$0x)).or(() -> Optional.of(ect.a)), this.g);
   }

   private static <T> void a(rz $$0, String $$1, Function<String, Optional<T>> $$2, List<elf<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (sw $$5 : $$0.c($$1, 10)) {
            elf.a((rz)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(djp $$0) {
      this.b($$0);

      for (hy $$1 : d) {
         a($$0, $$1);
      }

      csa $$2 = $$0.F();
      this.f.forEach($$1x -> {
         cva $$2x = $$1x.a() == cvc.a ? $$2.a_($$1x.b()).b() : (cva)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ecr $$2x = $$1x.a() == ect.a ? $$2.b_($$1x.b()).a() : (ecr)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(djp $$0, hy $$1) {
      csa $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<hx> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(hx.f);
         boolean $$7 = $$3.contains(hx.e);
         boolean $$8 = $$3.contains(hx.d);
         boolean $$9 = $$3.contains(hx.c);
         boolean $$10 = $$3.size() == 1;
         crh $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         hx[] $$16 = hx.values();
         ht.a $$17 = new ht.a();

         for (ht $$18 : ht.b($$12, $$2.I_(), $$14, $$13, $$2.ak() - 1, $$15)) {
            dhi $$19 = $$2.a_($$18);
            dhi $$20 = $$19;

            for (hx $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cva.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dhi a(dhi $$0, hx $$1, csb $$2, ht $$3, ht $$4) {
      return i.getOrDefault($$0.b(), dkc.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(djp $$0) {
      ht.a $$1 = new ht.a();
      ht.a $$2 = new ht.a();
      crh $$3 = $$0.f();
      csb $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         djq $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            hx[] $$8 = hx.values();
            djx<dhi> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = iu.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dhi $$16 = $$9.a($$12);
               dhi $$17 = $$16;

               for (hx $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (iu.a($$1.u()) == $$3.e && iu.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               cva.a($$16, $$17, $$4, $$1, 18);
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

   public rz b() {
      rz $$0 = new rz();
      rz $$1 = new rz();

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

      for (hy $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         sf $$6 = new sf();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> jy.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         sf $$7 = new sf();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> jy.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dhi a(dhi var1, hx var2, dhi var3, csb var4, ht var5, ht var6);

      default void a(csb $$0) {
      }
   }

   static enum b implements dkc.a {
      a(
         cvc.kO,
         cvc.ed,
         cvc.lM,
         cvc.lN,
         cvc.lO,
         cvc.lP,
         cvc.lQ,
         cvc.lR,
         cvc.lS,
         cvc.lT,
         cvc.lU,
         cvc.lV,
         cvc.lW,
         cvc.lX,
         cvc.lY,
         cvc.lZ,
         cvc.ma,
         cvc.mb,
         cvc.gS,
         cvc.gT,
         cvc.gU,
         cvc.fA,
         cvc.L,
         cvc.I,
         cvc.K,
         cvc.cE,
         cvc.cF,
         cvc.cG,
         cvc.cH,
         cvc.cI,
         cvc.cJ,
         cvc.cK,
         cvc.cR,
         cvc.cS,
         cvc.cT,
         cvc.cU,
         cvc.cW,
         cvc.cX,
         cvc.da,
         cvc.db,
         cvc.dc,
         cvc.dd,
         cvc.df,
         cvc.dg,
         cvc.dl,
         cvc.dm,
         cvc.dn,
         cvc.do,
         cvc.dq,
         cvc.dr
      ) {
         @Override
         public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cvc.cv, cvc.gV) {
         @Override
         public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cwd.d) == dia.a && $$2.c(cwd.d) == dia.a) {
               hx $$6 = $$0.c(cwd.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(cwd.c)) {
                  dia $$7 = $$1 == $$6.h() ? dia.b : dia.c;
                  $$3.a($$5, $$2.a(cwd.d, $$7.a()), 18);
                  if ($$6 == hx.c || $$6 == hx.f) {
                     dfd $$8 = $$3.c_($$4);
                     dfd $$9 = $$3.c_($$5);
                     if ($$8 instanceof dfk && $$9 instanceof dfk) {
                        dfk.a((dfk)$$8, (dfk)$$9);
                     }
                  }

                  return $$0.a(cwd.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cvc.aI, cvc.aJ, cvc.aG, cvc.aK, cvc.aH, cvc.aE, cvc.aF) {
         private final ThreadLocal<List<ObjectSet<ht>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
            dhi $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dhy.aC);
               List<ObjectSet<ht>> $$8 = this.g.get();
               if ($$8.isEmpty()) {
                  for (int $$9 = 0; $$9 < 7; $$9++) {
                     $$8.add(new ObjectOpenHashSet());
                  }
               }

               $$8.get($$7).add($$4.i());
            }

            return $$0;
         }

         @Override
         public void a(csb $$0) {
            ht.a $$1 = new ht.a();
            List<ObjectSet<ht>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ht> $$5 = $$2.get($$4);
               ObjectSet<ht> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ht $$7 = (ht)var8.next();
                  dhi $$8 = $$0.a_($$7);
                  if ($$8.c(dhy.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dhy.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (hx $$9 : f) {
                           $$1.a($$7, $$9);
                           dhi $$10 = $$0.a_($$1);
                           if ($$10.b(dhy.aC) && $$8.c(dhy.aC) > $$3) {
                              $$6.add($$1.i());
                           }
                        }
                     }
                  }
               }
            }

            $$2.clear();
         }
      },
      e(cvc.fe, cvc.fd) {
         @Override
         public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
            if ($$0.c(dcv.c) == 7) {
               cva $$6 = $$0.a(cvc.fd) ? cvc.eZ : cvc.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(cvc.fd) ? cvc.fb : cvc.fc).o().a(cyv.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final hx[] f = hx.values();

      b(cva... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cva... $$1) {
         for (cva $$2 : $$1) {
            dkc.i.put($$2, this);
         }

         if ($$0) {
            dkc.j.add(this);
         }
      }
   }
}
