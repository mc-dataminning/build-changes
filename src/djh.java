import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class djh extends dgy<dst> implements dpf {
   public static final MapCodec<djh> b = b($$0 -> new djh(() -> dso.b, $$0));
   public static final dwd c = dlz.aF;
   public static final dwh<dwb> d = dvz.bc;
   public static final dwa e = dvz.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fah i = die.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fah j = die.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fah k = die.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fah l = die.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fah m = die.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dkl.b<dst, Optional<brw>> n = new dkl.b<dst, Optional<brw>>() {
      public Optional<brw> a(dst $$0, dst $$1) {
         return Optional.of(new brv($$0, $$1));
      }

      public Optional<brw> a(dst $$0) {
         return Optional.of($$0);
      }

      public Optional<brw> a() {
         return Optional.empty();
      }
   };
   private static final dkl.b<dst, Optional<bsf>> o = new dkl.b<dst, Optional<bsf>>() {
      public Optional<bsf> a(final dst $$0, final dst $$1) {
         final brw $$2 = new brv($$0, $$1);
         return Optional.of(new bsf() {
            @Nullable
            @Override
            public cro createMenu(int $$0x, col $$1x, com $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.k);
                  $$1.e_($$1.k);
                  return crx.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xi S_() {
               if ($$0.an()) {
                  return $$0.S_();
               } else {
                  return (xi)($$1.an() ? $$1.S_() : xi.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsf> a(dst $$0) {
         return Optional.of($$0);
      }

      public Optional<bsf> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends djh> a() {
      return b;
   }

   protected djh(Supplier<dso<? extends dst>> $$0, dvi.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jm.c).b(d, dwb.a).b(e, Boolean.valueOf(false)));
   }

   public static dkl.a h(dvj $$0) {
      dwb $$1 = $$0.c(d);
      if ($$1 == dwb.a) {
         return dkl.a.a;
      } else {
         return $$1 == dwb.c ? dkl.a.b : dkl.a.c;
      }
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.b;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dwb $$6 = $$2.c(d);
         if ($$0.c(d) == dwb.a && $$6 != dwb.a && $$0.c(c) == $$2.c(c) && i($$2) == $$1.g()) {
            return $$0.b(d, $$6.a());
         }
      } else if (i($$0) == $$1) {
         return $$0.b(d, dwb.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$0.c(d) == dwb.a) {
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

   public static jm i(dvj $$0) {
      jm $$1 = $$0.c(c);
      return $$0.c(d) == dwb.b ? $$1.h() : $$1.i();
   }

   @Override
   public dvj a(czs $$0) {
      dwb $$1 = dwb.a;
      jm $$2 = $$0.g().g();
      erk $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jm $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jm $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dwb.c : dwb.b;
         }
      }

      if ($$1 == dwb.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dwb.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dwb.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == erl.c));
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(e) ? erl.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jm a(czs $$0, jm $$1) {
      dvj $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dwb.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      brz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         bsf $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cnc.a($$3, true);
         }
      }

      return bsd.a;
   }

   protected aws<ali> c() {
      return awv.i.b(awv.ao);
   }

   public dso<? extends dst> d() {
      return this.a.get();
   }

   @Nullable
   public static brw a(djh $$0, dvj $$1, dfb $$2, jh $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dkl.c<? extends dst> a(dvj $$0, dfb $$1, jh $$2, boolean $$3) {
      BiPredicate<dfc, jh> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = djh::a;
      }

      return dkl.a(this.a.get(), djh::h, djh::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dkl.b<dst, Float2FloatFunction> a(final dtr $$0) {
      return new dkl.b<dst, Float2FloatFunction>() {
         public Float2FloatFunction a(dst $$0x, dst $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dst $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dst($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? a($$2, this.d(), dst::a) : null;
   }

   public static boolean a(dfc $$0, jh $$1) {
      return a((deg)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(deg $$0, jh $$1) {
      jh $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dfc $$0, jh $$1) {
      List<cgu> $$2 = $$0.a(
         cgu.class, new ezi((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cgu $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return cro.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      dsm $$4 = $$1.c_($$2);
      if ($$4 instanceof dst) {
         ((dst)$$4).k();
      }
   }
}
