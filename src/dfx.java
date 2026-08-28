import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dfx extends ddo<dpj> implements dlv {
   public static final MapCodec<dfx> b = b($$0 -> new dfx($$0, () -> dpe.b));
   public static final dsr c = diq.aE;
   public static final dsv<dsp> d = dsn.bc;
   public static final dso e = dsn.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ewf i = deu.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ewf j = deu.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ewf k = deu.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ewf l = deu.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ewf m = deu.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhb.b<dpj, Optional<bqi>> n = new dhb.b<dpj, Optional<bqi>>() {
      public Optional<bqi> a(dpj $$0, dpj $$1) {
         return Optional.of(new bqh($$0, $$1));
      }

      public Optional<bqi> a(dpj $$0) {
         return Optional.of($$0);
      }

      public Optional<bqi> a() {
         return Optional.empty();
      }
   };
   private static final dhb.b<dpj, Optional<bqt>> o = new dhb.b<dpj, Optional<bqt>>() {
      public Optional<bqt> a(final dpj $$0, final dpj $$1) {
         final bqi $$2 = new bqh($$0, $$1);
         return Optional.of(new bqt() {
            @Nullable
            @Override
            public cpp createMenu(int $$0x, cmr $$1x, cms $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpw.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xl O_() {
               if ($$0.ag()) {
                  return $$0.O_();
               } else {
                  return (xl)($$1.ag() ? $$1.O_() : xl.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqt> a(dpj $$0) {
         return Optional.of($$0);
      }

      public Optional<bqt> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dfx> a() {
      return b;
   }

   protected dfx(drw.d $$0, Supplier<dpe<? extends dpj>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, je.c).a(d, dsp.a).a(e, Boolean.valueOf(false)));
   }

   public static dhb.a g(drx $$0) {
      dsp $$1 = $$0.c(d);
      if ($$1 == dsp.a) {
         return dhb.a.a;
      } else {
         return $$1 == dsp.c ? dhb.a.b : dhb.a.c;
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.b;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dsp $$6 = $$2.c(d);
         if ($$0.c(d) == dsp.a && $$6 != dsp.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dsp.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      if ($$0.c(d) == dsp.a) {
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

   public static je h(drx $$0) {
      je $$1 = $$0.c(c);
      return $$0.c(d) == dsp.b ? $$1.h() : $$1.i();
   }

   @Override
   public drx a(cxv $$0) {
      dsp $$1 = dsp.a;
      je $$2 = $$0.g().g();
      enq $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      je $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         je $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dsp.c : dsp.b;
         }
      }

      if ($$1 == dsp.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dsp.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dsp.c;
         }
      }

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == enr.c));
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(e) ? enr.c.a(false) : super.b_($$0);
   }

   @Nullable
   private je a(cxv $$0, je $$1) {
      drx $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dsp.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      bql.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         bqt $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clj.a($$3, true);
         }

         return bqp.c;
      }
   }

   protected awd<alb> c() {
      return awg.i.b(awg.ao);
   }

   public dpe<? extends dpj> d() {
      return this.a.get();
   }

   @Nullable
   public static bqi a(dfx $$0, drx $$1, dbt $$2, iz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhb.c<? extends dpj> a(drx $$0, dbt $$1, iz $$2, boolean $$3) {
      BiPredicate<dbu, iz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dfx::a;
      }

      return dhb.a(this.a.get(), dfx::g, dfx::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhb.b<dpj, Float2FloatFunction> a(final dqf $$0) {
      return new dhb.b<dpj, Float2FloatFunction>() {
         public Float2FloatFunction a(dpj $$0x, dpj $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpj $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpj::a) : null;
   }

   public static boolean a(dbu $$0, iz $$1) {
      return a((daz)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(daz $$0, iz $$1) {
      iz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dbu $$0, iz $$1) {
      List<cfd> $$2 = $$0.a(
         cfd.class, new evh((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfd $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return cpp.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      dpc $$4 = $$1.c_($$2);
      if ($$4 instanceof dpj) {
         ((dpj)$$4).l();
      }
   }
}
