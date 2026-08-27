import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cwd extends ctu<dfk> implements dca {
   public static final MapCodec<cwd> b = b($$0 -> new cwd($$0, () -> dff.b));
   public static final dic c = cyv.aE;
   public static final dig<dia> d = dhy.bc;
   public static final dhz e = dhy.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ekn i = cva.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ekn j = cva.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ekn k = cva.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ekn l = cva.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ekn m = cva.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cxh.b<dfk, Optional<biq>> n = new cxh.b<dfk, Optional<biq>>() {
      public Optional<biq> a(dfk $$0, dfk $$1) {
         return Optional.of(new bip($$0, $$1));
      }

      public Optional<biq> a(dfk $$0) {
         return Optional.of($$0);
      }

      public Optional<biq> a() {
         return Optional.empty();
      }
   };
   private static final cxh.b<dfk, Optional<bja>> o = new cxh.b<dfk, Optional<bja>>() {
      public Optional<bja> a(final dfk $$0, final dfk $$1) {
         final biq $$2 = new bip($$0, $$1);
         return Optional.of(new bja() {
            @Nullable
            @Override
            public cgm createMenu(int $$0x, cdt $$1x, cdu $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cgt.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public ur P_() {
               if ($$0.ae()) {
                  return $$0.P_();
               } else {
                  return (ur)($$1.ae() ? $$1.P_() : ur.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bja> a(dfk $$0) {
         return Optional.of($$0);
      }

      public Optional<bja> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cwd> a() {
      return b;
   }

   protected cwd(dhh.d $$0, Supplier<dff<? extends dfk>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, hx.c).a(d, dia.a).a(e, Boolean.valueOf(false)));
   }

   public static cxh.a g(dhi $$0) {
      dia $$1 = $$0.c(d);
      if ($$1 == dia.a) {
         return cxh.a.a;
      } else {
         return $$1 == dia.c ? cxh.a.b : cxh.a.c;
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.b;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dia $$6 = $$2.c(d);
         if ($$0.c(d) == dia.a && $$6 != dia.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dia.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if ($$0.c(d) == dia.a) {
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

   public static hx h(dhi $$0) {
      hx $$1 = $$0.c(c);
      return $$0.c(d) == dia.b ? $$1.h() : $$1.i();
   }

   @Override
   public dhi a(cnr $$0) {
      dia $$1 = dia.a;
      hx $$2 = $$0.g().g();
      ecs $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      hx $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         hx $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dia.c : dia.b;
         }
      }

      if ($$1 == dia.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dia.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dia.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == ect.c));
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(e) ? ect.c.a(false) : super.c_($$0);
   }

   @Nullable
   private hx a(cnr $$0, hx $$1) {
      dhi $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dia.a ? $$2.c(c) : null;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfk) {
            ((dfk)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      bit.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         bja $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            ccl.a($$3, true);
         }

         return bix.b;
      }
   }

   protected aqy<agi> c() {
      return arb.i.b(arb.ao);
   }

   public dff<? extends dfk> d() {
      return this.a.get();
   }

   @Nullable
   public static biq a(cwd $$0, dhi $$1, csa $$2, ht $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cxh.c<? extends dfk> a(dhi $$0, csa $$1, ht $$2, boolean $$3) {
      BiPredicate<csb, ht> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cwd::a;
      }

      return cxh.a(this.a.get(), cwd::g, cwd::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cxh.b<dfk, Float2FloatFunction> a(final dgg $$0) {
      return new cxh.b<dfk, Float2FloatFunction>() {
         public Float2FloatFunction a(dfk $$0x, dfk $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dfk $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? a($$2, this.d(), dfk::a) : null;
   }

   public static boolean a(csb $$0, ht $$1) {
      return a((crg)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(crg $$0, ht $$1) {
      ht $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(csb $$0, ht $$1) {
      List<bwu> $$2 = $$0.a(
         bwu.class, new ejp((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bwu $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      dfd $$4 = $$1.c_($$2);
      if ($$4 instanceof dfk) {
         ((dfk)$$4).i();
      }
   }
}
