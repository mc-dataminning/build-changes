import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class czv extends cxm<dje> implements dfs {
   public static final MapCodec<czv> b = b($$0 -> new czv($$0, () -> diz.b));
   public static final dmd c = dcn.aE;
   public static final dmh<dmb> d = dlz.bc;
   public static final dma e = dlz.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eos i = cys.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eos j = cys.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eos k = cys.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eos l = cys.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eos m = cys.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final daz.b<dje, Optional<blp>> n = new daz.b<dje, Optional<blp>>() {
      public Optional<blp> a(dje $$0, dje $$1) {
         return Optional.of(new blo($$0, $$1));
      }

      public Optional<blp> a(dje $$0) {
         return Optional.of($$0);
      }

      public Optional<blp> a() {
         return Optional.empty();
      }
   };
   private static final daz.b<dje, Optional<bma>> o = new daz.b<dje, Optional<bma>>() {
      public Optional<bma> a(final dje $$0, final dje $$1) {
         final blp $$2 = new blo($$0, $$1);
         return Optional.of(new bma() {
            @Nullable
            @Override
            public ckf createMenu(int $$0x, chk $$1x, chl $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return ckm.b($$0, $$1, $$2);
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

      public Optional<bma> a(dje $$0) {
         return Optional.of($$0);
      }

      public Optional<bma> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends czv> a() {
      return b;
   }

   protected czv(dli.d $$0, Supplier<diz<? extends dje>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ie.c).a(d, dmb.a).a(e, Boolean.valueOf(false)));
   }

   public static daz.a g(dlj $$0) {
      dmb $$1 = $$0.c(d);
      if ($$1 == dmb.a) {
         return daz.a.a;
      } else {
         return $$1 == dmb.c ? daz.a.b : daz.a.c;
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.b;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dmb $$6 = $$2.c(d);
         if ($$0.c(d) == dmb.a && $$6 != dmb.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dmb.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$0.c(d) == dmb.a) {
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

   public static ie h(dlj $$0) {
      ie $$1 = $$0.c(c);
      return $$0.c(d) == dmb.b ? $$1.h() : $$1.i();
   }

   @Override
   public dlj a(crk $$0) {
      dmb $$1 = dmb.a;
      ie $$2 = $$0.g().g();
      egw $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ie $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ie $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dmb.c : dmb.b;
         }
      }

      if ($$1 == dmb.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dmb.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dmb.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == egx.c));
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(e) ? egx.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ie a(crk $$0, ie $$1) {
      dlj $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dmb.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof dje) {
            ((dje)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      bls.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         bma $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cgc.a($$3, true);
         }

         return blw.b;
      }
   }

   protected ats<aiy> c() {
      return atv.i.b(atv.ao);
   }

   public diz<? extends dje> d() {
      return this.a.get();
   }

   @Nullable
   public static blp a(czv $$0, dlj $$1, cvr $$2, hz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public daz.c<? extends dje> a(dlj $$0, cvr $$1, hz $$2, boolean $$3) {
      BiPredicate<cvs, hz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = czv::a;
      }

      return daz.a(this.a.get(), czv::g, czv::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static daz.b<dje, Float2FloatFunction> a(final dka $$0) {
      return new daz.b<dje, Float2FloatFunction>() {
         public Float2FloatFunction a(dje $$0x, dje $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dje $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dje($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0.B ? a($$2, this.d(), dje::a) : null;
   }

   public static boolean a(cvs $$0, hz $$1) {
      return a((cux)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cux $$0, hz $$1) {
      hz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cvs $$0, hz $$1) {
      List<caa> $$2 = $$0.a(
         caa.class, new enu((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (caa $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      dix $$4 = $$1.c_($$2);
      if ($$4 instanceof dje) {
         ((dje)$$4).m();
      }
   }
}
