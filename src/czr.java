import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class czr extends cxi<dja> implements dfo {
   public static final MapCodec<czr> b = b($$0 -> new czr($$0, () -> div.b));
   public static final dlz c = dcj.aE;
   public static final dmd<dlx> d = dlv.bc;
   public static final dlw e = dlv.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eol i = cyo.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eol j = cyo.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eol k = cyo.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eol l = cyo.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eol m = cyo.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dav.b<dja, Optional<bln>> n = new dav.b<dja, Optional<bln>>() {
      public Optional<bln> a(dja $$0, dja $$1) {
         return Optional.of(new blm($$0, $$1));
      }

      public Optional<bln> a(dja $$0) {
         return Optional.of($$0);
      }

      public Optional<bln> a() {
         return Optional.empty();
      }
   };
   private static final dav.b<dja, Optional<bly>> o = new dav.b<dja, Optional<bly>>() {
      public Optional<bly> a(final dja $$0, final dja $$1) {
         final bln $$2 = new blm($$0, $$1);
         return Optional.of(new bly() {
            @Nullable
            @Override
            public ckb createMenu(int $$0x, chg $$1x, chh $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cki.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vq Q_() {
               if ($$0.ae()) {
                  return $$0.Q_();
               } else {
                  return (vq)($$1.ae() ? $$1.Q_() : vq.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bly> a(dja $$0) {
         return Optional.of($$0);
      }

      public Optional<bly> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends czr> a() {
      return b;
   }

   protected czr(dle.d $$0, Supplier<div<? extends dja>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ie.c).a(d, dlx.a).a(e, Boolean.valueOf(false)));
   }

   public static dav.a g(dlf $$0) {
      dlx $$1 = $$0.c(d);
      if ($$1 == dlx.a) {
         return dav.a.a;
      } else {
         return $$1 == dlx.c ? dav.a.b : dav.a.c;
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.b;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dlx $$6 = $$2.c(d);
         if ($$0.c(d) == dlx.a && $$6 != dlx.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dlx.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if ($$0.c(d) == dlx.a) {
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

   public static ie h(dlf $$0) {
      ie $$1 = $$0.c(c);
      return $$0.c(d) == dlx.b ? $$1.h() : $$1.i();
   }

   @Override
   public dlf a(crg $$0) {
      dlx $$1 = dlx.a;
      ie $$2 = $$0.g().g();
      egp $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ie $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ie $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dlx.c : dlx.b;
         }
      }

      if ($$1 == dlx.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dlx.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dlx.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == egq.c));
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(e) ? egq.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ie a(crg $$0, ie $$1) {
      dlf $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dlx.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof dja) {
            ((dja)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      blq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         bly $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cfy.a($$3, true);
         }

         return blu.b;
      }
   }

   protected atr<aiy> c() {
      return atu.i.b(atu.ao);
   }

   public div<? extends dja> d() {
      return this.a.get();
   }

   @Nullable
   public static bln a(czr $$0, dlf $$1, cvn $$2, hz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dav.c<? extends dja> a(dlf $$0, cvn $$1, hz $$2, boolean $$3) {
      BiPredicate<cvo, hz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = czr::a;
      }

      return dav.a(this.a.get(), czr::g, czr::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dav.b<dja, Float2FloatFunction> a(final djw $$0) {
      return new dav.b<dja, Float2FloatFunction>() {
         public Float2FloatFunction a(dja $$0x, dja $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dja $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dja($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0.B ? a($$2, this.d(), dja::a) : null;
   }

   public static boolean a(cvo $$0, hz $$1) {
      return a((cut)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cut $$0, hz $$1) {
      hz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cvo $$0, hz $$1) {
      List<bzw> $$2 = $$0.a(
         bzw.class, new enn((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bzw $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return ckb.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      dit $$4 = $$1.c_($$2);
      if ($$4 instanceof dja) {
         ((dja)$$4).m();
      }
   }
}
