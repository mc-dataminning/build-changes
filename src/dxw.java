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

public class dxw {
   private static final Logger b = LogUtils.getLogger();
   public static final dxw a = new dxw(dek.a);
   private static final String c = "Indices";
   private static final jm[] d = jm.values();
   private final EnumSet<jm> e = EnumSet.noneOf(jm.class);
   private final List<fay<dhy>> f = Lists.newArrayList();
   private final List<fay<erd>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<dhy, dxw.a> i = new IdentityHashMap<>();
   static final Set<dxw.a> j = Sets.newHashSet();

   private dxw(dex $$0) {
      this.h = new int[$$0.ao()][];
   }

   public dxw(uj $$0, dex $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         uj $$2 = $$0.p("Indices");

         for (int $$3 = 0; $$3 < this.h.length; $$3++) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for (jm $$6 : jm.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> lx.e.b(alh.c($$0x)).or(() -> Optional.of(dia.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> lx.c.b(alh.c($$0x)).or(() -> Optional.of(erf.a)), this.g);
   }

   private dxw(dxw $$0) {
      this.e.addAll($$0.e);
      this.f.addAll($$0.f);
      this.g.addAll($$0.g);
      this.h = new int[$$0.h.length][];

      for (int $$1 = 0; $$1 < $$0.h.length; $$1++) {
         int[] $$2 = $$0.h[$$1];
         this.h[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   private static <T> void a(uj $$0, String $$1, Function<String, Optional<T>> $$2, List<fay<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for (vg $$5 : $$0.c($$1, 10)) {
            fay.a((uj)$$5, $$2).ifPresent($$3::add);
         }
      }
   }

   public void a(dxj $$0) {
      this.b($$0);

      for (jm $$1 : d) {
         a($$0, $$1);
      }

      dev $$2 = $$0.E();
      this.f.forEach($$1x -> {
         dhy $$2x = $$1x.a() == dia.a ? $$2.a_($$1x.b()).b() : (dhy)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         erd $$2x = $$1x.a() == erf.a ? $$2.b_($$1x.b()).a() : (erd)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(dxj $$0, jm $$1) {
      dev $$2 = $$0.E();
      if ($$0.q().e.remove($$1)) {
         Set<jl> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jl.f);
         boolean $$7 = $$3.contains(jl.e);
         boolean $$8 = $$3.contains(jl.d);
         boolean $$9 = $$3.contains(jl.c);
         boolean $$10 = $$3.size() == 1;
         deb $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jl[] $$16 = jl.values();
         jg.a $$17 = new jg.a();

         for (jg $$18 : jg.b($$12, $$2.I_(), $$14, $$13, $$2.an(), $$15)) {
            dvd $$19 = $$2.a_($$18);
            dvd $$20 = $$19;

            for (jl $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dhy.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static dvd a(dvd $$0, jl $$1, dew $$2, jg $$3, jg $$4) {
      return i.getOrDefault($$0.b(), dxw.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(dxj $$0) {
      jg.a $$1 = new jg.a();
      jg.a $$2 = new jg.a();
      deb $$3 = $$0.f();
      dew $$4 = $$0.E();

      for (int $$5 = 0; $$5 < this.h.length; $$5++) {
         dxk $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jl[] $$8 = jl.values();
            dxr<dvd> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = ki.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               dvd $$16 = $$9.a($$12);
               dvd $$17 = $$16;

               for (jl $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (ki.a($$1.u()) == $$3.e && ki.a($$1.w()) == $$3.f) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dhy.a($$16, $$17, $$4, $$1, 18);
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

   public uj b() {
      uj $$0 = new uj();
      uj $$1 = new uj();

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

      for (jm $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         up $$6 = new up();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> lx.e.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", $$6);
      }

      if (!this.g.isEmpty()) {
         up $$7 = new up();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> lx.c.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", $$7);
      }

      return $$0;
   }

   public dxw c() {
      return this == a ? a : new dxw(this);
   }

   public interface a {
      dvd a(dvd var1, jl var2, dvd var3, dew var4, jg var5, jg var6);

      default void a(dew $$0) {
      }
   }

   static enum b implements dxw.a {
      a(
         dia.kO,
         dia.ed,
         dia.lM,
         dia.lN,
         dia.lO,
         dia.lP,
         dia.lQ,
         dia.lR,
         dia.lS,
         dia.lT,
         dia.lU,
         dia.lV,
         dia.lW,
         dia.lX,
         dia.lY,
         dia.lZ,
         dia.ma,
         dia.mb,
         dia.gS,
         dia.gT,
         dia.gU,
         dia.fA,
         dia.L,
         dia.I,
         dia.K,
         dia.cE,
         dia.cF,
         dia.cG,
         dia.cH,
         dia.cI,
         dia.cJ,
         dia.cK,
         dia.cR,
         dia.cS,
         dia.cT,
         dia.cU,
         dia.cW,
         dia.cX,
         dia.da,
         dia.db,
         dia.dc,
         dia.dd,
         dia.df,
         dia.dg,
         dia.dl,
         dia.dm,
         dia.dn,
         dia.do,
         dia.dq,
         dia.dr
      ) {
         @Override
         public dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(dia.cv, dia.gV) {
         @Override
         public dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(djb.d) == dvv.a && $$2.c(djb.d) == dvv.a) {
               jl $$6 = $$0.c(djb.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(djb.c)) {
                  dvv $$7 = $$1 == $$6.h() ? dvv.b : dvv.c;
                  $$3.a($$5, $$2.b(djb.d, $$7.a()), 18);
                  if ($$6 == jl.c || $$6 == jl.f) {
                     dsg $$8 = $$3.c_($$4);
                     dsg $$9 = $$3.c_($$5);
                     if ($$8 instanceof dsn && $$9 instanceof dsn) {
                        dsn.a((dsn)$$8, (dsn)$$9);
                     }
                  }

                  return $$0.b(djb.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dia.aI, dia.aJ, dia.aG, dia.aK, dia.aH, dia.aE, dia.aF) {
         private final ThreadLocal<List<ObjectSet<jg>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
            dvd $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(dvt.aC);
               List<ObjectSet<jg>> $$8 = this.g.get();
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
         public void a(dew $$0) {
            jg.a $$1 = new jg.a();
            List<ObjectSet<jg>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jg> $$5 = $$2.get($$4);
               ObjectSet<jg> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jg $$7 = (jg)var8.next();
                  dvd $$8 = $$0.a_($$7);
                  if ($$8.c(dvt.aC) >= $$4) {
                     $$0.a($$7, $$8.b(dvt.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for (jl $$9 : f) {
                           $$1.a($$7, $$9);
                           dvd $$10 = $$0.a_($$1);
                           if ($$10.b(dvt.aC) && $$8.c(dvt.aC) > $$3) {
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
      e(dia.fe, dia.fd) {
         @Override
         public dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
            if ($$0.c(dpu.c) == 7) {
               dhy $$6 = $$0.a(dia.fd) ? dia.eZ : dia.fa;
               if ($$2.a($$6)) {
                  return ($$0.a(dia.fd) ? dia.fb : dia.fc).m().b(dlt.aF, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jl[] f = jl.values();

      b(final dhy... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dhy... $$1) {
         for (dhy $$2 : $$1) {
            dxw.i.put($$2, this);
         }

         if ($$0) {
            dxw.j.add(this);
         }
      }
   }
}
