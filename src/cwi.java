import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cwi extends ctz<dfp> implements dcf {
   public static final MapCodec<cwi> b = b($$0 -> new cwi($$0, () -> dfk.b));
   public static final dih c = cza.aE;
   public static final dil<dif> d = did.bc;
   public static final die e = did.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eks i = cvf.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eks j = cvf.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eks k = cvf.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eks l = cvf.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eks m = cvf.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cxm.b<dfp, Optional<biu>> n = new cxm.b<dfp, Optional<biu>>() {
      public Optional<biu> a(dfp $$0, dfp $$1) {
         return Optional.of(new bit($$0, $$1));
      }

      public Optional<biu> a(dfp $$0) {
         return Optional.of($$0);
      }

      public Optional<biu> a() {
         return Optional.empty();
      }
   };
   private static final cxm.b<dfp, Optional<bje>> o = new cxm.b<dfp, Optional<bje>>() {
      public Optional<bje> a(final dfp $$0, final dfp $$1) {
         final biu $$2 = new bit($$0, $$1);
         return Optional.of(new bje() {
            @Nullable
            @Override
            public cgr createMenu(int $$0x, cdy $$1x, cdz $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cgy.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public uv Q_() {
               if ($$0.ae()) {
                  return $$0.Q_();
               } else {
                  return (uv)($$1.ae() ? $$1.Q_() : uv.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bje> a(dfp $$0) {
         return Optional.of($$0);
      }

      public Optional<bje> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cwi> a() {
      return b;
   }

   protected cwi(dhm.d $$0, Supplier<dfk<? extends dfp>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ib.c).a(d, dif.a).a(e, Boolean.valueOf(false)));
   }

   public static cxm.a g(dhn $$0) {
      dif $$1 = $$0.c(d);
      if ($$1 == dif.a) {
         return cxm.a.a;
      } else {
         return $$1 == dif.c ? cxm.a.b : cxm.a.c;
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.b;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dif $$6 = $$2.c(d);
         if ($$0.c(d) == dif.a && $$6 != dif.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dif.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$0.c(d) == dif.a) {
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

   public static ib h(dhn $$0) {
      ib $$1 = $$0.c(c);
      return $$0.c(d) == dif.b ? $$1.h() : $$1.i();
   }

   @Override
   public dhn a(cnw $$0) {
      dif $$1 = dif.a;
      ib $$2 = $$0.g().g();
      ecx $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ib $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ib $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dif.c : dif.b;
         }
      }

      if ($$1 == dif.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dif.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dif.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == ecy.c));
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(e) ? ecy.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ib a(cnw $$0, ib $$1) {
      dhn $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dif.a ? $$2.c(c) : null;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dfp) {
            ((dfp)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      bix.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         bje $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            ccq.a($$3, true);
         }

         return bjb.b;
      }
   }

   protected arc<agm> c() {
      return arf.i.b(arf.ao);
   }

   public dfk<? extends dfp> d() {
      return this.a.get();
   }

   @Nullable
   public static biu a(cwi $$0, dhn $$1, csf $$2, hx $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cxm.c<? extends dfp> a(dhn $$0, csf $$1, hx $$2, boolean $$3) {
      BiPredicate<csg, hx> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cwi::a;
      }

      return cxm.a(this.a.get(), cwi::g, cwi::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cxm.b<dfp, Float2FloatFunction> a(final dgl $$0) {
      return new cxm.b<dfp, Float2FloatFunction>() {
         public Float2FloatFunction a(dfp $$0x, dfp $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dfp $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? a($$2, this.d(), dfp::a) : null;
   }

   public static boolean a(csg $$0, hx $$1) {
      return a((crl)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(crl $$0, hx $$1) {
      hx $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(csg $$0, hx $$1) {
      List<bwz> $$2 = $$0.a(
         bwz.class, new eju((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bwz $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      dfi $$4 = $$1.c_($$2);
      if ($$4 instanceof dfp) {
         ((dfp)$$4).m();
      }
   }
}
