import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class djb extends dgs<dsn> implements doz {
   public static final MapCodec<djb> b = b($$0 -> new djb(() -> dsi.b, $$0));
   public static final dvx c = dlt.aF;
   public static final dwb<dvv> d = dvt.bc;
   public static final dvu e = dvt.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fab i = dhy.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fab j = dhy.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fab k = dhy.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fab l = dhy.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fab m = dhy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dkf.b<dsn, Optional<brr>> n = new dkf.b<dsn, Optional<brr>>() {
      public Optional<brr> a(dsn $$0, dsn $$1) {
         return Optional.of(new brq($$0, $$1));
      }

      public Optional<brr> a(dsn $$0) {
         return Optional.of($$0);
      }

      public Optional<brr> a() {
         return Optional.empty();
      }
   };
   private static final dkf.b<dsn, Optional<bsa>> o = new dkf.b<dsn, Optional<bsa>>() {
      public Optional<bsa> a(final dsn $$0, final dsn $$1) {
         final brr $$2 = new brq($$0, $$1);
         return Optional.of(new bsa() {
            @Nullable
            @Override
            public crj createMenu(int $$0x, cog $$1x, coh $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.k);
                  $$1.e_($$1.k);
                  return crs.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xh S_() {
               if ($$0.am()) {
                  return $$0.S_();
               } else {
                  return (xh)($$1.am() ? $$1.S_() : xh.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsa> a(dsn $$0) {
         return Optional.of($$0);
      }

      public Optional<bsa> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends djb> a() {
      return b;
   }

   protected djb(Supplier<dsi<? extends dsn>> $$0, dvc.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jl.c).b(d, dvv.a).b(e, Boolean.valueOf(false)));
   }

   public static dkf.a h(dvd $$0) {
      dvv $$1 = $$0.c(d);
      if ($$1 == dvv.a) {
         return dkf.a.a;
      } else {
         return $$1 == dvv.c ? dkf.a.b : dkf.a.c;
      }
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.b;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dvv $$6 = $$2.c(d);
         if ($$0.c(d) == dvv.a && $$6 != dvv.a && $$0.c(c) == $$2.c(c) && i($$2) == $$1.g()) {
            return $$0.b(d, $$6.a());
         }
      } else if (i($$0) == $$1) {
         return $$0.b(d, dvv.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$0.c(d) == dvv.a) {
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

   public static jl i(dvd $$0) {
      jl $$1 = $$0.c(c);
      return $$0.c(d) == dvv.b ? $$1.h() : $$1.i();
   }

   @Override
   public dvd a(czm $$0) {
      dvv $$1 = dvv.a;
      jl $$2 = $$0.g().g();
      ere $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jl $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jl $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dvv.c : dvv.b;
         }
      }

      if ($$1 == dvv.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dvv.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dvv.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == erf.c));
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(e) ? erf.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jl a(czm $$0, jl $$1) {
      dvd $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dvv.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      bru.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         bsa $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cmx.a($$3, true);
         }
      }

      return bry.a;
   }

   protected awr<alh> c() {
      return awu.i.b(awu.ao);
   }

   public dsi<? extends dsn> d() {
      return this.a.get();
   }

   @Nullable
   public static brr a(djb $$0, dvd $$1, dev $$2, jg $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dkf.c<? extends dsn> a(dvd $$0, dev $$1, jg $$2, boolean $$3) {
      BiPredicate<dew, jg> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = djb::a;
      }

      return dkf.a(this.a.get(), djb::h, djb::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dkf.b<dsn, Float2FloatFunction> a(final dtl $$0) {
      return new dkf.b<dsn, Float2FloatFunction>() {
         public Float2FloatFunction a(dsn $$0x, dsn $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dsn $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? a($$2, this.d(), dsn::a) : null;
   }

   public static boolean a(dew $$0, jg $$1) {
      return a((dea)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dea $$0, jg $$1) {
      jg $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dew $$0, jg $$1) {
      List<cgp> $$2 = $$0.a(
         cgp.class, new ezc((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cgp $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      dsg $$4 = $$1.c_($$2);
      if ($$4 instanceof dsn) {
         ((dsn)$$4).k();
      }
   }
}
