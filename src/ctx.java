import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctx extends crp<ddc> implements czw {
   public static final dgd b = cwo.aC;
   public static final dgh<dgb> c = dfz.bc;
   public static final dga d = dfz.C;
   public static final int e = 1;
   protected static final int f = 1;
   protected static final int g = 14;
   protected static final eig h = csv.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eig i = csv.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eig j = csv.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eig k = csv.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eig l = csv.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cuy.b<ddc, Optional<bgr>> m = new cuy.b<ddc, Optional<bgr>>() {
      public Optional<bgr> a(ddc $$0, ddc $$1) {
         return Optional.of(new bgq($$0, $$1));
      }

      public Optional<bgr> a(ddc $$0) {
         return Optional.of($$0);
      }

      public Optional<bgr> a() {
         return Optional.empty();
      }
   };
   private static final cuy.b<ddc, Optional<bhb>> n = new cuy.b<ddc, Optional<bhb>>() {
      public Optional<bhb> a(final ddc $$0, final ddc $$1) {
         final bgr $$2 = new bgq($$0, $$1);
         return Optional.of(new bhb() {
            @Nullable
            @Override
            public cel createMenu(int $$0x, cbt $$1x, cbu $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return ces.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public tm N_() {
               if ($$0.ac()) {
                  return $$0.N_();
               } else {
                  return (tm)($$1.ac() ? $$1.N_() : tm.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bhb> a(ddc $$0) {
         return Optional.of($$0);
      }

      public Optional<bhb> a() {
         return Optional.empty();
      }
   };

   protected ctx(dfi.d $$0, Supplier<dcx<? extends ddc>> $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, hc.c).a(c, dgb.a).a(d, Boolean.valueOf(false)));
   }

   public static cuy.a g(dfj $$0) {
      dgb $$1 = $$0.c(c);
      if ($$1 == dgb.a) {
         return cuy.a.a;
      } else {
         return $$1 == dgb.c ? cuy.a.b : cuy.a.c;
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.b;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dgb $$6 = $$2.c(c);
         if ($$0.c(c) == dgb.a && $$6 != dgb.a && $$0.c(b) == $$2.c(b) && h($$2) == $$1.g()) {
            return $$0.a(c, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(c, dgb.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if ($$0.c(c) == dgb.a) {
         return l;
      } else {
         switch (h($$0)) {
            case c:
            default:
               return h;
            case d:
               return i;
            case e:
               return j;
            case f:
               return k;
         }
      }
   }

   public static hc h(dfj $$0) {
      hc $$1 = $$0.c(b);
      return $$0.c(c) == dgb.b ? $$1.h() : $$1.i();
   }

   @Override
   public dfj a(cln $$0) {
      dgb $$1 = dgb.a;
      hc $$2 = $$0.g().g();
      eam $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      hc $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         hc $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dgb.c : dgb.b;
         }
      }

      if ($$1 == dgb.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dgb.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dgb.c;
         }
      }

      return this.n().a(b, $$2).a(c, $$1).a(d, Boolean.valueOf($$3.a() == ean.c));
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(d) ? ean.c.a(false) : super.c_($$0);
   }

   @Nullable
   private hc a(cln $$0, hc $$1) {
      dfj $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(c) == dgb.a ? $$2.c(b) : null;
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof ddc) {
            ((ddc)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof bgr) {
            bgu.a($$1, $$2, (bgr)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         bhb $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.b());
            cal.a($$3, true);
         }

         return bgy.b;
      }
   }

   protected apl<aex> b() {
      return apo.i.b(apo.ao);
   }

   public dcx<? extends ddc> c() {
      return this.a.get();
   }

   @Nullable
   public static bgr a(ctx $$0, dfj $$1, cpv $$2, gw $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(m).orElse(null);
   }

   @Override
   public cuy.c<? extends ddc> a(dfj $$0, cpv $$1, gw $$2, boolean $$3) {
      BiPredicate<cpw, gw> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = ctx::a;
      }

      return cuy.a(this.a.get(), ctx::g, ctx::h, b, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      return this.a($$0, $$1, $$2, false).apply(n).orElse(null);
   }

   public static cuy.b<ddc, Float2FloatFunction> a(final ddx $$0) {
      return new cuy.b<ddc, Float2FloatFunction>() {
         public Float2FloatFunction a(ddc $$0x, ddc $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(ddc $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return $$0.B ? a($$2, this.c(), ddc::a) : null;
   }

   public static boolean a(cpw $$0, gw $$1) {
      return a((cpb)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cpb $$0, gw $$1) {
      gw $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cpw $$0, gw $$1) {
      List<buu> $$2 = $$0.a(
         buu.class, new ehi((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (buu $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return cel.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      dcv $$4 = $$1.c_($$2);
      if ($$4 instanceof ddc) {
         ((ddc)$$4).i();
      }
   }
}
