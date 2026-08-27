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

public class dmb {
   private static final Logger b = LogUtils.getLogger();
   public static final dmb a = new dmb(cte.a);
   private static final String c = "Indices";
   private static final id[] d = id.values();
   private final EnumSet<id> e = EnumSet.noneOf(id.class);
   private final List<enj<cwq>> f = Lists.newArrayList();
   private final List<enj<eeq>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cwq, dmb.a> i = new IdentityHashMap<>();
   static final Set<dmb.a> j = Sets.newHashSet();

   private dmb(ctr $$0) {
      this.h = new int[$$0.am()][];
   }

   public dmb(sn $$0, ctr $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         sn $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (id $$6 : id.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> kd.e.b(ahg.a($$0x)).or(() -> Optional.of(cws.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kd.c.b(ahg.a($$0x)).or(() -> Optional.of(ees.a)), this.g);
   }

   private static <T> void a(sn $$0, String $$1, Function<String, Optional<T>> $$2, List<enj<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (tk $$5 : $$0.c($$1, 10)) {
            enj.a((sn)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dlo $$0) {
      this.b($$0);

      for (id $$1 : d) {
         a($$0, $$1);
      }

      ctp $$2 = $$0.F();
      this.f.forEach($$1x -> {
         cwq $$2x = $$1x.a() == cws.a ? $$2.a_($$1x.b()).b() : (cwq)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eeq $$2x = $$1x.a() == ees.a ? $$2.b_($$1x.b()).a() : (eeq)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dlo $$0, id $$1) {
      ctp $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ic> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ic.f);
         boolean $$7 = $$3.contains(ic.e);
         boolean $$8 = $$3.contains(ic.d);
         boolean $$9 = $$3.contains(ic.c);
         boolean $$10 = $$3.size() == 1;
         csw $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ic[] $$16 = ic.values();
         hx.a $$17 = new hx.a();

         for (hx $$18 : hx.b($$12, $$2.J_(), $$14, $$13, $$2.al() - 1, $$15)) {
            djh $$19 = $$2.a_($$18);
            djh $$20 = $$19;

            for (ic $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cwq.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static djh a(djh $$0, ic $$1, ctq $$2, hx $$3, hx $$4) {
      return i.getOrDefault($$0.b(), dmb.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dlo $$0) {
      hx.a $$1 = new hx.a();
      hx.a $$2 = new hx.a();
      csw $$3 = $$0.f();
      ctq $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dlp $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ic[] $$8 = ic.values();
            dlw<djh> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = iz.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               djh $$16 = $$9.a($$12);
               djh $$17 = $$16;

               for (ic $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (iz.a($$1.u()) == $$3.e && iz.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               cwq.a($$16, $$17, $$4, $$1, 18);
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

   public sn b() {
      sn $$0 = new sn();
      sn $$1 = new sn();

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

      for (id $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         st $$6 = new st();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> kd.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         st $$7 = new st();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> kd.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      djh a(djh var1, ic var2, djh var3, ctq var4, hx var5, hx var6);

      default void a(ctq $$0) {
      }
   }

   static enum b implements dmb.a {
      a(
         cws.kO,
         cws.ed,
         cws.lM,
         cws.lN,
         cws.lO,
         cws.lP,
         cws.lQ,
         cws.lR,
         cws.lS,
         cws.lT,
         cws.lU,
         cws.lV,
         cws.lW,
         cws.lX,
         cws.lY,
         cws.lZ,
         cws.ma,
         cws.mb,
         cws.gS,
         cws.gT,
         cws.gU,
         cws.fA,
         cws.L,
         cws.I,
         cws.K,
         cws.cE,
         cws.cF,
         cws.cG,
         cws.cH,
         cws.cI,
         cws.cJ,
         cws.cK,
         cws.cR,
         cws.cS,
         cws.cT,
         cws.cU,
         cws.cW,
         cws.cX,
         cws.da,
         cws.db,
         cws.dc,
         cws.dd,
         cws.df,
         cws.dg,
         cws.dl,
         cws.dm,
         cws.dn,
         cws.do,
         cws.dq,
         cws.dr
      ) {
         @Override
         public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cws.cv, cws.gV) {
         @Override
         public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cxt.d) == djz.a && $$2.c(cxt.d) == djz.a) {
               ic $$6 = $$0.c(cxt.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(cxt.c)) {
                  djz $$7 = $$1 == $$6.h() ? djz.b : djz.c;
                  $$3.a($$5, $$2.a(cxt.d, $$7.a()), 18);
                  if ($$6 == ic.c || $$6 == ic.f) {
                     dgv $$8 = $$3.c_($$4);
                     dgv $$9 = $$3.c_($$5);
                     if ($$8 instanceof dhc && $$9 instanceof dhc) {
                        dhc.a((dhc)$$8, (dhc)$$9);
                     }
                  }

                  return $$0.a(cxt.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cws.aI, cws.aJ, cws.aG, cws.aK, cws.aH, cws.aE, cws.aF) {
         private final ThreadLocal<List<ObjectSet<hx>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
            djh $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(djx.aC);
               List<ObjectSet<hx>> $$8 = this.g.get();
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
         public void a(ctq $$0) {
            hx.a $$1 = new hx.a();
            List<ObjectSet<hx>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<hx> $$5 = $$2.get($$4);
               ObjectSet<hx> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  hx $$7 = (hx)var8.next();
                  djh $$8 = $$0.a_($$7);
                  if ($$8.c(djx.aC) >= $$4) {
                     $$0.a($$7, $$8.a(djx.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ic $$9 : f) {
                           $$1.a($$7, $$9);
                           djh $$10 = $$0.a_($$1);
                           if ($$10.b(djx.aC) && $$8.c(djx.aC) > $$3) {
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
      e(cws.fe, cws.fd) {
         @Override
         public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
            if ($$0.c(del.c) == 7) {
               cwq $$6 = $$0.a(cws.fd) ? cws.eZ : cws.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(cws.fd) ? cws.fb : cws.fc).o().a(dal.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ic[] f = ic.values();

      b(cwq... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cwq... $$1) {
         for (cwq $$2 : $$1) {
            dmb.i.put($$2, this);
         }

         if ($$0) {
            dmb.j.add(this);
         }
      }
   }
}
