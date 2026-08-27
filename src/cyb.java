import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cyb extends cvs<dhk> implements ddy {
   public static final MapCodec<cyb> b = b($$0 -> new cyb($$0, () -> dhf.b));
   public static final dkj c = dat.aE;
   public static final dkn<dkh> d = dkf.bc;
   public static final dkg e = dkf.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final emv i = cwy.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final emv j = cwy.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final emv k = cwy.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final emv l = cwy.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final emv m = cwy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final czf.b<dhk, Optional<bjv>> n = new czf.b<dhk, Optional<bjv>>() {
      public Optional<bjv> a(dhk $$0, dhk $$1) {
         return Optional.of(new bju($$0, $$1));
      }

      public Optional<bjv> a(dhk $$0) {
         return Optional.of($$0);
      }

      public Optional<bjv> a() {
         return Optional.empty();
      }
   };
   private static final czf.b<dhk, Optional<bkg>> o = new czf.b<dhk, Optional<bkg>>() {
      public Optional<bkg> a(final dhk $$0, final dhk $$1) {
         final bjv $$2 = new bju($$0, $$1);
         return Optional.of(new bkg() {
            @Nullable
            @Override
            public cij createMenu(int $$0x, cfp $$1x, cfq $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return ciq.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vg Q_() {
               if ($$0.ae()) {
                  return $$0.Q_();
               } else {
                  return (vg)($$1.ae() ? $$1.Q_() : vg.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bkg> a(dhk $$0) {
         return Optional.of($$0);
      }

      public Optional<bkg> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cyb> a() {
      return b;
   }

   protected cyb(djo.d $$0, Supplier<dhf<? extends dhk>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ic.c).a(d, dkh.a).a(e, Boolean.valueOf(false)));
   }

   public static czf.a g(djp $$0) {
      dkh $$1 = $$0.c(d);
      if ($$1 == dkh.a) {
         return czf.a.a;
      } else {
         return $$1 == dkh.c ? czf.a.b : czf.a.c;
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.b;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dkh $$6 = $$2.c(d);
         if ($$0.c(d) == dkh.a && $$6 != dkh.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dkh.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$0.c(d) == dkh.a) {
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

   public static ic h(djp $$0) {
      ic $$1 = $$0.c(c);
      return $$0.c(d) == dkh.b ? $$1.h() : $$1.i();
   }

   @Override
   public djp a(cpp $$0) {
      dkh $$1 = dkh.a;
      ic $$2 = $$0.g().g();
      eez $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ic $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ic $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dkh.c : dkh.b;
         }
      }

      if ($$1 == dkh.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dkh.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dkh.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == efa.c));
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(e) ? efa.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ic a(cpp $$0, ic $$1) {
      djp $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dkh.a ? $$2.c(c) : null;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dhk) {
            ((dhk)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      bjy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         bkg $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            ceh.a($$3, true);
         }

         return bkc.b;
      }
   }

   protected asa<ahh> c() {
      return asd.i.b(asd.ao);
   }

   public dhf<? extends dhk> d() {
      return this.a.get();
   }

   @Nullable
   public static bjv a(cyb $$0, djp $$1, ctx $$2, hx $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public czf.c<? extends dhk> a(djp $$0, ctx $$1, hx $$2, boolean $$3) {
      BiPredicate<cty, hx> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cyb::a;
      }

      return czf.a(this.a.get(), cyb::g, cyb::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static czf.b<dhk, Float2FloatFunction> a(final dig $$0) {
      return new czf.b<dhk, Float2FloatFunction>() {
         public Float2FloatFunction a(dhk $$0x, dhk $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dhk $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? a($$2, this.d(), dhk::a) : null;
   }

   public static boolean a(cty $$0, hx $$1) {
      return a((ctd)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(ctd $$0, hx $$1) {
      hx $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cty $$0, hx $$1) {
      List<byf> $$2 = $$0.a(
         byf.class, new elx((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (byf $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      dhd $$4 = $$1.c_($$2);
      if ($$4 instanceof dhk) {
         ((dhk)$$4).m();
      }
   }
}
