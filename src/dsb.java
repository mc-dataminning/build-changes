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

public class dsb {
   private static final Logger b = LogUtils.getLogger();
   public static final dsb a = new dsb(cyv.a);
   private static final String c = "Indices";
   private static final ik[] d = ik.values();
   private final EnumSet<ik> e = EnumSet.noneOf(ik.class);
   private final List<etz<dch>> f = Lists.newArrayList();
   private final List<etz<ela>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dch, dsb.a> i = new IdentityHashMap<>();
   static final Set<dsb.a> j = Sets.newHashSet();

   private dsb(czi $$0) {
      this.h = new int[$$0.am()][];
   }

   public dsb(to $$0, czi $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         to $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (ik $$6 : ik.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> kt.e.b(ajv.a($$0x)).or(() -> Optional.of(dcj.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> kt.c.b(ajv.a($$0x)).or(() -> Optional.of(elc.a)), this.g);
   }

   private static <T> void a(to $$0, String $$1, Function<String, Optional<T>> $$2, List<etz<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (ul $$5 : $$0.c($$1, 10)) {
            etz.a((to)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dro $$0) {
      this.b($$0);

      for (ik $$1 : d) {
         a($$0, $$1);
      }

      czg $$2 = $$0.F();
      this.f.forEach($$1x -> {
         dch $$2x = $$1x.a() == dcj.a ? $$2.a_($$1x.b()).b() : (dch)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         ela $$2x = $$1x.a() == elc.a ? $$2.b_($$1x.b()).a() : (ela)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dro $$0, ik $$1) {
      czg $$2 = $$0.F();
      if ($$0.r().e.remove($$1)) {
         Set<ij> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(ij.f);
         boolean $$7 = $$3.contains(ij.e);
         boolean $$8 = $$3.contains(ij.d);
         boolean $$9 = $$3.contains(ij.c);
         boolean $$10 = $$3.size() == 1;
         cyn $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         ij[] $$16 = ij.values();
         id.a $$17 = new id.a();

         for (id $$18 : id.b($$12, $$2.I_(), $$14, $$13, $$2.al() - 1, $$15)) {
            dpi $$19 = $$2.a_($$18);
            dpi $$20 = $$19;

            for (ij $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dch.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dpi a(dpi $$0, ij $$1, czh $$2, id $$3, id $$4) {
      return i.getOrDefault($$0.b(), dsb.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dro $$0) {
      id.a $$1 = new id.a();
      id.a $$2 = new id.a();
      cyn $$3 = $$0.f();
      czh $$4 = $$0.F();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         drp $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            ij[] $$8 = ij.values();
            drw<dpi> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = jg.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dpi $$16 = $$9.a($$12);
               dpi $$17 = $$16;

               for (ij $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (jg.a($$1.u()) == $$3.e && jg.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dch.a($$16, $$17, $$4, $$1, 18);
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

   public to b() {
      to $$0 = new to();
      to $$1 = new to();

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

      for (ik $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         tu $$6 = new tu();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> kt.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         tu $$7 = new tu();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> kt.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public interface a {
      dpi a(dpi var1, ij var2, dpi var3, czh var4, id var5, id var6);

      default void a(czh $$0) {
      }
   }

   static enum b implements dsb.a {
      a(
         dcj.kO,
         dcj.ed,
         dcj.lM,
         dcj.lN,
         dcj.lO,
         dcj.lP,
         dcj.lQ,
         dcj.lR,
         dcj.lS,
         dcj.lT,
         dcj.lU,
         dcj.lV,
         dcj.lW,
         dcj.lX,
         dcj.lY,
         dcj.lZ,
         dcj.ma,
         dcj.mb,
         dcj.gS,
         dcj.gT,
         dcj.gU,
         dcj.fA,
         dcj.L,
         dcj.I,
         dcj.K,
         dcj.cE,
         dcj.cF,
         dcj.cG,
         dcj.cH,
         dcj.cI,
         dcj.cJ,
         dcj.cK,
         dcj.cR,
         dcj.cS,
         dcj.cT,
         dcj.cU,
         dcj.cW,
         dcj.cX,
         dcj.da,
         dcj.db,
         dcj.dc,
         dcj.dd,
         dcj.df,
         dcj.dg,
         dcj.dl,
         dcj.dm,
         dcj.dn,
         dcj.do,
         dcj.dq,
         dcj.dr
      ) {
         @Override
         public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dcj.cv, dcj.gV) {
         @Override
         public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(ddk.d) == dqa.a && $$2.c(ddk.d) == dqa.a) {
               ij $$6 = $$0.c(ddk.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(ddk.c)) {
                  dqa $$7 = $$1 == $$6.h() ? dqa.b : dqa.c;
                  $$3.a($$5, $$2.a(ddk.d, $$7.a()), 18);
                  if ($$6 == ij.c || $$6 == ij.f) {
                     dmo $$8 = $$3.c_($$4);
                     dmo $$9 = $$3.c_($$5);
                     if ($$8 instanceof dmv && $$9 instanceof dmv) {
                        dmv.a((dmv)$$8, (dmv)$$9);
                     }
                  }

                  return $$0.a(ddk.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dcj.aI, dcj.aJ, dcj.aG, dcj.aK, dcj.aH, dcj.aE, dcj.aF) {
         private final ThreadLocal<List<ObjectSet<id>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
            dpi $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dpy.aC);
               List<ObjectSet<id>> $$8 = this.g.get();
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
         public void a(czh $$0) {
            id.a $$1 = new id.a();
            List<ObjectSet<id>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<id> $$5 = $$2.get($$4);
               ObjectSet<id> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  id $$7 = (id)var8.next();
                  dpi $$8 = $$0.a_($$7);
                  if ($$8.c(dpy.aC) >= $$4) {
                     $$0.a($$7, $$8.a(dpy.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (ij $$9 : f) {
                           $$1.a($$7, $$9);
                           dpi $$10 = $$0.a_($$1);
                           if ($$10.b(dpy.aC) && $$8.c(dpy.aC) > $$3) {
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
      e(dcj.fe, dcj.fd) {
         @Override
         public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
            if ($$0.c(dkc.c) == 7) {
               dch $$6 = $$0.a(dcj.fd) ? dcj.eZ : dcj.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dcj.fd) ? dcj.fb : dcj.fc).n().a(dgc.aE, $$1);
               }
            }

            return $$0;
         }
      };

      public static final ij[] f = ij.values();

      b(dch... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, dch... $$1) {
         for (dch $$2 : $$1) {
            dsb.i.put($$2, this);
         }

         if ($$0) {
            dsb.j.add(this);
         }
      }
   }
}
