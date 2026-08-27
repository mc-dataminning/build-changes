import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ddb extends das<dmm> implements diy {
   public static final MapCodec<ddb> b = b($$0 -> new ddb($$0, () -> dmh.b));
   public static final dpt c = dft.aE;
   public static final dpx<dpr> d = dpp.bc;
   public static final dpq e = dpp.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final est i = dby.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final est j = dby.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final est k = dby.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final est l = dby.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final est m = dby.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final def.b<dmm, Optional<bnt>> n = new def.b<dmm, Optional<bnt>>() {
      public Optional<bnt> a(dmm $$0, dmm $$1) {
         return Optional.of(new bns($$0, $$1));
      }

      public Optional<bnt> a(dmm $$0) {
         return Optional.of($$0);
      }

      public Optional<bnt> a() {
         return Optional.empty();
      }
   };
   private static final def.b<dmm, Optional<boe>> o = new def.b<dmm, Optional<boe>>() {
      public Optional<boe> a(final dmm $$0, final dmm $$1) {
         final bnt $$2 = new bns($$0, $$1);
         return Optional.of(new boe() {
            @Nullable
            @Override
            public cmp createMenu(int $$0x, cjs $$1x, cjt $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cmw.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wg O_() {
               if ($$0.ae()) {
                  return $$0.O_();
               } else {
                  return (wg)($$1.ae() ? $$1.O_() : wg.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<boe> a(dmm $$0) {
         return Optional.of($$0);
      }

      public Optional<boe> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends ddb> a() {
      return b;
   }

   protected ddb(doy.d $$0, Supplier<dmh<? extends dmm>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ih.c).a(d, dpr.a).a(e, Boolean.valueOf(false)));
   }

   public static def.a g(doz $$0) {
      dpr $$1 = $$0.c(d);
      if ($$1 == dpr.a) {
         return def.a.a;
      } else {
         return $$1 == dpr.c ? def.a.b : def.a.c;
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.b;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dpr $$6 = $$2.c(d);
         if ($$0.c(d) == dpr.a && $$6 != dpr.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dpr.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if ($$0.c(d) == dpr.a) {
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

   public static ih h(doz $$0) {
      ih $$1 = $$0.c(c);
      return $$0.c(d) == dpr.b ? $$1.h() : $$1.i();
   }

   @Override
   public doz a(cuo $$0) {
      dpr $$1 = dpr.a;
      ih $$2 = $$0.g().g();
      eks $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ih $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ih $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dpr.c : dpr.b;
         }
      }

      if ($$1 == dpr.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dpr.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dpr.c;
         }
      }

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == ekt.c));
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(e) ? ekt.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ih a(cuo $$0, ih $$1) {
      doz $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dpr.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      bnw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         boe $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cik.a($$3, true);
         }

         return boa.b;
      }
   }

   protected aut<ajt> c() {
      return auw.i.b(auw.ao);
   }

   public dmh<? extends dmm> d() {
      return this.a.get();
   }

   @Nullable
   public static bnt a(ddb $$0, doz $$1, cyx $$2, ib $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public def.c<? extends dmm> a(doz $$0, cyx $$1, ib $$2, boolean $$3) {
      BiPredicate<cyy, ib> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = ddb::a;
      }

      return def.a(this.a.get(), ddb::g, ddb::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static def.b<dmm, Float2FloatFunction> a(final dni $$0) {
      return new def.b<dmm, Float2FloatFunction>() {
         public Float2FloatFunction a(dmm $$0x, dmm $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dmm $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? a($$2, this.d(), dmm::a) : null;
   }

   public static boolean a(cyy $$0, ib $$1) {
      return a((cyd)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cyd $$0, ib $$1) {
      ib $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cyy $$0, ib $$1) {
      List<ccg> $$2 = $$0.a(
         ccg.class, new erv((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (ccg $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      dmf $$4 = $$1.c_($$2);
      if ($$4 instanceof dmm) {
         ((dmm)$$4).l();
      }
   }
}
