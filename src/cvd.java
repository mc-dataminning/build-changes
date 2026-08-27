import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvd extends cst<dee> implements daz {
   public static final MapCodec<cvd> b = b($$0 -> new cvd($$0, () -> ddz.b));
   public static final dgv c = cxu.aE;
   public static final dgz<dgt> d = dgr.bc;
   public static final dgs e = dgr.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eiy i = cua.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eiy j = cua.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eiy k = cua.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eiy l = cua.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eiy m = cua.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cwf.b<dee, Optional<bhu>> n = new cwf.b<dee, Optional<bhu>>() {
      public Optional<bhu> a(dee $$0, dee $$1) {
         return Optional.of(new bht($$0, $$1));
      }

      public Optional<bhu> a(dee $$0) {
         return Optional.of($$0);
      }

      public Optional<bhu> a() {
         return Optional.empty();
      }
   };
   private static final cwf.b<dee, Optional<bie>> o = new cwf.b<dee, Optional<bie>>() {
      public Optional<bie> a(final dee $$0, final dee $$1) {
         final bhu $$2 = new bht($$0, $$1);
         return Optional.of(new bie() {
            @Nullable
            @Override
            public cfp createMenu(int $$0x, ccw $$1x, ccx $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cfw.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public ui O_() {
               if ($$0.ac()) {
                  return $$0.O_();
               } else {
                  return (ui)($$1.ac() ? $$1.O_() : ui.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bie> a(dee $$0) {
         return Optional.of($$0);
      }

      public Optional<bie> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cvd> a() {
      return b;
   }

   protected cvd(dga.d $$0, Supplier<ddz<? extends dee>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, hx.c).a(d, dgt.a).a(e, Boolean.valueOf(false)));
   }

   public static cwf.a g(dgb $$0) {
      dgt $$1 = $$0.c(d);
      if ($$1 == dgt.a) {
         return cwf.a.a;
      } else {
         return $$1 == dgt.c ? cwf.a.b : cwf.a.c;
      }
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.b;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dgt $$6 = $$2.c(d);
         if ($$0.c(d) == dgt.a && $$6 != dgt.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dgt.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$0.c(d) == dgt.a) {
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

   public static hx h(dgb $$0) {
      hx $$1 = $$0.c(c);
      return $$0.c(d) == dgt.b ? $$1.h() : $$1.i();
   }

   @Override
   public dgb a(cmr $$0) {
      dgt $$1 = dgt.a;
      hx $$2 = $$0.g().g();
      ebe $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      hx $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         hx $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dgt.c : dgt.b;
         }
      }

      if ($$1 == dgt.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dgt.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dgt.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == ebf.c));
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(e) ? ebf.c.a(false) : super.c_($$0);
   }

   @Nullable
   private hx a(cmr $$0, hx $$1) {
      dgb $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dgt.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof dee) {
            ((dee)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      bhx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         bie $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cbo.a($$3, true);
         }

         return bib.b;
      }
   }

   protected aqk<afw> c() {
      return aqn.i.b(aqn.ao);
   }

   public ddz<? extends dee> d() {
      return this.a.get();
   }

   @Nullable
   public static bhu a(cvd $$0, dgb $$1, cqz $$2, ht $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cwf.c<? extends dee> a(dgb $$0, cqz $$1, ht $$2, boolean $$3) {
      BiPredicate<cra, ht> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cvd::a;
      }

      return cwf.a(this.a.get(), cvd::g, cvd::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cwf.b<dee, Float2FloatFunction> a(final dez $$0) {
      return new cwf.b<dee, Float2FloatFunction>() {
         public Float2FloatFunction a(dee $$0x, dee $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dee $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dee($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$0.B ? a($$2, this.d(), dee::a) : null;
   }

   public static boolean a(cra $$0, ht $$1) {
      return a((cqf)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cqf $$0, ht $$1) {
      ht $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cra $$0, ht $$1) {
      List<bvx> $$2 = $$0.a(
         bvx.class, new eia((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bvx $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return cfp.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      ddx $$4 = $$1.c_($$2);
      if ($$4 instanceof dee) {
         ((dee)$$4).i();
      }
   }
}
