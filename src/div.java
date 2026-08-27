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

public class div {
   private static final Logger b = LogUtils.getLogger();
   public static final div a = new div(cqo.a);
   private static final String c = "Indices";
   private static final hy[] d = hy.values();
   private final EnumSet<hy> e = EnumSet.noneOf(hy.class);
   private final List<ejq<cua>> f = Lists.newArrayList();
   private final List<ejq<ebd>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cua, div.a> i = new IdentityHashMap<>();
   static final Set<div.a> j = Sets.newHashSet();

   private div(crb $$0) {
      this.h = new int[$$0.ak()][];
   }

   public div(rt $$0, crb $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         rt $$2 = $$0.p("Indices");

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

      a($$0, "neighbor_block_ticks", $$0x -> jy.f.b(afw.a($$0x)).or(() -> Optional.of(cuc.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> jy.d.b(afw.a($$0x)).or(() -> Optional.of(ebf.a)), this.g);
   }

   private static <T> void a(rt $$0, String $$1, Function<String, Optional<T>> $$2, List<ejq<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (sn $$5 : $$0.c($$1, 10)) {
            ejq.a((rt)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dii $$0) {
      this.b($$0);

      for (hy $$1 : d) {
         a($$0, $$1);
      }

      cqz $$2 = $$0.F();
      this.f.forEach($$1x -> {
         cua $$2x = $$1x.a() == cuc.a ? $$2.a_($$1x.b()).b() : (cua)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ebd $$2x = $$1x.a() == ebf.a ? $$2.b_($$1x.b()).a() : (ebd)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dii $$0, hy $$1) {
      cqz $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<hx> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(hx.f);
         boolean $$7 = $$3.contains(hx.e);
         boolean $$8 = $$3.contains(hx.d);
         boolean $$9 = $$3.contains(hx.c);
         boolean $$10 = $$3.size() == 1;
         cqg $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         hx[] $$16 = hx.values();
         ht.a $$17 = new ht.a();

         for (ht $$18 : ht.b($$12, $$2.I_(), $$14, $$13, $$2.aj() - 1, $$15)) {
            dgb $$19 = $$2.a_($$18);
            dgb $$20 = $$19;

            for (hx $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cua.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dgb a(dgb $$0, hx $$1, cra $$2, ht $$3, ht $$4) {
      return i.getOrDefault($$0.b(), div.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dii $$0) {
      ht.a $$1 = new ht.a();
      ht.a $$2 = new ht.a();
      cqg $$3 = $$0.f();
      cra $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dij $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            hx[] $$8 = hx.values();
            diq<dgb> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = iu.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dgb $$16 = $$9.a($$12);
               dgb $$17 = $$16;

               for (hx $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (iu.a($$1.u()) == $$3.e && iu.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               cua.a($$16, $$17, $$4, $$1, 18);
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

   public rt b() {
      rt $$0 = new rt();
      rt $$1 = new rt();

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
         rz $$6 = new rz();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> jy.f.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         rz $$7 = new rz();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> jy.d.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dgb a(dgb var1, hx var2, dgb var3, cra var4, ht var5, ht var6);

      default void a(cra $$0) {
      }
   }

   static enum b implements div.a {
      a(
         cuc.kO,
         cuc.ed,
         cuc.lM,
         cuc.lN,
         cuc.lO,
         cuc.lP,
         cuc.lQ,
         cuc.lR,
         cuc.lS,
         cuc.lT,
         cuc.lU,
         cuc.lV,
         cuc.lW,
         cuc.lX,
         cuc.lY,
         cuc.lZ,
         cuc.ma,
         cuc.mb,
         cuc.gS,
         cuc.gT,
         cuc.gU,
         cuc.fA,
         cuc.L,
         cuc.I,
         cuc.K,
         cuc.cE,
         cuc.cF,
         cuc.cG,
         cuc.cH,
         cuc.cI,
         cuc.cJ,
         cuc.cK,
         cuc.cR,
         cuc.cS,
         cuc.cT,
         cuc.cU,
         cuc.cW,
         cuc.cX,
         cuc.da,
         cuc.db,
         cuc.dc,
         cuc.dd,
         cuc.df,
         cuc.dg,
         cuc.dl,
         cuc.dm,
         cuc.dn,
         cuc.do,
         cuc.dq,
         cuc.dr
      ) {
         @Override
         public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cuc.cv, cuc.gV) {
         @Override
         public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cvd.d) == dgt.a && $$2.c(cvd.d) == dgt.a) {
               hx $$6 = $$0.c(cvd.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(cvd.c)) {
                  dgt $$7 = $$1 == $$6.h() ? dgt.b : dgt.c;
                  $$3.a($$5, $$2.a(cvd.d, $$7.a()), 18);
                  if ($$6 == hx.c || $$6 == hx.f) {
                     ddx $$8 = $$3.c_($$4);
                     ddx $$9 = $$3.c_($$5);
                     if ($$8 instanceof dee && $$9 instanceof dee) {
                        dee.a((dee)$$8, (dee)$$9);
                     }
                  }

                  return $$0.a(cvd.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cuc.aI, cuc.aJ, cuc.aG, cuc.aK, cuc.aH, cuc.aE, cuc.aF) {
         private final ThreadLocal<List<ObjectSet<ht>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
            dgb $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dgr.aC);
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
         public void a(cra $$0) {
            ht.a $$1 = new ht.a();
            List<ObjectSet<ht>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<ht> $$5 = $$2.get($$4);
               ObjectSet<ht> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  ht $$7 = (ht)var8.next();
                  dgb $$8 = $$0.a_($$7);
                  if ($$8.c(dgr.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dgr.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (hx $$9 : f) {
                           $$1.a($$7, $$9);
                           dgb $$10 = $$0.a_($$1);
                           if ($$10.b(dgr.aC) && $$8.c(dgr.aC) > $$3) {
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
      e(cuc.fe, cuc.fd) {
         @Override
         public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
            if ($$0.c(dbu.c) == 7) {
               cua $$6 = $$0.a(cuc.fd) ? cuc.eZ : cuc.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(cuc.fd) ? cuc.fb : cuc.fc).o().a(cxu.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final hx[] f = hx.values();

      b(cua... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cua... $$1) {
         for (cua $$2 : $$1) {
            div.i.put($$2, this);
         }

         if ($$0) {
            div.j.add(this);
         }
      }
   }
}
