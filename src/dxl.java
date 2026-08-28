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

public class dxl {
   private static final Logger b = LogUtils.getLogger();
   public static final dxl a = new dxl(ddy.a);
   private static final String c = "Indices";
   private static final jl[] d = jl.values();
   private final EnumSet<jl> e = EnumSet.noneOf(jl.class);
   private final List<fan<dhm>> f = Lists.newArrayList();
   private final List<fan<eqs>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dhm, dxl.a> i = new IdentityHashMap<>();
   static final Set<dxl.a> j = Sets.newHashSet();

   private dxl(del $$0) {
      this.h = new int[$$0.ao()][];
   }

   public dxl(ug $$0, del $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         ug $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jl $$6 : jl.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lv.e.b(ale.c($$0x)).or(() -> Optional.of(dho.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lv.c.b(ale.c($$0x)).or(() -> Optional.of(equ.a)), this.g);
   }

   private dxl(dxl $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(ug $$0, String $$1, Function<String, Optional<T>> $$2, List<fan<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vd $$5 : $$0.c($$1, 10)) {
            fan.a((ug)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dwy $$0) {
      this.b($$0);

      for (jl $$1 : d) {
         a($$0, $$1);
      }

      dej $$2 = $$0.E();
      this.f.forEach($$1x -> {
         dhm $$2x = $$1x.a() == dho.a ? $$2.a_($$1x.b()).b() : (dhm)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         eqs $$2x = $$1x.a() == equ.a ? $$2.b_($$1x.b()).a() : (eqs)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dwy $$0, jl $$1) {
      dej $$2 = $$0.E();
      if ($$0.q().e.remove($$1)) {
         Set<jk> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jk.f);
         boolean $$7 = $$3.contains(jk.e);
         boolean $$8 = $$3.contains(jk.d);
         boolean $$9 = $$3.contains(jk.c);
         boolean $$10 = $$3.size() == 1;
         ddp $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jk[] $$16 = jk.values();
         jf.a $$17 = new jf.a();

         for (jf $$18 : jf.b($$12, $$2.H_(), $$14, $$13, $$2.an(), $$15)) {
            dus $$19 = $$2.a_($$18);
            dus $$20 = $$19;

            for (jk $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dhm.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dus a(dus $$0, jk $$1, dek $$2, jf $$3, jf $$4) {
      return i.getOrDefault($$0.b(), dxl.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dwy $$0) {
      jf.a $$1 = new jf.a();
      jf.a $$2 = new jf.a();
      ddp $$3 = $$0.f();
      dek $$4 = $$0.E();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dwz $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jk[] $$8 = jk.values();
            dxg<dus> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = kh.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dus $$16 = $$9.a($$12);
               dus $$17 = $$16;

               for (jk $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (kh.a($$1.u()) == $$3.e && kh.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dhm.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.h.length; $$19++) {
         if (this.h[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.e, $$3.f});
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

   public ug b() {
      ug $$0 = new ug();
      ug $$1 = new ug();

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

      for (jl $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         um $$6 = new um();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lv.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         um $$7 = new um();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lv.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public dxl c() {
      return this == a ? a : new dxl(this);
   }

   public interface a {
      dus a(dus var1, jk var2, dus var3, dek var4, jf var5, jf var6);

      default void a(dek $$0) {
      }
   }

   static enum b implements dxl.a {
      a(
         dho.kO,
         dho.ed,
         dho.lM,
         dho.lN,
         dho.lO,
         dho.lP,
         dho.lQ,
         dho.lR,
         dho.lS,
         dho.lT,
         dho.lU,
         dho.lV,
         dho.lW,
         dho.lX,
         dho.lY,
         dho.lZ,
         dho.ma,
         dho.mb,
         dho.gS,
         dho.gT,
         dho.gU,
         dho.fA,
         dho.L,
         dho.I,
         dho.K,
         dho.cE,
         dho.cF,
         dho.cG,
         dho.cH,
         dho.cI,
         dho.cJ,
         dho.cK,
         dho.cR,
         dho.cS,
         dho.cT,
         dho.cU,
         dho.cW,
         dho.cX,
         dho.da,
         dho.db,
         dho.dc,
         dho.dd,
         dho.df,
         dho.dg,
         dho.dl,
         dho.dm,
         dho.dn,
         dho.do,
         dho.dq,
         dho.dr
      ) {
         @Override
         public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dho.cv, dho.gV) {
         @Override
         public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(dip.d) == dvk.a && $$2.c(dip.d) == dvk.a) {
               jk $$6 = $$0.c(dip.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(dip.c)) {
                  dvk $$7 = $$1 == $$6.h() ? dvk.b : dvk.c;
                  $$3.a($$5, $$2.b(dip.d, $$7.a()), 18);
                  if ($$6 == jk.c || $$6 == jk.f) {
                     drv $$8 = $$3.c_($$4);
                     drv $$9 = $$3.c_($$5);
                     if ($$8 instanceof dsc && $$9 instanceof dsc) {
                        dsc.a((dsc)$$8, (dsc)$$9);
                     }
                  }

                  return $$0.b(dip.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dho.aI, dho.aJ, dho.aG, dho.aK, dho.aH, dho.aE, dho.aF) {
         private final ThreadLocal<List<ObjectSet<jf>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
            dus $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dvi.aC);
               List<ObjectSet<jf>> $$8 = this.g.get();
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
         public void a(dek $$0) {
            jf.a $$1 = new jf.a();
            List<ObjectSet<jf>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jf> $$5 = $$2.get($$4);
               ObjectSet<jf> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jf $$7 = (jf)var8.next();
                  dus $$8 = $$0.a_($$7);
                  if ($$8.c(dvi.aC) >= $$4) {
                     $$0.a($$7, $$8.b(dvi.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jk $$9 : f) {
                           $$1.a($$7, $$9);
                           dus $$10 = $$0.a_($$1);
                           if ($$10.b(dvi.aC) && $$8.c(dvi.aC) > $$3) {
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
      e(dho.fe, dho.fd) {
         @Override
         public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
            if ($$0.c(dpj.c) == 7) {
               dhm $$6 = $$0.a(dho.fd) ? dho.eZ : dho.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dho.fd) ? dho.fb : dho.fc).n().b(dli.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jk[] f = jk.values();

      b(final dhm... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dhm... $$1) {
         for (dhm $$2 : $$1) {
            dxl.i.put($$2, this);
         }

         if ($$0) {
            dxl.j.add(this);
         }
      }
   }
}
