import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dga extends ddr<dpm> implements dly {
   public static final MapCodec<dga> b = b($$0 -> new dga($$0, () -> dph.b));
   public static final dsu c = dit.aE;
   public static final dsy<dss> d = dsq.bc;
   public static final dsr e = dsq.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ewi i = dex.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ewi j = dex.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ewi k = dex.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ewi l = dex.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ewi m = dex.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhe.b<dpm, Optional<bql>> n = new dhe.b<dpm, Optional<bql>>() {
      public Optional<bql> a(dpm $$0, dpm $$1) {
         return Optional.of(new bqk($$0, $$1));
      }

      public Optional<bql> a(dpm $$0) {
         return Optional.of($$0);
      }

      public Optional<bql> a() {
         return Optional.empty();
      }
   };
   private static final dhe.b<dpm, Optional<bqw>> o = new dhe.b<dpm, Optional<bqw>>() {
      public Optional<bqw> a(final dpm $$0, final dpm $$1) {
         final bql $$2 = new bqk($$0, $$1);
         return Optional.of(new bqw() {
            @Nullable
            @Override
            public cps createMenu(int $$0x, cmu $$1x, cmv $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpz.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xo O_() {
               if ($$0.ag()) {
                  return $$0.O_();
               } else {
                  return (xo)($$1.ag() ? $$1.O_() : xo.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqw> a(dpm $$0) {
         return Optional.of($$0);
      }

      public Optional<bqw> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dga> a() {
      return b;
   }

   protected dga(drz.d $$0, Supplier<dph<? extends dpm>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, je.c).a(d, dss.a).a(e, Boolean.valueOf(false)));
   }

   public static dhe.a g(dsa $$0) {
      dss $$1 = $$0.c(d);
      if ($$1 == dss.a) {
         return dhe.a.a;
      } else {
         return $$1 == dss.c ? dhe.a.b : dhe.a.c;
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.b;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dss $$6 = $$2.c(d);
         if ($$0.c(d) == dss.a && $$6 != dss.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dss.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if ($$0.c(d) == dss.a) {
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

   public static je h(dsa $$0) {
      je $$1 = $$0.c(c);
      return $$0.c(d) == dss.b ? $$1.h() : $$1.i();
   }

   @Override
   public dsa a(cxy $$0) {
      dss $$1 = dss.a;
      je $$2 = $$0.g().g();
      ent $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      je $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         je $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dss.c : dss.b;
         }
      }

      if ($$1 == dss.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dss.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dss.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == enu.c));
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(e) ? enu.c.a(false) : super.b_($$0);
   }

   @Nullable
   private je a(cxy $$0, je $$1) {
      dsa $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dss.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      bqo.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         bqw $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clm.a($$3, true);
         }

         return bqs.c;
      }
   }

   protected awg<ale> c() {
      return awj.i.b(awj.ao);
   }

   public dph<? extends dpm> d() {
      return this.a.get();
   }

   @Nullable
   public static bql a(dga $$0, dsa $$1, dbw $$2, iz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhe.c<? extends dpm> a(dsa $$0, dbw $$1, iz $$2, boolean $$3) {
      BiPredicate<dbx, iz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dga::a;
      }

      return dhe.a(this.a.get(), dga::g, dga::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhe.b<dpm, Float2FloatFunction> a(final dqi $$0) {
      return new dhe.b<dpm, Float2FloatFunction>() {
         public Float2FloatFunction a(dpm $$0x, dpm $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpm $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpm::a) : null;
   }

   public static boolean a(dbx $$0, iz $$1) {
      return a((dbc)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbc $$0, iz $$1) {
      iz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dbx $$0, iz $$1) {
      List<cfg> $$2 = $$0.a(
         cfg.class, new evk((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfg $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return cps.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      dpf $$4 = $$1.c_($$2);
      if ($$4 instanceof dpm) {
         ((dpm)$$4).l();
      }
   }
}
