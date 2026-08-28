import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dkp extends dig<dug> implements dqs {
   public static final MapCodec<dkp> b = b($$0 -> new dkp(() -> dub.b, $$0));
   public static final dxu<jn> c = dnk.aF;
   public static final dxu<dxp> d = dxn.bf;
   public static final dxo e = dxn.J;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fbu i = djm.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fbu j = djm.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fbu k = djm.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fbu l = djm.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fbu m = djm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dlu.b<dug, Optional<bsd>> n = new dlu.b<dug, Optional<bsd>>() {
      public Optional<bsd> a(dug $$0, dug $$1) {
         return Optional.of(new bsc($$0, $$1));
      }

      public Optional<bsd> a(dug $$0) {
         return Optional.of($$0);
      }

      public Optional<bsd> a() {
         return Optional.empty();
      }
   };
   private static final dlu.b<dug, Optional<bsm>> o = new dlu.b<dug, Optional<bsm>>() {
      public Optional<bsm> a(final dug $$0, final dug $$1) {
         final bsd $$2 = new bsc($$0, $$1);
         return Optional.of(new bsm() {
            @Nullable
            @Override
            public csc createMenu(int $$0x, cow $$1x, cox $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return csl.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wp p_() {
               if ($$0.l_()) {
                  return $$0.p_();
               } else {
                  return (wp)($$1.l_() ? $$1.p_() : wp.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsm> a(dug $$0) {
         return Optional.of($$0);
      }

      public Optional<bsm> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dkp> a() {
      return b;
   }

   protected dkp(Supplier<dub<? extends dug>> $$0, dww.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jn.c).b(d, dxp.a).b(e, Boolean.valueOf(false)));
   }

   public static dlu.a h(dwx $$0) {
      dxp $$1 = $$0.c(d);
      if ($$1 == dxp.a) {
         return dlu.a.a;
      } else {
         return $$1 == dxp.c ? dlu.a.b : dlu.a.c;
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dxp $$8 = $$6.c(d);
         if ($$0.c(d) == dxp.a && $$8 != dxp.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dxp.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if ($$0.c(d) == dxp.a) {
         return m;
      } else {
         switch (i($$0)) {
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

   public static jn i(dwx $$0) {
      jn $$1 = $$0.c(c);
      return $$0.c(d) == dxp.b ? $$1.h() : $$1.i();
   }

   @Override
   public dwx a(dag $$0) {
      dxp $$1 = dxp.a;
      jn $$2 = $$0.g().g();
      esz $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jn $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jn $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dxp.c : dxp.b;
         }
      }

      if ($$1 == dxp.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dxp.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dxp.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == eta.c));
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(e) ? eta.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jn a(dag $$0, jn $$1) {
      dwx $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dxp.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1 instanceof ard $$5) {
         bsm $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cnm.a($$5, $$3, true);
         }
      }

      return bsk.a;
   }

   protected awh<akv> c() {
      return awk.i.b(awk.ao);
   }

   public dub<? extends dug> d() {
      return this.a.get();
   }

   @Nullable
   public static bsd a(dkp $$0, dwx $$1, dgi $$2, ji $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dlu.c<? extends dug> a(dwx $$0, dgi $$1, ji $$2, boolean $$3) {
      BiPredicate<dgj, ji> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dkp::a;
      }

      return dlu.a(this.a.get(), dkp::h, dkp::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsm b(dwx $$0, dgi $$1, ji $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dlu.b<dug, Float2FloatFunction> a(final dvf $$0) {
      return new dlu.b<dug, Float2FloatFunction>() {
         public Float2FloatFunction a(dug $$0x, dug $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dug $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dug($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? a($$2, this.d(), dug::a) : null;
   }

   public static boolean a(dgj $$0, ji $$1) {
      return a((dfn)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dfn $$0, ji $$1) {
      ji $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dgj $$0, ji $$1) {
      List<chb> $$2 = $$0.a(
         chb.class, new fav((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (chb $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      dtz $$4 = $$1.c_($$2);
      if ($$4 instanceof dug) {
         ((dug)$$4).k();
      }
   }
}
