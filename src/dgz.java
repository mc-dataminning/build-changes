import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgz extends deq<dqm> implements dmy {
   public static final MapCodec<dgz> b = b($$0 -> new dgz($$0, () -> dqh.b));
   public static final dtu c = djs.aE;
   public static final dty<dts> d = dtq.bc;
   public static final dtr e = dtq.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final exp i = dfw.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final exp j = dfw.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final exp k = dfw.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final exp l = dfw.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final exp m = dfw.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final did.b<dqm, Optional<bqj>> n = new did.b<dqm, Optional<bqj>>() {
      public Optional<bqj> a(dqm $$0, dqm $$1) {
         return Optional.of(new bqi($$0, $$1));
      }

      public Optional<bqj> a(dqm $$0) {
         return Optional.of($$0);
      }

      public Optional<bqj> a() {
         return Optional.empty();
      }
   };
   private static final did.b<dqm, Optional<bqu>> o = new did.b<dqm, Optional<bqu>>() {
      public Optional<bqu> a(final dqm $$0, final dqm $$1) {
         final bqj $$2 = new bqi($$0, $$1);
         return Optional.of(new bqu() {
            @Nullable
            @Override
            public cps createMenu(int $$0x, cmu $$1x, cmv $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cqa.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wy O_() {
               if ($$0.ai()) {
                  return $$0.O_();
               } else {
                  return (wy)($$1.ai() ? $$1.O_() : wy.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqu> a(dqm $$0) {
         return Optional.of($$0);
      }

      public Optional<bqu> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgz> a() {
      return b;
   }

   protected dgz(dsz.d $$0, Supplier<dqh<? extends dqm>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ji.c).a(d, dts.a).a(e, Boolean.valueOf(false)));
   }

   public static did.a g(dta $$0) {
      dts $$1 = $$0.c(d);
      if ($$1 == dts.a) {
         return did.a.a;
      } else {
         return $$1 == dts.c ? did.a.b : did.a.c;
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.b;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dts $$6 = $$2.c(d);
         if ($$0.c(d) == dts.a && $$6 != dts.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dts.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      if ($$0.c(d) == dts.a) {
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

   public static ji h(dta $$0) {
      ji $$1 = $$0.c(c);
      return $$0.c(d) == dts.b ? $$1.h() : $$1.i();
   }

   @Override
   public dta a(cyb $$0) {
      dts $$1 = dts.a;
      ji $$2 = $$0.g().g();
      eoy $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ji $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ji $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dts.c : dts.b;
         }
      }

      if ($$1 == dts.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dts.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dts.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eoz.c));
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(e) ? eoz.c.a(false) : super.b_($$0);
   }

   @Nullable
   private ji a(cyb $$0, ji $$1) {
      dta $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dts.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      bqm.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         bqu $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clm.a($$3, true);
         }

         return bqq.c;
      }
   }

   protected avv<akq> c() {
      return avy.i.b(avy.ao);
   }

   public dqh<? extends dqm> d() {
      return this.a.get();
   }

   @Nullable
   public static bqj a(dgz $$0, dta $$1, dcu $$2, jd $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public did.c<? extends dqm> a(dta $$0, dcu $$1, jd $$2, boolean $$3) {
      BiPredicate<dcv, jd> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgz::a;
      }

      return did.a(this.a.get(), dgz::g, dgz::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static did.b<dqm, Float2FloatFunction> a(final drj $$0) {
      return new did.b<dqm, Float2FloatFunction>() {
         public Float2FloatFunction a(dqm $$0x, dqm $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dqm $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? a($$2, this.d(), dqm::a) : null;
   }

   public static boolean a(dcv $$0, jd $$1) {
      return a((dca)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dca $$0, jd $$1) {
      jd $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dcv $$0, jd $$1) {
      List<cff> $$2 = $$0.a(
         cff.class, new ewr((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cff $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return cps.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      dqf $$4 = $$1.c_($$2);
      if ($$4 instanceof dqm) {
         ((dqm)$$4).l();
      }
   }
}
