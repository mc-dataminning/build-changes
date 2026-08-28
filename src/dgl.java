import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgl extends dec<dpx> implements dmj {
   public static final MapCodec<dgl> b = b($$0 -> new dgl($$0, () -> dps.b));
   public static final dtf c = dje.aE;
   public static final dtj<dtd> d = dtb.bc;
   public static final dtc e = dtb.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final exa i = dfi.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final exa j = dfi.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final exa k = dfi.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final exa l = dfi.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final exa m = dfi.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhp.b<dpx, Optional<bqa>> n = new dhp.b<dpx, Optional<bqa>>() {
      public Optional<bqa> a(dpx $$0, dpx $$1) {
         return Optional.of(new bpz($$0, $$1));
      }

      public Optional<bqa> a(dpx $$0) {
         return Optional.of($$0);
      }

      public Optional<bqa> a() {
         return Optional.empty();
      }
   };
   private static final dhp.b<dpx, Optional<bql>> o = new dhp.b<dpx, Optional<bql>>() {
      public Optional<bql> a(final dpx $$0, final dpx $$1) {
         final bqa $$2 = new bpz($$0, $$1);
         return Optional.of(new bql() {
            @Nullable
            @Override
            public cpi createMenu(int $$0x, cmk $$1x, cml $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpq.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wu O_() {
               if ($$0.ai()) {
                  return $$0.O_();
               } else {
                  return (wu)($$1.ai() ? $$1.O_() : wu.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bql> a(dpx $$0) {
         return Optional.of($$0);
      }

      public Optional<bql> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgl> a() {
      return b;
   }

   protected dgl(dsk.d $$0, Supplier<dps<? extends dpx>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, jf.c).a(d, dtd.a).a(e, Boolean.valueOf(false)));
   }

   public static dhp.a g(dsl $$0) {
      dtd $$1 = $$0.c(d);
      if ($$1 == dtd.a) {
         return dhp.a.a;
      } else {
         return $$1 == dtd.c ? dhp.a.b : dhp.a.c;
      }
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.b;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dtd $$6 = $$2.c(d);
         if ($$0.c(d) == dtd.a && $$6 != dtd.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dtd.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$0.c(d) == dtd.a) {
         return m;
      } else {
         switch (h($$0)) {
            case c:
            default:
               return i;
            case d:
               return j;
            case e:
               return k;
            case f:
               return l;
         }
      }
   }

   public static jf h(dsl $$0) {
      jf $$1 = $$0.c(c);
      return $$0.c(d) == dtd.b ? $$1.h() : $$1.i();
   }

   @Override
   public dsl a(cxn $$0) {
      dtd $$1 = dtd.a;
      jf $$2 = $$0.g().g();
      eoj $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jf $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jf $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dtd.c : dtd.b;
         }
      }

      if ($$1 == dtd.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dtd.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dtd.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eok.c));
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(e) ? eok.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jf a(cxn $$0, jf $$1) {
      dsl $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dtd.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      bqd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         bql $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clc.a($$3, true);
         }

         return bqh.c;
      }
   }

   protected avo<akk> c() {
      return avr.i.b(avr.ao);
   }

   public dps<? extends dpx> d() {
      return this.a.get();
   }

   @Nullable
   public static bqa a(dgl $$0, dsl $$1, dcg $$2, ja $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhp.c<? extends dpx> a(dsl $$0, dcg $$1, ja $$2, boolean $$3) {
      BiPredicate<dch, ja> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgl::a;
      }

      return dhp.a(this.a.get(), dgl::g, dgl::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhp.b<dpx, Float2FloatFunction> a(final dqu $$0) {
      return new dhp.b<dpx, Float2FloatFunction>() {
         public Float2FloatFunction a(dpx $$0x, dpx $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpx $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpx::a) : null;
   }

   public static boolean a(dch $$0, ja $$1) {
      return a((dbm)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbm $$0, ja $$1) {
      ja $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dch $$0, ja $$1) {
      List<cev> $$2 = $$0.a(
         cev.class, new ewc((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cev $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      dpq $$4 = $$1.c_($$2);
      if ($$4 instanceof dpx) {
         ((dpx)$$4).l();
      }
   }
}
